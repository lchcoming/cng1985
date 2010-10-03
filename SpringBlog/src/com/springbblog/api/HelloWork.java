package com.springbblog.api;

import java.util.List;

import com.springbblog.dao.ArticleDa;
import com.springbblog.daocache.ArticleCache;
import com.springbblog.domain.ArticleEn;

public interface HelloWork {

	public String message();

	public boolean save(ArticleEn en);

	public List<ArticleEn> list(ArticleEn en);
}
