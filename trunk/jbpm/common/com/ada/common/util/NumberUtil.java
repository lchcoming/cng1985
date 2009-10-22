/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.utils<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-19<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-19          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.common.util;

public class NumberUtil {
	public static String autoNumebr() {
		long now = System.currentTimeMillis();
		String string = String.valueOf(now);
		string = Long.toHexString(now);
		System.out.println(Long.toOctalString(now));
		System.out.println(Long.toBinaryString(now));
		return string;
	}
}
