/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-5<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-5          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.util.Properties;
import com.ada.common.util.PropertiesUtil;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties f = PropertiesUtil
				.readProperties("F:\\hibernate.properties");
		System.out.println( f.size());
		PropertiesUtil.writeProperties("F:\\1.properties", f);
	}

}
