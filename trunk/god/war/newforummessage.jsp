<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%String id=request.getParameter("id"); %>
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
    margin-top:200px;
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
<div class="main">
<%@include file="/ads/ad728.jsp" %>
<h1>发帖啦</h1>
<form action="/ForumMessageService" method="post">
<input name="mothod" value="new" type="hidden">
<input name="id" value="<%=id%>" type="hidden">
贴名<input name="title">
<br/>
<textarea id="content1" name="content" style="width:768px;height:200px;visibility:hidden;">

</textarea>
<input type="submit">
</form>
</div>
</body>
</html>