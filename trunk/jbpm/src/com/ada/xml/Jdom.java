/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: AdventureWorks<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.xml<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-10<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-10          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

public class Jdom {
	public static void run() throws JDOMException, IOException {
		List<RssItem> itemsList = new ArrayList<RssItem>();
		SAXBuilder b = new SAXBuilder();
		File file = new File("F:\\xxx.xml");
		Document document = b.build(file);
		Element rss = document.getRootElement();
		List<Element> channel = rss.getChildren();
		for (Element element : channel) {
			List<Element> aList = element.getChildren();
			System.out.println(element.getName());
			for (Element element2 : aList) {
				RssItem item = new RssItem();
				if (element2.getName().equals("item")) {
					Element title = element2.getChild("title");
					item.setTitle(title.getText());
					Element description = element2.getChild("description");
					item.setDescription(description.getTextTrim());
					itemsList.add(item);

				}

			}
		}
		System.out.println("******************rss内容****************");
		System.out.println("******************rss内容****************"
				+ itemsList.size());
		for (RssItem item : itemsList) {
			System.out.println(item.getTitle());
			System.out.println(item.getDescription());
		}
		XMLOutputter outputter = new XMLOutputter();

	}

	public static void rss(String filesource) throws JDOMException, IOException {
		List<RssItem> itemsList = new ArrayList<RssItem>();
		SAXBuilder b = new SAXBuilder();
		File file = new File(filesource);
		Document document = b.build(file);
		Element rss = document.getRootElement();
		Element channel = rss.getChild("channel");
		List<Element> aList = channel.getChildren();
		System.out.println(channel.getName());
		for (Element itemelement : aList) {
			RssItem item = new RssItem();
			if (itemelement.getName().equals("item")) {
				Element title = itemelement.getChild("title");
				item.setTitle(title.getText());
				Element description = itemelement.getChild("description");
				item.setDescription(description.getTextTrim());
				Element link = itemelement.getChild("link");
				item.setLink(link.getTextTrim());
				Element category = itemelement.getChild("category");
				item.setCategory(category.getTextTrim());
				Element author = itemelement.getChild("author");
				if (author != null) {
					item.setAuthor(author.getTextTrim());
				}
				Element pubDate = itemelement.getChild("pubDate");
				item.setPubDate(pubDate.getTextTrim());
				Element comments = itemelement.getChild("comments");
				if (item != null) {
					try {
						item.setComments(comments.getTextTrim());
					} catch (Exception e) {
						item.setComments("没有内容");
					}

				}
				itemsList.add(item);

			}

		}
		System.out.println("******************rss内容****************");
		System.out.println("******************rss内容****************"
				+ itemsList.size());
		for (RssItem item : itemsList) {
			System.out.println(item.getTitle());
			System.out.println("++++++++++++++++++");
			System.out.println(item.getDescription());
			System.out.println(item.getComments());
		}
		XMLOutputter outputter = new XMLOutputter();

	}

	public static void netrss(String filesource) throws JDOMException,
			IOException {
		List<RssItem> itemsList = new ArrayList<RssItem>();
		SAXBuilder b = new SAXBuilder();
		File file = new File(filesource);
		URL url = new URL(filesource);
		InputStream in = url.openStream();
		Document document = b.build(in);
		Element rss = document.getRootElement();
		Element channel = rss.getChild("channel");
		List<Element> aList = channel.getChildren();
		System.out.println(channel.getName());
		for (Element itemelement : aList) {
			RssItem item = new RssItem();
			if (itemelement.getName().equals("item")) {
				Element title = itemelement.getChild("title");
				item.setTitle(title.getText());
				Element description = itemelement.getChild("description");
				item.setDescription(description.getTextTrim());
				Element link = itemelement.getChild("link");
				item.setLink(link.getTextTrim());
				Element category = itemelement.getChild("category");
				if (category != null) {
					item.setCategory(category.getTextTrim());
				}
				Element author = itemelement.getChild("author");
				if (author != null) {
					item.setAuthor(author.getTextTrim());
				}
				Element pubDate = itemelement.getChild("pubDate");
				item.setPubDate(pubDate.getTextTrim());
				Element comments = itemelement.getChild("comments");
				if (item != null) {
					try {
						item.setComments(comments.getTextTrim());
					} catch (Exception e) {
						item.setComments("没有内容");
					}

				}
				itemsList.add(item);

			}

		}
		System.out.println("******************rss内容****************");
		System.out.println("******************rss内容****************"
				+ itemsList.size());
		for (RssItem item : itemsList) {
			System.out.println(item.getTitle());
			System.out.println("++++++++++++++++++");
			System.out.println(item.getDescription());
			System.out.println(item.getComments());
		}
		XMLOutputter outputter = new XMLOutputter();

	}

	public static void main(String[] args) throws JDOMException, IOException {
		//QQ空间 http://feeds.qzone.qq.com/cgi-bin/cgi_rss_out?uin=369983994
		//有道博客搜索 http://blog.yodao.com/searchrss?q=java&keyfrom=rssreader
		//netrss("http://rss.sina.com.cn/tech/internet/home28.xml");
		String info= readnetinfo("http://www.163.com");
		System.out.println(info);
		// rss("F:\\gseek.xml");
	}

	private static String readnetinfo(String urlsource) throws MalformedURLException, IOException {
		URL url = new URL(urlsource);
		BufferedReader reader = new BufferedReader(new InputStreamReader(url
				.openStream()));
		String line;
		StringBuilder builder = new StringBuilder();
		while ((line = reader.readLine()) != null) {
			builder.append(line);

		}

		reader.close();
		return builder.toString();
		
	}
}
