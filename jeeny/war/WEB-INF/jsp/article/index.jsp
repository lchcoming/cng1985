<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="work.htm">
<script type="text/javascript" charset="utf-8" src="/kindeditor-3.4.2/kindeditor.js"></script>
<script type="text/javascript">
    KE.show({
        id : 'your_editor_id',
        width : '700px',
        height : '400px'
    });
</script>
http://java.sun.com/jsp/jstl/core
http://www.springframework.org/security/tags
<textarea id="your_editor_id" name="name" cols="100" rows="8">${name}</textarea>
<input type="text" name="subject" value="${article.subject}">
<input type="text" name="content" value="${article.content}">
<input  type="submit">
</form>
</body>
</html>