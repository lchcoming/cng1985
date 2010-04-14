/**
 * @author zhangdaiping@vip.qq.com
 * @version 1.2.2 (5/3/2010)
 */
Ext.ns('Ext.ux.form');

Ext.ux.form.TreeGridEditorTextField = Ext.extend(Ext.form.TextField, {
    xtype: 'tgetextfield',
    
    // filterInputValue : Function  输入值过滤函数
    filterInputValue: function(v) {
        return v;
    },
    
    // filterOutputValue : Function  输出值过滤函数
    filterOutputValue: function(v) {
        return v;
    },
    
    initComponent: function() {
        this.value = this.getDecodeValue(this.value);
        
        Ext.ux.form.TreeGridEditorTextField.superclass.initComponent.call(this);
    },
    
    getEncodeValue: function(v) {
        v = v || this.getValue();
        v = Ext.util.Format.htmlEncode(v).replace(/ /g, "&nbsp;");
        if (this.filterOutputValue) {
            v = this.filterOutputValue(v);
        }
        return v;
    },
    
    getDecodeValue: function(v) {
        v = v || this.getValue();
        if (this.filterInputValue) {
            v = this.filterInputValue(v);
        }
        v = Ext.util.Format.htmlDecode(v).replace(/&nbsp;/g, " ");
        return v;
    },
    
    getFilterValue: function(v) {
        v = v || this.getValue();
        if (this.filterOutputValue) {
            v = this.filterOutputValue(v);
        }
        return v;
    }
});

Ext.reg('tgetextfield', Ext.ux.form.TreeGridEditorTextField);

Ext.ux.form.TreeGridEditorDateField = Ext.extend(Ext.form.DateField, {
    xtype: 'tgedatefield',
    
    getValueText: function() {
        return Ext.form.DateField.superclass.getValue.call(this);
    }
});

Ext.reg('tgedatefield', Ext.ux.form.TreeGridEditorDateField);
