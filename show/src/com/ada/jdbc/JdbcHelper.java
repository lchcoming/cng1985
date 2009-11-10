/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.jdbc<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-10<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-10        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.jdbc;

public class JdbcHelper {

	public static ConnectFactory getDefault() {
		return new JdbcConnectFactory();
	}

	public static ConnectFactory createProxoolConnectFactory() {
		return new ProxoolConnectFactory();
	}

	public static ConnectFactory createDbcpConnectFactory() {
		return new DbcpConnectFactory();
	}

	public static ConnectFactory createC3P0ConnectFactory() {
		return new C3P0ConnectFactory();
	}
}
