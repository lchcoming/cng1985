<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
String name=request.getParameter("name");
String password=request.getParameter("password");
System.out.println(name);
System.out.println(password);
if(name.endsWith("ada")&&password.endsWith("ada2008")){
   request.getSession().setAttribute("name", name);
   response.sendRedirect("/admin/main.jsp");
}
else{
	  response.sendRedirect("/index.jsp");
}
 %>
