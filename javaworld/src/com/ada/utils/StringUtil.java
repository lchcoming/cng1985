package com.ada.utils;

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
}
