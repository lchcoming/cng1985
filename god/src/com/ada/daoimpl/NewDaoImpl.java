package com.ada.daoimpl;

import java.util.LinkedList;
import java.util.List;

import javax.jdo.Extent;
import javax.jdo.PersistenceManager;
import javax.jdo.Transaction;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ada.dao.BaseDao;
import com.ada.data.manager.EMF;
import com.ada.data.manager.PMF;
import com.ada.news.model.Discuss;
import com.ada.news.model.News;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.helper.PageBean;
import com.helper.PageResult;

public class NewDaoImpl extends BaseDao<News> {

	public News findbyid(Long id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		//pm.setDetachAllOnCommit(true);
		News news=new News();
	   // try {
	    	news= pm.getObjectById(News.class,id);
//	     news.setVisit(ns.getVisit());
//	     news.setTitle(ns.getTitle());
//	     news.setDetails(ns.getDetails());
//	     news.setDilist(ns.getDilist());
//	     news.setId(ns.getId());
//	     news.setPutime(ns.getPutime());
	   // } finally {
	     pm.close();
	   // }
	    return news;
	}

	public News visit(Long id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Transaction tx = pm.currentTransaction();
		tx.begin();
		News news =  pm.getObjectById(News.class,id);
		long visit = news.getVisit();
		news.setVisit(visit + 1);
		
		tx.commit();
		try {
		} finally {
			if (tx.isActive()) {
				tx.rollback();
			}
			news.getDetails();
			news.getDilist().size();
			for (Discuss it : news.getDilist()) {
				System.out.println(it.getContent());
			}
			System.out.println(news.getDilist().size());
			pm.close();
		}
		
		return news;
	}

	public PageResult<News> pagework(String where, String currentPage,
			String pagerMethod, int pageSize) {
		int totalRows = 0;
		List<News> resultList = null;
		PageBean pager = null;
		EntityManager em = EMF.get().createEntityManager();
		Query query = em.createQuery(where);
		totalRows = (query.getResultList()).size(); // 取得总计录数

		pager = new PageBean(totalRows, pageSize);
		// 如果当前页号为空，表示为首次查询该页
		// 如果不为空，则刷新pager对象，输入当前页号等信息
		if (currentPage != null) {
			pager.refresh(Integer.parseInt(currentPage));
		}

		// 获取当前执行的方法，首页，前一页，后一页，尾页。

		if (pagerMethod != null) {
			if (pagerMethod.equals("first")) {
				pager.first();
			} else if (pagerMethod.equals("previous")) {
				pager.previous();
			} else if (pagerMethod.equals("next")) {
				pager.next();
			} else if (pagerMethod.equals("last")) {
				pager.last();
			}
		}
		// 从当前页记录数开始

		query.setFirstResult(pager.getStartRow());
		// 取出pageSize个记录

		query.setMaxResults(pager.getPageSize());
		if (query.getResultList().size() > 0) {
			resultList = query.getResultList();
		}
		// 把分页查询的结果和对象放入PagerResult中

		PageResult<News> pagerResult = new PageResult<News>();
		pagerResult.setPageBean(pager);
		pagerResult.setResultList(resultList);
		return pagerResult;
	}

	public List<News> all() {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		List<News> result = new LinkedList<News>();
		Extent<News> newst = pm.getExtent(News.class);
		for (News item : newst) {
			result.add(item);
		}
		pm.close();
		return result;

	}

   public void adddiscuss(Discuss discuss,Long id){
	   PersistenceManager pm = PMF.get().getPersistenceManager();
		//pm.setDetachAllOnCommit(true);
		News news=new News();
	   // try {
	    	news= pm.getObjectById(News.class,id);
	    	news.getDilist().add(discuss);
//	     news.setVisit(ns.getVisit());
//	     news.setTitle(ns.getTitle());
//	     news.setDetails(ns.getDetails());
//	     news.setDilist(ns.getDilist());
//	     news.setId(ns.getId());
//	     news.setPutime(ns.getPutime());
	   // } finally {
	      pm.close();
	   // }
   }
   public void delete(Long id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {

			News	news= pm.getObjectById(News.class,id);
			pm.deletePersistent(news);
		} finally {
			pm.close();
		}
	}

}
