/** 
* CopyRright (c)1985-2009: ada.young <br />                             
* Project: javaworld<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:com.ada.utils<br />                             
* Author：ada.young <br />                  
* Create Date：  2009-10-21<br />   
* Modified By：ada.young          <br />                                
* Modified Date:2009-10-21          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.utils;

import java.lang.reflect.Proxy;

public class ProxyUtil {

	public static synchronized Object proxyObject(Object object) {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new DefalutHandle(object));
	}
}
