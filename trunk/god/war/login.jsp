<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登陆</title>
 <style type="text/css">
        #Reset1
        {
            width: 67px;
        }
                .username{
    background-image:url(images/username.gif);
	background-position: 1px 1px;
	background-repeat:no-repeat;
	padding-left:20px;
	height:20px;
	FONT-SIZE: 12px;}
.password{
    background-image:url(images/password.gif);
	background-position: 1px 1px;
	background-repeat:no-repeat;
	padding-left:20px;
	height:20px;
	FONT-SIZE: 12px;}
	    .login
	{
                margin-left: auto;
            margin-right:auto;
            margin-top:300px;
            width:200px;
            
        }
    </style>
</head>
<body>
<div class="login">
<h3>后台登陆</h3>
<form action="/servlet/Login" method="post">
用户名<input class="username" name="name"><br/>
密&nbsp; 码<input class="password" name="password" type="password"><br/>
<input type="submit" value="登陆">
</form>
</div>
<%@include file="foot.jsp" %>
</body>
</html>