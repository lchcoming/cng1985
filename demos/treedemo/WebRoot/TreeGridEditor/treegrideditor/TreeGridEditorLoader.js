/**
 * @author zhangdaiping@vip.qq.com
 * @version 1.2.2 (5/3/2010)
 */
Ext.ux.tree.TreeGridEditorLoader = Ext.extend(Ext.tree.TreeLoader, {
    createNode: function(attr) {
        if (!attr.uiProvider) {
            attr.uiProvider = Ext.ux.tree.TreeGridEditorNodeUI;
        }
        
        // apply baseAttrs, nice idea Corey!
        if (this.baseAttrs) {
            Ext.applyIf(attr, this.baseAttrs);
        }
        if (this.applyLoader !== false && !attr.loader) {
            attr.loader = this;
        }
        if (Ext.isString(attr.uiProvider)) {
            attr.uiProvider = this.uiProviders[attr.uiProvider] || eval(attr.uiProvider);
        }
        if (attr.nodeType) {
            return new Ext.ux.tree.TreeGridEditor.nodeTypes[attr.nodeType](attr);
        } else {
            return attr.leaf ? new Ext.ux.tree.TreeGridEditorNode(attr) : new Ext.ux.tree.TreeGridEditorAsyncNode(attr);
        }
    }
});
