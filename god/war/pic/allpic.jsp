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
		<%
			SiteImageDaoImpl dao = new SiteImageDaoImpl();
			List<SiteImage> all = dao.all();
			for(SiteImage item:all){
				%>
				<a href="/servlet/ShowImage?id=<%=item.getId()%>"><%=item.getId()%></a>
				<a><%=item.getImage().getBytes().length%></a>
				<%
			}
		%>
	</body>
</html>