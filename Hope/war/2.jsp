<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="com.ada.model.*" %>
<%@page import="java.util.*" %>
<%@page import="com.helper.*" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int curpage=1;
String cur=request.getParameter("page");
String method=request.getParameter("method");

if(cur!=null){
curpage=Integer.parseInt(cur);
}
int star=0;
int end=10;

ArticleEMFAdapter adapter=new ArticleEMFAdapter();
String query = "select from " + Article.class.getName();
//分页
PageResult result=adapter.getPageResult(query,cur,method,5);


PageBeans bean=adapter.getPageBean(query,cur,method,5);
List bb=adapter.pageArticle(bean);
curpage=bean.getCurrentPage();


List<Article> a=adapter.pageArticle(query,curpage,5);
%>
数据库中有<%=adapter.findsize(query) %>条数据
<br/>
现在是第<%=curpage%>页
<br/>
<%for(Article item:a){
%>

<%=item.getSubject() %>
主题
<br/>
<%

} %>

<%for(int i=0;i<10;i++){
%>
<a href="2.jsp?page=<%=i%>">第<%=i%>页</a>|
<%
} %>

<br/>
<%for(Object item:bb){
Article art=(Article)item;
%>
<%=art.getSubject()%>
<br/>
<%
} %>
总共有<%=bean.getTotalPages() %>页
现在是<%=bean.getCurrentPage() %>页
<a href="2.jsp?method=first">首页</a>
<a href="2.jsp?page=<%=curpage-1%>&?method=previous">上一页</a>
<a href="2.jsp?page=<%=curpage+1%>&?method=next">下一页</a>
<a href="2.jsp?method=last">尾页</a>
</body>
</html>