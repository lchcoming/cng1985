/**
 * @author zhangdaiping@vip.qq.com
 * @version 1.3.1 (10/3/2010)
 */
Ext.onReady(function() {
    Ext.QuickTips.init();
    
    var checkAdd = function(n) {
        //Ext.Msg.alert('Message', Ext.util.Format.htmlEncode(n.city).replace(/ /g, "&nbsp;") + '<br>' + n.nodePath + '<br>' + n.nodeParentPath + '<br>' + n.nodeParentId);
        var exist = treegrideditor.hasNode(n.nodeParentId, {
            city: n.city
        });
        if (exist) {
            Ext.Msg.alert('Message', '地区/级别已存在!');
            return false;
        }
        return true;
    };
    
    var checkEdit = function(n) {
        //Ext.Msg.alert('Message', Ext.util.Format.htmlEncode(n.city).replace(/ /g, "&nbsp;") + '<br>' + n.nodePath + '<br>' + n.nodeParentPath + '<br>' + n.nodeParentId);
        var exist = treegrideditor.hasNode(n.nodeParentId, {
            city: n.city
        }, false, false, {
            id: n.id
        }, false);
        if (exist) {
            Ext.Msg.alert('Message', '地区/级别已存在!');
            return false;
        }
        return true;
    };
    
    var checkRemove = function(n) {
        //Ext.Msg.alert('Message', Ext.util.Format.htmlEncode(n.city).replace(/ /g, "&nbsp;") + '<br>' + n.nodePath + '<br>' + n.nodeParentPath + '<br>' + n.nodeParentId);
        if (!n.nodeLeaf) {
            Ext.Msg.alert('Message', '地区下有子级别!');
            return false;
        }
        return true;
    };
    
    var treegrideditor = new Ext.ux.tree.TreeGridEditor({
        // TreeGridEditor唯一标识
        id: 'treegrideditor',
        
        // 自适应宽度
        autoWidth: true,
        
        // 高度
        height: 300,
        
        // 渲染到DOM节点
        renderTo: 'div-treegrideditor',
        
        // 最大深度（层级）
        maxDepth: 5,
        
        // 复选框
        checkbox: false,
        
        // 复选框类型，取值范围: 'multiple' 'single'
        checkMode: 'multiple',
        
        // 复选框插件，如需使用加载此插件
        // 在页面引用<script type="text/javascript" src="treegrideditor/plugins/TreeNodeChecked.js"></script>
        plugins: [new Ext.plugin.tree.TreeNodeChecked({
            linkedCheck: true,
            asyncCheck: false
        })],
        
        // 显示列
        columns: [{
            header: '地区名称（级别名称）',
            dataIndex: 'city',
            autoWidth: true,
            // 显示tip，默认false不显示；不设置tipText，则默认显示列值
            displayTip: true,
            // 设置tipText，当tipText为String时，显示String；如果为Function，则显示返回值
            // tipText : String/Function
            inputCfg: {
                allowBlank: false,
                trimmed: true
                // inputType : String  输入框类型，取值范围'text' 'password' 'select' 'date'，默认'text'
                // trimmed : Boolean  去首尾空格，默认false不自动去除
                // selectOptions : Array  如果inputType='select'，指定选择框选项
                // dateFormat : String  如果inputType='date'，指定日期format，默认'Y-m-d'
                // defaultValue : String  输入框默认值
                // filterInputValue : Function  输入值过滤函数
                // filterOutputValue : Function  输出值过滤函数
                // cls : String  输入框class
                // style : String  输入框样式
                // width : Number  输入框宽度
                // height : Number  输入框高度
                // readOnly : Boolean  是否只读，默认false不只读
                // selectOnFocus : Boolean  当焦点为输入框时，是否选中输入框文本，默认false不选中
                // allowBlank : Boolean  是否允许空值，默认true允许
                // blankText : String  为空值时，提示错误信息
                // maskRe : RegExp  限制输入值正则验证
                // maxLength : Number  最大长度
                // maxLengthText : String  超长时，提示错误信息
                // minLength : Number  最小长度
                // minLengthText : String  长度不够时，提示错误信息
                // regex : RegExp  正则验证输入值
                // regexText : String  正则验证失败时，提示错误信息
                // validateOnBlur : Boolean  当焦点移除时，验证输入值
                // validationDelay : Number  延迟验证，默认250
                // validationEvent : String/Boolean  指定验证时间，如果为false，则不触发验证，默认'keyup'
                // validator : Function  自定义验证函数，返回值true验证通过，如果返回值为String时，则输出此String为错误信息
                // invalidText : String  验证失败，提示错误信息
            }
        }, {
            header: '人数',
            dataIndex: 'xxx',
            width: 150,
            tpl: new Ext.XTemplate('{popu}人'),
            inputCfg: {
                cls: 'tge-inputfield-popu',
                defaultValue: '0',
                allowBlank: false,
                maskRe: /^\d$/,
                regex: /^\d{1,10}$/,
                regexText: '请输入1-10位正整数'
            }
        }
        , {
            header: '材料名称',
            dataIndex: 'popu3',
            width: 150,
            tpl: new Ext.XTemplate('{popu}人'),
            inputCfg: {
                cls: 'tge-inputfield-popu',
                defaultValue: '0',
                allowBlank: false,
                maskRe: /^\d$/,
                regex: /^\d{1,10}$/,
                regexText: '请输入1-10位正整数'
            }
        }
        , {
            header: '是否覆盖',
            dataIndex: 'overlapped',
            width: 100,
            tpl: new Ext.XTemplate('{overlapped:this.overlappedText}', {
                overlappedText: function(v) {
                    if (v === '1') {
                        return '是';
                    } else {
                        return '否';
                    }
                }
            }),
            inputCfg: {
                cls: 'tge-inputfield-overlapped',
                width: 80,
                inputType: 'select',
                selectOptions: [{
                    name: '是',
                    value: '1'
                }, {
                    name: '否',
                    value: '0',
                    selected: true
                }],
                allowBlank: false
            }
        }, {
            header: '创建日期',
            dataIndex: 'created',
            width: 150,
            inputCfg: {
                cls: 'tge-inputfield-created',
                inputType: 'date',
                dateFormat: 'Y-m-d',
                allowBlank: false
            }
        }],
        
        // 设置Obar
        obarCfg: {
            column: {
                header: '操作',
                dataIndex: 'id',
                width: 300
            },
            btns: [{
                id: 'add',
                text: '新增下级',
                // 最大层级按钮状态，取值范围：'normal','hidden','disabled','uncreated'
                deepestState: 'disabled',
                request: {
                    url: '/treedemo/tgeservlet',
                    params: {
                        method: 'add'
                    }
                },
                // 添加节点，保存校验函数
                validator: checkAdd
            }, {
                id: 'edit',
                text: '修改',
                // 最大层级按钮状态，取值范围：'normal','hidden','disabled','uncreated'
                deepestState: 'normal',
                request: {
                    url: '/treedemo/tgeservlet',
                    params: {
                        method: 'update'
                    }
                },
                // 修改节点，保存校验函数
                validator: checkEdit
            }, {
                id: 'remove',
                text: '删除',
                request: {
                    url: '/treedemo/tgeservlet',
                    params: {
                        method: 'delete'
                    }
                },
                // 删除节点校验函数
                validator: checkRemove
            },
            {
                id: 'remove',
                text: '删除',
                   // 最大层级按钮状态，取值范围：'normal','hidden','disabled','uncreated'
                deepestState: 'normal',
                request: {
                    url: '/treedemo/tgeservlet',
                    params: {
                        method: 'delete'
                    }
                },
                // 删除节点校验函数
                validator: checkRemove
            }
            ],
          
            listeners: {
                'afterupdatenode': function(tree, node, editMode) {
                    if (editMode === 'add' && node.getDepth() <= 2) {
                        tree.disableObar(node, 'add');
                        tree.disableObar(node, 'edit');
                    }
                },
                'afterremovenode': function(tree, nodeAttrs) {
                    Ext.Msg.alert('Message', '删除“' + Ext.util.Format.htmlEncode(nodeAttrs.city).replace(/ /g, "&nbsp;") + '”成功');
                }
            }
        },
        
        dataUrl: 'treegrideditor.json',
        
        //loader: new Ext.tree.TreeLoader({
        //    dataUrl: '/tge/tgeservlet',
        //    baseParams: {
        //        method: 'load'
        //    }
        //}),
        
        listeners: {
            'beforeappend': function(tree, parent, node) {
                tree.cascadeCheck = false;
            }
        },
        
		
		//---------------------------------功能测试-------------------------------------------------------
        
		tbar: [{
            text: '新增一级地区',
            icon: 'treegrideditor/images/add.png',
            listeners: {
                'click': function() {
                    treegrideditor.addNode(treegrideditor.getRootNode());
                }
            }
        }, {
            text: '刷新',
            icon: 'treegrideditor/images/refresh.png',
            listeners: {
                'click': function() {
                    treegrideditor.getRootNode().reload();
                }
            }
        },
        {
            text: '刷新',
            icon: 'treegrideditor/images/refresh.png',
            listeners: {
                'click': function() {
                    alert("hi");
                }
            }
        }
        ]
        
  

       
    });
});
