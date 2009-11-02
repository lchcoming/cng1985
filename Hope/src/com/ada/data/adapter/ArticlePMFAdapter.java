package com.ada.data.adapter;

import com.ada.data.manager.PMF;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.ada.model.Article;
import com.google.appengine.api.datastore.Text;

public class ArticlePMFAdapter implements ArticleAdapter {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ada.daoimpl.ArticleAdapter#addArticle(com.ada.model.Article)
	 */
	public void addArticle(Article art) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(art);
		} finally {
			pm.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ada.daoimpl.ArticleAdapter#updateArticle(com.ada.model.Article)
	 */
	public void updateArticle(Article art) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			long key = art.getId();
			Article f = pm.getObjectById(Article.class, key);
			f.setContent(art.getContent());
			f.setSubject(art.getSubject());
			f.setDate(art.getDate());
			f.setScore(art.getScore());
			f.setVisit(art.getVisit());
		} finally {
			pm.close();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ada.daoimpl.ArticleAdapter#deleteArticle(com.ada.model.Article)
	 */
	public void deleteArticle(Article art) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			long key = art.getId();
			Article f = pm.getObjectById(Article.class, key);
			pm.deletePersistent(f);
		} finally {
			if (pm.currentTransaction().isActive()) {
				pm.currentTransaction().rollback();
			}
			pm.close();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.ada.daoimpl.ArticleAdapter#findArticle(java.lang.String)
	 */
	public List<Article> findArticle(String query) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			List<Article> flights = (List<Article>) pm.newQuery(query)
					.execute();
			// Force all results to be pulled back before we close the entity
			// manager.
			// We could have also called pm.detachCopyAll()
			flights.size();
			return flights;
		} finally {
			pm.close();
		}
	}

	public Article findArticle(Long key) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		pm = PMF.get().getPersistenceManager();
		Article que = pm.getObjectById(Article.class, key);
		if (!pm.isClosed()) {
			pm.close();
		}
		return que;
	}

	public int findsize(String query) {
		return findArticle(query).size();
	}

	public List<Article> pageArticle(String query, int curpage, int pagesize) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {

			Query qu = pm.newQuery(query);
			int max = 0;
			int all = 0;
			all = findsize(query);
			max = all / pagesize;
			if (all % pagesize != 0) {
				max = max + 1;
			}
			// �߽��ж�
			if (pagesize < 0) {
				pagesize = 10;
			}
			if (curpage > max) {
				curpage = max;
			}
			if (curpage < 1) {
				curpage = 1;
			}
			int star = (curpage - 1) * pagesize;
			qu.setRange(star, pagesize);
			List<Article> flights = (List<Article>) qu.execute();
			// Force all results to be pulled back before we close the entity
			// manager.
			// We could have also called pm.detachCopyAll()
			flights.size();
			return flights;
		} finally {
			pm.close();
		}
	}
}
