package com.easycms.test;

import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;

public class Sacn {
	public static void main(String[] args) throws Exception {
		String source = "abf acf aaf abf";
		Scanner scanner = new Scanner(source);
		// (a[a|b]f)(a[c|d]f)
		Pattern p = Pattern.compile("(a[a|b]f)|(a[c|d]f)");

		while (scanner.hasNext(p)) {
			System.out.println(">>>>>>>>>>>>>>>>");
			MatchResult m = scanner.match();

			System.out.println(scanner.next(p));
			int c = m.groupCount();
			for (int i = 0; i < c; i++) {
				//System.out.println(m.group(i));
			}
		}
	}

	private static void s() {
		String source = "12321 2323 213 2213";
		Scanner scanner = new Scanner(source);
		while (scanner.hasNextInt()) {
			System.out.println(scanner.nextInt());
		}
	}
}
