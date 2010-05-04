<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/ext-all.css" />
<script type="text/javascript" src="/js/ext-base.js"></script>
<script type="text/javascript" src="/js/ext-all.js"></script>
	<script type="text/javascript">
		
		Ext.onReady(function(){


    // second tabs built from JS
    var tabs2 = new Ext.TabPanel({
        renderTo: document.body,
        activeTab: 0,
        
        
        plain:true,
        defaults:{autoScroll: true},
        items:[{
                title: '自动套价',
                html: "自动套价 页面"
            },{
                title: '人材机显示',
                autoLoad:'index.htm'
            },{
                title: '人材机总汇',
                autoLoad:'index.htm'
               // autoLoad: {url: 'index.htm', params: 'foo=bar&wtf=1'}
            }
        ]
    });

    function handleActivate(tab){
        alert(tab.title + ' was activated.');
    }
});
		</script>
</head>
<body>

</body>
</html>