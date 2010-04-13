/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.servlet;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Apr 13, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Apr 13, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.bulider.TreeHelp;
import com.ada.dao.BaseDAOImpl;
import com.ada.entity.CailiaoZiyuanType;

public class TreeHelpServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public TreeHelpServlet() {
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
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// /treejsonwork
		TreeHelp help = new TreeHelp();
		String hql = "from CailiaoZiyuanType type where type.cailiaoZiyuanType.cailiaoTypeId = '"
				+ request.getParameter("id") + "'";

		BaseDAOImpl dao = new BaseDAOImpl();
		List<CailiaoZiyuanType> temp = (List<CailiaoZiyuanType>) dao
				.findByQuery(hql);
		String treess = help.makeTree(temp);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(treess);
		out.flush();
		out.close();
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

		TreeHelp help = new TreeHelp();
		String hql = "from CailiaoZiyuanType type where type.cailiaoZiyuanType.cailiaoTypeId = '"
				+ request.getParameter("id") + "'";

		BaseDAOImpl dao = new BaseDAOImpl();
		List<CailiaoZiyuanType> temp = (List<CailiaoZiyuanType>) dao
				.findByQuery(hql);
		String treess = help.makeTree(temp);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println(treess);
		out.flush();
		out.close();
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
