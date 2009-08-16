package com.ada.daoimpl;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;

import com.ada.dao.BaseDao;
import com.ada.data.manager.PMF;
import com.ada.news.model.Discuss;

public class DiscussDaoImpl extends BaseDao<Discuss> {
public List<Discuss> all(){
	PersistenceManager pm = PMF.get().getPersistenceManager();
	List<Discuss> result = new LinkedList<Discuss>();
	Extent<Discuss> newst = pm.getExtent(Discuss.class);
	for (Discuss item : newst) {
		result.add(item);
	}
	return result;
}
}
