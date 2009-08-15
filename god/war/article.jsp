<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.util.*" %>
       <%@page import="com.ada.model.*" %>
       <%@ page import="com.ada.data.manager.PMF" %>
<%@page import="com.ada.data.adapter.*" %>
<%@page import="javax.jdo.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%String id=request.getParameter("id");
ArticlePMFAdapter adapter=new ArticlePMFAdapter();
long ids=Integer.parseInt(id);
Article que=adapter.findArticle(ids);
long v=que.getVisit();
v++;
que.setVisit(v);
adapter.updateArticle(que);
 %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><%=que.getSubject() %></title>
<link rel="stylesheet" href="style.css" type="text/css" media="screen" />
<link rel="stylesheet" href="/css/site.css" type="text/css" media="screen" />
 <style type="text/css" rel="stylesheet">
    form {
    margin: 0;
    }
    .editor {
    margin-top: 5px;
    margin-bottom: 5px;
    }
    .main{
    margin-top:100px;
    width:760px;
    margin-left:auto;
    margin-right:auto;
    
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
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
<%@include file="top.jsp" %>
<div class="main">
<%@include file="/ads/ad728.jsp" %>
 <br/>
 <%=que.getSubject()%>
 <br/>
 <h5>内容如下</h5>
 发布时间:<%=que.getDate() %>访问量<%=que.getVisit() %>
 <br/>
 <%=que.getContent().getValue() %>
 <br/>
 <a href="index.jsp">回到首页</a>|<a href="articles.jsp">回到目录</a>|<a href="article.jsp?id=<%=que.getId()%>">置顶</a>

<%
RMessageAdapter padapter=new RMessageAdapter();
String sqlquery="select from "+RMessage.class.getName()+" where articleid=="+id;
List<RMessage> msgs=padapter.findArticle(sqlquery);
if(msgs==null){
out.println("没有人回复");
}
else{
for(RMessage rmsg:msgs){
%>
<div class="commentbox">
        	<%=rmsg.getContent().getValue()%>
        	</div>
        	<div class="commentfooter">
                              发表于:<%=rmsg.getPubtime() %>
            </div>
<%
}
}
 %>
<form action="/rmessage" method="post">
<input name="aid" type="hidden" value="<%=que.getId()%>">
<textarea id="content1" name="content" style="width:768px;height:200px;visibility:hidden;">
</textarea>
<input type="submit">
</form>
 </div>
</body>
</html>