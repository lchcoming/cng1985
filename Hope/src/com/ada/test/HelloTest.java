/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-2<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-2        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;


import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ada.framework.ioc.IocService;

public class HelloTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
   @Test
   public void hello(){
	   Calendar calendar=Calendar.getInstance();
	    calendar.add(Calendar.DATE,1000);
	    System.out.println(calendar);
	    assertTrue("hahadddddddd", true);
	    assertNotNull(IocService.getContext());
	    
   }
}
