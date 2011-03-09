/** 
 * CopyRright (c)1985-2011: ada.young <br />                             
 * Project: javaworld<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.util<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2011-3-9<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2011-3-9          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.util;
/**
 * 一个循环的99乘法表
 * @author Administrator
 *
 */
public class Apps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		o1();
	}

	/**
	 * 两个变量一个循环的99乘法表
	 */
	private static void o() {
		for (int i = 1, j = 1; (i < 10) && (j <= i);) {

			System.out.print(i + "*" + j + "=" + " " + i * j + "  ");
			if (i == j) {
				j = 1;
				System.out.println();
				i++;
			} else {
				j++;
			}
		}
	}

	/**
	 * 两个变量一个递归函数的99乘法表
	 */
	private static void o1() {
		for (int i = 1; i < 10; i++) {
			c(i, j);
		}
	}

	private static int j = 1;

	public static int c(int i, int j) {
		if (i <= 9) {
			System.out.print(i + "*" + j + "=" + i * j + "  ");
			if (i == j) {
				System.out.println();
			}
			if (j < i) {
				j++;
				c(i, j);
			}
		}
		return i;
	}

}
