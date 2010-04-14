/**
 * @author zhangdaiping@vip.qq.com
 * @version 1.3 (10/3/2010)
 */
Ext.ux.tree.TreeGridEditorNode = Ext.extend(Ext.tree.TreeNode, {
    editing: false,
    
    editMode: false,
    
    // private
    constructor: function(config) {
        this.inputFields = {};
        Ext.ux.tree.TreeGridEditorNode.superclass.constructor.call(this, config);
    },
    
    // private
    destroy: function() {
        this.destroyInputField();
        this.inputFields = null;
        Ext.ux.tree.TreeGridEditorNode.superclass.destroy.call(this);
    },
    
    // private
    remove: function(destroy) {
        this.parentNode.leaf = this.parentNode.childNodes.length > 1 ? false : true;
        this.parentNode.attributes.leaf = this.parentNode.leaf;
        this.destroyInputField();
        Ext.ux.tree.TreeGridEditorNode.superclass.remove.call(this, destroy);
    },
    
    // private 
    registerInputField: function(sort, inputCfg) {
        var ocfg, tcfg, fcfg;
        
        ocfg = {
            inputType: inputCfg.inputType || 'text',
            trimmed: inputCfg.trimmed || false,
            selectOptions: inputCfg.selectOptions,
            dateFormat: inputCfg.dateFormat,
            filterInputValue: inputCfg.filterInputValue,
            filterOutputValue: inputCfg.filterOutputValue
        }
        tcfg = {
            cls: inputCfg.cls || 'x-tge-input',
            style: inputCfg.style,
            width: inputCfg.width,
            height: inputCfg.height,
            readOnly: inputCfg.readOnly,
            selectOnFocus: inputCfg.selectOnFocus,
            allowBlank: inputCfg.allowBlank,
            blankText: inputCfg.blankText,
            invalidText: inputCfg.invalidText,
            maskRe: inputCfg.maskRe,
            maxLength: inputCfg.maxLength,
            maxLengthText: inputCfg.maxLengthText,
            minLength: inputCfg.minLength,
            minLengthText: inputCfg.minLengthText,
            regex: inputCfg.regex,
            regexText: inputCfg.regexText,
            validateOnBlur: inputCfg.validateOnBlur,
            validationDelay: inputCfg.validationDelay,
            validationEvent: inputCfg.validationEvent,
            validator: inputCfg.validator
        };
        fcfg = {
            id: this.id + '-inputfield-' + sort + '-input',
            renderTo: this.id + '-inputfield-' + sort,
            msgTarget: 'qtip',
            emptyText: ''
        };
        
        if (this.getEditMode() === 'add') {
            fcfg.value = inputCfg.defaultValue;
        } else {
            fcfg.value = this.attributes[sort] || '';
        }
        
        for (var p in tcfg) {
            if (!Ext.isDefined(fcfg[p]) && Ext.isDefined(tcfg[p])) {
                fcfg[p] = tcfg[p];
            }
        }
        
        this.inputFields[sort] = this.createInputField(ocfg, fcfg);
    },
    
    // private
    createInputField: function(ocfg, fcfg) {
        var fel = Ext.getDom(fcfg.renderTo);
        fel.innerHTML = '';
        
        var inputField;
        if (ocfg.inputType === 'password') {
            fcfg.inputType = 'password';
            inputField = new Ext.form.TextField(fcfg);
        } else if (ocfg.inputType === 'select') {
            fel.innerHTML = '<div id="' + fcfg.renderTo + '-el"></div>';
            fcfg.renderTo = fcfg.renderTo + '-el';
            fcfg.triggerClass = 'x-treegrideditor-arrow-trigger';
            fcfg.mode = 'local';
            var data = [], opts = ocfg.selectOptions, opt;
            if (opts) {
                for (var i = 0; i < opts.length; i++) {
                    opt = opts[i];
                    data.push([opt.value, opt.name]);
                    if (fcfg.value === '' && opt.selected) {
                        fcfg.value = opt.value;
                    }
                }
            }
            fcfg.store = new Ext.data.ArrayStore({
                id: fcfg.id + 'combo-store',
                fields: ['displayValue', 'displayText'],
                data: data
            })
            fcfg.valueField = 'displayValue';
            fcfg.displayField = 'displayText';
            fcfg.triggerAction = 'all';
            fcfg.editable = false;
            inputField = new Ext.form.ComboBox(fcfg);
        } else if (ocfg.inputType === 'date' || ocfg.inputType === 'datetime') {
            fel.innerHTML = '<div id="' + fcfg.renderTo + '-el"></div>';
            fcfg.renderTo = fcfg.renderTo + '-el';
            fcfg.triggerClass = 'x-treegrideditor-date-trigger';
            fcfg.format = ocfg.dateFormat || 'Y-m-d';
            fcfg.editable = false;
            fcfg.value = (fcfg.value !== '' ? Date.parseDate(fcfg.value, fcfg.format) : new Date());
            inputField = new Ext.ux.form.TreeGridEditorDateField(fcfg);
        } else {
            if (ocfg.trimmed) {
                fcfg.listeners = {
                    'blur': function(f) {
                        f.setValue(Ext.util.Format.trim(f.getValue()));
                    }
                }
            }
            if (ocfg.filterInputValue) {
                fcfg.filterInputValue = ocfg.filterInputValue;
            }
            if (ocfg.filterOutputValue) {
                fcfg.filterOutputValue = ocfg.filterOutputValue;
            }
            inputField = new Ext.ux.form.TreeGridEditorTextField(fcfg);
        }
        return inputField;
    },
    
    // private
    destroyInputField: function() {
        for (var p in this.inputFields) {
            Ext.destroy(this.inputFields[p]);
            delete this.inputFields[p];
        }
    },
    
    getInputFields: function() {
        return this.inputFields;
    },
    
    getInputField: function(p) {
        return this.inputFields[p];
    },
    
    getInputValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgedatefield') {
            ret = f.getValueText();
        } else {
            ret = f.getValue();
        }
        return ret;
    },
    
    getEncodeValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgetextfield') {
            ret = f.getEncodeValue();
        } else {
            ret = this.getInputValue(f);
        }
        return ret;
    },
    
    getFilterValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgetextfield') {
            ret = f.getFilterValue();
        } else {
            ret = this.getInputValue(f);
        }
        return ret;
    },
    
    getEditing: function() {
        return this.editing;
    },
    
    getEditMode: function() {
        return this.editMode;
    }
});

