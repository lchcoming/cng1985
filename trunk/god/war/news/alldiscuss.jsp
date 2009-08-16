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
<%	DiscussDaoImpl dao = new DiscussDaoImpl();
    List<Discuss> ns= dao.all();
    for(Discuss item:ns){   	
    	
    	%>
    	<%=item.getContent() %>
    	<%=item.getNews().getTitle() %>
    	<%=item.getPutime().toLocaleString()%>
    	<a href="deletediscuss.jsp?id=<%=item.getKey().getId() %>&pid=<%=item.getKey().getParent().getId() %>">删除</a>
    	<br/>
    	<%
    }
%>
</body>
</html>