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

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ada.common.util.Config;

public class C3P0ConnectFactory implements ConnectFactory {
	private static Log log = LogFactory.getLog(C3P0ConnectFactory.class);

	public Connection creadteDB2() {
		Connection connection = null;
		Properties properties = Config.loadProperties(
				"/properties/db2.properties", "db2 properties");
		connection = createConnect(properties);

		return connection;
	}

	Connection createConnect(Properties properties) {
		Connection connection = null;
		if (null == properties || properties.size() < 4) {
			log.error("加载资源失败");
		} else {
			log.info("加载资源成功");
			String driver = properties.getProperty("driver");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			try {
				Class.forName(driver);
				connection = DriverManager.getConnection(url, username,
						password);
			} catch (SQLException e) {
				log.error("fail", e);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return connection;
	}

	public Connection creadteMysql() {
		Connection connection = null;
		Properties properties = Config.loadProperties(
				"/properties/mysql.properties", "mysql properties");
		connection = createConnect(properties);
		return connection;
	}

	@Override
	public Connection creadteMSsql() {
		Connection connection = null;
		Properties properties = Config.loadProperties(
				"/properties/mssql.properties", "mysql properties");
		connection = createConnect(properties);
		return connection;
	}
}
