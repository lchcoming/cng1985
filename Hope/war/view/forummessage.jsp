<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${message.title}</title>
<link rel="stylesheet" href="/css/site.css" type="text/css" media="screen" />
<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
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
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
    .ad{
    margin-top:20px;
    width:730px;
    }
  </style>
 <script type="text/javascript" charset="utf-8" src="/kindeditor/kindeditor.js"></script>
  <script type="text/javascript">
    KE.show({
        id : 'content1',
        cssPath : '/kindeditor/index.css',
          items : [
        'undo', 'redo','emoticons','fontname', 'fontsize', 'textcolor', 'bgcolor', 'bold', 'italic', 'underline',
        'removeformat', 'justifyleft', 'justifycenter', 'justifyright', 'insertorderedlist',
        'insertunorderedlist']
    });
  </script>
</head>
<body>
<%@include file="/top.jsp" %>
<div class="main">
<%@include file="/ads/ad728.jsp" %>
<h3>主题:${message.title}</h3>
<h5>发布时间: <fmt:formatDate value="${message.putime}" pattern="yyyy年MM月dd日"/>|由${message.pubuser}发布</h5>
<h2>内容如下</h2>
<c:out value="${message.content.value}" escapeXml="false"></c:out>

<br/>
<h2>他人回复</h2>
<c:forEach items="${ms}" var ="item">
<div class="commentbox">
             ${item.content.value} 
          
        	</div>
        	<div class="commentfooter">
                              发表于:<fmt:formatDate value="${message.pubtime}" pattern="yyyy年MM月dd日"/>
            </div>

</c:forEach>


<a href="index.jsp">回到首页</a>|<a href="forum.jsp?id=${forum.id}">回到${forum.title}</a>|<a href="forummessage.jsp?id=${message.id}&forumid=${forum.id}">至顶</a>

<form action="/ForumRMessageService" method="post">
<input name="id" type="hidden" value="${message.id}">
<input name="forumid" type="hidden" value="${forum.id}">
<textarea id="content1" name="content" style="width:768px;height:200px;visibility:hidden;">
</textarea>
<input type="submit" value="回复该帖">
<div class="ad">
 <%@include file="/ads/728a.jsp" %>
</div>
</form>
</div>
</body>
</html>