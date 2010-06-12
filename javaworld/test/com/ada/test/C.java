/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-23<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-23          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class C {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date=new Date(System.currentTimeMillis()+1000*60*60*8);
		Calendar calendar=Calendar.getInstance();
		TimeZone zone= TimeZone.getDefault();
		Locale aLocale=Locale.CHINA;
		//aLocale.CHINA
		//calendar.s
		zone.setRawOffset(10);
		zone.setID("CST");
		Calendar.getInstance(zone,aLocale);
		calendar.getTime();
		//System.out.println(date.toLocaleString());
		System.out.println(zone);
		System.out.println(calendar.getTime());
		//System.out.println(date.toLocaleString());
		for (int i = 0; i < 500; i++) {
            NetWorks works=new NetWorks();
            //works.start();
		}
	}

}
