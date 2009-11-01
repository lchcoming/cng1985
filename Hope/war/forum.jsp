<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.daoimpl.*" %>
<%@page import="com.ada.model.*"  %>
<%@page import="java.util.*"  %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

 String id=request.getParameter("id");
if(id==null){
id="5059";
}
ForumMessageDaoImpl dao=new ForumMessageDaoImpl();
ForumDaoImpl  fdao=new ForumDaoImpl();
Forum forum=fdao.findbyid(Long.parseLong(id));
List<ForumMessage> ms=dao.findbyforumid(id);
 %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=forum.getTitle()%></title>
<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
 <style type="text/css" rel="stylesheet">
    form {
    margin: 0;
    }
    .editor {
    margin-top: 5px;
    margin-bottom: 5px;
    }
    .main{
    width:768px;
    margin-left:auto;
    margin-right:auto;
     margin-top:50px;
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
    .nav{
    background:silver;
    border:0px;
    }
  </style>
</head>
<body>
<%@include file="top.jsp" %>

<div class="main">
<%@include file="/ads/ad728.jsp" %>
<br/>
<%
    UserService userService = UserServiceFactory.getUserService();
    User user = userService.getCurrentUser();
    if (user != null) {
%>
<p>欢迎光临: <%= user.getNickname() %>! (You can
<a href="<%= userService.createLogoutURL(request.getRequestURI()) %>">sign out</a>.)</p>
<%
    } else {
%>
<p>Hello!
<a href="<%= userService.createLoginURL(request.getRequestURI()) %>">Google账户登录</a>
to include your name with you post.</p>
<%
    }
%>
欢迎来到
<%=forum.getTitle()%><a href="newforummessage.jsp?id=<%=id%>">发帖从这里开始</a>
<br/>
<%=forum.getDescribe()%>
<table >
<tr class="nav">
<td>主题</td>
<td>访问量</td>
<td>发帖人</td>
<td>发布时间</td>
</tr>
<%
if(ms!=null){
for(ForumMessage item:ms){
%>
<tr>
<td><a href="forummessage.jsp?id=<%=item.getId()%>&forumid=<%=id%>">
<% if(item.getTitle().length()>50){
%> 
<%=item.getTitle().substring(0,48) %>
<%
}
else{
%>
<%=item.getTitle()%>
<%
}
 %>
</a></td>
<td><%=item.getVisit() %></td>
<td><%=item.getPubuser() %></td>
<td><%=item.getPutime().toLocaleString() %></td>
</tr>

<%
}
}
else{
%>没有内容<%
}
 %>
</table>
</div>
</body>
</html>