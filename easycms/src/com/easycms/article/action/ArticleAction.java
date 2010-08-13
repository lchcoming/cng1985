package com.easycms.article.action;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.easycms.common.help.Page;
import com.easycms.entity.Article;
import com.google.appengine.api.labs.taskqueue.Queue;
import com.google.appengine.api.labs.taskqueue.QueueFactory;
import com.google.appengine.api.labs.taskqueue.TaskOptions;
import com.google.appengine.api.labs.taskqueue.TaskOptions.Method;


public class ArticleAction  extends ArticleBaseAction{

	private Page page=new Page();;
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public ArticleAction(){
		super();
	}
	public String add() {
		dao.add(article);
		
		return "success";
	}

	public String adds() throws Exception {
	    Set<String> r=new HashSet<String>();
	    r.add("http://tech.163.com/it");
	    r.add("http://tech.163.com");
	    r.add("http://news.163.com");
	    r.add("http://money.163.com/stock");
	    r.add("http://money.163.com");
	    r.add("http://edu.163.com");
	    for(String item:r){
	    	Queue queue = QueueFactory.getDefaultQueue();
			TaskOptions t = TaskOptions.Builder.url("/addsitem.action");
			t.param("url", item);
			t.method(Method.GET);
			queue.add(t);
	    }
		
		
		return "success";
	}
	public String addsitem() throws Exception {
		logger.info("{}","开始添加文章");
		
		logger.info("{}","添加文章结束");
		return "success";
	}
	public String addsOne() throws Exception {
		logger.info("{}","开始添加文章");
	
		logger.info("{}","添加文章结束");
		return "success";
	}
	public String preAdd() {
		
		return "success";
	}

	public String view() {
	
		return "success";
	}

	public String preUpdate() {
		
		return "success";
	}

	public String update() {
		
		return "success";
	}
	public String delete() {
		dao.delete(Article.class,article);
		return "success";
	}
	public String list() {
		String query = "select from " + Article.class.getName();
		query+=" order by date desc ";
		articles =dao.find(query);
		logger.info("系统中的文章有{}篇",articles.size());
		return "success";
	}
	public String maps() {
		String query = "select from " + Article.class.getName();
		query+=" order by date desc ";
		articles =dao.find(query);
		logger.info("系统中的文章有{}篇",articles.size());
		return "success";
	}
	public String rss() {
		
		return "success";
	}
	public String typeList() {
		 
		return "success";
	}
}
