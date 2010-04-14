/**
 * @author zhangdaiping@vip.qq.com
 * @version 1.3.1 (10/3/2010)
 */
Ext.ux.tree.TreeGridEditor = Ext.extend(Ext.ux.tree.TreeGrid, {
    // 展开动画
    animate: false,
    
    // 列菜单
    enableHdMenu: false,
    
    // 列宽度调整
    columnResize: false,
    
    // 默认true立即设置列表滚动条，false延迟10毫秒设置
    reserveScrollOffset: true,
    
    // 排序
    enableSort: false,
    
    // vista样式
    useArrows: false,
    
    // 禁用样式 
    unstyled: false,
    
    // 最大深度（层级）
    maxDepth: 0,
    
    // 超出最大深度，提示信息
    maxDepthText: 'Maximum node depth.',
    
    // 根节点ID
    rootNodeId: 'tge-root',
    
    // 复选框
    checkbox: false,
    
    // 取值范围: 'multiple' 'single'
    checkMode: 'multiple',
    
    obarHeaderText: 'Manage',
    
    obarBtnText: {
        add: 'Add child',
        edit: 'Edit',
        remove: 'Remove',
        save: 'Save',
        cancel: 'Cancel'
    },
    
    // private
    initComponent: function() {
        this.autoScroll = false, lines = false;
        this.enableDD = this.enableDrag = this.enableDrop = false;
        this.rootVisible = false;
        
        if (this.checkMode === 'single') {
            this.cascadeCheck = false;
        }
        
        if (!this.obarCfg) {
            this.obarCfg = {
                column: ccfg,
                btns: [{
                    id: 'add',
                    disabled: false,
                    text: this.obarBtnText.add
                }, {
                    id: 'edit',
                    disabled: false,
                    text: this.obarBtnText.edit
                }, {
                    id: 'remove',
                    disabled: false,
                    text: this.obarBtnText.remove
                }],
                listeners: {}
            };
        } else {
            this.obarCfg.column = this.obarCfg.column || ccfg;
            this.obarCfg.btns = this.obarCfg.btns || [];
            this.obarCfg.listeners = this.obarCfg.listeners ||
            {};
        }
        
        if (!this.obar) {
            this.obar = new Ext.ux.tree.TreeGridEditor.Obar(this, {
                listeners: this.obarCfg.listeners
            });
        }
        if (!this.obar.tge) {
            this.obar.setTge(this);
        }
        
        if (!this.root) {
            this.root = new Ext.ux.tree.TreeGridEditorAsyncNode({
                id: this.rootNodeId,
                text: 'TreeGridEditor Root'
            });
        }
        
        Ext.ux.tree.TreeGridEditor.superclass.initComponent.apply(this, arguments);
        
        this.loader.createNode = function(attr) {
            return Ext.ux.tree.TreeGridEditorLoader.prototype.createNode.call(this, attr);
        }
        
        this.selModel = new Ext.ux.tree.TreeGridEditorSelectionModel(this);
    },
    
    // private
    beforeDestroy: function() {
        Ext.destroy(this.obar);
        this.obar = null;
        Ext.ux.tree.TreeGridEditor.superclass.beforeDestroy.call(this);
    },
    
    // private
    registerNode: function(n) {
        Ext.ux.tree.TreeGridEditor.superclass.registerNode.call(this, n);
        if (!n.uiProvider && !n.isRoot && !n.ui.isTreeGridNodeUI) {
            n.ui = new Ext.ux.tree.TreeGridEditorNodeUI(n);
        }
    },
    
    // private
    initColumns: function() {
        var cols = this.columns, columns = [], col;
        for (var i = 0, len = cols.length; i < len; i++) {
            col = cols[i];
            col.cls = col.cls || '';
            col.cls = 'x-treegrideditor-inputfield ' + col.cls;
            col.displayTip = col.displayTip || false;
            col.inputCfg = col.inputCfg ||
            {};
            col.inputCfg.inputType = col.inputCfg.inputType || 'text';
            col.inputCfg.inputType = col.inputCfg.inputType.toLowerCase();
            col.inputCfg.defaultValue = col.inputCfg.defaultValue || '';
            columns.push(col);
        }
        this.columns = columns;
        
        Ext.ux.tree.TreeGridEditor.superclass.initColumns.apply(this, arguments);
        
        this.colTpls = [];
        cols = this.columns;
        for (var i = 0, len = cols.length; i < len; i++) {
            col = cols[i];
            this.colTpls.push(col.tpl);
        }
        
        var self = this, c = {
            xtype: 'tgcolumn'
        }, ccfg = {
            header: this.obarHeaderText,
            dataIndex: 'id',
            width: 200
        };
        
        this.obar.btns = [];
        var btns = this.obarCfg.btns;
        for (var i = 0, len = btns.length; i < len; i++) {
            if (btns[i].id === 'update' || btns[i].id === 'cancel') {
                continue;
            }
            
            var req = btns[i].request || false;
            if (req) {
                req.method = req.method ? req.method.toUpperCase() : 'POST';
            }
            this.obar.btns[btns[i].id] = {
                disabled: btns[i].disabled || false,
                cls: btns[i].cls || '',
                text: btns[i].text || this.obarBtnText[btns[i].id],
                deepest: btns[i].deepest || 'normal',
                request: req,
                validator: btns[i].validator ||
                function() {
                    return true;
                }
            }
        }
        
        c.obarTag = true;
        c.header = this.obarCfg.column.header || this.defaultObarHeaderText;
        c.dataIndex = this.obarCfg.column.dataIndex || 'id';
        c.width = this.obarCfg.column.width || 200;
        c.autoWidth = this.obarCfg.column.autoWidth || false;
        c.align = this.obarCfg.column.align || 'left';
        c.cls = this.obarCfg.column.cls || '';
        c.tpl = new Ext.XTemplate('{' + c.dataIndex + ':this.obarHtml}', {
            obarHtml: function(v) {
                return self.obarHtml.call(self, v)
            }
        });
        c = Ext.create(c);
        c.init(this);
        this.columns.push(c);
    },
    
    // private
    onResize: function(w, h) {
        w = w || this.getWidth();
        w = w === 'auto' ? this.getWidth() : w;
        // fix for firefox
        var ua = navigator.userAgent.toLowerCase();
        w = /firefox/.test(ua) ? w - 17 : w;
        h = h || this.getHeight();
        var tc = tw = 0;
        var cols = this.columns;
        Ext.each(cols, function(col, i, cols) {
            if (col.autoWidth) {
                tc++;
            } else {
                tw += col.width;
            }
        }, this);
        if (tc > 0) {
            var av = (w - tw - 20) / tc;
            av = av < 100 ? 100 : av;
            Ext.each(cols, function(col, i, cols) {
                if (col.autoWidth) {
                    col.width = av;
                }
            }, this);
        }
        
        Ext.ux.tree.TreeGridEditor.superclass.onResize.apply(this, arguments);
        
        var colEls = this.el.select('table > colgroup');
        colEls.each(function(c, colEls, i) {
            var t = Ext.get(c.dom.parentNode);
            t.setWidth(w - 20);
            c.remove();
            this.colgroupTpl.insertFirst(t, {
                columns: cols
            });
        }, this);
    },
    
    // private 
    getChecked: function(a, startNode) {
        if (this.checkMode === 'single') {
            var n, c = document.getElementsByName('x-treegrideditor-node-cb');
            for (var i = 0; i < c.length; i++) {
                if (c[i].checked) {
                    n = c[i].value;
                    break;
                }
            }
            if (n) {
                n = this.getNodeById(n);
                return !a ? n : (a == 'id' ? n.id : n.attributes[a]);
            }
            return null;
        } else {
            return Ext.ux.tree.TreeGridEditor.superclass.getChecked.apply(this, arguments);
        }
    },
    
    // private
    registerInputField: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        
        var cols = this.columns, col;
        for (var i = 0, len = cols.length - 1; i < len; i++) {
            col = cols[i];
            n.registerInputField(col.dataIndex, col.inputCfg);
        }
        
        return n.getInputFields();
    },
    
    // private
    unregisterInputField: function(n) {
        n.destroyInputField();
    },
    
    // private
    removeColTpl: function() {
        var cols = this.columns, tpls = this.colTpls;
        for (var i = 0, len = tpls.length; i < len; i++) {
            cols[i].tpl = null;
        }
    },
    
    // private
    restoreColTpl: function() {
        var cols = this.columns, tpls = this.colTpls;
        for (var i = 0, len = tpls.length; i < len; i++) {
            cols[i].tpl = tpls[i];
        }
    },
    
    // private
    obarHtml: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var r = [];
        r.push('<div class="x-treegrideditor-obar" unselectable="on">');
        if (n.getEditMode()) {
            r.push(this.saveBtnsHtml(n));
        } else {
            r.push(this.editBtnsHtml(n));
        }
        r.push('</div>');
        return r.join('');
    },
    
    // private
    editBtnsHtml: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var deepest = this.maxDepth > 0 && n.getDepth() >= this.maxDepth;
        var r = [], btns = this.obarCfg.btns, btn, m, mu, disableObar, hideObar;
        
        for (var i = 0, len = btns.length; i < len; i++) {
            btn = btns[i];
            if (btn.disabled) {
                continue;
            }
            
            if (deepest && btn.deepestState === 'uncreated') {
                continue;
            }
            
            m = btn.id;
            mu = m.substring(0, 1).toUpperCase() + m.substring(1);
            disableObar = n.attributes['disableObar' + mu];
            hideObar = n.attributes['hideObar' + mu];
            
            r.push('<span id="', n.id, '-obar-', m, '" unselectable="on"');
            if (deepest) {
                if (btn.deepestState === 'hidden' || hideObar) {
                    r.push(' style="display: none;"');
                }
            } else {
                r.push(hideObar ? ' style="display: none;"' : '');
            }
            r.push('>');
            r.push('<a');
            if (deepest) {
                if (btn.deepestState === 'disabled' || disableObar) {
                    r.push(' disabled="true" style="color: #ACA899;"');
                }
            } else {
                r.push(disableObar ? ' disabled="true" style="color: #ACA899;"' : '');
            }
            r.push(' hidefocus="on" href="javascript:false;" class="x-treegrideditor-obar-', m);
            if (deepest) {
                if (btn.deepestState === 'disabled' || disableObar) {
                    r.push(' x-treegrideditor-obar-' + m + '-gray');
                }
            } else {
                r.push(disableObar ? ' x-treegrideditor-obar-' + m + '-gray' : '');
            }
            r.push(Ext.isIE ? ' x-treegrideditor-obar-' + m + '-ie' : '', Ext.isEmpty(btn.cls) ? '' : ' ' + btn.cls, '" onclick="Ext.getCmp(\'', this.id, '\').callObarMethod(\'', n.id, '\',\'', m, '\');return false;">', this.obar.btns[m].text, '</a>');
            r.push('</span>');
        }
        return r.join('');
    },
    
    // private
    saveBtnsHtml: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var r = [];
        r.push('<span id="', n.id, '-obar-yes" unselectable="on">');
        r.push('<a hidefocus="on" href="javascript:false;" class="x-treegrideditor-obar-yes', Ext.isIE ? ' x-treegrideditor-obar-yes-ie' : '', '" onclick="Ext.getCmp(\'', this.id, '\').updateNode(\'', n.id, '\');return false;">', this.obarBtnText.save, '</a>');
        r.push('</span>');
        r.push('<span id="', n.id, '-obar-no" unselectable="on">');
        r.push('<a hidefocus="on" href="javascript:false;" class="x-treegrideditor-obar-no', Ext.isIE ? ' x-treegrideditor-obar-no-ie' : '', '" onclick="Ext.getCmp(\'', this.id, '\').cancelEdit(\'', n.id, '\');return false;">', this.obarBtnText.cancel, '</a>');
        r.push('</span>');
        return r.join('');
    },
    
    /**
     * 调用Obar函数
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    callObarMethod: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (n.attributes['disableObar' + m.substring(0, 1).toUpperCase() + m.substring(1)]) {
            return;
        }
        this.obar[m](n);
    },
    
    /**
     * 激活obar功能按钮
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    enableObar: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (m == 'add' && this.maxDepth > 0 && n.getDepth() >= this.maxDepth) {
            return;
        }
        
        n.attributes['disableObar' + m.substring(0, 1).toUpperCase() + m.substring(1)] = false;
        var b = Ext.get(n.id + '-obar-' + m).child('a');
        b.set({
            disabled: false
        });
        b.setStyle({
            color: ''
        });
        b.removeClass('x-treegrideditor-obar-' + m + '-gray');
        b.focus();
        n.select();
    },
    
    /**
     * 禁用obar功能按钮
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    disableObar: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (m == 'add' && this.maxDepth > 0 && n.getDepth() >= this.maxDepth) {
            return;
        }
        
        n.attributes['disableObar' + m.substring(0, 1).toUpperCase() + m.substring(1)] = true;
        var b = Ext.get(n.id + '-obar-' + m).child('a');
        b.focus();
        b.set({
            disabled: true
        });
        b.setStyle({
            color: '#ACA899'
        });
        b.addClass('x-treegrideditor-obar-' + m + '-gray');
        n.select();
    },
    
    /**
     * 自适应启用/禁用obar功能按钮
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    toggleDisableObar: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (n.attributes['disableObar' + m.substring(0, 1).toUpperCase() + m.substring(1)]) {
            this.enableObar(n, m);
        } else {
            this.disableObar(n, m);
        }
    },
    
    /**
     * 显示obar功能按钮
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    showObar: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        n.attributes['hideObar' + m.substring(0, 1).toUpperCase() + m.substring(1)] = false;
        var b = Ext.get(n.id + '-obar-' + m);
        b.setDisplayed(true);
        b.child('a').focus();
        n.select();
    },
    
    /**
     * 隐藏obar功能按钮
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    hideObar: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        n.attributes['hideObar' + m.substring(0, 1).toUpperCase() + m.substring(1)] = true;
        var b = Ext.get(n.id + '-obar-' + m);
        b.child('a').focus();
        b.setDisplayed(false);
        n.select();
    },
    
    /**
     * 自适应显示/隐藏obar个功能按钮
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} m  obar方法id
     * @return void
     */
    toggleHideObar: function(n, m) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (n.attributes['hideObar' + m.substring(0, 1).toUpperCase() + m.substring(1)]) {
            this.showObar(n, m);
        } else {
            this.hideObar(n, m);
        }
    },
    
    // private
    activeObar: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var deepest = this.maxDepth > 0 && n.getDepth() >= this.maxDepth;
        if (!n.getEditMode() && deepest) {
            var btns = this.obarCfg.btns, btn;
            for (var i = 0, len = btns.length; i < len; i++) {
                btn = btns[i];
                if (btn.deepestState === 'disabled') {
                    this.disableObar(n, btn.id);
                } else if (btn.deepestState === 'hidden') {
                    this.hideObar(n, btn.id);
                }
            }
        }
    },
    
    /**
     * 生成节点ID，新增下级树节点时调用
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return String
     */
    makeNodeId: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (!this.nextNewNodeNumber) {
            this.nextNewNodeNumber = 0;
        }
        this.nextNewNodeNumber++;
        return n.id + '_n_' + this.nextNewNodeNumber;
    },
    
    /**
     * 新增树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return Ext.tree.TreeNode
     */
    addNode: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (n.getEditMode()) {
            return;
        }
        
        if (n.attributes['disableObarAdd']) {
            return;
        }
        
        if (this.maxDepth > 0 && n.getDepth() >= this.maxDepth) {
            if (Ext.isBoolean(this.maxDepthText) && !this.maxDepthText) {
                return;
            }
            Ext.Msg.alert('Message', this.maxDepthText);
            return;
        }
        
        var c;
        if (this.obar.fireEvent('beforeaddnode', this, n) !== false) {
            var ar = function(n) {
                var nc = {
                    id: this.makeNodeId(n),
                    leaf: true
                };
                
                this.removeColTpl();
                
                try {
                    c = new Ext.ux.tree.TreeGridEditorNode(nc);
                    c.editing = {};
                    c.editMode = 'add';
                    c.ui = new Ext.ux.tree.TreeGridEditorNodeUI(c);
                    n.leaf = false;
                    n.attributes.leaf = false;
                    n.appendChild(c);
                    
                    var inputFields = this.registerInputField(c);
                    
                    c.select();
                    n.ui.interceptEvent = true;
                    for (var p in inputFields) {
                        inputFields[p].focus();
                        break;
                    }
                } finally {
                    this.restoreColTpl();
                }
                
                this.obar.fireEvent('addnode', this, n, c);
            }
            n.expand(false, false, ar, this);
        }
        return c;
    },
    
    /**
     * 编辑树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    editNode: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (n.getEditMode()) {
            return;
        }
        
        if (n.attributes['disableObarEdit']) {
            return;
        }
        
        if (this.obar.fireEvent('beforeeditnode', this, n) !== false) {
            n.editing = Ext.apply({}, n.attributes);
            n.editMode = 'edit';
            var inputFields = this.registerInputField(n);
            
            var wrap = n.getUI().wrap, r = Ext.query('tr[treegrideditornodeid=' + n.id + ']', wrap);
            r = r[0];
            var o = Ext.fly(r).query('.x-treegrideditor-obar');
            Ext.DomHelper.overwrite(o[0], this.saveBtnsHtml(n));
            
            n.select();
            for (var p in inputFields) {
                inputFields[p].focus();
                break;
            }
            this.obar.fireEvent('editnode', this, n);
        }
    },
    
    /**
     * 取消编辑树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    cancelEdit: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (!n.getEditMode()) {
            return;
        }
        
        if (this.obar.fireEvent('beforecanceledit', this, n) !== false) {
            if (n.getEditMode() === 'edit') {
                var wrap = n.getUI().wrap, r = Ext.query('tr[treegrideditornodeid=' + n.id + ']', wrap);
                r = r[0];
                
                this.unregisterInputField(n);
                
                var cs = Ext.fly(r).query('span[treegrideditorinputfield], div[treegrideditorinputfield]');
                var cols = this.columns, col, nAttr, filterValue = function(c, v) {
                    if (v) {
                        v = Ext.util.Format.htmlEncode(v).replace(/ /g, "&nbsp;");
                    }
                    return v;
                };
                for (var i = 0, len = cols.length - 1; i < len; i++) {
                    col = cols[i], nAttr = Ext.apply({}, n.getEditing());
                    nAttr[col.dataIndex] = filterValue(col, nAttr[col.dataIndex]);
                    col.tpl.overwrite(cs[i], nAttr);
                }
                
                n.editing = false;
                n.editMode = false;
                
                Ext.DomHelper.overwrite(Ext.fly(r).child('.x-treegrideditor-obar'), this.editBtnsHtml(n));
                this.activeObar(n);
                n.select();
            } else {
                n.remove();
            }
            this.obar.fireEvent('canceledit', this, n);
        }
    },
    
    /**
     * 保存树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    updateNode: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        
        var m = n.getEditMode();
        if (!m) {
            return;
        }
        
        if (this.obar.fireEvent('beforeupdatenode', this, n, m) !== false) {
            var valid = true, flds = n.getInputFields();
            for (var p in flds) {
                if (!n.getInputField(p).validate()) {
                    valid = false;
                }
            }
            if (!valid) {
                return;
            }
            
            var gfv = function(n, sort) {
                return n.getInputValue(sort);
            };
            
            if (!this.editValidator(n, m, gfv)) {
                return;
            }
            
            this.handleRequest(n, m, gfv, function(res) {
                if (this.obar.fireEvent('updatenode', this, n, m, res) !== false) {
                    var respid = Ext.isString(res) ? res : res.id, wrap = n.getUI().wrap, r = Ext.query('tr[treegrideditornodeid=' + n.id + ']', wrap);
                    r = r[0];
                    
                    var cs = Ext.fly(r).query('span[treegrideditorinputfield], div[treegrideditorinputfield]');
                    var cols = this.columns, col, csDom, nAttr;
                    var tip = function(c, cVal, fVal) {
                        var t;
                        if (c.displayTip && cVal && fVal) {
                            t = fVal;
                            if (Ext.isDefined(c.tipText)) {
                                if (Ext.isString(c.tipText)) {
                                    t = c.tipText;
                                } else if (Ext.isFunction(c.tipText)) {
                                    t = c.tipText(cVal);
                                }
                            }
                        }
                        return t;
                    };
                    for (var i = 0, len = cols.length - 1; i < len; i++) {
                        col = cols[i], csDom = cs[i];
                        n.attributes[col.dataIndex] = n.getInputValue(col.dataIndex), nAttr = Ext.apply({}, n.attributes);
                        nAttr[col.dataIndex] = n.getEncodeValue(col.dataIndex);
                        col.tpl.overwrite(csDom, nAttr);
                        if (col.displayTip) {
                            csDom.qtip = tip(col, n.attributes[col.dataIndex], nAttr[col.dataIndex]);
                        }
                    }
                    
                    this.unregisterInputField(n);
                    
                    if (m === 'add' && respid) {
                        n.setId(respid);
                        r.setAttribute('treegrideditornodeid', respid);
                        for (var i = 0, len = cols.length; i < len; i++) {
                            col = cols[i], csDom = cs[i];
                            csDom.setAttribute('id', respid + '-inputfield-' + col.dataIndex);
                        }
                    }
                    
                    n.editing = false;
                    n.editMode = false;
                    
                    Ext.DomHelper.overwrite(Ext.fly(r).child('.x-treegrideditor-obar'), this.editBtnsHtml(n))
                    this.activeObar(n);
                    this.obar.fireEvent('afterupdatenode', this, n, m);
                }
            });
        }
    },
    
    /**
     * 移除树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    removeNode: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        if (n.getEditMode()) {
            return;
        }
        
        if (n.attributes['disableObarRemove']) {
            return;
        }
        
        if (this.obar.fireEvent('beforeremovenode', this, n) !== false) {
            if (!this.editValidator(n, 'remove')) {
                return;
            }
            
            this.handleRequest(n, 'remove', undefined, function(res) {
                if (this.obar.fireEvent('removenode', this, n, res) !== false) {
                    var attrs = Ext.apply({}, n.attributes);
                    n.remove();
                    this.obar.fireEvent('afterremovenode', this, attrs);
                }
            });
        }
    },
    
    // private
    handleRequest: function(n, m, gfv, cb) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var req = this.obar.btns[m].request;
        if (req) {
            var bkParams = Ext.apply({}, req.params);
            var params = req.params ||
            {};
            var rAttrs = this.getNodeAttributes(n, gfv);
            Ext.applyIf(params, rAttrs);
            Ext.Ajax.request({
                url: req.url,
                method: req.method,
                params: params,
                success: function(response, opts) {
                    var res = response.responseText;
                    try {
                        res = Ext.isEmpty(res) ? '' : Ext.decode(res);
                    } catch (e) {
                        // ignore
                    }
                    cb.call(this, res);
                },
                failure: function(response, opts) {
                    Ext.Msg.alert('Error', 'Server-side failure with status code ' + response.status);
                    this.obar.fireEvent('requestfailure', this, n, m, response.status);
                },
                headers: {
                    'my-header': 'treegrideditor-request'
                },
                scope: this
            });
            req.params = bkParams;
        } else {
            cb.call(this, n);
        }
    },
    
    // private
    editValidator: function(n, m, gfv) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var a = this.obar.btns[m], v = a.validator;
        return v(this.getNodeAttributes(n, gfv));
    },
    
    /**
     * 获取树节点attributes，如使用gfv取值，则使用gfv返回值覆盖node.attributes
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {Function} gfv (可选)  node.attributes取值函数
     * @return Array
     */
    getNodeAttributes: function(n, gfv) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        
        var rAttrs = {
            id: n.id,
            nodeLeaf: n.isLeaf() ? true : false,
            nodeExpanded: n.expanded ? true : false,
            nodePath: this.getNodePath(n),
            nodeParentPath: this.getParentNodePath(n),
            nodeParentId: n.parentNode.id,
            leaf: false,
            expanded: false,
            checked: false,
            loader: false
        }
        if (this.checkbox) {
            var checked = false;
            if (this.checkMode === 'single') {
                var c = document.getElementsByName('x-treegrideditor-node-cb');
                for (var i = 0; i < c.length; i++) {
                    if (c[i].value === n.id) {
                        checked = c[i].checked;
                        break;
                    }
                }
            } else {
                checked = n.attributes.checked;
            }
            rAttrs.nodeChecked = checked;
        }
        
        Ext.applyIf(rAttrs, n.attributes);
        delete rAttrs.leaf;
        delete rAttrs.expanded;
        delete rAttrs.checked;
        delete rAttrs.loader;
        
        if (Ext.isDefined(gfv)) {
            var cols = this.columns;
            for (var i = 0, len = cols.length - 1; i < len; i++) {
                var col = cols[i], sort = col.dataIndex;
                rAttrs[sort] = gfv.call(this, n, sort);
            }
        }
        
        return rAttrs;
    },
    
    /**
     * 获取树节点路径，不含root节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return String
     */
    getNodePath: function(n) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var path = n.getPath();
        path = path.substring(1);
        path = path.substring(path.indexOf(this.pathSeparator));
        return path;
    },
    
    /**
     * 获取父树节点路径，不含root节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return String
     */
    getParentNodePath: function(n) {
        var path = this.getNodePath(n);
        path = path.substring(0, path.lastIndexOf(this.pathSeparator));
        return path;
    },
    
    /**
     * 获取子树节点，如果p=undefined，返回子TreeNode数组对象；如果p有值，返回指定p值的node.attributes字符串，默认由‘,’分割；
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {String} p (可选)  指定获取node.attributes值
     * @param {String} s (可选)  分隔符，默认','
     * @return Array/String
     */
    getChildNodes: function(n, p, s) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        var childs = n.childNodes;
        if (!Ext.isDefined(p)) {
            return childs;
        }
        var ret = '', s = s || ',';
        Ext.each(childs, function(node) {
            if (ret.length > 0) {
                ret += s;
            }
            ret += node.attributes[p];
        });
        return ret;
    },
    
    /**
     * 获取子树节点node.attributes数组
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return Array
     */
    getChildNodeAttrs: function(n) {
        var childs = this.getNodeChilds(n);
        var attrs = [];
        Ext.each(childs, function(node) {
            attrs.push(this.getNodeAttributes(n));
        }, this);
        return attrs;
    },
    
    /**
     * 验证树节点是否存在，如果allChild=true，验证树节点的所有子节点，默认验证树节点的下一级子节点；
     * 如果single=true，单属性匹配
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @param {Object} params  验证属性
     * @param {Boolean} allChild (可选)  是否验证所有子节点，默认false
     * @param {Boolean} single (可选)  单属性匹配模式，默认false
     * @param {Object} ignore (可选)  忽略值
     * @param {Boolean} ignoreSingle (可选)  忽略值单属性匹配模式，默认false
     * @return Boolean
     */
    hasNode: function(n, params, allChild, single, ignore, ignoreSingle) {
        n = Ext.isObject(n) ? n : this.getNodeById(n);
        ignore = ignore ||
        {};
        var exist = false;
        
        var ignoreValue = function(nAttrs) {
            var ex = false, iv;
            
            if (ignoreSingle) {
                for (var p in ignore) {
                    iv = ignore[p];
                    if (Ext.isString(iv)) {
                        if (iv === nAttrs[p]) {
                            ex = true;
                        }
                    } else if (Ext.isArray(iv)) {
                        for (var i = 0; i < iv.length; i++) {
                            if (iv[i] === nAttrs[p]) {
                                ex = true;
                                break;
                            }
                        }
                    }
                    
                    if (ex) {
                        break;
                    }
                }
            } else {
                var s = [], pi = 0;
                for (var p in ignore) {
                    iv = ignore[p];
                    if (Ext.isString(iv)) {
                        if (iv === nAttrs[p]) {
                            s.push(true);
                        }
                    } else if (Ext.isArray(iv)) {
                        for (var i = 0; i < iv.length; i++) {
                            if (iv[i] === nAttrs[p]) {
                                s.push(true);
                            }
                        }
                    }
                    pi++;
                }
                
                if (pi > 0 && s.length === pi) {
                    ex = true;
                }
            }
            
            return ex;
        };
        
        var validate = function(nodes) {
            var node, nAttrs;
            var ex = false;
            for (var i = 0; i < nodes.length; i++) {
                node = nodes[i], nAttrs = node.attributes;
                
                if (ignoreValue(nAttrs)) {
                    continue;
                }
                
                if (single) {
                    for (var p in params) {
                        if (params[p] == nAttrs[p]) {
                            ex = true;
                            break;
                        }
                    }
                } else {
                    ex = true;
                    for (var p in params) {
                        if (params[p] != nAttrs[p]) {
                            ex = false;
                            break;
                        }
                    }
                }
                
                if (ex) {
                    break;
                }
            }
            return ex;
        };
        
        if (allChild) {
            var loopValidate = function(nodes) {
                var s = validate(nodes);
                if (s) {
                    return true;
                }
                var node;
                for (var i = 0; i < nodes.length; i++) {
                    node = nodes[i];
                    s = loopValidate(node.childNodes);
                    if (s) {
                        return true;
                    }
                }
                return false;
            };
            exist = loopValidate(n.childNodes);
        } else {
            exist = validate(n.childNodes);
        }
        
        return exist;
    },
    
    /**
     * 批量处理，如果nodes有值，则处理nodes；默认nodes=this.Checked();
     * @param {String} m  批处理类型，取值范围'update' 'cancel' 'add' 'edit' 'remove'或自定义的obar功能
     * @param {String/Array/TreeNode} nodes (可选)  树节点ID/ID数组/TreeNode对象/TreeNode数组
     * @param {Boolean} sequence (可选)  顺序处理，默认true
     * @return void
     */
    batchProcess: function(m, nodes, sequence) {
        m = m.toLowerCase();
        nodes = nodes || this.getChecked();
        if (Ext.isString(nodes)) {
            var ns = nodes.split(this.pathSeparator), nodes = [], n;
            for (var i = 0; i < ns.length; i++) {
                n = this.getNodeById(ns[i]);
                if (Ext.isDefined(n)) {
                    nodes.push(this.getNodeById(ns[i]));
                }
            }
        }
        
        sequence = sequence || true;
        if (sequence === true) {
            var seq = function(a, b) {
                if (a.getDepth() >= b.getDepth()) {
                    return a.getDepth() - b.getDepth();
                } else {
                    return b.getDepth() - a.getDepth();
                }
            };
            nodes.sort(seq);
        }
        
        var task;
        for (var i = 0; i < nodes.length; i++) {
            if (m === 'update') {
                task = new Ext.util.DelayedTask(this.updateNode, this, [nodes[i]]);
            } else if (m === 'cancel') {
                task = new Ext.util.DelayedTask(this.cancelEdit, this, [nodes[i]]);
            } else {
                task = new Ext.util.DelayedTask(this[m + 'Node'], this, [nodes[i]]);
            }
            task.delay(i * 250);
        }
    }
});

