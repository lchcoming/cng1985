<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>My JSP 'index.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <s:form action="/hello/flowstar.action">
  开始一个申请
  <s:textfield name="messages"></s:textfield>
  <s:submit></s:submit>
  </s:form>
  <a href="flowlist.action?username=123">部门经理查看</a>
   <a  href="flowlist.action?username=456">总经理查看</a>
   <a  href="flowhistory.action">历史记录</a>
    This is my JSP page. <br>
  </body>
</html>
