<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://cng1985.appspot.com/" prefix="tree"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="/struts-tags" prefix="s"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<base href="<%=basePath%>">

		<title>My JSP 'datatree.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
		<link rel="stylesheet" href="<%=basePath%>jtree/jquery.treeview.css" />

		<link rel="stylesheet" href="<%=basePath%>jtree/screen.css" />
		<script src="<%=basePath%>jtree/lib/jquery.js" type="text/javascript"></script>
		<script src="<%=basePath%>jtree/lib/jquery.cookie.js"
			type="text/javascript"></script>
		<script src="<%=basePath%>jtree/lib/jquery.treeview.js"
			type="text/javascript"></script>


	</head>

	<body>
		<table style="width: 100%">
			<tr>
				<td align="left" vAlign="top" style="font-size: 10pt; width: 200px;">
					<div id="sidetree">
						<div class="treeheader">
							&nbsp;
						</div>
						<div id="sidetreecontrol">
							<a href="?#">收缩</a> |
							<a href="?#">展开</a>
						</div>


						<tree:Tree></tree:Tree>
						<script type="text/javascript">
	$(function() {
			$("#tree").treeview({
				collapsed: true,
				
				control:"#sidetreecontrol",
				//animated: "medium",
				persist: "location"
			});
		})
	</script>
					</div>
				</td>
				<td vAlign="top">
					<iframe name="cai" id="cai" width="100%"
						style="border: #999999 solid 1px; height: 500px;" align="left"></iframe>
				</td>
			</tr>
		</table>




	</body>
</html>
