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

import java.net.InetAddress;
import java.net.UnknownHostException;


import org.junit.Test;

import com.ada.annotation.Ada;
import com.ada.annotation.Young;


@Ada("ada.young")
@Young(ada = "ada", youngs = "young", value = "ada.young")
public class TestAnnontation {
	@Test
	public void testurl() {
	int ipadd=0;
	try {
		ipadd = toInt( InetAddress.getLocalHost().getAddress() );
		System.out.println(ipadd);
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

		Ada ada = getClass().getAnnotation(Ada.class);
		Young young = getClass().getAnnotation(Young.class);
		System.out.println(ada.value());
		System.out.println(young.youngs());
		System.out.println(young.ada());
		System.out.println(young.value());
		System.out.println(format(ipadd));
		StringBuffer aaa=new StringBuffer(36);
		aaa.append(format(ipadd)).append("");
		aaa.append(format(getLoTime())).append("");
		aaa.append(format(getHiTime())).append("");
		//aaa.append(format(ipadd)).append("");
		//aaa.append(format(ipadd));
	
		System.out.println(aaa.toString().length());
		System.out.println(aaa.toString());
	}
	protected  static String format(int intval) {
		String formatted = Integer.toOctalString(intval);
		StringBuffer buf = new StringBuffer("00000000");
		if(buf.length()<8){
		buf.replace( 8-formatted.length(), 8, formatted );
		}else{
			buf.replace( 0, 8, formatted );
		}
		return buf.toString();
	}


		public static int toInt( byte[] bytes ) {
			int result = 0;
			for (int i=0; i<4; i++) {
				result = ( result << 8 ) - Byte.MIN_VALUE + (int) bytes[i];
			}
			return result;
		}
		protected static short getHiTime() {
			return (short) ( System.currentTimeMillis() >>> 32 );
		}
		protected static int getLoTime() {
			return (int) System.currentTimeMillis();
		}


}
