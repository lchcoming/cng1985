package com.ada.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.Transaction;

import com.ada.data.manager.PMF;
import com.ada.model.ForumMessage;
import com.ada.model.ForumRMessage;

public class ForumRMessageDaoImpl {
	public void addForumRMessage(ForumRMessage message) {
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
   public List<ForumRMessage> all(){
	   PersistenceManager pm=PMF.get().getPersistenceManager();
	  Extent ex=pm.getExtent(ForumRMessage.class);
	  List<ForumRMessage>  result=new ArrayList<ForumRMessage>();
	  for(Object item:ex){
		  ForumRMessage m=(ForumRMessage)item;
		  result.add(m);
	  }
	  if (!pm.isClosed()) {
		  pm.close();
		}
	  return result;
   }
   public List<ForumRMessage> findbyid(String id){
	   PersistenceManager manager = PMF.get().getPersistenceManager();
		try {
			String sql = "select from " + ForumRMessage.class.getName();
			sql += " where messageid == " + id;
			Query query = manager.newQuery(sql);
			Object result = query.execute();
			List<ForumRMessage> ss=(List<ForumRMessage>) result;
			ss.size();
			return ss;
		} finally {
			manager.close();
		}
   }
}
