/** 
 * CopyRright (c)1985-2010: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.common.util<br />                             
 * Author：ada.young <br />                  
 * Create Date：  May 4, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:May 4, 2010          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.common.util;


public class PinYinUTils {
	public static String getPY(String py) {
		if (py != "") {
			// execScript("tmp=asc(\""+py+"\")", "vbscript");
			int tmp = py.charAt(0);
			//tmp = 65536 + tmp;
			System.out.println(tmp);
			String pys = "";
			if (tmp >= 45217 && tmp <= 45252) {
				pys = "A";
			} else if (tmp >= 45253 && tmp <= 45760) {
				pys = "B";
			} else if (tmp >= 45761 && tmp <= 46317) {
				pys = "C";
			} else if (tmp >= 46318 && tmp <= 46825) {
				pys = "D";
			} else if (tmp >= 46826 && tmp <= 47009) {
				pys = "E";
			} else if (tmp >= 47010 && tmp <= 47296) {
				pys = "F";
			} else if ((tmp >= 47297 && tmp <= 47613) || (tmp == 63193)) {
				pys = "G";
			} else if (tmp >= 47614 && tmp <= 48118) {
				pys = "H";
			} else if (tmp >= 48119 && tmp <= 49061) {
				pys = "J";
			} else if (tmp >= 49062 && tmp <= 49323) {
				pys = "K";
			} else if (tmp >= 49324 && tmp <= 49895) {
				pys = "L";
			} else if (tmp >= 49896 && tmp <= 50370) {
				pys = "M";
			} else if (tmp >= 50371 && tmp <= 50613) {
				pys = "N";
			} else if (tmp >= 50614 && tmp <= 50621) {
				pys = "O";
			} else if (tmp >= 50622 && tmp <= 50905) {
				pys = "P";
			} else if (tmp >= 50906 && tmp <= 51386) {
				pys = "Q";
			} else if (tmp >= 51387 && tmp <= 51445) {
				pys = "R";
			} else if (tmp >= 51446 && tmp <= 52217) {
				pys = "S";
			} else if (tmp >= 52218 && tmp <= 52697) {
				pys = "T";
			} else if (tmp >= 52698 && tmp <= 52979) {
				pys = "W";
			} else if (tmp >= 52980 && tmp <= 53688) {
				pys = "X";
			} else if (tmp >= 53689 && tmp <= 54480) {
				pys = "Y";
			} else if (tmp >= 54481 && tmp <= 62289) {
				pys = "Z";
			} else {
				pys = String.valueOf(py.charAt(0));
			}
			return pys;
		}
		return py;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
	System.out.println(getPY("陈陈"));
	}
}
