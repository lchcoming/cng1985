<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String query=request.getParameter("q");
if(query==null){
	query="啪啪在线";
}

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=query %></title>
<link rel="stylesheet" type="text/css" href="/css/style.css"
	media="screen" />
<link rel="alternate" type="application/rss+xml" title="RSS 2.0"
	href="rss/" />
<script src="/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	$.get("/temple/subbar.txt",function(data){
	      $("#subbar").html(data);
			});
	$.get("/temple/topbar.txt",function(data){
	      $("#topbar").html(data);
			});

	
});
</script>

</head>
<body>

<!-- SiteSearch Google -->

<div id="topbar">
加载中
</div>

<div id="subbar">
加载中
</div>


<div class="content">
<div id="main">
<div class="padding">


<div id="left_side"  >
				<div class="mpart">
<!-- SiteSearch Google -->
<form method="get" action="http://cng1985.appspot.com/search/main.jsp" target="_top">
<table border="0" bgcolor="#fbf7f7">
<tr><td nowrap="nowrap" valign="top" align="left" height="32">

<br/>
<input type="hidden" name="domains" value="cng1985.appspot.com"></input>
<label for="sbi" style="display: none">输入您的搜索字词</label>
<input type="text" name="q" size="31" maxlength="255" value="<%=query%>" id="sbi"></input>
<label for="sbb" style="display: none">提交搜索表单</label>
<input type="submit" name="sa" value="Google 搜索" id="sbb"></input>
</td></tr>
<tr>
<td nowrap="nowrap">
<table>
<tr>
<td style='white-space: nowrap;'>
<input type="radio" name="sitesearch" value="" checked id="ss0"></input>
<label for="ss0" title="搜索网络"><font size="-1" color="#000000">Web</font></label></td>
<td style='white-space: nowrap;'>
<input type="radio" name="sitesearch" value="cng1985.appspot.com" id="ss1"></input>
<label for="ss1" title="搜索 cng1985.appspot.com"><font size="-1" color="#000000">站内搜索</font></label></td>
</tr>
</table>
<input type="hidden" name="client" value="pub-5166549859484488"></input>
<input type="hidden" name="forid" value="1"></input>
<input type="hidden" name="ie" value="UTF-8"></input>
<input type="hidden" name="oe" value="UTF-8"></input>
<input type="hidden" name="cof" value="GALT:#0066CC;GL:1;DIV:#999999;VLC:336633;AH:center;BGC:fbf7f7;LBGC:FF9900;ALC:0066CC;LC:0066CC;T:000000;GFNT:666666;GIMP:666666;FORID:11"></input>
<input type="hidden" name="hl" value="zh-CN"></input>
</td></tr></table>
</form>
				</div>
</div>
<div class="clear"></div>
</div>


</div>
</div>
</body>
</html>