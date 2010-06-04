/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: LoginManager1.4<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.diary.app;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  May 6, 2010<br />   
 * Modified By��ada.young          <br />                                
 * Modified Date:May 6, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.diary.app;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class A {
	private static String configFile = "/max.properties";
	private static Properties profile=new Properties();
	   private static String step = "00001";//ÿ������� 99999���������ɰ��������  
	     private static Map idMap = new HashMap();  
	       
	     static{  
	         long maxId = 0L;  
	         maxId = getMaxIdFromDB();  
	         if(maxId!=0){  
	             String key = (maxId + "").substring(0, 8);  
	             Long value = new Long(maxId);  
	             idMap.put(key, value);  
	         }  
	     }  
	     //��Ŀ��һ������������ʱ�������ݿ��õ�����id,���ݿ���û�м�¼,�򷵻�0  
	     public static long getMaxIdFromDB(){  
	    	 URL name=Thread.currentThread().getClass().getResource(configFile);
	    	 System.out.print(name.getFile());
	    	 File file = new File(configFile);
	    	
	    	  try {
	    		  
	    		
				profile.load(new FileReader(file));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 System.out.println(profile.getProperty("maxid"));  
			 long id = 0;
	 //      return 0L;//���ݿ���û�м�¼�����  
			 try{
				 id= Long.parseLong(profile.getProperty("maxid"));
			 }catch(Exception e){
				 e.printStackTrace();
				 String key = new SimpleDateFormat("yyyyMMdd").format(new Date());  
		        id= Long.parseLong(key+"50001"); 
				
			 }
			 
	         return id;//��Ŀ���������ݿ����м�¼�����  
	     }  
	     public static synchronized long getId(){  
	         long id = 0L;  
	           
	         String key = new SimpleDateFormat("yyyyMMdd").format(new Date());  
	         Long value = (Long)idMap.get(key);  
	         if(value==null){  
	             idMap.clear();  
	             id = Long.parseLong(key+step);  
	         }else{  
	             id = value.longValue() + 1;   
	         }  
	         idMap.put(key, new Long(id));  
	           
	         return id;  
	     }  
	     /** 
	      * @param args 
	      */  
	     public static void main(String[] args) {  
	         int i=0;
	         while(i<10){
	        	 long id=getId();
	        	 saveData(id);
	        	 System.out.println(id);
	        	 i++;
	         }
	         
	     }  
	     
	     public static synchronized void saveData(long id){
	    	 profile.setProperty("maxid", String.valueOf(id));
	    	 File file = new File(configFile);
	 		if(!file.exists())
	 		{
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
	 			System.out.println("�����ļ�����ʱ����");
	 			e.printStackTrace();
	 		}
	     }
	   
}

