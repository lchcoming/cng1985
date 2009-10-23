/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.common.proxy.handler<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-23<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-23          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.common.proxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogHandler implements InvocationHandler {

	private Object proxyObject;

	public LogHandler(Object proxyobject) {
		proxyObject = proxyobject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		method.invoke(proxyObject, args);
		return null;
	}

}
