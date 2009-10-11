/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: jbpm<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-8<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-8          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {
	@Test
	public void hello() {
    Map<String,Object> map=new HashMap<String,Object>();
    for(int i=1;i<100000;i++){
    	map.put("hello", i);
    	map.put(String.valueOf(i), i);
    }
    System.out.println(map.size());
    System.out.println(map.get("hello"));
    System.out.println(map.get("8956"));
    System.out.println(map.containsKey("5"));
    System.out.println(map.containsValue(566));
   
	}
}
