<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.ada.model.*" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="com.ada.data.manager.PMF" %>
<%@page import="javax.jdo.*" %>
<%@page import="com.ada.gtalk.Work"%>
<%

Work work=new Work();
work.sendmessage();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="/css/site.css" type="text/css" media="screen" />
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
    margin-top:10px;
    background:white;
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
  </style>
  <script type="text/javascript" charset="utf-8" src="/kindeditor/kindeditor.js"></script>
  <script type="text/javascript">
    KE.show({
        id : 'content1',
        cssPath : '/kindeditor/index.css',
          items : [
        'undo', 'redo','emoticons','fontname', 'fontsize', 'textcolor', 'bgcolor', 'bold', 'italic', 'underline',
        'removeformat', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
        'insertunorderedlist']
    });
  </script>
</head>
<body>
<%@include file="top.jsp" %>
<div class="main">
<h1>系统错误，请等待！！！！！！！</h1>
<%@include file="/ads/ad728.jsp" %>
</div>

<%@include file="foot.jsp" %>
</body>
</html>