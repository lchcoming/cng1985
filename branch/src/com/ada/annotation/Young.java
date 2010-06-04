/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.annotation<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-21<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-21          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
/**
 * 
 */
package com.ada.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Young {
	String youngs();
	String ada();
	String value();
}
