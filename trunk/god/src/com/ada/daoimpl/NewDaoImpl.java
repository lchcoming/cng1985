package com.ada.daoimpl;

import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import com.ada.dao.BaseDao;
import com.ada.data.manager.PMF;
import com.ada.news.model.News;
import com.helper.PageResult;

public class NewDaoImpl extends BaseDao<News> {

	public News findbyid(Long id) {
		return findbyid(id, News.class);
	}

	public News visit(Long id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		News news = pm.getObjectById(News.class, id);
		long visit = news.getVisit();
		news.setVisit(visit + 1);
		tx.commit();
		try {
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return news;
	}
    public PageResult<News> pagework(String sql) {
		return null;
	}

}
