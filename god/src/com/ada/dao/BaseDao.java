package com.ada.dao;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;
import javax.servlet.jsp.tagext.TryCatchFinally;

import com.ada.data.manager.PMF;
import com.ada.model.UserInfo;

public class BaseDao<T extends Object> {
	public void add(T entity) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		try {
			pm.makePersistent(entity);
	     tx.commit();
		} finally {
			if(tx.isActive()){
				tx.rollback();
			}
			pm.close();
		}
	}

//	public void delete(T entity) {
//		PersistenceManager pm = PMF.get().getPersistenceManager();
//		try {
//			pm.deletePersistent(entity);
//		} finally {
//			pm.close();
//		}
//	}

	protected T findbyid(Long id, Class<T> arg0) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		T item = null;
		try {
			item = pm.getObjectById(arg0, id);
		} finally {
			pm.close();
		}
		// Object item = pm.getObjectById(id);

		return item;
	}
	// public List<T> all(){
	// List<T> rr=new LinkedList<T>();
	// PersistenceManager em=PMF.get().getPersistenceManager();
	// T ex=em.getExtent(T.class);
	// for(T item:ex){
	// rr.add(item);
	// }
	// return rr;
	// }
}
