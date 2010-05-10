/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: SUNPS<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.gete.pms.quota.utils;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  May 10, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:May 10, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.common.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.Properties;



public class PropertiesUtil {
	public static Properties loadProperties(String filename, String info) {
		URL url = null;

		ClassLoader threadContextClassLoader = Thread.currentThread()
				.getContextClassLoader();
		if (threadContextClassLoader != null) {
			url = threadContextClassLoader.getResource(filename);
		}
		if (url == null) {
			url = PropertiesUtil.class.getResource(filename);
			if (url == null) {

				return new Properties();
			}
		}

		return loadProperties(url, info);
	}
	private static URL getFileFullName(String configFile) {
		URL url = null;

		ClassLoader threadContextClassLoader = Thread.currentThread()
				.getContextClassLoader();
		if (threadContextClassLoader != null) {
			url = threadContextClassLoader.getResource(configFile);
			
		}
		if (url == null) {
			
			url = PropertiesUtil.class.getResource(configFile);
			if (url == null) {
			}
		}
		return url;
	}
	public static synchronized void saveData(Properties profile,String filename) {
		
		URL url = getFileFullName(filename);
		//System.out.println(url.getFile());
		File file = new File(url.getFile());
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("�޷����������ļ���");
			}
		}
		try {
			//profile.store(new FileWriter(file), "max");
			OutputStream a=new FileOutputStream(file);
			profile.store(a, "max");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�����ļ�����ʱ��?");
			e.printStackTrace();
		}
	}
	public static Properties loadProperties(URL url, String info) {

		Properties properties = new Properties();
		InputStream in = null;

		try {
			in = url.openStream();
			properties.load(in);

		} catch (Exception e) {

		} finally {
			try {
				in.close();
			} catch (IOException e) {

			}
		}

		return properties;
	}
}

