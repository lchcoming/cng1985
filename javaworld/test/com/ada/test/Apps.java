/** 
 * CopyRright (c)1985-2010: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Jun 9, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Jun 9, 2010          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.io.File;
import java.io.IOException;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import com.ada.common.util.FileUtil;


public class Apps {
	public static void main(String[] args) {
		int a = 65536;
		System.out.println(a << 5);
		System.out.println(a >> 16);
		System.out.println(~a);
		System.out.println(a | 2);
		System.out.println(a & 2);
		System.out.println(a & 2);
		System.out.println(a & 1);
		System.out.println(2 << 29);
		File file=new File("C:\\Documents and Settings\\ada");
		//List<File> files = FileUtil.ListFile("C:\\Documents and Settings");
		//System.out.println(files.size());
		//System.out.println("文件个数："+file.list().length);
		try {
			JarFile jar=new JarFile("E:\\jars\\guice-2.0\\guice-2.0.jar");
			Enumeration<JarEntry>  e=	jar.entries();
			while(e.hasMoreElements()){
				String name=e.nextElement().getName();
				System.out.println(name);
				File filetemp=new  File("E:/jars/guice-2.0/guice-2.0.jar"+name);
				if(filetemp.isFile()){
					System.out.println(">>>>>");
				}
			}
			System.out.println(jar.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
}
