<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=GB2312"%>
<HTML>
<HEAD>
<META HTTP-EQUIV="Content-Type" CONTENT="text/html; charset=gb2312">
<script type="text/javascript" language="javascript" src="../../include/popupTree/js/xtree.js" ></script>
<%@ include file="../../include/css.jsp" %>
<TITLE></TITLE>
</HEAD>

<%
	String ipt1 = request.getParameter("input1");
	String ipt2 = request.getParameter("input2");
%>

<script language="javascript">
 function fun(id,name)
  {		
		parent.document.all("<%=ipt1%>").value=id;
		parent.document.all("<%=ipt2%>").value=name;
	
		parent.close_window();
  }
</script>

<BODY>
<jsp:useBean id="treeMaker" class="com.knowledgesurf.basic.util.tree.TreeMaker" scope="page"/> 
<% 
Collection equipSortTreeList = (Collection)request.getAttribute("tree");
String strAct = request.getParameter("act");
String httpUrl = "";
if(strAct != null && strAct.equals("sort"))
{
	httpUrl = "equipSortQuery.do?id=";
}

String path = "../../include/tree/";
%>
<%@ include file= "../../include/tree/jsp/TreeModel.jsp" %>
<div noWrap style="position: absolute; width:90%px; height:100%px; top: 5px; left: 5px; PADDING-BOTTOM: 5px; PADDING-LEFT: 5px; PADDING-RIGHT: 0px; PADDING-TOP: 5px; overflow:auto;"> 
  <!-- js file containing the tree content, edit this file to alter the menu,
       the menu will be inserted where this tag is located in the document -->
<script language="javascript">
  if (document.getElementById) { 
	<%
		//树型初使化 (目前不能省略)                   (String rootId,String rootName,String Icon,String openIcon,String url,String target) 
		StringBuffer tree = treeMaker.TreeRootInit2("",request.getParameter("treename"),"../../include/tree/pic/xtree_foldericon.gif","../../include/tree/pic/xtree_openfoldericon.gif","javascript:","main");
		/**
		* TreeListApp 方法  4028813e0a72687b010a72af7b370002
		* TreeListApp(集合对象，根节点名称，选择项，默认图标，打开图标)
		* 第一个参数为树型集合对象
		* 第三个参数： "c"为多选项， "r"为单选项，"" 空字符串为默认项
		*/
		String target="main";
		if(request.getParameter("target")!=null)
			target=request.getParameter("target");
			
		if (request.getParameter("pup")==null || request.getParameter("pup").equals("1"))
		tree = treeMaker.TreeListApp2(equipSortTreeList,"../../images/xtree_foldericon.gif","../../images/xtree_openfoldericon.gif",httpUrl,target);
		else
		tree = treeMaker.TreeListApp(equipSortTreeList,"../../images/xtree_foldericon.gif","../../images/xtree_openfoldericon.gif",httpUrl,target);
		//TreeListApp 方法 可多次调用，生成复杂树型结构
		//tree = treeMaker.TreeListApp(orgTreeList,"/power/include/tree/pic/icon.gif",""); 
		
		//输出字符串
		out.println(tree.toString());
	%>
	document.write(node);
  }
</script>
</div>
<!--  //  -->
</body>
</html>>
