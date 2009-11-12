/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.action<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-12<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-12        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class AdaWork extends ActionSupport {

	@Override
	public String execute() throws Exception {
	
		return super.execute();
	}

	@Override
	public void validate() {
		//this.clearFieldErrors();
	    this.addFieldError("a", "a");
	    this.addFieldError("b", "b");
	    this.addFieldError("c", "c");
	    this.addFieldError("d", "d");
	    this.addFieldError("e", "e");
	    this.addFieldError("f", "f");
	    this.addFieldError("g", "g");
	    this.addFieldError("h", "h");
		super.validate();
	}

}
