/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.test;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 29, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;
import com.demo.factory.HibernateSessionFactory;
import static org.junit.Assert.*;

import org.hibernate.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TreeTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	@Test
	public void testDao()   {
		Session session=		HibernateSessionFactory.getSession();
		assertNotNull(session);
	}
}

