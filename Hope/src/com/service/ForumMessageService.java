package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.daoimpl.ForumMessageDaoImpl;
import com.ada.model.ForumMessage;
import com.google.appengine.api.datastore.Text;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

public class ForumMessageService extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ForumMessageService() {
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
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		ForumMessage msg = new ForumMessage();
		String id = request.getParameter("id");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String methdo = request.getParameter("method");
		msg.setForumid(Long.parseLong(id));
		msg.setPutime(new Date());
		msg.setTitle(title);
		UserService userService = UserServiceFactory.getUserService();
		User u = userService.getCurrentUser();
		if (u != null) {
			msg.setPubuser(u.getNickname());
		} else {
			msg.setPubuser("游客");
		}
		msg.setContent(new Text(content));
		ForumMessageDaoImpl dao = new ForumMessageDaoImpl();
		dao.addForumMessage(msg);
		response.sendRedirect("/forum.jsp?id=" + id);
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
