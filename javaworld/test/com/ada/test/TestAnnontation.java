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

import org.junit.Test;

import com.ada.annotation.Ada;
import com.ada.annotation.Young;
import com.ada.utils.NetUtil;

@Ada("ada.young")
@Young(ada = "ada", youngs = "young", value = "ada.young")
public class TestAnnontation {
	@Test
	public void testurl() {
		Ada ada = getClass().getAnnotation(Ada.class);
		Young young = getClass().getAnnotation(Young.class);
		System.out.println(ada.value());
		System.out.println(young.youngs());
		System.out.println(young.ada());
		System.out.println(young.value());

	}
}
