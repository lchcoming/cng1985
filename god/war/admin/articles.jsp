<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="com.ada.model.*" %>
<%@page import="java.util.*" %>
<%@page import="com.helper.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>一些简简单单的思想，一点点小小的历史</title>
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
<a href="main.jsp">回到首页</a>
<table class="main">
<tr>
<td>文章名</td>
<td>发布时间</td>
<td>编辑</td>
<td>删除</td>
</tr>
<%
int curpage=1;
String cur=request.getParameter("page");
String method=request.getParameter("method");
String query = "select from " + Article.class.getName();
ArticleEMFAdapter adapter=new ArticleEMFAdapter();
//分页
PageBean bean=adapter.getPageBean(query,cur,method,25);
List bb=adapter.pageArticle(bean);
curpage=bean.getCurrentPage();
List<Article> msgs = (List<Article>)bb;
if(msgs!=null){
for(Article item:msgs){

%>

<tr>
<td><a href="article.jsp?id=<%=item.getId()%>"><%=item.getSubject() %></a></td>
<td><%=item.getDate()%></td>
<td><a href="updatearticle.jsp?id=<%=item.getId() %>">编辑</a></td>
<td><a>删除</a></td>
</tr>

<%
}
}
else{
%>
<tr>
<td>没有文章</td>
</tr>

<%
}
%>
</table>
<div class="ada">
总共有<%=bean.getTotalPages() %>页
现在是<%=bean.getCurrentPage() %>页
<a href="articles.jsp?method=first">首页</a>
<a href="articles.jsp?page=<%=curpage-1%>&?method=previous">上一页</a>
<a href="articles.jsp?page=<%=curpage+1%>&?method=next">下一页</a>
<a href="articles.jsp?method=last">尾页</a>
</div>
</body>
</html>