/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.framework.ioc<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-2<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-2        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.framework.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class IocService {
private static ApplicationContext context;
public static ApplicationContext getContext(){
	if(null==context){
		context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}
	return context;
}
}
