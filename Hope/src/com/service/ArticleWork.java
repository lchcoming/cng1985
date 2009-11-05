package com.service;

import com.ada.data.adapter.ArticleEMFAdapter;
import com.ada.data.manager.PMF;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.jdo.PersistenceManager;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.model.Article;
import com.ada.model.Message;
import com.google.appengine.api.datastore.Text;

public class ArticleWork extends HttpServlet {

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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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

		String content = request.getParameter("content");
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
		ArticleEMFAdapter.updateData();
		System.out.println("!!!!!!!!!!!!!!!!!!!!");
		response.sendRedirect("/admin/main.jsp");
	}

}
