/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-21<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-21          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

public abstract class ShowInfo {

	public ShowInfo() {
		super();
	}

	public void print() {
	  System.out.println("4444");
	}

	
	public void show() {
		// TODO Auto-generated method stub
		 System.out.println("你爷爷的");
	}
	public long autonumber() {
		System.out.println(">>>>");
		return System.currentTimeMillis();
	}

}