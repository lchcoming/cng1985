<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.daoimpl.*" %>
<%@page import="com.ada.model.*"  %>
<%@page import="java.util.*"  %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@page import="com.ada.data.page.Pager"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%

 String id=request.getParameter("id");
if(id==null){
id="5059";
}
String curpage=request.getParameter("page");
if(null==curpage){
	curpage="1";
}
int pages=Integer.parseInt(curpage);
ForumMessageDaoImpl dao=new ForumMessageDaoImpl();
ForumDaoImpl  fdao=new ForumDaoImpl();
Forum forum=fdao.findbyid(Long.parseLong(id));
Pager pager=dao.findbyid(id,pages);
request.setAttribute("forum",forum);
request.setAttribute("forummessages",pager.getResultList());
request.setAttribute("pageBean",pager.getPageBean());
request.getRequestDispatcher("/view/forum.jsp").forward(request,response);
 %>