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
package com.ada.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import com.ada.common.util.PropertiesUtil;



public class AutoTimeNumerUtil {

	private static final String configFile = "com/ada/common/util/number.properties";
	private static final String step = "01";//

	
	static Properties profile;
	static {
		profile = PropertiesUtil.loadProperties(configFile, new Date()
				.toLocaleString());
	}

	public static String getDayNumber(String id) {

		return getNumber(id, "yyyyMMdd");
		// String min=
	}

	public static String getYearNumber(String id) {

		return getNumber(id, "yyyy");
		// String min=
	}

	public static synchronized String getDayNumberBySave(String id) {

		String temp = getDayNumber(id);
		profile.setProperty(id, temp);

		PropertiesUtil.saveData(profile, configFile);
		return temp;
		// String min=
	}

	public static synchronized String getYearNumberBySave(String id) {

		String temp = getDayNumber(id);
		profile.setProperty(id, temp);

		PropertiesUtil.saveData(profile, configFile);
		return temp;
		// String min=
	}

	public static String getDayNumberBySave() {
		Properties profile = new Properties();
		String temp = getDayNumber("daynumberid");
		profile.setProperty("daynumberid", temp);

		PropertiesUtil.saveData(profile, configFile);
		return temp;
		// String min=
	}

	public static String getDayNumberSpit() {
		String key = new SimpleDateFormat("yyyyMMdd").format(new Date());
		key = key + step;
		if (null == profile) {
			profile = PropertiesUtil.loadProperties(configFile, "");
		}
		String min = profile.getProperty("daynumberspitid");
		if (null == min) {
			profile.setProperty("daynumberspitid", key);
			PropertiesUtil.saveData(profile, configFile);
			min = profile.getProperty("daynumberspitid");
		}
		min = min.replaceAll("-", "");
	
		if (key.length() < min.length()) {
			return key.substring(0, 8) + "-" + step;
		}
		if (Long.parseLong(key) > Long.parseLong(min)) {
			return key.substring(0, 8) + "-" + step;
		} else {
			String min1 = min.substring(8, min.length());
			String min2 = min.substring(0, 8);
			min1 = "1" + min1;
			long temp = Long.parseLong(min1);
			temp++;
			String t = String.valueOf(temp);
			t = t.substring(1);
			return String.valueOf(min2 + "-" + t);
		}

		// String min=
	}

	public static String getNumber(String id, String format) {
		String key = new SimpleDateFormat(format).format(new Date());
		key = key + step;
		if (null == profile) {
			profile = PropertiesUtil.loadProperties(configFile, "");
		}

		String min = profile.getProperty(id);
		if (null == min) {
			profile.setProperty(id, key);
			PropertiesUtil.saveData(profile, configFile);
			min = profile.getProperty(id);
		}

		if (key.length() < min.length()) {
			return key;
		}
		if (Long.parseLong(key) > Long.parseLong(min)) {
			return key;
		} else {
			long temp = Long.parseLong(min);
			temp++;
			return String.valueOf(temp);
		}

		// String min=
	}

	public static String getYearNumber() {
		return getNumber("yearnumberid", "yyyy");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// loadProperties(configFile,"");
		int i = 0;
		while (i < 10) {
			System.out.println(getDayNumberBySave("aaaaaaa"));
			System.out.println(getDayNumberBySave("b"));
			i++;
		}

	}
}
