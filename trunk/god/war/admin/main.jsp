<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>
<%if(session.getAttribute("name")==null){
response.sendRedirect("/index.jsp");
} %>
欢迎光临
<%=session.getAttribute("name") %>
<br/>
<a href="mail.jsp">发送邮件</a>
<a href="addarticle.jsp">添加文章</a>
<a href="articles.jsp">文章管理</a>
<a href="addforum.jsp">添加论坛</a>
</body>
</html>