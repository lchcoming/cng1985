<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.ada.daoimpl.*"%>
<%@ page import="java.util.*"%>
<%@ page import="com.google.appengine.api.datastore.Text"%>
<%@ page import="com.ada.model.*"%>
<%
String content = request.getParameter("content");
String subject=request.getParameter("subject");
Text a=new Text(content);
Date date = new Date();
Article msg = new Article( );
msg.setDate(date);
msg.setContent(a);
msg.setSubject(subject);
msg.setVisit(0);
ArticleDaoImpl dao=new ArticleDaoImpl();
dao.addObject(msg);
response.sendRedirect("/admin/main.jsp");

%>