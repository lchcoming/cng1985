package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.daoimpl.ForumDaoImpl;
import com.ada.model.Forum;

public class ForumService extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ForumService() {
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
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String title = request.getParameter("title");
		String d = request.getParameter("content");
		String type = request.getParameter("type");
		Forum forum = new Forum();
		forum.setPubtime(new Date());
		forum.setTitle(title);
		forum.setDescribe(d);
		forum.setForumtype(type);
		ForumDaoImpl dao =new ForumDaoImpl();
		dao.addForum(forum);
		response.sendRedirect("/admin/main.jsp");
	}

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
