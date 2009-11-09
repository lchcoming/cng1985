package com.ada.daoimpl;

import javax.jdo.PersistenceManager;

import com.ada.data.manager.PMF;
import com.ada.model.Deparment;

public class DeparmentDaoImpl {
public void addDeparment(Deparment dp){
	PersistenceManager pm =PMF.get().getPersistenceManager();
	try{
		
		pm.makePersistent(dp);
	}
	finally{
		pm.close();
	}
}
}
