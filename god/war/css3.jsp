<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
.ada{
 color: #1a1a1a;
    padding: .5em;
    -webkit-border-radius: 6px;
    -moz-border-radius: 6px;
     text-shadow: rgba(0,0,0,.8) 0 1px 0;
      background: rgba(164, 173, 183, .15);
}
#content{
    -webkit-column-count : 4;
    -webkit-column-gap : 20px;
    -moz-column-count : 4;
    -moz-column-gap : 20px;
    background: rgba(164, 173, 183,.2);
    }
</style>
</head>
<body>
<div class="ada">
哈哈
</div>
<div id="content">
我们可以通过这个选择器定义三件事情：栏数(column-coun)、栏宽(column-width、例子中没有用到)和各栏之间的空白/间距(column-gap)。 如果column-count未设定，浏览器会在允许的宽度内容纳尽可能多的栏目。

为了在各栏时间添加一个数值的分隔，我们可以使用column-rule 属性，其功能和border 属性类似:

1
2
3
div {
    column-rule: 1px solid #00000;
    }
上面的这条属性，浏览器中不会看到任何效果，因为它没有分栏，如果配合上面的例子就可以了。

相关属性: column-break-after, column-break-before, column-span, column-fill.

浏览器支持: 多栏布局目前被Safari 3+，chrome，和Firefox 1.5+所支持。
</div>
</body>
</html>