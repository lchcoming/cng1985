<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.model.*" %>
<%@page import="com.ada.daoimpl.*"%>
<%@page import="java.util.*"%>
<% UserDaoImpl dao=new UserDaoImpl();
 List<UserInfo> ff=dao.all();

 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%for(UserInfo item:ff){
out.println(item.getUsername());
out.println(item.getContactInfo().getEmail());
} %>
<jsp:useBean id="a" class="com.ada.model.UserInfo"></jsp:useBean>
<jsp:setProperty property="username" name="a" value="adddd"/>
<jsp:getProperty property="username" name="a"/>
${1}
${q}
${a.username}
取的值
${aa.username}
${ada}
</body>
</html>