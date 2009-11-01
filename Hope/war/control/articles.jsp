
<%@page import="com.ada.service.impl.ArticleServiceImpl"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="com.ada.model.*" %>
<%@page import="java.util.*" %>
<%@page import="com.ada.data.page.*" %>


<%
int curpage=1;
String cur=request.getParameter("page");
if(null==cur){
	cur="1";
}
curpage=Integer.parseInt(cur);
String query = "select from " + Article.class.getName();
query+=" order by date desc ";
ArticleEMFAdapter adapter=new ArticleEMFAdapter();
//分页
Pager bean=null;
if(curpage==1){
	bean=ArticleServiceImpl.getpage();
}
else{
	 bean=adapter.getpage(query,curpage,10);
}

request.setAttribute("articles",bean);
%>
 <jsp:forward page="/view/articles.jsp"></jsp:forward>
  
