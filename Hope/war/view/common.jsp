<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>啪啪论坛</title>
<link rel="stylesheet" href="/style.css" type="text/css" media="screen" />
 <style type="text/css" rel="stylesheet">
    form {
    margin: 0;
    }
    .editor {
    margin-top: 5px;
    margin-bottom: 5px;
    }
    .main{
    width:768px;
    margin-left:auto;
    margin-right:auto;
     margin-top:0px;
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
  </style>
</head>
<body>
<%@include file="/top.jsp" %>
<div class="main">
<%@include file="/ads/ad728.jsp" %>
<c:forEach items="${forums}" var="forum">
<div>
<a href="forum.jsp?id=${forum.id}">${forum.title}</a>
<br/>
${forum.describe}
</div>
</c:forEach>
</div>
<%@include file="/foot.jsp" %>
<%@include file="/bbs.jsp" %>
</body>
</html>