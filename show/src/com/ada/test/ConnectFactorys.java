/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-10<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-10        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import static org.junit.Assert.*;

import java.sql.Connection;
import org.junit.Test;

import com.ada.jdbc.ConnectFactory;
import com.ada.jdbc.JdbcHelper;

public class ConnectFactorys {

	@Test
	public void testCreadteDB2() {
		ConnectFactory com = JdbcHelper.createProxoolConnectFactory();
		
		Connection connection1 = com.creadteMysql();
		assertNotNull(connection1);
		Connection connection = com.creadteDB2();
		assertNotNull(connection);
	}

}
