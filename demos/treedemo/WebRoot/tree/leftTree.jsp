<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=GB2312"%>
<HTML>
<HEAD>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=gb2312">
<%@ include file="../../include/css.jsp" %>
<TITLE></TITLE>
</HEAD>
<BODY>
<!-- 以下程序加到页面中生成树型视图 -->
<jsp:useBean id="treeMaker" class="com.knowledgesurf.basic.util.tree.TreeMaker" scope="page"/> 
<% 
//String rootID = (String)request.getAttribute("rootID");
String rootID = getStrParameter(request,"rootID");
String rootName = getStrParameter(request,"rootName");
String rootURL = getStrParameter(request,"rootURL");
String treeURL = getStrParameter(request,"treeURL");
String treeAct = getStrParameter(request,"treeAct");
String rootTarget = getStrParameter(request,"rootTarget");
String treeTarget = getStrParameter(request,"treeTarget");

StringBuffer tree = null;
if(treeAct == null || treeAct.equals("")){
	treeAct = "default";
}

Collection rootTreeNodes = (Collection)request.getAttribute("rootTreeNodes");
Collection treeNodes = (Collection)request.getAttribute("treeNodes");

String path = "/power/include/Tree/";
%>
<%@ include file= "../../include/Tree/jsp/TreeModel.jsp" %>
<!----><b><font color="#3300CC">
<%if(treeAct.equals("default")){%>
	<a href="#" onclick="window.location.reload()">刷&nbsp 新</a>
<%}else if(treeAct.equals("back")){%>
	<a href="#" onclick="history.back()">返&nbsp 回</a>
<%}else{
	out.print(treeAct);
}%>
</font>
</b>
<div noWrap style="position: absolute; width:90%px; height:100%px; top: 39px; left: 5px; PADDING-BOTTOM: 5px; PADDING-LEFT: 5px; PADDING-RIGHT: 0px; PADDING-TOP: 5px; overflow:auto;"> 
  <!-- js file containing the tree content, edit this file to alter the menu,
       the menu will be inserted where this tag is located in the document -->
<script language="javascript">
  if (document.getElementById) { 
	<%
		//树型初使化 (目前不能省略)
		if(rootName != null && !rootName.equals(""))
			treeMaker.TreeRootInit(rootID,rootName,"/power/include/Tree/pic/home.gif","/power/include/Tree/pic/home.gif");
		
		if(rootTreeNodes != null)
			tree = treeMaker.TreeListApp(rootTreeNodes,"/power/images/xtree_foldericon.gif","/power/images/xtree_openfoldericon.gif",rootURL,rootTarget);
		/**
		* TreeListApp 方法
		* TreeListApp(集合对象，根节点名称，选择项，默认图标，打开图标)
		* 第一个参数为树型集合对象
		* 第三个参数： "c"为多选项， "r"为单选项，"" 空字符串为默认项
		*/
		if(treeNodes != null)
		 	tree = treeMaker.TreeListApp(treeNodes,"/power/images/xtree_foldericon.gif","/power/images/xtree_openfoldericon.gif",treeURL,treeTarget);
		
		//TreeListApp 方法 可多次调用，生成复杂树型结构
		//tree = treeMaker.TreeListApp(orgTreeList,"/power/include/Tree/pic/icon.gif",""); 
		
		//输出字符串
		out.println(tree.toString());
	%>
	document.write(node<%=rootID%>);
  }
</script>
</div>
<!--  //  -->

</body>
</html>
<%!
	String getStrParameter(HttpServletRequest req,String parmName){
		String param = "";
		if(parmName != null && !parmName.equals("") && req != null){
			String temp = (String)req.getAttribute(parmName);
			if(temp == null || temp.equals("") || temp.equals("null")){
				temp = req.getParameter(parmName);
			}
			if(temp != null && !temp.equals("") && !temp.equals("null")){
				param = temp;
			}
		}
		return param;
	}
%>