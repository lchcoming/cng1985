/** 
 * CopyRright (c)1985-2010: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Jun 25, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Jun 25, 2010          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLClassLoader;

public class ClassWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassLoader.getSystemClassLoader();
		//E:\\jars\\guice-2.0\\guice-2.0.jar
	URL url=	ClassWork.class.getResource("/guice-2.0.jar");
	System.out.println(url.getProtocol());
	System.out.println(url.getFile());
	System.out.println(url.getPort());
	System.out.println(url.getHost());
	File file=new File("");

	URL [] r={url};
		URLClassLoader c=new URLClassLoader(r);
		try {
			c.loadClass("com.google.inject.internal.ExposedBindingImpl").newInstance();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
