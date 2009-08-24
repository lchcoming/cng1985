package com.ada.service;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ada.daoimpl.SiteImageDaoImpl;
import com.ada.news.model.SiteImage;
import com.google.appengine.api.images.Image;
import com.google.appengine.api.images.ImagesService;
import com.google.appengine.api.images.ImagesServiceFactory;
import com.google.appengine.api.images.ImagesServicePb.Transform;

public class ShowImage extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ShowImage() {
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

		// response.setHeader("Pragma","No-cache");
		// response.setHeader("Cache-Control","no-cache");
		// response.setDateHeader("Expires", 0);
		//
		// // 在内存中创建图象
		// int width=60, height=20;
		// ImagesService imagesService =
		// ImagesServiceFactory.getImagesService();
		//
		// byte[] oldImageData = null;
		// Image oldImage = ImagesServiceFactory.makeImage(oldImageData);
		// com.google.appengine.api.images.Transform resize =
		// ImagesServiceFactory.makeResize(200, 300);
		//
		// Image newImage = imagesService.applyTransform(resize, oldImage);
		//         
		// byte[] newImageData = newImage.getImageData();
		SiteImageDaoImpl daoImpl = new SiteImageDaoImpl();
		String id = request.getParameter("id");
		SiteImage image = daoImpl.getbyid(Long.parseLong(id));
		response.setContentType("image/jpg");
		File file=new File("/Creek.jpg");
		 InputStream fis=new FileInputStream(file);
		 int length=(int)file.length();
		
		 byte[] images=new byte[length];
		
		 fis.read(images);
		response.setContentLength(images.length);
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(images);
		outputStream.flush();
		response.reset();
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

		SiteImageDaoImpl daoImpl = new SiteImageDaoImpl();
		String id = request.getParameter("id");
		SiteImage image = daoImpl.getbyid(Long.parseLong(id));
		response.setContentType("image/jpg");
		response.setContentLength(image.getImage().getBytes().length);
		OutputStream outputStream = response.getOutputStream();
		outputStream.write(image.getImage().getBytes());
		outputStream.flush();
	}

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
