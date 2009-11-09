package com.ada.data.adapter;

import java.util.List;

import com.ada.data.manager.PMF;

import javax.jdo.PersistenceManager;
import com.ada.model.RMessage;

public class RMessageAdapter {
public void addRMessage(RMessage msg){
	PersistenceManager pm = PMF.get().getPersistenceManager();
    try {
      pm.makePersistent(msg);
    } finally {
      pm.close();
    }
}
public List<RMessage> findArticle(String query) {
	PersistenceManager pm = PMF.get().getPersistenceManager();
	try {
		List<RMessage> flights = (List<RMessage>) pm.newQuery(query)
				.execute();
		// Force all results to be pulled back before we close the entity
		// manager.
		// We could have also called pm.detachCopyAll()
		flights.size();
		return flights;
	} finally {
		pm.close();
	}
}
}
