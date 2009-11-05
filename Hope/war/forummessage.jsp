<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.daoimpl.*" %>
<%@page import="com.ada.model.*"  %>
<%@page import="java.util.*"  %>
<%

String id=request.getParameter("id");
String forumid=request.getParameter("forumid");

ForumMessageDaoImpl dao=new ForumMessageDaoImpl();

ForumMessage message=dao.findbyid(Long.parseLong(id));
ForumRMessageDaoImpl mdao=new ForumRMessageDaoImpl();
List<ForumRMessage> ms=mdao.findbyid(id);
ForumDaoImpl  fdao=new ForumDaoImpl();
Forum forum=fdao.findbyid(Long.parseLong(forumid));
request.setAttribute("ms",ms);
request.setAttribute("forum",forum);
request.setAttribute("message",message);
request.getRequestDispatcher("/view/forummessage.jsp").forward(request,response);
  %>
