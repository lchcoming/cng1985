/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-23<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-23          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import java.util.HashMap;
import java.util.Map;

import com.ada.common.util.NetUtil;

public class He {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while(true){
		Map<String,String> map=new HashMap<String,String>();
		map.put("content", "test");
		map.put("id", "5058");
		map.put("method", "new");
		map.put("title", "test!!!!!!!  waiting.........");
		System.out.println(NetUtil.parseUrlParam(map));
		NetUtil.parseUrlParam(map);
         NetUtil.getResultByPost("http://cng1985.appspot.com/ForumMessageService", NetUtil.parseUrlParam(map));
		}
	}

}
