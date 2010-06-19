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
import java.util.List;

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
		File file=new File("E:\\编程文档");
		List<File> files = FileUtil.ListFile("E:\\编程文档");
		System.out.println(files.size());
		System.out.println(file.list().length);
	}
}