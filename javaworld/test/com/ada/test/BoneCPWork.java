/** 
* CopyRright (c)1985-2010: ada.young <br />                             
* Project: javaworld<br />                                           
* Module ID:    <br />   
* Comments:            <br />                                  
* JDK version used:<JDK1.6><br />                                 
* Namespace:com.ada.test<br />                             
* Author：ada.young <br />                  
* Create Date：  Jul 2, 2010<br />   
* Modified By：ada.young          <br />                                
* Modified Date:Jul 2, 2010          <br />                               
* Why & What is modified <br />   
* Version: 1.01         <br />       
*/ 
package com.ada.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jolbox.bonecp.BoneCP;
import com.jolbox.bonecp.BoneCPConfig;

public class BoneCPWork {
	/** Start test
	 * @param args none expected.
	 */
	public static void main(String[] args) {
		BoneCP connectionPool = null;
		Connection connection = null;
 
		try {
			// load the database driver (make sure this is in your classpath!)
			Class.forName("org.sqlite.JDBC");
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
		try {
			// setup the connection pool
			BoneCPConfig config = new BoneCPConfig();
			config.setJdbcUrl("jdbc:sqlite:E:\\others\\data\\sys"); // jdbc url specific to your database, eg jdbc:mysql://127.0.0.1/yourdb
			config.setUsername(""); 
			config.setPassword("");
			config.setMinConnectionsPerPartition(5);
			config.setMaxConnectionsPerPartition(10);
			config.setPartitionCount(1);
			connectionPool = new BoneCP(config); // setup the connection pool
			
			connection = connectionPool.getConnection(); // fetch a connection
			
			if (connection != null){
				System.out.println("Connection successful!");
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM MaterialCatalog"); // do something with the connection.
				while(rs.next()){
					System.out.println(rs.getString(1)); // should print out "1"'
				}
			}
			connectionPool.shutdown(); // shutdown connection pool.
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
