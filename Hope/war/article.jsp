<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.*" %>
<%@page import="com.ada.model.*" %>
<%@ page import="com.ada.data.manager.PMF" %>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="javax.jdo.*" %>
<%String id=request.getParameter("id");
ArticlePMFAdapter adapter=new ArticlePMFAdapter();
long ids=Integer.parseInt(id);
Article que=adapter.findArticle(ids);
long v=que.getVisit();
v++;
que.setVisit(v);
adapter.updateArticle(que);
request.setAttribute("article",que);
request.getRequestDispatcher("/view/article.jsp").forward(request,response);
%>
