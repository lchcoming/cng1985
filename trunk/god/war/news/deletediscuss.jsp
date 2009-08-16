<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.ada.news.model.*"%>
<%@page import="com.ada.daoimpl.*"%>
<%@page import="com.google.appengine.api.datastore.Text" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<%
		String id=request.getParameter("id");
		String pid=request.getParameter("pid");
		DiscussDaoImpl dao = new DiscussDaoImpl();
	    dao.deletediscuss(Long.parseLong(id),Long.parseLong(pid));
	    response.sendRedirect("alldiscuss.jsp");
	
		%>
	</body>
</html>