<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.test.Hello"%>
<%@page import="com.ada.framework.ioc.IocService"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="foot.jsp" %>
<%=request.getServerName() %><br>
<%=request.getProtocol() %><br>
<%=request.getLocalPort() %><br>
<%=request.getRemoteAddr() %><br>
<%=request.getRemoteHost() %><br>
<%=request.getRemoteUser() %><br>
<%
Hello hello=(Hello)IocService.getContext().getBean("hello");
out.print(hello.now());
%>
</body>
</html>