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

import static org.junit.Assert.*;

import java.util.logging.Logger;

import org.junit.Test;

public class TestLove {
	private Logger logger = Logger.getLogger("TestLove");
	@Test
	public void love() {
		Lover lover = Lover.getinstance();
		for (int i = 0; i < 1000; i++) {
			assertNotNull(lover);
			assertSame(lover, Lover.getinstance());
		}

	}

	@Test
	public void otherlove() {
		Love love = OtherLover.getinstance();
		love = new LoverB();
		for (int i = 0; i < 1; i++) {
			assertNotNull(love);
			//assertSame(love, OtherLover.getinstance());
		}
		for (int i = 0; i < 2; i++) {
			love.show();
			assertNotNull(love);
			love = new LoverB();
			// assertSame(love, OtherLover.getinstance());
			love.show();

		}
		love = new LoverB();
		for (int i = 0; i < 2; i++) {
			love = OtherLover.getinstance();
			love = new LoverB();
			OtherLover.setLove(love);
			logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
			love.show();
			logger.info(">>>>>>>>>>>>>>>>>>>>>>>>");
			love=OtherLover.getLove();
			//love = new LoverB();
			love = OtherLover.getinstance();
			love.show();
		}

		// for (int i = 0; i < 1000; i++) {
		// assertNotNull(love);
		// love = new LoverA();
		// assertSame(love, OtherLover.getinstance());
		// }
	}
}
