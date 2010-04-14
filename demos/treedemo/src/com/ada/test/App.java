/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.test;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Apr 14, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Apr 14, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.util.Date;
import java.util.Properties;

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println(new Date());
	        Properties P = System.getProperties();
	        P.list(System.out);
	        System.out.println("--- Memony Usage:");
	        Runtime rt = Runtime.getRuntime();
	        System.out.println("Total Memory="
	                          +rt.totalMemory() 
	                          +"Free Memory="
	                          +rt.freeMemory());
	}

}

