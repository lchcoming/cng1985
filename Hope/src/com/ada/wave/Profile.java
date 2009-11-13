/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.wave<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.wave;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.wave.api.ProfileServlet;

public class Profile extends ProfileServlet {

	  @Override
	  public String getRobotName() {
	    return "ada.young";
	  }
	 
	  @Override
	  public String getRobotAvatarUrl() {
	    return "My Robot Image URL";
	  }
	 
	
	  public String getRobotProfileUrl() {
	    return "My Robot Profile URL";
	  }

}
