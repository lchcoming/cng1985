package com.ada.mail;

import com.ada.data.manager.PMF;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.Properties;  

import javax.jdo.PersistenceManager;
import javax.mail.MessagingException; 
import javax.mail.Message; 
import javax.mail.Session; 
import javax.mail.Transport; 
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SiteMail extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);

	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		 Properties props = new Properties(); 
	        Session session = Session.getDefaultInstance(props, null); 
	 
	        String msgBody =request.getParameter("content"); 
	         String tomail=request.getParameter("tomail");
	        try { 
	            Message msg = new MimeMessage(session); 
	            msg.setFrom(new InternetAddress("cng1985@gmail.com")); 
	            msg.addRecipient(Message.RecipientType.TO, 
	                             new InternetAddress(tomail)); 
	            msg.setSubject("Your Example.com account has been activated"); 
	           msg.setContent(msgBody, "text/html;charset=gbk");
	            //msg.setText(msgBody); 
	            Transport.send(msg); 
	 
	        } catch (AddressException e) { 
	        } catch (MessagingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        System.out.println("·¢ËÍ³É¹¦");
	        response.sendRedirect("/admin/mail.jsp");
	}

}
