<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

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
    margin-top:100px;
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
  <br/>
  <div class="main">
  <table >
    <c:forEach items="${articles.resultList}" var="ada" varStatus="young">
    <tr>
    <td>
    ${young.count}
    </td>
    <td width="500">
    <a href="/article.jsp?id=${ada.id} ">
    <c:choose>
    <c:when test="${fn:length(ada.subject)>20}">
     <c:out value="${fn:substring(ada.subject,0, 20)}"></c:out>....
    </c:when>
    <c:otherwise>
     <c:out value="${ada.subject}"></c:out>
    </c:otherwise>
    </c:choose>
     </a>
    </td>
    <td width="200">
    
    <fmt:formatDate value="${ada.date}" pattern="yyyy年MM月dd日"/>
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
