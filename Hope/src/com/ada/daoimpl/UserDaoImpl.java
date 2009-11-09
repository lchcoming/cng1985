package com.ada.daoimpl;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.ada.data.manager.EMF;
import com.ada.data.manager.PMF;
import com.ada.model.UserInfo;

public class UserDaoImpl {
	public void addUser(UserInfo user) {
		PersistenceManager em = PMF.get().getPersistenceManager();
		try {
			
			em.makePersistent(user);
		} finally {
			em.close();
		}
	}
	public List<UserInfo> all(){
		List<UserInfo> rr=new LinkedList<UserInfo>();
		PersistenceManager em=PMF.get().getPersistenceManager();
		Extent ex=em.getExtent(UserInfo.class);
		for(Object item:ex){
			rr.add((UserInfo)item);
		}
		return rr;
	}
}
