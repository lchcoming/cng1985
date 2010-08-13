package com.easycms.article;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import com.easycms.article.domain.NavItem;
import com.easycms.article.domain.Notice;
import com.easycms.entity.Link;
import com.easycms.entity.News;
import com.easycms.factory.VelocityContextFactory;

public class HelloAction {

	private String contextText;

	public String getContextText() {
		return contextText;
	}

	public void setContextText(String contextText) {
		this.contextText = contextText;
	}

	public String work() throws Exception {

		List<NavItem> items = new ArrayList<NavItem>();
		NavItem item = new NavItem();
		item.setName("首页");
		item.setUrl("dd");
		items.add(item);
		items.add(item);
		items.add(item);
		items.add(item);
		List<Notice> notices = new ArrayList<Notice>();
		Notice n=new Notice();
		n.setName("dsfsdfdsfdsfdsfd");
		notices.add(n);
		Notice n1=new Notice();
		n1.setName("送扥工扥刮风非等");
		notices.add(n1);
		List<News> news=new ArrayList<News>();
		News nn=new News();
		nn.setNewsTitle("快填分东风送扥跟随");
		news.add(nn);
		List<Link> links=new ArrayList<Link>();
		Link li=new Link();
		li.setLinkEmail("cng1985@gmail.com");
		li.setLinkWebName("西安");
		links.add(li);
		links.add(li);
		links.add(li);
		links.add(li);
		Properties properties = new Properties();
		properties.setProperty("resource.loader", "class");
		properties
				.setProperty("class.resource.loader.class",
						"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
		VelocityEngine ve = new VelocityEngine();
		ve.init(properties);
		Template t = ve.getTemplate("/templates/default/index.html", "utf-8");
		/* create a context and add data */
		VelocityContext context = VelocityContextFactory.creteDefault();
		context.put("navs", items);
		context.put("notices", notices);
		context.put("news", news);
		context.put("links", links);
		
		StringWriter writer = new StringWriter();
		t.merge(context, writer);
		writer.flush();
		writer.close();
		contextText = writer.toString();
		return "success";
	}
}
