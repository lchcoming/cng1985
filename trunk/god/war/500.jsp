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
<h1>500错误！！！！</h1>
<%@include file="/ads/ad728.jsp" %>
<form action="/servlet/MessageWork" method="post">
 <div class="editor">
<textarea id="content1" name="content" style="width:768px;height:200px;visibility:hidden;">

</textarea>
</div>
<br>
<input type="submit">
</form>
<%String query = "select from " + Message.class.getName();
PersistenceManager pm = PMF.get().getPersistenceManager();
		pm = PMF.get().getPersistenceManager();
		
		Query que=pm.newQuery(query);
		que.setOrdering("date desc");
		que.setRange(0,10);
		List<Message> msgs = (List<Message>)que.execute();
        for(Message item:msgs){
        	%>
        	<div class="commentbox">
        	<%=item.getContent() %>
        	</div>
        	<div class="commentfooter">
                              发表于:<%=item.getDate() %>
            </div>
        	<div class="line"></div>
        	<br>
        	<%
        } %>
 <a href="message.jsp">置顶</a>
</div>

<%@include file="foot.jsp" %>
</body>
</html>