package com.ada.common.util;

import java.util.Date;

import com.ada.common.factory.DateFormatFactory;

public class DateUtil {
	public static String toChineseDate(Date time){
		return DateFormatFactory.createChineseDate().format(time);
	}
}
