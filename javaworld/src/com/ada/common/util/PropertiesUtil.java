/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.common.util<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-5<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-5          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesUtil {
	public static Properties readProperties(String filename) {
		Properties properties = new Properties();
		InputStream in = null;
		File file = new File(filename);
		try {
			in = new FileInputStream(file);
			properties.load(in);
			System.out.println("OSCache: Properties read " + properties);
			// log.info("OSCache: Properties read " + properties);
		} catch (Exception e) {
			System.out.println("OSCache: Error reading from ");
			// log.error("OSCache: Error reading from " + url, e);
			// log.error("OSCache: Ensure the properties information in " + url+
			// " is readable and in your classpath.");
		} finally {
			try {
				in.close();
			} catch (IOException e) {
				System.out
						.println("OSCache: IOException while closing InputStream: ");
				// log.warn("OSCache: IOException while closing InputStream: " +
				// e.getMessage());
			}
		}

		return properties;
	}

	public static Properties writeProperties(String filename,
			Properties properties) {

		if (properties == null) {
			properties = new Properties();
		}
		OutputStream out = null;
		File file = new File(filename);
		try {
			out = new FileOutputStream(file);

			properties.store(out, "ff");
			System.out.println("OSCache: Properties read " + properties);
			// log.info("OSCache: Properties read " + properties);
		} catch (Exception e) {
			System.out.println("OSCache: Error reading from ");
			// log.error("OSCache: Error reading from " + url, e);
			// log.error("OSCache: Ensure the properties information in " + url+
			// " is readable and in your classpath.");
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				System.out
						.println("OSCache: IOException while closing InputStream: ");
				// log.warn("OSCache: IOException while closing InputStream: " +
				// e.getMessage());
			}
		}

		return properties;
	}
}
