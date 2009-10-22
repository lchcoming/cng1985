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
package com.ada.framework.api;

public interface StrutsAction {
	/**
	 * struts 2中添加一条数据
	 * 
	 * @return
	 */
	String add();

	/**
	 * struts 2为添加一条数据做准备
	 * 
	 * @return
	 */
	String addpage();

	/**
	 * struts 2中更新一条数据
	 * 
	 * @return
	 */
	String update();

	/**
	 * struts 2中为更新一条数据做准备
	 * 
	 * @return
	 */
	String updatepage();

	/**
	 * struts 2查找数据
	 * 
	 * @return
	 */
	String list();

	/**
	 * struts 2删除一条数据
	 * 
	 * @return
	 */
	String delete();

	/**
	 * struts 2中显示一条数据
	 * 
	 * @return
	 */
	String show();
}
