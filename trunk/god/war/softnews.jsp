<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>软件方面新闻，有google reader 提供</title>
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
<%@include file="top.jsp" %>

<div class="main">
<%@include file="/ads/ad728.jsp" %>
<script type="text/javascript" src="http://www.google.com/reader/ui/publisher-zh_CN.js"></script>
<script type="text/javascript" src="http://www.google.com/reader/public/javascript/user/14761321806085161684/label/it-net?n=10&callback=GRC_p(%7Bc%3A%22-%22%2Ct%3A%22%5Cu8F6F%5Cu4EF6%5Cu65B9%5Cu9762%5Cu6700%5Cu65B0%5Cu65B0%5Cu95FB%22%2Cs%3A%22true%22%2Cb%3A%22false%22%7D)%3Bnew%20GRC"></script>
</div>
<%@include file="foot.jsp" %>
<%@include file="bbs.jsp" %>
</body>
</html>