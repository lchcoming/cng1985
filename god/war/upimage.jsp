<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="/sign" enctype="multipart/form-data" method="post">
            <div><label>Message:</label></div>
            <div><textarea name="content" rows="3" cols="60"></textarea></div>
            <div><label>Avatar:</label></div>
            <div><input type="file" name="img"/><</div>
            <div><input type="submit" value="Sign Guestbook"></div>
          </form>
</body>
</html>