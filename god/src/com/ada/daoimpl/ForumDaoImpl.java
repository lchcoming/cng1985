package com.ada.daoimpl;

import java.util.ArrayList;
import java.util.List;

import com.ada.dao.ForumDao;
import com.ada.data.manager.*;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import com.ada.model.Forum;

public class ForumDaoImpl implements ForumDao {

	public void addForum(Forum forum) {
		PersistenceManager pm =PMF.get().getPersistenceManager();
		//Transaction tx=pm.currentTransaction();
		
		try{
			
			//tx.begin();
			pm.makePersistent(forum);
			//tx.commit();
		}
		finally{
			pm.close();
			//tx.rollback();
		}
	}

	public void updateForum(Forum forum) {
		PersistenceManager pm =PMF.get().getPersistenceManager();
		try{
			Transaction tx=pm.currentTransaction();
			tx.begin();
			Forum f=pm.getObjectById(Forum.class,forum.getId());
			tx.commit();
		}
		finally{
			pm.close();
		}
	}

	public void deleteForum(Forum forum) {
		PersistenceManager pm =PMF.get().getPersistenceManager();
		try{
			Transaction tx=pm.currentTransaction();
			tx.begin();
			pm.deletePersistent(forum);
			tx.commit();
		}
		finally{
			pm.close();
		}
	}
    public List<Forum> allForum(){
    	PersistenceManager pm=PMF.get().getPersistenceManager();
    	Extent ex= 	pm.getExtent(Forum.class);
    	List<Forum> fs=new ArrayList<Forum>();
    	for(Object item:ex){
    		Forum forum=(Forum)item;
    		fs.add(forum);
    	}
    	return fs;
    }
    public Forum findbyid(long id){
    	PersistenceManager pm=PMF.get().getPersistenceManager();
    	Forum ff=pm.getObjectById(Forum.class,id);
    	return ff;
    }
}
