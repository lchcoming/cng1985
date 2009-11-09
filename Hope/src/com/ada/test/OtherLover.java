/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-9<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-9        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.util.logging.Logger;

public class OtherLover {
	private static Logger logger = Logger.getLogger("LoveB");
	private static Love loves;
    private OtherLover(){
    	logger.info("OtherLover");
    }
    static{
    	logger.info("static");
    }
	public static Love getLove() {
		return loves;
	}
	public static void setLove(Love love) {
		OtherLover.loves = love;
		love=new LoverA();
		logger.info("*********************");
		love.show();
	}
	public static Love getinstance() {
		if (null == loves) {
			loves = new LoverA();
			logger.info(">>>>>>");
		}
		return loves;
	}
}
