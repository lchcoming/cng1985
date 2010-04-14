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
        height: 800,
        
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
            dataIndex: 'popu',
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
            header: '人数',
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
                width: 200
            },
            btns: [{
                id: 'add',
                text: '新增下级',
                // 最大层级按钮状态，取值范围：'normal','hidden','disabled','uncreated'
                deepestState: 'uncreated',
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
            }],
            
            // Obar事件
            //
            //   beforeaddnode  添加树节点之前，如果返回false，则中止添加操作
            //     'beforeaddnode': function(tree, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         return Boolean
            //
            //   addnode  添加树节点
            //     'addnode': function(tree, parent, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         parent : Ext.tree.TreeNode  父树节点
            //         node : Ext.tree.TreeNode  新增树节点
            //         return void
            //
            //   beforeeditnode  修改树节点之前，如果返回false，则中止修改操作
            //     'beforeeditnode': function(tree, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         return Boolean
            //
            //   editnode  修改树节点
            //     'editnode': function(tree, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         return void
            //
            //   beforeremovenode  删除树节点之前，如果返回false，则中止删除操作
            //     'beforeremovenode': function(tree, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         return Boolean
            //
            //   removenode  删除树节点，如果返回false，则中止删除操作
            //     'beforeremovenode': function(tree, node, response)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         response : String/Object  服务端响应消息
            //         return Boolean
            //
            //   afterremovenode  删除树节点之后
            //     'afterremovenode': function(tree, nodeAttributes)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         nodeAttributes : Object  当前树节点的属性
            //         return void
            //
            //   beforeupdatenode  保存树节点之前，如果返回false，则中止保存操作
            //     'beforeupdatenode': function(tree, node, editMode)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         editMode : String  编辑模式，'add'新增下级节点，'edit'编辑当前节点
            //         return Boolean
            //
            //   updatenode  保存树节点，如果返回false，则中止保持操作
            //     'updatenode': function(tree, node, editMode, response)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         editMode : String  编辑模式，'add'新增下级节点，'edit'编辑当前节点
            //         response : String/Object  服务端响应消息
            //         return Boolean
            //
            //   afterupdatenode  保存树节点之后
            //     'afterupdatenode': function(tree, node, editMode)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         editMode : String  编辑模式，'add'新增下级节点，'edit'编辑当前节点
            //         return void
            //
            //   beforecanceledit 取消修改树节点之前，如果返回false，则中止取消操作
            //     'beforecanceledit': function(tree, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         return Boolean
            //
            //   canceledit  取消修改树节点
            //     'canceledit': function(tree, node)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         return void
            //
            //   requestfailure  Ajax请求失败
            //     'requestfailure': function(tree, node, fn, status)
            //         tree : Ext.ux.tree.TreeGridEditor
            //         node : Ext.tree.TreeNode  当前树节点
            //         fn : String  失败状态
            //         status : String  失败状态
            //         return void
            //
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
        }],
        
        buttonAlign: 'center',
		
        buttons: [{
            xtype: 'buttongroup',
            columns: 1,
            defaults: {
                scale: 'medium',
                width: 150
            },
            items: [{
                text: '禁用/启用“北京”新增',
                listeners: {
                    'click': function() {
                        treegrideditor.toggleDisableObar('1', 'add');
                    }
                }
            }, {
                text: '禁用/启用“上海”修改',
                listeners: {
                    'click': function() {
                        treegrideditor.toggleDisableObar('2', 'edit');
                    }
                }
            }, {
                text: '隐藏/显示“北京”删除',
                listeners: {
                    'click': function() {
                        treegrideditor.toggleHideObar('1', 'remove');
                    }
                }
            }]
        }, {
            xtype: 'buttongroup',
            columns: 1,
            defaults: {
                scale: 'medium',
                width: 150
            },
            items: [{
                text: '验证“北京市”是否存在',
                listeners: {
                    'click': function() {
                        var r = treegrideditor.hasNode(treegrideditor.getRootNode(), {
                            id: '1',
                            city: '北京'
                        });
                        Ext.Msg.alert('Message', '返回值: ' + (r ? '存在' : '不存在'));
                    }
                }
            }, {
                text: '验证“昌平区”是否存在',
                listeners: {
                    'click': function() {
                        var r = treegrideditor.hasNode('1', {
                            city: '昌平区'
                        }, true);
                        Ext.Msg.alert('Message', '返回值: ' + (r ? '存在' : '不存在'));
                    }
                }
            }, {
                text: '验证“海淀区”是否存在',
                listeners: {
                    'click': function() {
                        var r = treegrideditor.hasNode('1', {
                            id: '111111',
                            city: '海淀区'
                        }, true, true);
                        Ext.Msg.alert('Message', '返回值: ' + (r ? '存在' : '不存在'));
                    }
                }
            }]
        }, {
            xtype: 'buttongroup',
            columns: 2,
            defaults: {
                scale: 'medium',
                width: 150
            },
            items: [{
                text: '获取被选中对象',
                listeners: {
                    'click': function() {
                        Ext.Msg.alert('Message', treegrideditor.getChecked('city'));
                    }
                }
            }, {
                text: '批量新增',
                listeners: {
                    'click': function() {
                        treegrideditor.batchProcess('add');
                    }
                }
            }, {
                text: '批量修改',
                listeners: {
                    'click': function() {
                        treegrideditor.batchProcess('edit');
                    }
                }
            }, {
                text: '批量删除',
                listeners: {
                    'click': function() {
                        treegrideditor.batchProcess('remove');
                    }
                }
            }, {
                text: '批量保存',
                listeners: {
                    'click': function() {
                        treegrideditor.batchProcess('update');
                    }
                }
            }, {
                text: '批量取消',
                listeners: {
                    'click': function() {
                        treegrideditor.batchProcess('cancel');
                    }
                }
            }]
        }]
    });
});
