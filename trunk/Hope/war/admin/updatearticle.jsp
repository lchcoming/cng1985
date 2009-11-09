<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*" %>
       <%@page import="com.ada.model.*" %>
       <%@ page import="com.ada.data.manager.PMF" %>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="javax.jdo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%String id=request.getParameter("id");
ArticlePMFAdapter adapter=new ArticlePMFAdapter();
long ids=Integer.parseInt(id);
Article que=adapter.findArticle(ids);
 %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=que.getSubject() %></title>
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
    margin-top:100px;
    width:760px;
    margin-left:auto;
    margin-right:auto;
    
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
<a href="main.jsp">回到首页</a>
<div class="main">

 <form action="" method="post">
<input name="subject" value="<%=que.getSubject()%>">
  <textarea id="content1" name="content" style="width:700px;height:400px;visibility:hidden;">
  <%=que.getContent().getValue() %>
  </textarea>
  <input type="submit" value="更新文章"> 
 </form>


 </div>
</body>
</html>