<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.daoimpl.*" %>
<%@page import="com.ada.model.*"  %>
<%@page import="java.util.*"  %>
<%
ForumDaoImpl dao=new ForumDaoImpl();
List<Forum> fs=dao.allForum();
request.setAttribute("forums",fs);
request.getRequestDispatcher("/view/common.jsp").forward(request,response);
 %>
