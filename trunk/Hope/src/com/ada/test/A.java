/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-8<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-8        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

public class A {

	public void show() {
		System.out.println("a");
	}

	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
}
