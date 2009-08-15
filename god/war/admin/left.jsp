<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
    font: normal 11px verdana;
    }

ul {
    margin: 0;
    padding: 0;
    list-style: none;
    width: 150px; /* Width of Menu Items */
    border-bottom: 1px solid #ccc;
    }

ul li {
    position: relative;
    }
    
li ul {
    position: absolute;
    left: 149px; /* Set 1px less than menu width */
    top: 0;
    display: none;
    }

/* Styles for Menu Items */
ul li a {
    display: block;
    text-decoration: none;
    color: #777;
    background: #fff; /* IE6 Bug */
    padding: 5px;
    border: 1px solid #ccc;
    border-bottom: 0;
    }

/* Fix IE. Hide from IE Mac \*/
* html ul li { float: left; height: 1%; }
* html ul li a { height: 1%; }
/* End */

ul li a:hover { color: #E2144A; background: #f9f9f9; } /* Hover Styles */
        
li ul li a { padding: 2px 5px; } /* Sub Menu Styles */
        
li:hover ul, li.over ul { display: block; } /* The magic */
</style>
</head>

<body>
<ul id="nav"> 
<li><a href="articles.jsp" target="main">文章管理</a></li> 
<li><a href="http://www.google.com" target="main">论坛管理</a></li> 
<li><a href="http://www.google.com" target="main">问答管理</a></li> 
<li><a href="http://www.google.com" target="main">留言管理</a></li> 
<li><a href="http://www.google.com" target="main">地区管理</a></li> 
<li><a href="http://www.google.com" target="main">世界管理</a></li> 
<li><a href="http://www.google.com" target="main">机构管理</a></li>
<li><a href="http://www.google.com" target="main">用户管理</a></li>
<li><a href="http://www.google.com" target="main">留言管理</a></li> 
<li><a href="http://www.google.com" target="main">地区管理</a></li> 
<li><a href="http://www.google.com" target="main">世界管理</a></li> 
<li><a href="http://www.google.com" target="main">留言管理</a></li> 
<li><a href="http://www.google.com" target="main">地区管理</a></li> 
<li><a href="http://www.google.com" target="main">世界管理</a></li> 
<li><a href="http://www.google.com" target="main">机构管理</a></li>
<li><a href="http://www.google.com" target="main">用户管理</a></li> 
<li><a href="http://www.google.com" target="main">机构管理</a></li>
<li><a href="http://www.google.com" target="main">用户管理</a></li>   
<li><a href="http://www.google.com" target="main">工具箱</a></li>
<li><a href="http://www.google.com" target="main">帖子管理</a></li>
<li><a href="http://www.google.com" target="main">回帖管理</a></li>   
<li><a href="http://cng1985.appspot.com/" target="main">查看系统</a></li> 
<li><a href="http://code.google.com/p/cng1985/updates/list" target="main">源代码管理</a></li> 
</ul> 
</body>
</html>