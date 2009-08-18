<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
 <%@page import="com.ada.model.*" %>
<%String q="ada";

UserInfo aa=new UserInfo();
aa.setUsername("ada.young");
request.setAttribute("ada",q);
request.setAttribute("aa",aa);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>啪啪在线，中国最大的毕业设计网站</title>
 <link href="/css/site.css" rel="stylesheet" type="text/css" />
</head>

<body>
<%@include file="top.jsp" %>
<div class="body">
<div class="left">
1
</div>
<div class="right">

</div>
<div class="left">
2
</div>
<div class="right">
${"呵呵"}
</div>
<div class="left">
3
</div>
<div class="right">

</div>
</div>
<%@include file="foot.jsp" %>
</body>
</html>