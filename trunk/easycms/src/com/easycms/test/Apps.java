package com.easycms.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

public class Apps {
	public static void main(String[] args) throws Exception {

		Properties properties = new Properties();
		properties.setProperty("resource.loader", "class");
		properties
				.setProperty("class.resource.loader.class",
						"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");

		// Velocity.init("velocity.properties");
		VelocityEngine ve = new VelocityEngine();
		ve.init(properties);
		/* next, get the Template */

		// ClasspathResourceLoader.getClass().getResourceAsStream("template path")
		Template t = ve.getTemplate("/com/easycms/test/image.vm","utf-8");

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
		System.out.println(writer.toString());
	}
}
