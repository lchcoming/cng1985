package com.easycms.servlet;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Properties;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.easycms.test.Hello;

@SuppressWarnings("serial")
public class EasycmsServlet extends HttpServlet {
	//private Logger logger = LoggerFactory.getLogger("EasycmsServlet");

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		//logger.info("{}","你访问我了");
		Properties properties = new Properties();
		properties.setProperty("resource.loader", "class");
		properties
				.setProperty("class.resource.loader.class",
						"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		// Velocity.init("velocity.properties");
		VelocityEngine ve = new VelocityEngine();
		try {
			ve.init(properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* next, get the Template */

		// ClasspathResourceLoader.getClass().getResourceAsStream("template path")
		Template t = null;
		try {
			t = ve.getTemplate("/com/easycms/test/image.vm","utf-8");
		} catch (ResourceNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseErrorException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* create a context and add data */
		VelocityContext context = new VelocityContext();
		context.put("name", "陈可可");
		context.put("site", "http://www.eiffelqiu.com");
		Hello hello=new Hello();
		context.put("hello", hello);
		/* now render the template into a StringWriter */
		StringWriter writer = new StringWriter();
		File flie=new File("E:\\jslib\\jquery\\image\\Highcharts-2.0.0\\11.html");
//		BufferedWriter  writer1 = new BufferedWriter(
//				new OutputStreamWriter(new FileOutputStream(flie)));

		t.merge(context, writer);
		writer.flush();
		writer.close();
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().println(writer.toString());
	}
}
