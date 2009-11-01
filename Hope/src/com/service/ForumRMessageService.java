package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.daoimpl.ForumRMessageDaoImpl;
import com.ada.model.ForumRMessage;
import com.google.appengine.api.datastore.Text;

public class ForumRMessageService extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ForumRMessageService() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	   String id=request.getParameter("id");
	   String content=request.getParameter("content");
	   ForumRMessage f=new ForumRMessage();
	   f.setMessageid(Long.parseLong(id));
	   f.setContent(new Text(content));
	   String forumid=request.getParameter("forumid");
	   ForumRMessageDaoImpl dao=new ForumRMessageDaoImpl();
	   dao.addForumRMessage(f);
	   response.sendRedirect("forummessage.jsp?id="+id+"&forumid="+forumid);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
