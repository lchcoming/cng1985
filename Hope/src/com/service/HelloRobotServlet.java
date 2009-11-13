/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.service<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.service;


import com.google.wave.api.AbstractRobotServlet;
import com.google.wave.api.Blip;
import com.google.wave.api.Event;
import com.google.wave.api.EventType;
import com.google.wave.api.RobotMessageBundle;
import com.google.wave.api.TextView;
import com.google.wave.api.Wavelet;

@SuppressWarnings("serial")
public class HelloRobotServlet extends AbstractRobotServlet {

	 @Override
	  public void processEvents(RobotMessageBundle bundle) {
	    Wavelet wavelet = bundle.getWavelet();
	              
	    if (bundle.wasSelfAdded()) {
	      Blip blip = wavelet.appendBlip();
	      TextView textView = blip.getDocument();
	      textView.append("I'm alive!");
	    }
	            
	    for (Event e: bundle.getEvents()) {
	      if (e.getType() == EventType.WAVELET_PARTICIPANTS_CHANGED) {    
	        Blip blip = wavelet.appendBlip();
	        TextView textView = blip.getDocument();
	        textView.append("Hi, everybody! welcome to here");
	      }
	      if (e.getType() == EventType.DOCUMENT_CHANGED) {   
	    	   
		        Blip blip = wavelet.appendBlip();
		        TextView textView = blip.getDocument();
		        textView.append("Hi, what are you dong");
		      }
	    }
	  }

}
