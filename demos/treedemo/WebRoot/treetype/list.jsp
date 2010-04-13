<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'list.jsp' starting page</title>
    
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
	<table width="100%" border="0" cellspacing="1" bgcolor="#999999" style="font-size:12px;">
      <tr>
        <td width="7%" height="25" align="center" background="<%=basePath%>/project/img/cat_bg.gif">序号</td>
        <td width="21%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">分类编号</td>
        <td width="19%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">名称</td>
        <td width="18%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">所属类型</td>
        <td width="18%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">创建时间</td>
        <td width="17%" align="center" background="<%=basePath%>/project/img/cat_bg.gif">操 作</td>
      </tr>
  
      <s:iterator value="types" status="ada">
 
      <s:if test="#ada.odd==true">
		<tr bgcolor="#FFFFFF">
		</s:if>
		<s:else>		 
		<tr bgcolor="#EEEEEE">	
		</s:else>
        <td height="20" align="center"><s:property value="#ada.count"/></td>
        <td align="center"> <s:property value="demo1"/></td> 
        <td align="center"> <s:property value="cailiaoTypeName"/></td> 
        <td align="center"> <s:property value="cailiaoZiyuanType.cailiaoTypeName"/></td>
        <td align="center"> <s:date name="cailiaoTypeCreatTime" format="yyyy-MM-dd"/></td>
         <!--<td align="left" bgcolor="#FFFFFF"><s:property value="cailiaoTypeId"/></td> 
        <td align="left" bgcolor="#FFFFFF">MM</td> 
        <td align="left" bgcolor="#FFFFFF">2009-10-01</td> 
        <td align="left" bgcolor="#FFFFFF"> <s:property value="cailiaoTypeName"/></td> 
         -->
        <td align="center"><a href="<s:url action="cailiaoziyuantypepreupdate">
        <s:param name="vo.cailiaoZiyuanType.cailiaoTypeId" value="cailiaoTypeId"></s:param>
         <s:param name="vo.id" value="vo.id"></s:param>
        </s:url>">修改</a>|<a href="#" onclick="deleteType('${cailiaoTypeId}','<s:url action="cailiaoziyuantypedelete"><s:param name="vo.cailiaoZiyuanType.cailiaoTypeId" value="cailiaoTypeId"></s:param><s:param name="vo.id" value="vo.id"></s:param></s:url>');"> 删除</a></td> 
      </tr> 
     
  </s:iterator>
    </table> 
   
  </body>
</html>
