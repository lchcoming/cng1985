/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-1<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-1        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ada.data.manager.EMF;
import com.ada.data.page.PageBean;
import com.ada.data.page.Pager;

public class EMFDaoImpl {
	public void add(Object entity) {
	
		EntityManager em = EMF.get().createEntityManager();
		try {
			em.persist(entity);
		} finally {
			em.close();
		}
	}
	 public Pager getpage(String hql, int currentPage, int pageSize){
		  int totalRows = 0;
			List resultList = null;
			PageBean pager = null;
			 EntityManager em = EMF.get().createEntityManager();
			Query query = em.createQuery(hql);
			totalRows = (query.getResultList().size()); // 取得总计录数

			pager = new PageBean(pageSize, currentPage, totalRows);
			// 从当前页记录数开始

			query.setFirstResult((pager.getCurrentPage() - 1) * pageSize);
			// 取出pageSize个记录

			query.setMaxResults(pager.getPageSize());
			if (query.getResultList().size() > 0) {
				resultList = query.getResultList();
				resultList.size();
			}
			// 把分页查询的结果和对象放入PagerResult中

			Pager pagerResult = new Pager();
			pagerResult.setPageBean(pager);
			pagerResult.setResultList(resultList);
			if(em.isOpen()){
				em.close();
			}
			
			return pagerResult;
	  }
}
