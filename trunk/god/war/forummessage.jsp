<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.daoimpl.*" %>
<%@page import="com.ada.model.*"  %>
<%@page import="java.util.*"  %>
<%

String id=request.getParameter("id");
String forumid=request.getParameter("forumid");

ForumMessageDaoImpl dao=new ForumMessageDaoImpl();

ForumMessage message=dao.findbyid(Long.parseLong(id));
ForumRMessageDaoImpl mdao=new ForumRMessageDaoImpl();
List<ForumRMessage> ms=mdao.findbyid(id);
ForumDaoImpl  fdao=new ForumDaoImpl();
Forum forum=fdao.findbyid(Long.parseLong(forumid));
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=message.getTitle()%></title>
<link rel="stylesheet" href="/css/site.css" type="text/css" media="screen" />
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
     margin-top:100px;
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
<%@include file="/ads/ad728.jsp" %>
<h3>主题:<%=message.getTitle()%></h3>
<h5>发布时间:<%=message.getPutime() %>|由<%=message.getPubuser()%>发布</h5>
<h2>内容如下</h2>
<%=message.getContent().getValue()%>
<br/>
<h2>他人回复</h2>
<%for(ForumRMessage ii:ms){
%>
<div class="commentbox">
           <%=ii.getContent().getValue()%>
        	</div>
        	<div class="commentfooter">
                              发表于:<%=ii.getPubtime() %>
            </div>
<%
} %>

<a href="index.jsp">回到首页</a>|<a href="forum.jsp?id=<%=forumid%>">回到<%=forum.getTitle() %></a>|<a href="forummessage.jsp?id=<%=id %>&forumid=<%=forumid %>">至顶</a>

<form action="/ForumRMessageService" method="post">
<input name="id" type="hidden" value="<%=id%>">
<input name="forumid" type="hidden" value="<%=forumid%>">
<textarea id="content1" name="content" style="width:768px;height:200px;visibility:hidden;">
</textarea>
<input type="submit">
</form>
<%@include file="friends/score.jsp" %>
</div>
</body>
</html>