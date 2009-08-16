package com.ada.service;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;

public class HtmlWork {
	public void work() throws IOException {
		String message;

		message = URLEncoder.encode("my message", "UTF-8");
		URL url = new URL("http://www.example.com/comment");
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setDoOutput(true);
		connection.setRequestMethod("POST");

		OutputStreamWriter writer = new OutputStreamWriter(connection
				.getOutputStream());
		writer.write("message=" + message);
		writer.close();

		if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
			// OK
		} else {
			// Server returned HTTP error code.
		}

	}
}