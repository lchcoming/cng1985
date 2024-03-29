package com.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.data.adapter.RMessageAdapter;
import com.ada.model.RMessage;
import com.google.appengine.api.datastore.Text;

public class RMessageServerlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RMessageServerlet() {
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
		String content=request.getParameter("content");
		String aid=request.getParameter("aid");
	RMessageAdapter adapter=new RMessageAdapter();
	long id=Long.parseLong(aid);
	RMessage msg=new RMessage(id, new Text(content), 0, 0, 0, new Date());
	adapter.addRMessage(msg);
	response.sendRedirect("/article.jsp?id="+aid);
	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
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
