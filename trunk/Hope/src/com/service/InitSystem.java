/** 
* CopyRright (c)1985-2009: <br />                             
* Project: Hope<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:com.service<br />                             
* Author：ada.young <br />                  
* Create Date：  2009-10-17<br />   
* Modified By：ada.young          <br />                                
* Modified Date:2009-10-17          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import com.ada.daoimpl.MessageDaoImpl;
import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;
import com.google.appengine.api.datastore.FetchOptions;
import com.google.appengine.api.datastore.PreparedQuery;
import com.google.appengine.api.datastore.Query;
import com.sun.xml.internal.messaging.saaj.soap.MessageImpl;


public class InitSystem extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public InitSystem() {
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
		MessageDaoImpl dao=new MessageDaoImpl();
		dao.initDate();
		DatastoreService datastore =
			DatastoreServiceFactory.getDatastoreService();
		Query query = new Query("_ah_SESSION");
		PreparedQuery results = datastore.prepare(query);

		int cleared = 0;
		try {
			for (Entity session : results.asIterable(withLimit(40))) {				
				datastore.delete(session.getKey());
				cleared++;
			}
		} catch (Throwable e) {
			//log.severe(e.getMessage());
		}
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

	private FetchOptions withLimit(int i) {
		FetchOptions options=FetchOptions.Builder.withLimit(40);
		return options;
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

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
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
