<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.daoimpl.*" %>
<%@page import="com.ada.model.*"  %>
<%@page import="java.util.*"  %>
<%
ForumDaoImpl dao=new ForumDaoImpl();
List<Forum> fs=dao.allForum();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>啪啪论坛</title>
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
     margin-top:0px;
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
  </style>
</head>
<body>
<%@include file="top.jsp" %>
<div class="main">
<%@include file="/ads/ad728.jsp" %>
<%
for(Forum item:fs){
%>
<div>
<a href="forum.jsp?id=<%=item.getId()%>"><%=item.getTitle() %></a>
<br/>
<%=item.getDescribe()%>
</div>
<%
}
 %>
</div>
<%@include file="foot.jsp" %>
<%@include file="bbs.jsp" %>
</body>
</html>