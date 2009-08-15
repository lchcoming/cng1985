package com.ada.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import com.ada.data.manager.PMF;
import com.ada.model.ForumMessage;

public class ForumMessageDaoImpl {
	public void addForumMessage(ForumMessage message) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			Transaction tx = pm.currentTransaction();
			tx.begin();
			pm.makePersistent(message);
			tx.commit();
		} finally {
			pm.close();
		}
	}

	public List<ForumMessage> all() {
		PersistenceManager manager = PMF.get().getPersistenceManager();
		Extent ex = manager.getExtent(ForumMessage.class);
		List<ForumMessage> msgs = new ArrayList<ForumMessage>();
		for (Object item : ex) {
			ForumMessage fm = (ForumMessage) item;
			msgs.add(fm);
		}
		if (!manager.isClosed()) {
			manager.close();
		}
		return msgs;
	}

	public ForumMessage findbyid(Long id) {
		PersistenceManager manager = PMF.get().getPersistenceManager();
		Object fm = manager.getObjectById(ForumMessage.class, id);
		if (fm != null) {
			return (ForumMessage) fm;
		} else {
			return null;
		}
	}

	public List<ForumMessage> findbyforumid(String forumid) {
		PersistenceManager manager = PMF.get().getPersistenceManager();
		try {
			String sql = "select from " + ForumMessage.class.getName();
			sql += " where forumid == " + forumid;
			Query query = manager.newQuery(sql);
			Object result = query.execute();
			List<ForumMessage> ss=(List<ForumMessage>) result;
			ss.size();
			return ss;
		} finally {
			manager.close();
		}
	}

}
