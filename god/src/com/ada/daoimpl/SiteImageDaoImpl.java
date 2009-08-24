package com.ada.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;

import com.ada.data.manager.PMF;
import com.ada.news.model.SiteImage;

public class SiteImageDaoImpl {
	public void add(SiteImage image) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			pm.makePersistent(image);
			tx.commit();
		} finally {

			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
	}

	public List<SiteImage> all() {
		List<SiteImage> reuleList = new ArrayList<SiteImage>();
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			Extent<SiteImage> im = pm.getExtent(SiteImage.class);
			tx.commit();
			for (SiteImage siteImage : im) {

				reuleList.add(siteImage);
			}
		} finally {

			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return reuleList;
	}
    public SiteImage getbyid(Long id){
    	PersistenceManager pm = PMF.get().getPersistenceManager();
    	SiteImage rr=new SiteImage();
		Transaction tx = pm.currentTransaction();

		try {
			tx.begin();
			rr=	pm.getObjectById(SiteImage.class,id);
			System.out.println(rr.getImage().getBytes().length);
			tx.commit();
		} finally {

			if (tx.isActive()) {
				tx.rollback();
			}
			pm.close();
		}
		return rr;
    }
}
