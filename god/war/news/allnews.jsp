<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.news.model.*"%>
<%@page import="com.ada.daoimpl.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%	NewDaoImpl dao = new NewDaoImpl();
    List<News> ns= dao.all();
    for(News item:ns){   	
    	
    	%>
    	<%=item.getId()%>
    	<%=item.getDilist().size()%>
    	<a href="newsdetail.jsp?id=<%=item.getId() %>"><%=item.getTitle()%></a>
    	<a href="deletenews.jsp?newsid=<%=item.getId() %>">删除</a>
    	<%=item.getPutime().toLocaleString()%>
    	
    	<br/>
    	<%
    }
%>
</body>
</html>