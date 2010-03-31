Ext.BLANK_IMAGE_URL = 'http://localhost:8080/treedemo/images/default/s.gif';
Ext.onReady(function(){ 
    var tree = new Ext.tree.TreePanel({   
        el:"tree-div",   
        autoScroll:true,
        animate:true,
        width:'100px',
        height:'300px',
        enableDD:true,
        containerScroll: true, 
        loader: new Ext.tree.TreeLoader({
            dataUrl:'http://localhost:8080/treedemo/navigatejson?id=1'            
        })
    });
    tree.on("click",function(node,event){alert(node.id);});
    tree.on('beforeload',function(node){        
          //  tree.loader.dataUrl = 'region.ejf?cmd=getRegion&id='+(node.id!='root'?node.id:"");
          tree.loader.dataUrl= 'http://localhost:8080/treedemo/navigatejson?id=1' ;
        });        
    var root = new Ext.tree.AsyncTreeNode({
        text: '地区信息',
        draggable:false,
        id:'root'
    });
    tree.setRootNode(root);
    tree.render();
       root.expand();
});