package com.springbblog.remoting.service;

import java.util.List;

import com.springbblog.api.HelloWork;
import com.springbblog.dao.ArticleDa;
import com.springbblog.daocache.ArticleCache;
import com.springbblog.domain.ArticleEn;

public class HelloWorkRemoting implements HelloWork {

	
	@Override
	public String message() {
		// TODO Auto-generated method stub
		return "ada";
	}

	public boolean save(ArticleEn en) {
		ArticleDa dao = new ArticleCache();
		return dao.save(en);
	}
	public List<ArticleEn> list(ArticleEn en) {
		ArticleDa dao = new ArticleCache();
		return dao.findAll("articleId", true, 0, 100);
	}
}
