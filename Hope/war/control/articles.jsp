
<%@page import="com.ada.service.impl.ArticleServiceImpl"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="com.ada.model.*" %>
<%@page import="java.util.*" %>
<%@page import="com.ada.dao.help.*" %>
<%@page import="java.util.logging.Logger"%>
<%@page import="com.ada.dao.api.ArticleDao"%>
<%@page import="com.ada.dao.pmf.ArticleDaoImpl"%>


<%
int curpage=1;
String cur=request.getParameter("page");
if(null==cur){
	cur="1";
}
curpage=Integer.parseInt(cur);
String query = "select from " + Article.class.getName();
query+=" order by date desc ";
ArticleDao dao=new ArticleDaoImpl();
ArticleEMFAdapter adapter=new ArticleEMFAdapter();
//分页
Pager bean=null;
if(curpage==1){
	 bean=dao.getPager(query,1,10);
	
}
else{
	 bean=dao.getPager(query,curpage,10);
}
request.setAttribute("articles",bean);
%>
 <jsp:forward page="/view/articles.jsp"></jsp:forward>
  
