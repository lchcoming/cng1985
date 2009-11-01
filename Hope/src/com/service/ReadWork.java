package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.data.manager.PMF;
import com.ada.model.Article;
import com.google.appengine.api.datastore.Text;

public class ReadWork extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ReadWork() {
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
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String content = request.getParameter("source");
		String subject=request.getParameter("title");
		Text a=new Text(content);
		Date date = new Date();
		Article msg = new Article( );
		msg.setDate(date);
		msg.setContent(a);
		msg.setSubject(subject);
		msg.setVisit(0);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(msg);
		} finally {
			pm.close();
		}
		response.sendRedirect("/articles.jsp");
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

		String content = request.getParameter("source");
		String subject=request.getParameter("subject");
		Text a=new Text(content);
		Date date = new Date();
		Article msg = new Article( );
		msg.setDate(date);
		msg.setContent(a);
		msg.setSubject(subject);
		msg.setVisit(0);
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(msg);
		} finally {
			pm.close();
		}
		response.sendRedirect("/articles.jsp");
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
