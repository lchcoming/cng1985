package com.jeeny.core;

import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.jdo.PersistenceManagerFactory;

import com.jeeny.helper.PMF;

public class BaseDAOImpl implements BaseDAO {
private Logger logger=Logger.getLogger(getClass().getName()); 
	public void add(Object o) {
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager m = factory.getPersistenceManager();
		try {
			m.makePersistent(o);
		} catch (Exception e) {
			logger.severe(e.getMessage());
		} finally {
			factory.close();
		}

	}
	public void delete(Object o) {
		PersistenceManagerFactory factory = PMF.get();
		PersistenceManager m = factory.getPersistenceManager();
		try {
			m.deletePersistent(m);
		} catch (Exception e) {
			logger.severe(e.getMessage());
		} finally {
			factory.close();
		}

	}
}
