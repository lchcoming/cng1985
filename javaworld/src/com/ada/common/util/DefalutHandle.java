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
package com.ada.common.util;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DefalutHandle implements InvocationHandler {
 
	private Object object;
	public DefalutHandle(Object s){
		object=s;
	}
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("*****代理开始**********");
		Object ss = arg1.invoke(object, arg2);
		System.out.println("*****代理结束**********");
		return ss;
	}

}
