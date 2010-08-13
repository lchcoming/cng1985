package com.easycms.common.util;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class BeanUtil {
	protected static Logger logger = LoggerFactory.getLogger("BeanUtil");

	public static <T> T clone(Object o) {

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

		return (T) o;
	}

	public static <T> T readerByField(Object o, String field) {
		Class classs = o.getClass();
		Field[] fs = classs.getDeclaredFields();
		Object oo = null;
		try {
			Field fi = classs.getDeclaredField(field);
			fi.setAccessible(true);
			oo = fi.get(o);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (T) oo;
	}

	public static <T> T writeByField(Object o, String field, Object value) {
		Class classs = o.getClass();
		Field[] fs = classs.getDeclaredFields();
		Object oo = null;
		try {
			Field fi = classs.getDeclaredField(field);
			fi.setAccessible(true);
			fi.set(o, value);
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (T) oo;
	}

	public static <T extends Object> T cloned(T o) {
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

		return (T) o;
	}

	public static <T> T copy(Object o, Map<String, Object> map) {
		Class<? extends Object> classs = o.getClass();
		Set<String> sets = map.keySet();
		if (null == sets) {
			return null;
		}
		for (String item : sets) {
			try {
				String meth = "set" + item.substring(0, 1).toUpperCase()
						+ item.substring(1);
				System.out.println(meth);

				Method m = classs.getDeclaredMethod(meth, map.get(item)
						.getClass());
				m.setAccessible(true);
				m.invoke(o, map.get(item));
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return (T) o;
	}

	public static <T> T copy(Object src, Object target) {
		Class classs = src.getClass();
		Field[] fs = classs.getDeclaredFields();
		try {
			System.out.println(fs.length);
			for (Field item : fs) {
				if (hasOnefield(src, item.getName())) {
					item.setAccessible(true);
					item.set(target, item.get(src));
				} else {
					logger.warn("{}","设置字段失败");
				}

			}
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return (T) target;
	}

	public static boolean hasOnefield(Object oo, String field) {
		Class classs = oo.getClass();
		Field[] fs = classs.getDeclaredFields();
		try {
			Field fie = classs.getDeclaredField(field);
			if (fie != null) {
				return true;
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	public static void main(String[] args) {
	

	}
}
