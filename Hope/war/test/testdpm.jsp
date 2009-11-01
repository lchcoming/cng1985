<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.model.*" %>
<%@page import="com.ada.daoimpl.*"%>
<%@page import="java.util.*"%>
<%

Deparment dp=new Deparment();
UserInfo u=new UserInfo();
u.setId(Long.parseLong("1111"));
dp.getUsers().add(u);
DeparmentDaoImpl dao=new DeparmentDaoImpl();
dao.addDeparment(dp);
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>