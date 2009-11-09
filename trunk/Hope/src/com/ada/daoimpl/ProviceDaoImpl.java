package com.ada.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;

import com.ada.data.manager.PMF;
import com.ada.world.model.Provice;

public class ProviceDaoImpl {
	public List<Provice> all() {
		List<Provice> ps = new ArrayList<Provice>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Extent<Provice> ex = pm.getExtent(Provice.class);
		for(Provice item:ex){
			ps.add(item);
		}
        return ps;
	}
}
