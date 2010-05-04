<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
建设中  ，请等待${contact}

<dl id="rightCon">
	
   
 <c:forEach begin="0" end="15">
 <table width="31%" border="1" style="border:#cccccc solid 1px; float:left; margin:5px;">
  <tr>
    <td height="25"  background="images/cat_bg.gif">&nbsp;&nbsp;<strong>最新通知</strong></td>
  </tr>
   <tr>
    <td height="20">[1]<a href="#">公告信息标题</a> <font color="#99CC00">NEW</font></td>
  </tr>
  <tr>
    <td height="20">[2]<a href="#">公告信息标题</a> <font color="#99CC00">NEW</font></td>
  </tr>
  <tr>
    <td height="20">[3]公告信息标题 <font color="#99CC00">NEW</font></td>
  </tr>
  <tr>
    <td height="20">[4]公告信息标题 <font color="#99CC00">NEW</font></td>
  </tr>
</table>
 </c:forEach>   
</dl>

</body>
</html>