package com.easycms.servlet;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("serial")
public class EasycmsServlet extends HttpServlet {
	private Logger logger = LoggerFactory.getLogger("EasycmsServlet");

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		logger.info("{}","你访问我了");
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
