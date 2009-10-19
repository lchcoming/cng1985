/** 
 * CopyRright (c)1985-2009: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.test<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-19<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-19          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.TreeMap;

import org.junit.Test;

import com.ada.utils.NetUtil;

public class NetUtilTest {

	@Test
	public void testParseUrlParam() {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("a", "1");
		map.put("b", "2");
		String result = NetUtil.parseUrlParam(map);
		assertEquals("a=1&b=2", result);
	}

	@Test
	public void testurl() {
		String content = NetUtil.getResultByGet("http://www.baidu.com/s?wd=163",
				null);
		System.out.println(content);
	}
}
