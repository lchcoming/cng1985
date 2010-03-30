/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dwr;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 30, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dwr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NavigateJsonServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public NavigateJsonServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	    public void doGet(HttpServletRequest request, HttpServletResponse response)  
	             throws ServletException, IOException {  
	         this.doPost(request, response);  
	     }  
	     public void doPost(HttpServletRequest request, HttpServletResponse response)  
	             throws ServletException, IOException {  
	   
	         NavigateManager navigateManager = new NavigateManager();  
	         request.setAttribute("list", navigateManager.getChildrenById(new Integer(request.getParameter("id"))));  
	         RequestDispatcher dispatcher = request.getRequestDispatcher("/exttree/json.jsp");  
	         dispatcher.forward(request, response);  
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

