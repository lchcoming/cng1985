package com.ada.service;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.daoimpl.SiteImageDaoImpl;
import com.ada.news.model.SiteImage;
import com.google.appengine.api.datastore.Blob;

public class UpFile extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UpFile() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the GET method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * The doPost method of the servlet. <br>
	 * 
	 * This method is called when a form has its tag value method equals to
	 * post.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		DataInputStream in = null;
		/*
		 * set content type of response and get handle to output stream in case
		 * we are unable to redirect client
		 */
		String file=request.getParameter("upl-file");
		System.out.print(file);
		String contentType = request.getContentType();
		System.out.println("\ncontentType= " + contentType);
		int formDataLength = request.getContentLength();
		System.out.println("\nContentLength= " + formDataLength);
		if (contentType != null
				&& contentType.indexOf("multipart/form-data") != -1) {
			in = new DataInputStream(request.getInputStream());
			byte[] images = new byte[formDataLength];
			in.read(images);
			SiteImage image = new SiteImage();
			Blob data = new Blob(images);
			image.setImage(data);
			SiteImageDaoImpl dao = new SiteImageDaoImpl();
			dao.add(image);

		}
	}

	public static final int MAX_SIZE = 1024000;

	/**
	 * Initialization of the servlet. <br>
	 * 
	 * @throws ServletException
	 *             if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
