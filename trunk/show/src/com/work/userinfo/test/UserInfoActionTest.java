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
		info.setUsername("年高");
		info.setUserpassword("p");
		action.setModel(info);
		action.add();
	}

	@Test
	public void testUpdate() {
		BeanHelp help = BeanHelp.getinstance();
		UserInfoAction action = (UserInfoAction) help.getBean("UserInfoAction");
		Userinfo info = new Userinfo();
		info.setId(5);
		info.setRealname("年高");
		info.setUsername("年高");
		info.setUserpassword("年高");
		action.setModel(info);
		action.update();
	}

	@Test
	public void testDelete() {
		BeanHelp help = BeanHelp.getinstance();
		UserInfoAction action = (UserInfoAction) help.getBean("UserInfoAction");
		Userinfo info = new Userinfo();
		info.setId(5);
		info.setRealname("a");
		info.setUsername("年高");
		info.setUserpassword("p");
		action.setModel(info);
		action.delete();
	}

}
