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

import com.ada.common.util.NetUtil;

public class NetWorks extends Thread {
	private static int number = 0;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		while (true) {
			NetUtil
					.getResultByGet(
							"http://127.0.0.1:8080/Sun_PS/cailiaoziyuantypetree.action",
							"");
			number++;
			System.out.println("" + number + "cur thread"
					+ Thread.currentThread().getName());
		}
	}

}
