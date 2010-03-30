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

public class NavigateEditServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public NavigateEditServlet() {
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
	         String idstr = request.getParameter("id");  
	         String parentId = request.getParameter("parentId");  
	         String leaf = request.getParameter("leaf");  
	         String number = request.getParameter("number");  
	         Navigate obj = null;  
	         if(null != idstr){  
	             NavigateManager navigateManager = new NavigateManager();  
	             obj = navigateManager.get(idstr);  
	         }else{  
	             obj = new Navigate();  
	             obj.setParentId(new Integer(parentId));  
	             obj.setLeaf(new Integer(leaf));  
	             obj.setNumber(new Integer(number));  
	         }  
	         request.setAttribute("obj", obj);  
	         RequestDispatcher dispatcher = request.getRequestDispatcher("/exttree/edit.jsp");  
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

