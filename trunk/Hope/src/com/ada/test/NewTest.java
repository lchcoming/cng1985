package com.ada.test;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ada.daoimpl.NewDaoImpl;
import com.ada.news.model.News;

public class NewTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("classpath:config/spring/test.xml");
	Object cObject=	context.getBean("b");
	A b=(A)cObject;
	
	System.out.println(cObject.getClass().getName());
	}

}
