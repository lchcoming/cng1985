<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
  <style type="text/css" rel="stylesheet">
    form {
    margin: 0;
    }
    .editor {
    margin-top: 5px;
    margin-bottom: 5px;
    }
  </style>
  <script type="text/javascript" charset="utf-8" src="/kindeditor/kindeditor.js"></script>
  <script type="text/javascript">
    KE.show({
        id : 'content1',
        cssPath : '/kindeditor/index.css'
    });
  </script>
</head>
<body>
<h3>添加文章</h3>
<form action="/servlet/ArticleWork" method="post">
主题<input name="subject">
  <div class="editor">
      <textarea id="content1" name="content" style="width:700px;height:400px;visibility:hidden;">

</textarea>
<br>
<input type="submit">
</form>
</body>
</html>