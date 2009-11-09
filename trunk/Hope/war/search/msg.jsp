<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.tool.*" %>
<%

String url=request.getParameter("url");
if(url==null){
	url="www.google.cn";
}
if(!url.matches("^http.*")){
	url="http://"+url;
}
String msg=HtmlWork.visit(url);
if(msg==null){
	msg="不好意思，系统出错了";
}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.title{
margin-left:0px;;
width:700px;
position:fixed;
}
.main{
margin-left:auto;
margin-right:auto;
width:1024px;

}
.q{
width:500px;
}
</style>
</head>
<body>
<form action="">
<div class="title">
请输入url地址<input name="url" class="q">
<input type="submit" value="开始导航">
</div>
<br/>
<h1>代理以后的内容</h1>
<%=msg%>

</form>
</body>
</html>