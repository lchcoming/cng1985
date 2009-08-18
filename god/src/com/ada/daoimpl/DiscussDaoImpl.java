package com.ada.daoimpl;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import com.ada.dao.BaseDao;
import com.ada.data.manager.PMF;
import com.ada.news.model.Discuss;
import com.ada.news.model.News;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

public class DiscussDaoImpl extends BaseDao<Discuss> {
	public List<Discuss> all() {
		List<Discuss> result = new LinkedList<Discuss>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			Extent<Discuss> newst = pm.getExtent(Discuss.class);
			for (Discuss item : newst) {
				result.add(item);
			}
		} finally {
			pm.close();
		}
		return result;
	}

	public void adddiscuss(Discuss dis, Long newid) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try {
			News news = pm.getObjectById(News.class, newid);
			dis.setNews(news);
			//pm.makePersistent(dis);
			pm.makePersistentAll(dis);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public void deletediscuss(Long id, Long pid) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try {
			Key k = new KeyFactory.Builder(News.class.getSimpleName(), pid)
					.addChild(Discuss.class.getSimpleName(), id).getKey();
			// Key key=KeyFactory.createKey(Discuss.class.getSimpleName(), id)
			Discuss news = pm.getObjectById(Discuss.class, k);
			pm.deletePersistent(news);
			tx.commit();
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}
}
