/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao.proxy<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-5<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-5        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class PMFProxy {
	public static synchronized Object proxyObject(Object object) {
		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), new DefalutHandle(object));
	}
	private static  class DefalutHandle implements InvocationHandler{
		private Object object;

		public DefalutHandle(Object s) {
			object = s;
		}

		@Override
		public Object invoke(Object arg0, Method arg1, Object[] arg2)
				throws Throwable {
			System.out.println("*****代理开始**********");
			System.out.println(arg0.getClass().getName());
			System.out.println(object.getClass().getName());
			Object ss = arg1.invoke(object, arg2);
			if (ss != null) {
				System.out.println(ss.getClass().getName());
			}
			System.out.println("*****代理结束**********");
			return ss;
		}
	}
}
