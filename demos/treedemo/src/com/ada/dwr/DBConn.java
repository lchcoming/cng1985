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

import java.sql.Connection;
import java.sql.DriverManager;
 public class DBConn {  
	   
	     private static  String url = "jdbc:mysql://localhost:3306/treedemo";  
	     private static  String username = "root";  
	     private static  String password = "admin";  
	     private static  String driver = "com.mysql.jdbc.Driver";  
	       
	     public static Connection getConnection(){  
	         Connection conn = null;  
	         try{  
	             Class.forName(driver);  
	             conn = DriverManager.getConnection(url,username,password);  
	         }catch(Exception e){  
	             e.printStackTrace();  
	         }  
	         return conn;  
	     }  
	 }  

