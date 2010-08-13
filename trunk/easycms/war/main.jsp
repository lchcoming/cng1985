<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

<jsp:useBean id="site" class="com.easycms.beans.SiteBean"></jsp:useBean>
<jsp:getProperty property="contextText" name="site"/>