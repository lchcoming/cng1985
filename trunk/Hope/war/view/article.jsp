<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"  %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${article.subject}</title>

  <script src="http://www.google.com/jsapi?key=ABQIAAAAH80-Y87XpsBeX9dD6s11XRRz5Xc5DfDk61Quo47e5PLdy7WiUBTyBrrhUz_W3sfYfmhtIIq-NwQA9A"></script>
    <script type="text/javascript">
    /*
    *  How to draw results in tabbed mode.
    
    */
    //ABQIAAAAH80-Y87XpsBeX9dD6s11XRRz5Xc5DfDk61Quo47e5PLdy7WiUBTyBrrhUz_W3sfYfmhtIIq-NwQA9A我的密钥
    google.load('search', '1');
    
    function OnLoad() {
    
      // create a tabbed mode search control
      var tabbed = new google.search.SearchControl();
      //google.search.Search.LARGE_RESULTSET
      //google.search.Search.SMALL_RESULTSET
      tabbed.setResultSetSize(GSearch.LARGE_RESULTSET);
      var webSearch = new google.search.WebSearch();

      // Restrict our search to pages from the Cartoon Newtowrk
      webSearch.setSiteRestriction('cng1985.appspot.com');
      webSearch.setUserDefinedLabel('站内搜索');
      // create our searchers.  There will now be 3 tabs.
       tabbed.addSearcher(new google.search.WebSearch());
       tabbed.addSearcher(webSearch);
      tabbed.addSearcher(new google.search.LocalSearch());
      tabbed.addSearcher(new google.search.BlogSearch());
    
      // draw in tabbed layout mode
      var drawOptions = new google.search.DrawOptions();
      drawOptions.setDrawMode(google.search.SearchControl.DRAW_MODE_TABBED);
    
      // Draw the tabbed view in the content div
      tabbed.draw(document.getElementById("content"), drawOptions);
    
      // Search!
      tabbed.execute("${article.subject}");
    }
    google.setOnLoadCallback(OnLoad);
    </script>
<link rel="stylesheet" href="/style.css" type="text/css" media="screen" />
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
    #content{
    width:768px;
     margin-left:auto;
    margin-right:auto;
    }
  </style>
</head>
<body>
<%@include file="/top.jsp" %>
<div class="main">
<%@include file="/ads/ad728.jsp" %>
 <br/>
 ${article.subject}
 <br/>
 <h5>内容如下</h5>
 发布时间: <fmt:formatDate value="${article.date}" pattern="yyyy年MM月dd日  HH:mm:ss"/>&nbsp;&nbsp;&nbsp;访问量${article.visit}
 <br/>
 ${article.content.value}
 <br/>
 <a href="index.jsp">回到首页</a>|<a href="/control/articles.jsp">回到目录</a>|<a href="article.jsp?id= ${article.id}">置顶</a>

  <div id="content">Loading...</div>
 </div>
</body>
</html>