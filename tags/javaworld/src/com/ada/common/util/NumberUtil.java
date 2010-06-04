/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.utils<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-19<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-19          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.common.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;



public class NumberUtil {
	private static String configFile = "com/ada/common/util/max.properties";
	private static Properties profile = new Properties();
	private static String step = "00001";//������ɰ�������
	private static Map idMap = new HashMap();
   
	static {
		long maxId = 0L;
		maxId = getMaxIdFromDB();
	
		if (maxId != 0) {
			String key = (maxId + "").substring(0, 8);
			Long value = new Long(maxId);
			idMap.put(key, value);
		}
	}

	// ��Ŀ��һ���������ʱ������ݿ��õ�����id,��ݿ���û�м�¼,�򷵻�0
	public static long getMaxIdFromDB() {
		URL url = getFileFullName();

		InputStream in = null;

		try {
			in = url.openStream();
			profile.load(in);

		} catch (Exception e) {

		} finally {
			try {
				in.close();
			} catch (IOException e) {

			}
		}
		long id = 0;
		// return 0L;//��ݿ���û�м�¼�����
		try {
			id = Long.parseLong(profile.getProperty("maxid"));
		} catch (Exception e) {
			e.printStackTrace();
			String key = new SimpleDateFormat("yyyyMMdd").format(new Date());
			id = Long.parseLong(key + "50001");

		}

		return id;// ��Ŀ��������ݿ����м�¼�����
	}

	public static synchronized long getId() {
		long id = 0L;

		String key = new SimpleDateFormat("yyyyMMdd").format(new Date());
		Long value = (Long) idMap.get(key);
		if (value == null) {
			idMap.clear();
			id = Long.parseLong(key + step);
		} else {
			id = value.longValue() + 1;
		}
		idMap.put(key, new Long(id));

		return id;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// loadProperties(configFile,"");
		int i = 0;
		while (i < 10) {
			long id = getId();
			saveData(id);
			
			System.out.println(id);
			i++;
		}

	}

	public static synchronized void saveData(long id) {
		profile.setProperty("maxid", String.valueOf(id));
		URL url = getFileFullName();
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
			profile.store(new FileWriter(file), "max");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("�����ļ�����ʱ��?");
			e.printStackTrace();
		}
	}

	private static URL getFileFullName() {
		URL url = null;

		ClassLoader threadContextClassLoader = Thread.currentThread()
				.getContextClassLoader();
		if (threadContextClassLoader != null) {
			url = threadContextClassLoader.getResource(configFile);
			
		}
		if (url == null) {
			
			url = NumberUtil.class.getResource(configFile);
			if (url == null) {
				
			}
		}
		return url;
	}

	public static Properties loadProperties(String filename, String info) {
		URL url = null;

		ClassLoader threadContextClassLoader = Thread.currentThread()
				.getContextClassLoader();
		if (threadContextClassLoader != null) {
			url = threadContextClassLoader.getResource(filename);
		}
		if (url == null) {
			url = NumberUtil.class.getResource(filename);
			if (url == null) {

				return new Properties();
			}
		}

		return loadProperties(url, info);
	}

	/**
	 * Load the properties from the specified URL.
	 * 
	 * @param url
	 *            a non null value of the URL to the properties
	 * @param info
	 *            additional logger information if the properties can't be read
	 * @return the loaded properties specified by the URL
	 * @since 2.4
	 */
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

	public static String autoNumebr() {
		long now = System.currentTimeMillis();
		String string = String.valueOf(now);
		string = Long.toHexString(now);
		System.out.println(Long.toOctalString(now));
		System.out.println(Long.toBinaryString(now));
		return string;
	}
}
