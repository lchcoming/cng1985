<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <%
    
    %>
   <title>一些简简单单的思想，一点点小小的历史</title>
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
    margin-top:10px;
    }
     .ada{
    width:768px;
    margin-left:auto;
    margin-right:auto;
    margin-top:10px;
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
  <table class="main">
    <c:forEach items="${articles.resultList}" var="ada">
    <tr>
    <td>
    <a href="/article.jsp?id=${ada.id} ">
    <c:out value="${ada.subject}"></c:out>
    </a>
    </td>
  </tr>
    
    </c:forEach>
    </table>
    第<FONT color="red">${articles.pageBean.currentPage }</FONT>页&nbsp;	
	共<FONT color="red">${ articles.pageBean.totalPages}</FONT>页&nbsp;						                  
	记录总数:<FONT color="red">${articles.pageBean.totalRows }</FONT> 条&nbsp;
   <c:forEach begin="${articles.pageBean.startPage}" end="${articles.pageBean.endPage}" var="i" step="1">
   <a href="/control/articles.jsp?page=${i}">第<c:out value="${i}"></c:out>页</a>
   </c:forEach>
   <%@include file="/foot.jsp" %>
<br />

<%@include file="/ads/ad728.jsp" %>
</div>
  </body>
</html>
