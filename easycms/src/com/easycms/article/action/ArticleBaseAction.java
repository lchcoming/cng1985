package com.easycms.article.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.easycms.common.dao.BaseDao;
import com.easycms.common.dao.BaseDaoImpl;
import com.easycms.entity.Article;

public class ArticleBaseAction {
	protected Logger logger=LoggerFactory.getLogger(getClass());
	protected Article article;
	protected List<Article> articles;
	protected String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	protected List<String> types;
	protected Date now;
	public Date getNow() {
		return now;
	}
	public void setNow(Date now) {
		this.now = now;
	}
	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}
	protected BaseDao dao;
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public List<Article> getArticles() {
		return articles;
	}
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public ArticleBaseAction(){
		now=new Date();
		dao=new BaseDaoImpl();
		article=new Article();
		types=new ArrayList<String>();
		types.add("java开发");
		types.add("C#开发");
		types.add("个人观点");
		types.add("strut2");
		types.add("google app engin");
		types.add("框架设计");
		types.add("python");
		types.add("jquery");
		types.add("extjs");
	}
}
