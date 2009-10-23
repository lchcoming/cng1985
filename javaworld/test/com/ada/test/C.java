/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-23<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-23          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < 500; i++) {
            NetWorks works=new NetWorks();
            works.start();
		}
	}

}
