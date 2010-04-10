<%@ page contentType="text/html;charset=UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<html>
	<head>
		<title>导航控制</title>
		<link rel="stylesheet" type="text/css" href="../extjs/ext-all.css" />
		<script type="text/javascript" src="../extjs/ext-base.js"></script>
		<script type="text/javascript" src="../extjs/ext-all.js"></script>
		<script type='text/javascript'
			src='<%=basePath%>dwr/interface/NavigateManager.js'></script>
		<script type='text/javascript' src='<%=basePath%>dwr/engine.js'></script>
		<script type='text/javascript' src='<%=basePath%>dwr/util.js'></script>
		<script type="text/javascript"
			src="a.js"></script>
	</head>
	<body>
	</body>
</html>