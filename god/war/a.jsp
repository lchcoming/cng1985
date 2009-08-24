<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%
List<String> a=new ArrayList<String>();
a.add("a");
a.add("dd");
request.setAttribute("show",a);

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<c:if test="a==a">
haha
</c:if>
<c:forEach items="#show" var="item">
<c:out value="item"></c:out>
</c:forEach>
<form action="b.jsp">
<input type="submit" >
</form>
</body>
</html>