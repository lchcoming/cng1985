<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>网站搜索，google技术提供</title>
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
    margin-top:10px;
    width:768px;
    margin-left:auto;
    margin-right:auto;
    background: #fbf7f7 url(images/header_bkg.jpg) repeat-x 0% 0%;
    
    }
    .line{
    width:700px;
    heght:2px;
     background: #433433;
    }
  </style>
</head>
<body>

<div class="main">

<%@include file="search.jsp" %>
<!-- SiteSearch Google -->
<!-- Google Search Result Snippet Begins -->
<div id="googleSearchUnitIframe"></div>

<script type="text/javascript">
   var googleSearchIframeName = 'googleSearchUnitIframe';
   var googleSearchFrameWidth = 768;
   var googleSearchFrameborder = 0 ;
   var googleSearchDomain = 'www.google.cn';
</script>
<script type="text/javascript"
         src="http://www.google.com/afsonline/show_afs_search.js">
</script>
</div>
<!-- Google Search Result Snippet Ends -->
</body>
</html>