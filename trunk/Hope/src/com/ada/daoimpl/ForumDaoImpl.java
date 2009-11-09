package com.ada.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.ada.dao.core.EMFDaoImpl;
import com.ada.data.manager.*;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import com.ada.model.Forum;

public class ForumDaoImpl  {

	public void addForum(Forum forum) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		// Transaction tx=pm.currentTransaction();

		try {

			// tx.begin();
			pm.makePersistent(forum);
			// tx.commit();
		} finally {
			pm.close();
			// tx.rollback();
		}
	}

	public void updateForum(Forum forum) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			Transaction tx = pm.currentTransaction();
			tx.begin();
			Forum f = pm.getObjectById(Forum.class, forum.getId());
			tx.commit();
		} finally {
			pm.close();
		}
	}

	public void deleteForum(Forum forum) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			Transaction tx = pm.currentTransaction();
			tx.begin();
			pm.deletePersistent(forum);
			tx.commit();
		} finally {
			pm.close();
		}
	}

	private static List<Forum> fs;

	public List<Forum> allForum() {
		if (fs == null) {
			PersistenceManager pm = PMF.get().getPersistenceManager();
			Extent<Forum> ex = pm.getExtent(Forum.class);
			fs = new ArrayList<Forum>();
			for (Forum item : ex) {
				Forum forum = item;
				fs.add(forum);
			}
			if (!pm.isClosed()) {
				pm.close();
			}
		}

		return fs;
	}

	public Forum findbyid(long id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Forum ff = pm.getObjectById(Forum.class, id);
		if (!pm.isClosed()) {
			pm.close();
		}
		return ff;
	}
}
