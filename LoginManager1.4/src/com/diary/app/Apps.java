/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: LoginManager1.4<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.diary.app;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  May 6, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:May 6, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.diary.app;

import com.diary.ui.DiaryJFrame;

public class Apps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// DiaryJFrame d=new DiaryJFrame();
		System.out.println(computeNewCode("554895445", "fdgdf", 0));
		
		System.out.println(doGenRamdomNum(1));
		// d.show();
	}

	private static String computeNewCode(String maxCode, String head,
			int numCount) {

		String newCode = "";
		if (maxCode != null) {
			int i = head.length();
			int j = maxCode.length();
			int k = j - i;

			String numPart = maxCode.substring(i, j);
			int theInt = new Integer(numPart).intValue();
			theInt++;
			String numString = new Integer(theInt).toString();
			k = k - numString.length();
			String temp0 = "";
			for (; k > 0; k--) {
				temp0 = temp0 + "0";
			}
			numString = temp0 + numString;
			newCode = head + numString;
		} else {
			String temp0 = "";
			for (int k = numCount - 1; k > 0; k--) {
				temp0 = temp0 + "0";
			}
			newCode = head + temp0 + "1";
		}
		return newCode;
	}

	public static String doGenRamdomNum(int digits) {
		java.util.Random r = new java.util.Random();
		int random = Math.abs(r.nextInt()) % (int) (Math.pow(10, digits));
		String result = null;
		int length = (random + "").length();
		result = random * ((int) Math.pow(10, digits - length)) + "";

		return result;
	}
}
