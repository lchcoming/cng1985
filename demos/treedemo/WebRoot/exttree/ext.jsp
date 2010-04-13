<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'ext.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link rel="stylesheet" type="text/css"
			href="<%=basePath%>extjs/ext-all.css" />
		<!-- GC -->
		<!-- LIBS -->
		<script type="text/javascript" src="<%=basePath%>extjs/ext-base.js"></script>
		<!-- ENDLIBS -->

		<script type="text/javascript" src="<%=basePath%>extjs/ext-all.js"></script>
		<script type="text/javascript" src="<%=basePath%>extjs/tree.js"></script>
		<script type='text/javascript'
			src='<%=basePath%>dwr/interface/NavigateManager.js'></script>
		<script type='text/javascript' src='<%=basePath%>dwr/engine.js'></script>
		<script type='text/javascript' src='<%=basePath%>dwr/util.js'></script>


		<style type="text/css">
.x-window-dlg .ext-mb-download {
	background: transparent url(images/download.gif) no-repeat top left;
	height: 46px;
}
</style>
	</head>

	<body>
		<script type="text/javascript">  
		 //alert(<%=basePath%>);
            //      Ext.Msg.alert(" 错误提示","表单信息不健全！");  
                 
      </script>
		<br>
		<iframe name="dd"></iframe>
	</body>
</html>
