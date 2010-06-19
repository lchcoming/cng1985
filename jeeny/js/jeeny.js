/**
 * @author ada
 */
   /**
     * 提示补全组件
     * @class Suggest
     * @constructor
     * @param {String|HTMLElement} textInput
     * @param {String} dataSource
     * @param {Object} config
     */
    function Jeeny(textInput, dataSource, config) {

        /**
         * 文本输入框
         * @type HTMLElement
         */
        this.textInput = $(textInput);

        /**
         * 获取数据的URL 或 JSON格式的静态数据
         * @type {String|Object}
         */
        this.dataSource = dataSource;

        /**
         * JSON静态数据源
         * @type Object 格式为 {"query1" : [["key1", "result1"], []], "query2" : [[], []]}
         */
        this.JSONDataSource = S.isPlainObject(dataSource) ? dataSource : null;

        /**
         * 通过jsonp返回的数据
         * @type Object
         */
        this.returnedData = null;

        /**
         * 配置参数
         * @type Object
         */
        this.config = S.merge(defaultConfig, config || { });

        /**
         * 存放提示信息的容器
         * @type HTMLElement
         */
        this.container = null;

        /**
         * 输入框的值
         * @type String
         */
        this.query = "";

        /**
         * 获取数据时的参数
         * @type String
         */
        this.queryParams = "";

        /**
         * 内部定时器
         * @private
         * @type Object
         */
        this._timer = null;

        /**
         * 计时器是否处于运行状态
         * @private
         * @type Boolean
         */
        this._isRunning = false;

        /**
         * 获取数据的script元素
         * @type HTMLElement
         */
        this.dataScript = null;

        /**
         * 数据缓存
         * @private
         * @type Object
         */
        this._dataCache = {};

        /**
         * 最新script的时间戳
         * @type String
         */
        this._latestScriptTime = "";

        /**
         * script返回的数据是否已经过期
         * @type Boolean
         */
        this._scriptDataIsOut = false;

        /**
         * 是否处于键盘选择状态
         * @private
         * @type Boolean
         */
        this._onKeyboardSelecting = false;

        /**
         * 提示层的当前选中项
         * @type Boolean
         */
        this.selectedItem = null;

        // init
        this._init();
		
		 /**
         * 初始化方法
         * @protected
         */
        this._init= function() {
            // init DOM
            this._initTextInput();
            this._initContainer();
            if (this.config.useShim) this._initShim();
            this._initStyle();

            // create events
            this.createEvent(BEFORE_DATA_REQUEST);
            this.createEvent(ON_DATA_RETURN);
            this.createEvent(BEFORE_SHOW);
            this.createEvent(ON_ITEM_SELECT);

            // window resize event
            this._initResizeEvent();
        };
		 this._initTextInput= function() {
            var instance = this;

            // turn off autocomplete
            this.textInput.setAttribute("autocomplete", "off");

            // focus
            Event.on(this.textInput, "focus", function() {
                instance.start();
            });

            // blur
            Event.on(this.textInput, "blur", function() {
                instance.stop();
                instance.hide();
            });

            // auto focus
            if (this.config.autoFocus) this.textInput.focus();

            // keydown
            // 注：截至目前，在Opera9.64中，输入法开启时，依旧不会触发任何键盘事件
            var pressingCount = 0; // 持续按住某键时，连续触发的keydown次数。注意Opera只会触发一次。
            Event.on(this.textInput, "keydown", function(ev) {
                var keyCode = ev.keyCode;
                //console.log("keydown " + keyCode);

                switch (keyCode) {
                    case 27: // ESC键，隐藏提示层并还原初始输入
                        instance.hide();
                        instance.textInput.value = instance.query;
                        break;
                    case 13: // ENTER键
                        // 提交表单前，先隐藏提示层并停止计时器
                        instance.textInput.blur(); // 这一句还可以阻止掉浏览器的默认提交事件

                        // 如果是键盘选中某项后回车，触发onItemSelect事件
                        if (instance._onKeyboardSelecting) {
                            if (instance.textInput.value == instance._getSelectedItemKey()) { // 确保值匹配
                                instance.fireEvent(ON_ITEM_SELECT, instance.textInput.value);
                            }
                        }

                        // 提交表单
                        instance._submitForm();

                        break;
                    case 40: // DOWN键
                    case 38: // UP键
                        // 按住键不动时，延时处理
                        if (pressingCount++ == 0) {
                            if (instance._isRunning) instance.stop();
                            instance._onKeyboardSelecting = true;
                            instance.selectItem(keyCode == 40);

                        } else if (pressingCount == 3) {
                            pressingCount = 0;
                        }
                        break;
                    case 46: //DEL键
                    case 8: //BACKSPACE键
                    	instance.textInput1.value="";
                    	instance.textInput2.value="";
                    	instance.textInput3.value="";
                    	instance.textInput4.value="";
                    	instance.textInput5.value="";
                    	instance.nametext.value="";
        			   break;
                }

                // 非 DOWN/UP 键时，开启计时器
                if (keyCode != 40 && keyCode != 38) {
                    if (!instance._isRunning) {
                        // 1. 当网速较慢，js还未下载完时，用户可能就已经开始输入
                        //    这时，focus事件已经不会触发，需要在keyup里触发定时器
                        // 2. 非DOWN/UP键时，需要激活定时器
                        instance.start();
                    }
                    instance._onKeyboardSelecting = false;
                }
            });

            // reset pressingCount
            Event.on(this.textInput, "keyup", function() {
                //console.log("keyup");
                pressingCount = 0;
            });
        }
   
      /**
         * 初始化提示层容器
         * @protected
         */
        this._initContainer=function() {
            // create
            var container = document.createElement("div"),
                customContainerClass = this.config.containerClass;

            container.className = CONTAINER_CLASS;
            if(customContainerClass) {
                container.className += " " + customContainerClass;
            }
            container.style.position = "absolute";
            container.style.visibility = "hidden";
            this.container = container;

            this._setContainerRegion();
            this._initContainerEvent();

            // append
            document.body.insertBefore(container, document.body.firstChild);
        }
     /**
         * 设置容器的left, top, width
         * @protected
         */
        this._setContainerRegion= function() {
            var r = Dom.getRegion(this.textInput);
       
           
            var left = r.left, w = r.right - left - 2;  // 减去border的2px
         
            // bug fix: w 应该判断下是否大于 0, 后边设置 width 的时候如果小于 0, ie 下会报参数无效的错误
            w = w > 0 ? w : 0;

            // ie8兼容模式
            // document.documentMode:
            // 5 - Quirks Mode
            // 7 - IE7 Standards
            // 8 - IE8 Standards
            var docMode = document.documentMode;
            if (docMode === 7 && (ie === 7 || ie === 8)) {
                left -= 2;
            } else if (YAHOO.env.ua.gecko) { // firefox下左偏一像素 注：当 input 所在的父级容器有 margin: auto 时会出现
                left++;
            }
      
            this.container.style.left = left + "px";
            this.container.style.top = r.bottom + "px";

            if (this.config.containerWidth == "auto") {
                this.container.style.width = w + "px";
            } else {
                this.container.style.width = this.config.containerWidth;
            }
        }
    this._initContainerEvent= function() {
            var instance = this;

            // 鼠标事件
            Event.on(this.container, "mousemove", function(ev) {
                //console.log("mouse move");
                var target = Event.getTarget(ev);

                if (target.nodeName != "LI") {
                    target = Dom.getAncestorByTagName(target, "li");
                }
                if (Dom.isAncestor(instance.container, target)) {
                    if (target != instance.selectedItem) {
                        // 移除老的
                        instance._removeSelectedItem();
                        // 设置新的
                        instance._setSelectedItem(target);
                    }
                }
            });

            var mouseDownItem = null;
            this.container.onmousedown = function(e) {
                e = e || window.event;
                // 鼠标按下处的item
                mouseDownItem = e.target || e.srcElement;

                // 鼠标按下时，让输入框不会失去焦点
                // 1. for IE
                instance.textInput.onbeforedeactivate = function() {
                    window.event.returnValue = false;
                    instance.textInput.onbeforedeactivate = null;
                };
                // 2. for W3C
                return false;
            };

            // mouseup事件
            Event.on(this.container, "mouseup", function(ev) {
                // 当mousedown在提示层，但mouseup在提示层外时，点击无效
                if (!instance._isInContainer(Event.getXY(ev))) return;
                var target = Event.getTarget(ev);
                // 在提示层A项处按下鼠标，移动到B处释放，不触发onItemSelect
                if (target != mouseDownItem) return;

                // 点击在关闭按钮上
                if (target.className == CLOSE_BTN_CLASS) {
                    instance.hide();
                    return;
                }

                // 可能点击在li的子元素上
                if (target.nodeName != "LI") {
                    target = Dom.getAncestorByTagName(target, "li");
                }
                // 必须点击在container内部的li上
                if (Dom.isAncestor(instance.container, target)) {
                    instance._updateInputFromSelectItem(target);

                    // 触发选中事件
                    //console.log("on item select");
                    instance.fireEvent(ON_ITEM_SELECT, instance.textInput.value);

                    // 提交表单前，先隐藏提示层并停止计时器
                    instance.textInput.blur();

                    // 提交表单
                    instance._submitForm();
                }
            });
        }
 /**
         * click选择 or enter后，提交表单
         */
       this._submitForm= function() {
            // 注：对于键盘控制enter选择的情况，由html自身决定是否提交。否则会导致某些输入法下，用enter选择英文时也触发提交
            if (this.config.submitFormOnClickSelect) {
                var form = this.textInput.form;
                if (!form) return;

                // 通过js提交表单时，不会触发onsubmit事件
                // 需要js自己触发
                if (document.createEvent) { // w3c
                    var evObj = document.createEvent("MouseEvents");
                    evObj.initEvent("submit", true, false);
                    form.dispatchEvent(evObj);
                }
                else if (document.createEventObject) { // ie
                    form.fireEvent("onsubmit");
                }

                form.submit();
            }
        }
   
        /**
         * 判断p是否在提示层内
         * @param {Array} p [x, y]
         */
        this._isInContainer= function(p) {
            var r = Dom.getRegion(this.container);
            return p[0] >= r.left && p[0] <= r.right && p[1] >= r.top && p[1] <= r.bottom;
        }
		 /**
         * 给容器添加iframe shim层
         * @protected
         */
        this._initShim= function() {
            var iframe = document.createElement("iframe");
            iframe.src = "about:blank";
            iframe.className = SHIM_CLASS;
            iframe.style.position = "absolute";
            iframe.style.visibility = "hidden";
            iframe.style.border = "none";
            this.container.shim = iframe;

            this._setShimRegion();
            document.body.insertBefore(iframe, document.body.firstChild);
        }
		 /**
         * 设置shim的left, top, width
         * @protected
         */
        this._setShimRegion= function() {
            var container = this.container, shim = container.shim;
            if (shim) {
                shim.style.left = (parseInt(container.style.left) - 2) + "px"; // 解决吞边线bug
                shim.style.top = container.style.top;
                shim.style.width = (parseInt(container.style.width) + 2) + "px";
            }
        }
		  /**
         * 初始化样式
         * @protected
         */
        this._initStyle= function() {
            var styleEl = Dom.get(STYLE_ID);
            if (styleEl) return; // 防止多个实例时重复添加

            var style = ".suggest-container{background:white;border:1px solid #999;z-index:99999}";
            style += ".suggest-shim{z-index:99998}";
            style += ".suggest-container li{color:#404040;padding:1px 0 2px;font-size:12px;line-height:18px;float:left;width:100%}";
            style += ".suggest-container li.selected{background-color:#39F;cursor:default}";
            style += ".suggest-key{float:left;text-align:left;padding-left:5px}";
            style += ".suggest-result{float:right;text-align:right;padding-right:5px;color:green}";
            style += ".suggest-container li.selected span{color:#FFF;cursor:default}";
            //style += ".suggest-container li.selected .suggest-result{color:green}";
            style += ".suggest-bottom{padding:0 5px 5px}";
            style += ".suggest-close-btn{float:right}";
            style += ".suggest-container li,.suggest-bottom{overflow:hidden;zoom:1;clear:both}";
            /* hacks */
            style += ".suggest-container{*margin-left:2px;_margin-left:-2px;_margin-top:-3px}";

            styleEl = document.createElement("style");
            styleEl.id = STYLE_ID;
            styleEl.type = "text/css";
            head.appendChild(styleEl); // 先添加到DOM树中，都在cssText里的hack会失效

            if (styleEl.styleSheet) { // IE
                styleEl.styleSheet.cssText = style;
            } else { // W3C
                styleEl.appendChild(document.createTextNode(style));
            }
        }
        /**
         * window.onresize时，调整提示层的位置
         * @protected
         */
        this._initResizeEvent= function() {
            var instance = this, resizeTimer;

            Event.on(window, "resize", function() {
                if (resizeTimer) {
                    clearTimeout(resizeTimer);
                }

                resizeTimer = setTimeout(function() {
                    instance._setContainerRegion();
                    instance._setShimRegion();
                }, 50);
            });
        }
		 /**
         * 启动计时器，开始监听用户输入
         */
        this.start= function() {
            NS.Suggest.focusInstance = this;

            var instance = this;
            instance._timer = setTimeout(function() {
                instance.updateData();
                instance._timer = setTimeout(arguments.callee, instance.config.timerDelay);
            }, instance.config.timerDelay);

            this._isRunning = true;
        }
		      /**
         * 停止计时器
         */
        this.stop= function() {
            NS.Suggest.focusInstance = null;
            clearTimeout(this._timer);
            this._isRunning = false;
        }
		  /**
         * 显示提示层
         */
        this.show= function() {
            if (this.isVisible()) return;
            var container = this.container, shim = container.shim;

            container.style.visibility = "";

            if (shim) {
                if (!shim.style.height) { // 第一次显示时，需要设定高度
                    var r = Dom.getRegion(container);
                    shim.style.height = (r.bottom - r.top - 2) + "px";
                }
                shim.style.visibility = "";
            }
        }
		  /**
         * 隐藏提示层
         */
        this.hide= function() {
            if (!this.isVisible()) return;
            var container = this.container, shim = container.shim;
            //console.log("hide");

            if (shim) shim.style.visibility = "hidden";
            container.style.visibility = "hidden";
        }
		 /**
         * 提示层是否显示
         */
        this.isVisible= function() {
            return this.container.style.visibility != "hidden";
        }
		        /**
         * 更新提示层的数据
         */
        this.updateData= function() {
            if (!this._needUpdate()) return;
            //console.log("update data");

            this._updateQueryValueFromInput();
            var q = this.query;

            // 1. 输入为空时，隐藏提示层
            if (!Lang.trim(q).length) {
                this._fillContainer("");
                this.hide();
                return;
            }

            if (typeof this._dataCache[q] != "undefined") { // 2. 使用缓存数据
                //console.log("use cache");
                this.returnedData = "using cache";
                this._fillContainer(this._dataCache[q]);
                this._displayContainer();

            } else if (this.JSONDataSource) { // 3. 使用JSON静态数据源
                this.handleResponse(this.JSONDataSource[q]);

            } else { // 4. 请求服务器数据
                this.requestData();
            }
        }
		        /**
         * 是否需要更新数据
         * @protected
         * @return Boolean
         */
        this._needUpdate= function() {
            // 注意：加入空格也算有变化
            return this.textInput.value != this.query;
        }
		  /**
         * 通过script元素加载数据
         */
        this.requestData= function() {
            //console.log("request data via script");
            if (!ie) this.dataScript = null; // IE不需要重新创建script元素

            if (!this.dataScript) {
                var script = document.createElement("script");
                script.type = "text/javascript";
                script.charset = "utf-8";

                // jQuery ajax.js line 275:
                // Use insertBefore instead of appendChild  to circumvent an IE6 bug.
                // This arises when a base node is used.
                head.insertBefore(script, head.firstChild);
                this.dataScript = script;

                if (!ie) {
                    var t = new Date().getTime();
                    this._latestScriptTime = t;
                    script.setAttribute("time", t);

                    Event.on(script, "load", function() {
                        //console.log("on load");
                        // 判断返回的数据是否已经过期
                        this._scriptDataIsOut = script.getAttribute("time") != this._latestScriptTime;
                    }, this, true);
                }
            }

            // 注意：没必要加时间戳，是否缓存由服务器返回的Header头控制
            this.queryParams = "queryCode=" + encodeURIComponent(this.query) + "&code=utf-8&callback=" + CALLBACK_STR;
            this.fireEvent(BEFORE_DATA_REQUEST, this.query);
            this.dataScript.src = this.dataSource + "?" + this.queryParams;
        }
	  /**
         * 处理获取的数据
         * @param {Object} data
         */
        this.handleResponse= function(data) {
            //console.log("handle response");
            if (this._scriptDataIsOut) return; // 抛弃过期数据，否则会导致bug：1. 缓存key值不对； 2. 过期数据导致的闪屏

            this.returnedData = data;
            this.fireEvent(ON_DATA_RETURN, data);

            // 格式化数据
            this.returnedData = this.formatData(this.returnedData);

            // 填充数据
            var content = "";
            var len = this.returnedData.length;
            if (len > 0) {
                var list = document.createElement("ol");
                for (var i = 0; i < len; ++i) {
                    var itemData = this.returnedData[i];
                    var li = this.formatItem(itemData["key"], itemData["result"], itemData["cailiaoPinpai"] ,itemData["cailiaoGuige"], itemData["cailiaoDanwei"], itemData["cailiaoJiage"]);
                    // 缓存key值到attribute上
                    li.setAttribute("key", itemData["key"]);
                    li.setAttribute("result", itemData["result"]);
					//--------------------------------缓存需要写回到页面的值 START
					//Add by guxiao 2009.11.10
					li.setAttribute("cailiaoPinpai", itemData["cailiaoPinpai"]);
					li.setAttribute("cailiaoGuige", itemData["cailiaoGuige"]);
					li.setAttribute("cailiaoDanwei", itemData["cailiaoDanwei"]);
					li.setAttribute("cailiaoJiage", itemData["cailiaoJiage"]);
					//--------------------------------缓存需要写回到页面的值 EDN
                    list.appendChild(li);
                }
                content = list;
            }
            this._fillContainer(content);

            // 有内容时才添加底部
            if (len > 0) this.appendBottom();

            // fire event
            if (Lang.trim(this.container.innerHTML)) {
                // 实际上是beforeCache，但从用户的角度看，是beforeShow
                this.fireEvent(BEFORE_SHOW, this.container);
            }

            // cache
            this._dataCache[this.query] = this.container.innerHTML;

            // 显示容器
            this._displayContainer();
        }
		   /**
         * 格式化输入的数据对象为标准格式
         * @param {Object} data 格式可以有3种：
         *  1. {"result" : [["key1", "result1"], ["key2", "result2"], ...]}
         *  2. {"result" : ["key1", "key2", ...]}
         *  3. 1和2的组合
         *  4. 标准格式
         *  5. 上面1-4中，直接取o["result"]的值
         * @return Object 标准格式的数据：
         *  [{"key" : "key1", "result" : "result1"}, {"key" : "key2", "result" : "result2"}, ...]
         */
        this.formatData= function(data) {
            var arr = [];
            if (!data) return arr;
            if (Lang.isArray(data["result"])) data = data["result"];
            var len = data.length;
            if (!len) return arr;

            var item;
            for (var i = 0; i < len; ++i) {
                item = data[i];
                /*
                if (Lang.isString(item)) { // 只有key值时
                    arr[i] = {"key" : item};
                }
                */
                //------------------------------------------格式化得到的数据 START
                //Add by guxiao 2009.11.10
                if (Lang.isArray(item) && item.length >= 6) { // 取数组前6个
                	arr[i] = {"key" : item[0], "result" : item[1], "cailiaoPinpai" : item[2], "cailiaoGuige" : item[3], "cailiaoDanwei" : item[4], "cailiaoJiage" : item[5]};
                //------------------------------------------格式化得到的数据 END
                //	else if (Lang.isArray(item) && item.length >= 3) { // ["key", "result"] 取数组前2个
                } else {
                    arr[i] = item;
                }
            }
            return arr;
        }
		 /**
         * 格式化输出项
         * @param {String} key 查询字符串
         * @param {Number} result 结果 可不设
         * @return {HTMLElement}
         */
       this.formatItem=function(key, result, cailiaoPinpai, cailiaoGuige, cailiaoDanwei, cailiaoJiage) {
            var li = document.createElement("li");
          //------------------------------------将需要显示的数据添加到li上 START
            //Add by guxiao 2009.11.10
            var keyEl = document.createElement("span");
            keyEl.className = KEY_EL_CLASS;
            keyEl.appendChild(document.createTextNode(key));
            li.appendChild(keyEl);
            
            //var keyEl = document.createElement("span");
            //keyEl.className = KEY_EL_CLASS;
            //keyEl.appendChild(document.createTextNode(result));
          //  li.appendChild(keyEl);
            
            var keyEl = document.createElement("span");
            keyEl.className = KEY_EL_CLASS;
            keyEl.appendChild(document.createTextNode(cailiaoPinpai));
            li.appendChild(keyEl);
            
            var keyEl = document.createElement("span");
            keyEl.className = KEY_EL_CLASS;
            keyEl.appendChild(document.createTextNode(cailiaoGuige));
            li.appendChild(keyEl);
            
            var keyEl = document.createElement("span");
            keyEl.className = KEY_EL_CLASS;
            keyEl.appendChild(document.createTextNode(cailiaoDanwei));
            li.appendChild(keyEl);
            
            var keyEl = document.createElement("span");
            keyEl.className = KEY_EL_CLASS;
            keyEl.appendChild(document.createTextNode(cailiaoJiage));
            li.appendChild(keyEl);
                  
            //------------------------------------将需要显示的数据添加到li上 END
            /*
            if (typeof result != "undefined") { // 可以没有
                var resultText = this.config.resultFormat.replace("%result%", result);
                if (Lang.trim(resultText)) { // 有值时才创建
                    var resultEl = document.createElement("span");
                    resultEl.className = RESULT_EL_CLASS;
                    resultEl.style.visibility = "hidden";
					resultEl.appendChild(document.createTextNode(resultText));
                    li.appendChild(resultEl);
                }
            }
            */
            return li;
        }
		   /**
         * 添加提示层底部
         */
        this.appendBottom= function() {
            var bottom = document.createElement("div");
            bottom.className = BOTTOM_CLASS;

            if (this.config.showCloseBtn) {
                var closeBtn = document.createElement("a");
                closeBtn.href = "javascript: void(0)";
                closeBtn.setAttribute("target", "_self"); // bug fix: 覆盖<base target="_blank" />，否则会弹出空白页面
                closeBtn.className = CLOSE_BTN_CLASS;
                closeBtn.appendChild(document.createTextNode(this.config.closeBtnText));

                // 没必要，点击时，输入框失去焦点，自动就关闭了
                /*
                 Event.on(closeBtn, "click", function(ev) {
                 Event.stopEvent(ev);
                 this.hidden();
                 }, this, true);
                 */

                bottom.appendChild(closeBtn);
            }

            // 仅当有内容时才添加
            if (Lang.trim(bottom.innerHTML)) {
                this.container.appendChild(bottom);
            }
        }
		 /**
         * 填充提示层
         * @protected
         * @param {String|HTMLElement} content innerHTML or Child Node
         */
        this._fillContainer= function(content) {
            if (content.nodeType == 1) {
                this.container.innerHTML = "";
                this.container.appendChild(content);
            } else {
                this.container.innerHTML = content;
            }

            // 一旦重新填充了，selectedItem就没了，需要重置
            this.selectedItem = null;
        }
		   /**
         * 根据contanier的内容，显示或隐藏容器
         */
         this._displayContainer= function() {
            if (Lang.trim(this.container.innerHTML)) {
                this.show();
            } else {
                this.hide();
            }
        }
		 /**
         * 选中提示层中的上/下一个条
         * @param {Boolean} down true表示down，false表示up
         */
        this.selectItem= function(down) {
            //console.log("select item " + down);
            var items = this.container.getElementsByTagName("li");
            if (items.length == 0) return;

            // 有可能用ESC隐藏了，直接显示即可
            if (!this.isVisible()){
                this.show();
                return; // 保留原来的选中状态
            }
            var newSelectedItem;

            // 没有选中项时，选中第一/最后项
            if (!this.selectedItem) {
                newSelectedItem = items[down ? 0 : items.length - 1];
            } else {
                // 选中下/上一项
                newSelectedItem = Dom[down ? "getNextSibling" : "getPreviousSibling"](this.selectedItem);
                // 已经到了最后/前一项时，归位到输入框，并还原输入值
                if (!newSelectedItem) {
                    this.textInput.value = this.query;
                }
            }

            // 移除当前选中项
            this._removeSelectedItem();

            // 选中新项
            if (newSelectedItem) {
                this._setSelectedItem(newSelectedItem);
                this._updateInputFromSelectItem();
            }
        }
		  /**
         * 移除选中项
         * @protected
         */
        this._removeSelectedItem= function() {
            //console.log("remove selected item");
            Dom.removeClass(this.selectedItem, SELECTED_ITEM_CLASS);
            this.selectedItem = null;
        }
		/**
         * 设置当前选中项
         * @protected
         * @param {HTMLElement} item
         */
        this._setSelectedItem= function(item) {
            //console.log("set selected item");
            Dom.addClass((item), SELECTED_ITEM_CLASS);
            this.selectedItem = (item);
        }
		      /**
         * 获取提示层中选中项的key字符串
         * @protected
         */
        this._getSelectedItemKey= function() {
            if (!this.selectedItem) return "";

            // getElementsByClassName比较损耗性能，改用缓存数据到attribute上方法
            //var keyEl = Dom.getElementsByClassName(KEY_EL_CLASS, "*", this.selectedItem)[0];
            //return keyEl.innerHTML;

            return this.selectedItem.getAttribute("key");
        }
		     /**
         * 将textInput的值更新到this.query
         * @protected
         */
        this._updateQueryValueFromInput= function() {
            this.query = this.textInput.value;
        }
		   /**
         * 将选中项的值更新到textInput
         * @protected
         */
        this._updateInputFromSelectItem=function() {
            this.textInput.value = this._getSelectedItemKey(this.selectedItem);
           this.nametext.value=this._getSelectedItemKey(this.selectedItem);
            //-------------------------将弹出层中的部分数据写回到页面的输入框中 START
            //Add by guxiao 2009.11.10
            if(this.selectedItem.getAttribute("result")!=null){
            	this.textInput1.value=this.selectedItem.getAttribute("result");
            }
            if(this.selectedItem.getAttribute("cailiaoPinpai")!=null){
            	this.textInput2.value=this.selectedItem.getAttribute("cailiaoPinpai");
            }
            if(this.selectedItem.getAttribute("cailiaoGuige")!=null){
            	this.textInput3.value=this.selectedItem.getAttribute("cailiaoGuige");
            }
            if(this.selectedItem.getAttribute("cailiaoDanwei")!=null){
            	this.textInput4.value=this.selectedItem.getAttribute("cailiaoDanwei");
            }
            if(this.selectedItem.getAttribute("cailiaoJiage")!=null){
            	this.textInput5.value=this.selectedItem.getAttribute("cailiaoJiage");
            }
            //-------------------------将弹出层中的部分数据写回到页面的输入框中 END
        }

    
    }