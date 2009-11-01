package com.ada.test;

import java.util.Calendar;

import com.ada.daoimpl.NewDaoImpl;
import com.ada.news.model.News;

public class NewTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calendar calendar=Calendar.getInstance();
    calendar.add(Calendar.DATE,1000);
    System.out.println(calendar.getTime().toLocaleString());
	}

}
