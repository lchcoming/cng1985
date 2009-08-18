package com.ada.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class HtmlWork {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			work();
			name();
			System.out.println("+++++++");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void work() throws IOException {
		String message;
		System.out.println("+++++++");
		message = URLEncoder.encode("my message", "UTF-8");
		URL url = new URL(
				"http://cng1985.appspot.com/newforummessage.jsp?id=7007");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setFollowRedirects(true);
		connection.setRequestMethod("POST");

		OutputStreamWriter writer = new OutputStreamWriter(connection
				.getOutputStream());
		writer.write("title=" + "ada");
		writer.write("id=" + "7007");
		writer.write("mothod=" + "new");
		writer.write("content=" + "ada2008");
		writer.close();

		System.out.println(connection.getResponseMessage());
		System.out.println(connection.getResponseCode());
		if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
			// OK
		} else {
			System.out.println(connection.getResponseCode());
		}

	}

	public static void name() {
		String line;
		String message = null;
		try {
			URL url = new URL("http://cng1985.appspot.com/login.jsp");
			BufferedReader reader = new BufferedReader(new InputStreamReader(
					url.openStream()));

			while ((line = reader.readLine()) != null) {
				message += line + "\n";
			}
			reader.close();
		} catch (IOException e) {
			// TODO: handle exception
		}
		System.out.println(message);

	}

}
