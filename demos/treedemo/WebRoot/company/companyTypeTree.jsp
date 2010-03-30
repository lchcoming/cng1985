<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
%>
<%@taglib uri="/struts-tags" prefix="s" %>
<head>
<link href="<%=path%>/include/tree/css/xtree.css" rel="stylesheet" type="text/css">
<SCRIPT src="<%=path%>/include/tree/js/xtree.js"></SCRIPT>
</head>
<body>
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
</DIV>
</body>

