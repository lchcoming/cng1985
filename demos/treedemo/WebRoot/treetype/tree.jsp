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

		<title>My JSP 'index.jsp' starting page</title>

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
		<script type='text/javascript'
			src='<%=basePath%>dwr/interface/NavigateManager.js'></script>
		<script type='text/javascript' src='<%=basePath%>dwr/engine.js'></script>
		<script type='text/javascript' src='<%=basePath%>dwr/util.js'></script>
		<script type='text/javascript' src='treetype/tree.js'></script>
	</head>

	<body>
		
	</body>
</html>
