package com.ada.tool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class HtmlWork {
	public static String visit(String urll) throws IOException {
		String line;
		String message ="";
		try {
			URL url = new URL(urll);
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream()));

			while ((line = reader.readLine()) != null) {
				message += line + "\n";
			}
			reader.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(message);

		return message;

	}
}
