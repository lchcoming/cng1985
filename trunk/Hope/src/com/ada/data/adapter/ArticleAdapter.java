package com.ada.data.adapter;

import java.util.List;

import com.ada.model.Article;

public interface ArticleAdapter {

	public abstract void addArticle(Article art);

	public abstract void updateArticle(Article art);

	public abstract void deleteArticle(Article art);

	public abstract List<Article> findArticle(String query);

}