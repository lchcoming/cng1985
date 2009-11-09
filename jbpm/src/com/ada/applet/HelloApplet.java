/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: jbpm<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.applet<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-9<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-9          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.applet;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.logging.Logger;

public class HelloApplet extends Applet {
	private Logger logger = Logger.getLogger("HelloApplet");
    double f(double x) {
    	return (Math.cos(x/5) + Math.sin(x/7) + 2) * getSize().height / 4;
        }

        public void paint(Graphics g) {
            for (int x = 0 ; x < getSize().width ; x++) {
    	    g.drawLine(x, (int)f(x), x + 1, (int)f(x + 1));
            }
            logger.info("draw");
        }
      public String getAppletInfo() {
        return "Draws a sin graph.";
      }
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
		logger.info("end >>>>>>>>>>>");
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		super.init();
		logger.info("star >>>>>>>>");

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
