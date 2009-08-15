<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="com.ada.model.*" %>
<%@page import="java.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int curpage=1;
String cur=request.getParameter("page");

if(cur!=null){
curpage=Integer.parseInt(cur);
}
int star=0;
int end=10;

ArticlePMFAdapter adapter=new ArticlePMFAdapter(); 
String query = "select from " + Article.class.getName();
List<Article> a=adapter.pageArticle(query,curpage,5);
%>
数据库中有<%=adapter.findsize(query) %>条数据
<br/>
现在是第<%=curpage%>页
<br/>
<%for(Article item:a){
%>

<%=item.getSubject() %>
主题
<br/>
<%

} %>

<%for(int i=0;i<10;i++){
%>
<a href="3.jsp?page=<%=i%>">第<%=i%>页</a>|
<%
} %>
</body>
</html>