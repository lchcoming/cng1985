/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.help<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.help;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanHelp {
	private Log log = LogFactory.getLog(BeanHelp.class);
	private static ApplicationContext context;
	private static BeanHelp beanHelp;

	public Object getBean(String name) {
		Object object = null;
		try {
			object = context.getBean(name);
			log.error("获取bean成功");
		} catch (Exception e) {
			log.error("获取bean失败", e);
		}

		return object;
	}

	private BeanHelp() {
		log.info("初始化BeanHelp");
	}

	public static BeanHelp getinstance() {
		if (beanHelp == null) {
			beanHelp = new BeanHelp();
		}
		if (context == null) {
			String[] sourceStrings = { "applicationContext.xml" };
			context = new ClassPathXmlApplicationContext(sourceStrings);
		}
		return beanHelp;
	}
}
