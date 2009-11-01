package com.ada.dao;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

import com.ada.data.manager.PMF;

public class BaseDao<T extends Object> {
	public void add(T entity) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(entity);
		} finally {
			pm.close();
		}
	}

	public T findbyid(Long id, Class<T> arg0) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		// Object item = pm.getObjectById(id);
		T item = pm.getObjectById(arg0, id);
		return item;
	}

	public List<T> all() {

		PersistenceManager pm = PMF.get().getPersistenceManager();
		Query query = pm.newQuery("");
		return (List<T>) query.execute();

	}
}
