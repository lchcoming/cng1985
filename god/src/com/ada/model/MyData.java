package com.ada.model;

public class MyData {
private static String message;

public static String getMessage() {
	return message;
}

public static void setMessage(String message) {
	MyData.message = message;
}
}
