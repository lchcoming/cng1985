package com.ada.daoimpl;

import com.ada.data.manager.PMF;

import java.util.List;

import javax.jdo.PersistenceManager;

import com.ada.dao.core.DataDao;
import com.ada.model.Article;
import com.google.appengine.api.datastore.Text;



public class ArticleDaoImpl implements DataDao {

	@Override
	public void addObject(Object object) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    try {
	      pm.makePersistent(object);
	    } finally {
	      pm.close();
	    }

	}

	@Override
	public void deleteObject(Object object) {
		
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    try {
	    	String key="";
	      Article f = pm.getObjectById(Article.class, key);
	      pm.deletePersistent(f);
	    } finally {
	      if (pm.currentTransaction().isActive()) {
	        pm.currentTransaction().rollback();
	      }
	      pm.close();
	    }

	}

	@Override
	public List findObject(String sql) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    try {
	      List<Article> flights = (List<Article>) pm.newQuery(sql).execute();
	      // Force all results to be pulled back before we close the entity manager.
	      // We could have also called pm.detachCopyAll() 
	      flights.size();
	      return flights;
	    } finally {
	      pm.close();
	    }
	}

	@Override
	public void updateObject(Object object) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
	    try {
	    	String key="";
	    	Article f = pm.getObjectById(Article.class, key);
	      f.setContent(new Text("a"));
	      f.setSubject("");
	    } finally {
	      pm.close();
	    }

	}

}
