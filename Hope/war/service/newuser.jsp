<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.ada.model.*" %>
<%@page import="com.ada.daoimpl.*"%>
<%String name=request.getParameter("username");
  String password=request.getParameter("password");
  String email=request.getParameter("email");
  UserInfo user=new UserInfo();
  user.setUsername(name);
  user.setPassword(password);
  ContactInfo contact=new ContactInfo();
  contact.setEmail(email);
  user.setContactInfo(contact);
  UserDaoImpl dao=new UserDaoImpl();
   dao.addUser(user);
   response.sendRedirect("/login.jsp");
 %>
