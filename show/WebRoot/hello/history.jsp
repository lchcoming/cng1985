<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   
    
    <title>My JSP 'history.jsp' starting page</title>
    
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
 所有初始化流程列表
 <br/>
 <table border="1">
 <tr>
 
  <td>流程id</td>
 <td>
 流程开始时间
 </td>
 <td>流程结束时间</td>
  <td>最终状态</td>
  
 </tr>
 
 
   <s:iterator value="historys">
   <tr>
    <td><s:property value="processInstanceId"/></td>
     <td> <s:property value="startTime"/></td>
      <td><s:property value="endTime"/></td>
     <td> <s:property value="state"/></td>
  </tr>
  </s:iterator>
 </table>
 <a href="index.jsp">回到主页</a>
  </body>
</html>
