<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'mywork.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<%
List<String> a=new ArrayList<String>();
a.add("ada");
a.add("young");
request.setAttribute("a",a);
%>
  </head>
  
  <body>
  <c:forEach var="i" begin="1" end="5">
  ${i}
   <br>
   </c:forEach>
     <c:forEach items="${a}" var="item">
  ${item}
   <br>
   </c:forEach>
    This is my JSP page. <br>
  </body>
</html>
