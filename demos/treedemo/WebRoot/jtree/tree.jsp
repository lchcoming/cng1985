<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="http://cng1985.appspot.com/" prefix="t"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="content-type"
			content="text/html; charset=iso-8859-1" />
		<title>jQuery treeView</title>

		<link rel="stylesheet" href="<%=basePath%>jtree/jquery.treeview.css" />
		
		<link rel="stylesheet" href="<%=basePath%>jtree/screen.css" />
		<style type="text/css">
<!--
a {
	text-decoration: none;
}

a,a:visited {
	color: #000;
	background: inherit;
}

dt {
	font-size: 22px;
	font-weight: bold;
	margin: 0 0 0 15px;
}

dd {
	margin: 0 0 0 15px;
}

h4 {
	margin: 0;
	padding: 0;
	font-size: 18px;
	text-align: center;
}

p {
	margin: 0;
	padding: 0 0 0 18px;
}

p a,p a:visited {
	color: #00f;
	background: inherit;
}

/*CNLTreeMenu Start*/
.CNLTreeMenu img.s {
	cursor: pointer;
	vertical-align: middle;
}

.CNLTreeMenu ul {
	padding: 0;
}

.CNLTreeMenu li {
	list-style: none;
	padding: 0;
}

.Closed ul {
	display: none;
}

.Child img.s {
	background: none;
	cursor: default;
}

#CNLTreeMenu2 ul {
	margin: 0 0 0 17px;
}

#CNLTreeMenu2 img.s {
	width: 17px;
	height: 15px;
}

#CNLTreeMenu2 .Opened img.s {
	background: url(<%=basePath%>treefileimage/folder.gif) no-repeat
		;
}

#CNLTreeMenu2 .Closed img.s {
	background: url(<%=basePath%>treefileimage/folder-closed.gif) no-repeat 
		;
}

#CNLTreeMenu2 .Child img.s {
	background: url(<%=basePath%>treefileimage/file.gif) no-repeat;
}

/*CNLTreeMenu End*/ /*Temp CSS for View Demo*/
#CNLTreeMenu1,#CNLTreeMenu2,#CNLTreeMenu3 {
	float: left;
	width: 220px;
	border: 1px solid #99BEEF;
	background: #FFFFFF;
	color: inherit;
	margin: 3px;
	padding: 3px;
}

#CNLTreeMenu1,#CNLTreeMenu2 {
	padding-bottom: 15px;
}

.ViewCode {
	clear: both;
	border: 1px solid #FFB900;
	background: #FFFFCC;
	color: inherit;
	margin: 3px;
	padding: 3px;
}

.ViewCode h6 {
	color: #00f;
}
-->
</style>
		<script src="<%=basePath%>jtree/lib/jquery.js" type="text/javascript"></script>
		<script src="<%=basePath%>jtree/lib/jquery.cookie.js"
			type="text/javascript"></script>
		<script src="<%=basePath%>jtree/lib/jquery.treeview.js"
			type="text/javascript"></script>

		<script type="text/javascript">
	$(function() {
			$("#tree").treeview({
				collapsed: true,
				animated: "medium",
				control:"#sidetreecontrol",
				persist: "location"
			});
		})
	</script>
	</head>
	<body>

		<h1 id="banner">
			<a
				href="http://bassistance.de/jquery-plugins/jquery-plugin-treeview/">jQuery
				Treeview Plugin</a> Demo
		</h1>
		<div id="main">

			<s:property value="trees" escape="false" />
		</div>	
		    <table width="100%" border="0" cellpadding="0" cellspacing="0"> 
          <tr> 
            <td width="220" align="left" valign="top"> 
			  <div class="CNLTreeMenu" id="CNLTreeMenu2"> 
		<!-- 	<s:form action="cailiaoziyuantypetree"><s:submit value="刷新"/></s:form> -->
                    <h4>材料信息管理</h4> 
					
                    <p><a id="AllOpen_2" href="#" onclick="MyCNLTreeMenu2.SetNodes(0);Hd(this);Sw('AllClose_2');">全部展开</a><a id="AllClose_2" href="#" onclick="MyCNLTreeMenu2.SetNodes(1);Hd(this);Sw('AllOpen_2');" style="display:none;">全部折叠</a></p> 
       <s:property value="trees" escape="false"/>
              </div><!-- CNLTreeMenu --> 
			<!--CNLTreeMenu3 End--> 
			  <script type="text/javascript"> 
						<!--
						function Ob(o){
						var o=document.getElementById(o)?document.getElementById(o):o;
						return o;
						}
						function Hd(o) {
						Ob(o).style.display="none";
						}
						function Sw(o) {
						Ob(o).style.display="";
						}
						function ExCls(o,a,b,n){
						var o=Ob(o);
						for(i=0;i<n;i++) {o=o.parentNode;}
						o.className=o.className==a?b:a;
						}
						function CNLTreeMenu(id,TagName0) {
						this.id=id;
						this.TagName0=TagName0==""?"li":TagName0;
						this.AllNodes = Ob(this.id).getElementsByTagName(TagName0);
						this.InitCss = function (ClassName0,ClassName1,ClassName2,ImgUrl) {
						this.ClassName0=ClassName0;
						this.ClassName1=ClassName1;
						this.ClassName2=ClassName2;
						this.ImgUrl=ImgUrl || "<%=basePath%>image/s1.gif";
						this.ImgBlankA ="<img src=\""+this.ImgUrl+"\" class=\"s\" onclick=\"ExCls(this,'"+ClassName0+"','"+ClassName1+"',1);\" alt=\"展开/折叠\" />";
						this.ImgBlankB ="<img src=\""+this.ImgUrl+"\" class=\"s\" />";
						for (i=0;i<this.AllNodes.length;i++ ) {
						   this.AllNodes[i].className==""?this.AllNodes[i].className=ClassName1:"";
						   this.AllNodes[i].innerHTML=(this.AllNodes[i].className==ClassName2?this.ImgBlankB:this.ImgBlankA)+this.AllNodes[i].innerHTML;
						   }
						}
						this.SetNodes = function (n) {
						var sClsName=n==0?this.ClassName0:this.ClassName1;
						for (i=0;i<this.AllNodes.length;i++ ) {
						   this.AllNodes[i].className==this.ClassName2?"":this.AllNodes[i].className=sClsName;
						}
						}
						}
						
						var MyCNLTreeMenu2=new CNLTreeMenu("CNLTreeMenu2","li");
						MyCNLTreeMenu2.InitCss("Opened","Closed","Child","<%=basePath%>image/s1.gif");
						
						-->
						</script>			
			</td> 
            <td align="left" valign="top"> 
			
			<iframe name="cai" id="cai" width="100%" style="border:#999999 solid 1px; height:500px;" align="left"></iframe> 
             
            </td> 
          </tr> 
        </table> 
	</body>
</html>
