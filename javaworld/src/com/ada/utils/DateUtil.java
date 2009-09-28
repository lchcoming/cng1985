package com.ada.utils;

import java.util.Date;

import com.ada.factory.DateFormatFactory;

public class DateUtil {
	public static String toChineseDate(Date time){
		return DateFormatFactory.createChineseDate().format(time);
	}
}
