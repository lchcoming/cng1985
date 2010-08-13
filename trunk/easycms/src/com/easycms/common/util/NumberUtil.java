package com.easycms.common.util;

import java.lang.reflect.Field;



public class NumberUtil {

	public static int min(int... numbers) {
		int mini = numbers[0];
		for (int item : numbers) {
			if (mini > item) {
				mini = item;
			}
		}
		return mini;
	}

	public static Object clone(Object o) {
		Class classs = o.getClass();
		Field[] fs = classs.getDeclaredFields();
		try {
			Object oo = classs.newInstance();
			for (Field item : fs) {
				item.setAccessible(true);
				item.set(oo, item.get(o));
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return o;
	}

	public static void main(String[] args) {
		
	}
}
