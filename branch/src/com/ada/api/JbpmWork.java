/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.api<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-19<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-19          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.api;

public interface JbpmWork {
	/**
	 * 我提出来的
	 * 
	 */
	String myhistory();

	/**
	 * 我提出来并且成功的
	 * 
	 * 
	 * 
	 */
	String mysuccess();

	/**
	 * 要我我审批的
	 * 
	 */
	String mywork();

	String deploy();

	/**
	 * 我审批过的
	 * 
	 * 
	 * 
	 * @return
	 * @throws GlobalException
	 */
	String myworkhistory();

	/**
	 * 审批失败
	 * 
	 * @return
	 */
	String nopass();

	/**
	 * 审批总经理已审-同意
	 * 
	 * @return
	 */
	String pass();
}
