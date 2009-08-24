<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/servlet/UpFile" method="post" enctype="multipart/form-data">
发送文件:<input type="file" size="40" name="upl-file"> 
<input type="submit" value="开始发送">
<input type="reset" value="重 设">
</form>
</body>
</html>