Ext.ux.tree.TreeGridEditor.nodeTypes.node = Ext.ux.tree.TreeGridEditorNode;

Ext.ux.tree.TreeGridEditorAsyncNode = Ext.extend(Ext.tree.AsyncTreeNode, {
    editing: false,
    
    editMode: false,
    
    // private
    constructor: function(config) {
        this.inputFields = {};
        Ext.ux.tree.TreeGridEditorAsyncNode.superclass.constructor.call(this, config);
    },
    
    // private
    destroy: function() {
        this.destroyInputField();
        this.inputFields = null;
        Ext.ux.tree.TreeGridEditorAsyncNode.superclass.destroy.call(this);
    },
    
    // private
    remove: function(destroy) {
        this.parentNode.leaf = this.parentNode.childNodes.length > 1 ? false : true;
        this.parentNode.attributes.leaf = this.parentNode.leaf;
        this.destroyInputField();
        Ext.ux.tree.TreeGridEditorAsyncNode.superclass.remove.call(this, destroy);
    },
    
    // private 
    registerInputField: function(sort, inputCfg) {
        var ocfg, tcfg, fcfg;
        
        ocfg = {
            inputType: inputCfg.inputType || 'text',
            trimmed: inputCfg.trimmed || false,
            selectOptions: inputCfg.selectOptions,
            dateFormat: inputCfg.dateFormat,
            filterInputValue: inputCfg.filterInputValue,
            filterOutputValue: inputCfg.filterOutputValue
        }
        tcfg = {
            cls: inputCfg.cls || 'x-tge-input',
            style: inputCfg.style,
            width: inputCfg.width,
            height: inputCfg.height,
            readOnly: inputCfg.readOnly,
            selectOnFocus: inputCfg.selectOnFocus,
            allowBlank: inputCfg.allowBlank,
            blankText: inputCfg.blankText,
            invalidText: inputCfg.invalidText,
            maskRe: inputCfg.maskRe,
            maxLength: inputCfg.maxLength,
            maxLengthText: inputCfg.maxLengthText,
            minLength: inputCfg.minLength,
            minLengthText: inputCfg.minLengthText,
            regex: inputCfg.regex,
            regexText: inputCfg.regexText,
            validateOnBlur: inputCfg.validateOnBlur,
            validationDelay: inputCfg.validationDelay,
            validationEvent: inputCfg.validationEvent,
            validator: inputCfg.validator
        };
        fcfg = {
            id: this.id + '-inputfield-' + sort + '-input',
            renderTo: this.id + '-inputfield-' + sort,
            msgTarget: 'qtip',
            emptyText: ''
        };
        
        if (this.getEditMode() === 'add') {
            fcfg.value = inputCfg.defaultValue;
        } else {
            fcfg.value = this.attributes[sort] || '';
        }
        
        for (var p in tcfg) {
            if (!Ext.isDefined(fcfg[p]) && Ext.isDefined(tcfg[p])) {
                fcfg[p] = tcfg[p];
            }
        }
        
        this.inputFields[sort] = this.createInputField(ocfg, fcfg);
    },
    
    // private
    createInputField: function(ocfg, fcfg) {
        var fel = Ext.getDom(fcfg.renderTo);
        fel.innerHTML = '';
        
        var inputField;
        if (ocfg.inputType === 'password') {
            fcfg.inputType = 'password';
            inputField = new Ext.form.TextField(fcfg);
        } else if (ocfg.inputType === 'select') {
            fel.innerHTML = '<div id="' + fcfg.renderTo + '-el"></div>';
            fcfg.renderTo = fcfg.renderTo + '-el';
            fcfg.triggerClass = 'x-treegrideditor-arrow-trigger';
            fcfg.mode = 'local';
            var data = [], opts = ocfg.selectOptions, opt;
            if (opts) {
                for (var i = 0; i < opts.length; i++) {
                    opt = opts[i];
                    data.push([opt.value, opt.name]);
                    if (fcfg.value === '' && opt.selected) {
                        fcfg.value = opt.value;
                    }
                }
            }
            fcfg.store = new Ext.data.ArrayStore({
                id: fcfg.id + 'combo-store',
                fields: ['displayValue', 'displayText'],
                data: data
            })
            fcfg.valueField = 'displayValue';
            fcfg.displayField = 'displayText';
            fcfg.triggerAction = 'all';
            fcfg.editable = false;
            inputField = new Ext.form.ComboBox(fcfg);
        } else if (ocfg.inputType === 'date' || ocfg.inputType === 'datetime') {
            fel.innerHTML = '<div id="' + fcfg.renderTo + '-el"></div>';
            fcfg.renderTo = fcfg.renderTo + '-el';
            fcfg.triggerClass = 'x-treegrideditor-date-trigger';
            fcfg.format = ocfg.dateFormat || 'Y-m-d';
            fcfg.editable = false;
            fcfg.value = (fcfg.value !== '' ? Date.parseDate(fcfg.value, fcfg.format) : new Date());
            inputField = new Ext.ux.form.TreeGridEditorDateField(fcfg);
        } else {
            if (ocfg.trimmed) {
                fcfg.listeners = {
                    'blur': function(f) {
                        f.setValue(Ext.util.Format.trim(f.getValue()));
                    }
                }
            }
            if (ocfg.filterInputValue) {
                fcfg.filterInputValue = ocfg.filterInputValue;
            }
            if (ocfg.filterOutputValue) {
                fcfg.filterOutputValue = ocfg.filterOutputValue;
            }
            inputField = new Ext.ux.form.TreeGridEditorTextField(fcfg);
        }
        return inputField;
    },
    
    // private
    destroyInputField: function() {
        for (var p in this.inputFields) {
            Ext.destroy(this.inputFields[p]);
            delete this.inputFields[p];
        }
    },
    
    getInputFields: function() {
        return this.inputFields;
    },
    
    getInputField: function(p) {
        return this.inputFields[p];
    },
    
    getInputValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgedatefield') {
            ret = f.getValueText();
        } else {
            ret = f.getValue();
        }
        return ret;
    },
    
    getInputValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgedatefield') {
            ret = f.getValueText();
        } else {
            ret = f.getValue();
        }
        return ret;
    },
    
    getEncodeValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgetextfield') {
            ret = f.getEncodeValue();
        } else {
            ret = this.getInputValue(f);
        }
        return ret;
    },
    
    getFilterValue: function(p) {
        var f = Ext.isString(p) ? this.getInputField(p) : p;
        var ret = '';
        if (f.xtype === 'tgetextfield') {
            ret = f.getFilterValue();
        } else {
            ret = this.getInputValue(f);
        }
        return ret;
    },
    
    getEditing: function() {
        return this.editing;
    },
    
    getEditMode: function() {
        return this.editMode;
    }
});

Ext.ux.tree.TreeGridEditor.nodeTypes.async = Ext.ux.tree.TreeGridEditorAsyncNode;
