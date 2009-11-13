/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.work.userinfo.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.work.userinfo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.ada.entity.Userinfo;
import com.ada.help.BeanHelp;
import com.work.userinfo.action.UserInfoAction;

public class UserInfoActionTest {

	@Test
	public void testAdd() {
		BeanHelp help = BeanHelp.getinstance();
		UserInfoAction action = (UserInfoAction) help.getBean("UserInfoAction");
		Userinfo info = new Userinfo();
		info.setRealname("a");
		info.setUsername("a");
		info.setUserpassword("p");
		action.setModel(info);
		action.add();
	}

	@Test
	public void testUpdate() {
	}

	@Test
	public void testDelete() {

	}

}
