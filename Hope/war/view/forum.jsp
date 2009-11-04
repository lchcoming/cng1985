<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${forum.title}</title>
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
     margin-top:50px;
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
    .nav{
    background:silver;
    border:0px;
    }
  </style>
</head>
<body>
<%@include file="/top.jsp" %>

<div class="main">
<%@include file="/ads/ad728.jsp" %>
<br/>
<%
    UserService userService = UserServiceFactory.getUserService();
    User user = userService.getCurrentUser();
    if (user != null) {
%>
<p>欢迎光临: <%= user.getNickname() %>! (You can
<a href="<%= userService.createLogoutURL(request.getRequestURI()) %>">sign out</a>.)</p>
<%
    } else {
%>
<p>Hello!
<a href="<%= userService.createLoginURL(request.getRequestURI()) %>">Google账户登录</a>
to include your name with you post.</p>
<%
    }
%>
欢迎来到
${forum.title}<a href="newforummessage.jsp?id=${forum.id}">发帖从这里开始</a>
<br/>
${forum.describe}
<table >
<tr class="nav">
<td>主题</td>
<td>访问量</td>
<td>发帖人</td>
<td>发布时间</td>
</tr>
<c:forEach items="${forummessages}" var="item">
<tr>
<td><a href="forummessage.jsp?id=${item.id}&forumid=${forum.id}">

<c:choose>
    <c:when test="${fn:length(item.title)>50}">
     <c:out value="${fn:substring(item.title,0, 50)}"></c:out>....
    </c:when>
    <c:otherwise>
     <c:out value="${item.title}"></c:out>
    </c:otherwise>
    </c:choose>
</a></td>
<td>${item.visit}</td>
<td>${item.pubuser}</td>
<td><fmt:formatDate value="${item.putime}" pattern="yyyy年MM月dd日"/></td>
</tr>

</c:forEach>

</table>

    第<FONT color="red">${pageBean.currentPage }</FONT>页&nbsp;	
	共<FONT color="red">${ pageBean.totalPages}</FONT>页&nbsp;						                  
	记录总数:<FONT color="red">${pageBean.totalRows }</FONT> 条&nbsp;
   <c:forEach begin="${pageBean.startPage}" end="${pageBean.endPage}" var="i" step="1">
   <a href="/forum.jsp?page=${i}&id=${forum.id}">第<c:out value="${i}"></c:out>页</a>
   </c:forEach>
</div>
</body>
</html>