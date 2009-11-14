/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dwr<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-14<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-14        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dwr;

import java.text.DateFormat;
import java.util.Date;
import java.util.logging.Logger;

import com.ada.factory.DateFormatFactory;

public class HelloDwr {
	private Logger logger=Logger.getLogger("HelloDwr");
	public String messge() {
		return "i am ada.young";
	}

	public String timemessge() {
		logger.fine("time");
		DateFormat format = DateFormatFactory.createChineseDate();
		Date now = new Date();
		String timestr = "现在时间是:";
		timestr += format.format(now);
		return timestr;
	}
}
