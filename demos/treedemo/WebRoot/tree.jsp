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

		<title>My JSP 'tree.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<link href="<%=basePath%>css/xtree.css" rel="stylesheet"
			type="text/css">
		<script src="<%=basePath%>js/xtree.js"></script>
	</head>

	<body>
		<%=path%>
		<%=basePath%>
		<form action="">
		<input type="text" name="a">
		<input type="text" name="aa">
		</form>
		<br>
		<jsp:useBean id="treeMaker" class="com.gete.framework.tree.TreeMaker" scope="page"/> 
<% 
	Collection companyTreeList = (Collection)request.getAttribute("companyTypeTree");
	String type = (String)request.getAttribute("type");
	String httpUrl = "";
%>

<DIV class="orgtree"> 
<script language="javascript">

  if (document.getElementById) {
	<%
		//树型初使化 (目前不能省略)(String rootId,String rootName,String Icon,String openIcon,String url,String target) 
		StringBuffer tree = new StringBuffer();
		if(type != null && !type.equals("")&&type.equals("2")){
			tree = treeMaker.TreeRootInit3("","阳光装饰供货商",path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif","companyDetailList.action?vo.parentId=0","main");
		}else{
			tree = treeMaker.TreeRootInit3("","阳光装饰供货商",path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif","companyTyepList.action?vo.parentOrderCode=0&vo.id=0","main");
		}
		
		/**
		* TreeListApp 方法
		* TreeListApp(集合对象，根节点名称，选择项，默认图标，打开图标)
		* 第一个参数为树型集合对象
		* 第三个参数： "c"为多选项， "r"为单选项，"" 空字符串为默认项
		*/
		tree = treeMaker.TreeListApp(companyTreeList,path+"/images/xtree_foldericon.gif",path+"/images/xtree_openfoldericon.gif",httpUrl,"main");
		//TreeListApp 方法 可多次调用，生成复杂树型结构
		//tree = treeMaker.TreeListApp(orgTreeList,"/power/include/tree/pic/icon.gif",""); 
		
		//输出字符串
		out.println(tree.toString());
	%>
	document.write(node0);
  }
</script>
	</body>
</html>
