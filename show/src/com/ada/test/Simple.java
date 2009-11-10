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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Simple {

	private static final Log LOG = LogFactory.getLog(Simple.class);

	private static void withoutProxool() {

		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			try {
				connection = DriverManager.getConnection(
						"jdbc:mysql://192.168.1.103:3306/jbpm", "root", "root");
			} catch (SQLException e) {
				LOG.error("Problem getting connection", e);
			}

			if (connection != null) {
				LOG.info("Got connection :)");
			} else {
				LOG
						.error("Didn't get connection, which probably means that no Driver accepted the URL");
			}

		} catch (ClassNotFoundException e) {
			LOG.error("Couldn't find driver", e);
		} finally {
			try {
				// Check to see we actually got a connection before we
				// attempt to close it.
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				LOG.error("Problem closing connection", e);
			}
		}
	}

	private static void withProxool() {

		Connection connection = null;
		try {
			// NOTE THIS LINE
			Class.forName("org.logicalcobwebs.proxool.ProxoolDriver");
			try {
				// NOTE THIS LINE
				connection = DriverManager
						.getConnection(
								"proxool.example:com.mysql.jdbc.Driver:jdbc:mysql://192.168.1.103:3306/jbpm",
								"root", "root");
			} catch (SQLException e) {
				LOG.error("Problem getting connection", e);
			}

			if (connection != null) {
				LOG.info("Got connection :)");
			} else {
				LOG
						.error("Didn't get connection, which probably means that no Driver accepted the URL");
			}

		} catch (ClassNotFoundException e) {
			LOG.error("Couldn't find driver", e);
		} finally {
			try {
				// Check to see we actually got a connection before we
				// attempt to close it.
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				LOG.error("Problem closing connection", e);
			}
		}
	}

	/**
	 * Tests getting a connection with and without Proxool
	 */
	public static void main(String[] args) {
		withoutProxool();
		withProxool();
	}

}