Ext.ux.tree.TreeGridEditor.nodeTypes = {};

Ext.reg('treegrideditor', Ext.ux.tree.TreeGridEditor);

Ext.ux.tree.TreeGridEditor.Obar = function(tge, config) {
    this.setTge = function(tge) {
        this.tge = tge;
    };
    this.setTge(tge);
    config = config ||
    {};
    this.initialConfig = config;
    Ext.apply(this, config);
    
    this.addEvents('beforeaddnode', 'addnode', 'beforeeditnode', 'editnode', 'beforeremovenode', 'removenode', 'afterremovenode', 'beforeupdatenode', 'updatenode', 'afterupdatenode', 'beforecanceledit', 'canceledit', 'requestfailure');
    
    Ext.ux.tree.TreeGridEditor.Obar.superclass.constructor.call(this);
    
    if (this.init) {
        this.init.call(this);
    }
    
    if (this.initEvents) {
        this.initEvents.call(this);
    }
};

Ext.extend(Ext.ux.tree.TreeGridEditor.Obar, Ext.util.Observable, {
    /**
     * 新增树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    add: function(n) {
        this.tge.addNode.call(this.tge, n);
    },
    
    /**
     * 编辑树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    edit: function(n) {
        this.tge.editNode.call(this.tge, n);
    },
    
    /**
     * 删除树节点
     * @param {String/Ext.tree.TreeNode} n  树节点ID或TreeNode对象
     * @return void
     */
    remove: function(n) {
        this.tge.removeNode.call(this.tge, n);
    }
});
