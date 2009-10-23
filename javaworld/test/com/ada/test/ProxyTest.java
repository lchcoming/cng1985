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

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import org.junit.Test;

import com.ada.common.util.ProxyUtil;

public class ProxyTest {
	@Test
	public void proxy() {
		Printer printer = new Printer();
		ShowMessage messagePrint=(ShowMessage)ProxyUtil.proxyObject(printer);
		messagePrint.show();
		AutoNumber autoNumber=(AutoNumber)ProxyUtil.proxyObject(printer);
		autoNumber.autonumber();
		System.out.println(autoNumber.autonumber());
		assertTrue(Proxy.isProxyClass(messagePrint.getClass()));
	}
}
