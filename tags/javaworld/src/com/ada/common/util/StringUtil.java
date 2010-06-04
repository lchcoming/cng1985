package com.ada.common.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringUtil {
	public static String sortstring(String source) {
		String result = "";
		for (int i = source.length(); i > 0; i--) {
			String temp = source.substring(i - 1, i);
			result += temp;
		}
		return result;
	}

	public static String sortstrings(String source) {
		char[] chars = source.toCharArray();
		char[] temp = new char[chars.length];
		int length = source.length() - 1;
		for (int i = chars.length - 1; i >= 0; i--) {
			temp[length - i] = chars[i];
		}
		String result = String.copyValueOf(temp);
		return result;
	}
		
	/**
	 * 
	 * @param maxWminF 最大到万 最小到分 型如：2536.50，10.36，0.23，

	 * @return 型如：#贰伍叁陆伍零，###壹零叁陆
	 */
	public static String moneyToUpperCase(double maxWminF){
		String[] result = new String[7];
		String resultX = "";
		
		String[] tempD = split(String.valueOf(maxWminF),'.');
		
		String tempDF = tempD[0];
		String tempDB = tempD[1];
		
		
		switch(tempDF.length()){
		case 1:  tempDF = "####"+tempDF;break;
		case 2:  tempDF = "###"+tempDF;break;
		case 3:  tempDF = "##"+tempDF;break;
		case 4:  tempDF = "#"+tempDF;break;
		default: break;
		}
		switch(tempDB.length()){
		case 1:  tempDB = tempDB+"0";break;
		default: break;	
		}
		
		for(int i = 0;i<5;i++){
			result[i] = chDigUpCast((tempDF.charAt(i)));
		}
		for(int i = 0;i<2;i++){
			result[5+i] = chDigUpCast((tempDB.charAt(i)));
		}
		
		for(int i = 0;i<7;i++){
			resultX = resultX+result[i];
		}
		return resultX;
	}
	
	private static String[] split(String source, char useChar) {
		List list = new ArrayList();
		String sub;
		String[] result;

		if (source.charAt(0) == useChar)
			source = source.substring(1, source.length());
		if (source.charAt(source.length() - 1) == useChar)
			source = source.substring(0, source.length() - 1);

		int start = 0;
		int end = source.indexOf(useChar);
		while (end > 0) {
			sub = source.substring(start, end);
			list.add(sub);
			start = end + 1;
			end = source.indexOf(useChar, start);
		}

		sub = source.substring(start, source.length());
		list.add(sub);

		result = new String[list.size()];

		Iterator iter = list.iterator();
		int i = 0;
		while (iter.hasNext()) {
			result[i++] = (String) iter.next();
		}
		return result;
	}
	
	public static String chDigUpCast(char d){
		String result = "";
		switch(d){
		case '0': result = "零";break; 
		case '1': result = "壹";break; 
		case '2': result = "贰";break; 
		case '3': result = "叁";break; 
		case '4': result = "肆";break; 
		case '5': result = "伍";break; 
		case '6': result = "陆";break; 
		case '7': result = "柒";break; 
		case '8': result = "捌";break; 
		case '9': result = "玖";break;
		case '#': result = "#";break;
		case '-': result = "-";break;
		default:break;
		}
		
		return result;
	}
	
	private static String chUpCastDig(char d){
		String result = "";
		switch(d){
		case '零': result = "0";break; 
		case '壹': result = "1";break; 
		case '贰': result = "2";break; 
		case '叁': result = "3";break; 
		case '肆': result = "4";break; 
		case '伍': result = "5";break; 
		case '陆': result = "6";break; 
		case '柒': result = "7";break; 
		case '捌': result = "8";break; 
		case '玖': result = "9";break;
		case '#': result = "-";break;
		default:break;
		}
		
		return result;
	}
	
	public static String moneyUpperCaseDig(String str){
		String tempStr = "";
		for(int i = 0;i < str.length();i++){
			tempStr = tempStr + chUpCastDig(str.charAt(i));
		}
		return tempStr;
	}
	public static void main(String [] args){
		System.out.println("dd");
		System.out.println(moneyToUpperCase(1556.155));
	}
}
