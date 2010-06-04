/** 
 * CopyRright (c)1985-2010:ada.young <br />                             
 * Project: SUNPS<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.gete.pms.repertory.utils;<br />                             
 * @Author ada.young <br />  
 * @Email  cng1985@gmail.com <br />                 
 * @Time   2010-6-1<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2010-6-1      <br />                               
 * Why & What is modified <br />   
 * @Version: 1.01         <br />       
 */

package com.ada.util;

import java.io.IOException;

public class MoneyUtils {
	private static String[] faceVal = new String[] { "零", "壹", "贰", "叁", "肆",
			"伍", "陆", "柒", "捌", "玖" };

	private static String[] level = new String[] { "圆", "拾", "佰", "仟", "萬", "亿" };

	public static String f(String s1) throws IOException {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			int digit = Integer.valueOf(s1.substring(i, i + 1)).intValue();
			sb.append(faceVal[digit]);
		}
		String face = sb.reverse().toString();
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < face.length(); i++) {
			// 加权
			if (i == 0) {
				resultSb.append(level[0]);
			} else {
				// 万位处理
				if ((i + 4) % 8 == 0) {
					resultSb.append(level[4]);
				}
				// 亿位处理
				else if (i % 8 == 0) {
					resultSb.append(level[5]);
				} else {
					resultSb.append(level[i % 4]);
				}
			}
			// 加面值
			String temp = face.substring(i, i + 1);
			resultSb.append(temp);
		}

		String result = resultSb.reverse().toString();

		result = result.replaceAll("零拾", "零");
		result = result.replaceAll("零佰", "零");
		result = result.replaceAll("零仟", "零");

		result = result.replaceAll("[零]+", "零");

		result = result.replaceAll("零圆", "圆");
		result = result.replaceAll("零萬", "萬");
		result = result.replaceAll("零亿", "亿");
		return result;
	}

	private static String HanDigiStr[] = new String[] { "零", "壹", "贰", "叁",
			"肆", "伍", "陆", "柒", "捌", "玖" };

	private static String HanDiviStr[] = new String[] { "", "拾", "佰", "仟", "万",
			"拾", "佰", "仟", "亿", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾",
			"佰", "仟", "万", "拾", "佰", "仟" };

	private static String PositiveIntegerToHanStr(String NumStr) { // 输入字符串必须正整数，只允许前导空格(必须右对齐)，不宜有前导零
		String RMBStr = "";
		boolean lastzero = false;
		boolean hasvalue = false; // 亿、万进位前有数值标记
		int len, n;
		len = NumStr.length();
		if (len > 15)
			return "数值过大!";
		for (int i = len - 1; i >= 0; i--) {
			if (NumStr.charAt(len - i - 1) == ' ')
				continue;
			n = NumStr.charAt(len - i - 1) - '0';
			if (n < 0 || n > 9)
				return "输入含非数字字符!";

			if (n != 0) {
				if (lastzero)
					RMBStr += HanDigiStr[0]; // 若干零后若跟非零值，只显示一个零
				// 除了亿万前的零不带到后面
				// if( !( n==1 && (i%4)==1 && (lastzero || i==len-1) ) ) //
				// 如十进位前有零也不发壹音用此行
				if (!(n == 1 && (i % 4) == 1 && i == len - 1)) // 十进位处于第一位不发壹音
					RMBStr += HanDigiStr[n];
				RMBStr += HanDiviStr[i]; // 非零值后加进位，个位为空
				hasvalue = true; // 置万进位前有值标记
			} else {
				if ((i % 8) == 0 || ((i % 8) == 4 && hasvalue)) // 亿万之间必须有非零值方显示万
					RMBStr += HanDiviStr[i]; // “亿”或“万”
			}
			if (i % 8 == 0)
				hasvalue = false; // 万进位前有值标记逢亿复位
			lastzero = (n == 0) && (i % 4 != 0);
		}

		if (RMBStr.length() == 0)
			return HanDigiStr[0]; // 输入空字符或"0"，返回"零"
		return RMBStr;
	}

	public static String NumToRMBStr(double val) {
		String SignStr = "";
		String TailStr = "";
		long fraction, integer;
		int jiao, fen;

		if (val < 0) {
			val = -val;
			SignStr = "负";
		}
		if (val > 99999999999999.999 || val < -99999999999999.999)
			return "数值位数过大!";
		// 四舍五入到分
		long temp = Math.round(val * 100);
		integer = temp / 100;
		fraction = temp % 100;
		jiao = (int) fraction / 10;
		fen = (int) fraction % 10;
		if (jiao == 0 && fen == 0) {
			TailStr = "整";
		} else {
			TailStr = HanDigiStr[jiao];
			if (jiao != 0)
				TailStr += "角";
			if (integer == 0 && jiao == 0) // 零元后不写零几分
				TailStr = "";
			if (fen != 0)
				TailStr += HanDigiStr[fen] + "分";
		}

		// 下一行可用于非正规金融场合，0.03只显示“叁分”而不是“零元叁分”
		// if( !integer ) return SignStr+TailStr;

		return "￥" + SignStr + PositiveIntegerToHanStr(String.valueOf(integer))
				+ "元" + TailStr;
	}

}
