<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.news.model.*"%>
<%@page import="com.ada.daoimpl.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<%
		String id=request.getParameter("id");
		if(id==null){
			id="1";
		}
			NewDaoImpl dao = new NewDaoImpl();
			News news =dao.visit(Long.parseLong(id));
		
		%>
		
		
		标题:<%=news.getTitle() %>
		<br/>
		内容<%=news.getDetails().getContent().getValue() %>
		<br/>
		留言量:<%=news.getVisit()%>
	<br/>评论如下
	<br/>
		<%
		for(Discuss dis:news.getDilist()){
			%>
			<%=dis.getContent() %>
			<br/>
			<%
			
		}
		
		%>
<form action="adddiscuss.jsp" method="post">
  <input name="content" type="text">
  <input type="hidden" name="newsid" value="<%=id%>">
  <input type="submit" value="添加评论">
</form>
</body>
</html>