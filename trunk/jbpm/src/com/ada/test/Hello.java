package com.ada.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Hello {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("E:\\Program Files\\Netease\\tx2\\note.txt");
		System.out.println(file.isFile());
		FileInputStream stream = null;
		try {
			stream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		InputStreamReader i=new InputStreamReader(stream);

		StringReader reader = new StringReader(
				"E:\\Program Files\\Netease\\tx2\\note.txt");
		BufferedReader bufferedReader = new BufferedReader(i);
		try {
			System.out.println(bufferedReader.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
