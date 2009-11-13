/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao.emf<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-5<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-5        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao.pmf;

import java.util.List;
import java.util.logging.Logger;

import javax.jdo.PersistenceManager;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.ada.dao.api.ArticleDao;
import com.ada.dao.help.EntityManagerHelper;
import com.ada.dao.help.PageBean;
import com.ada.dao.help.Pager;
import com.ada.data.manager.EMF;
import com.ada.data.manager.PMF;
import com.ada.model.Article;

public class ArticleDaoImpl implements ArticleDao {
	private Logger logger = Logger.getLogger("ArticleDaoImpl");
	private static List temp;

	public void add(Article article) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		try {
			pm.makePersistent(article);
		} finally {
			pm.close();
		}

	}

	public void delete(Article article) {
		// TODO Auto-generated method stub

	}

	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

	public Article getById(String id) {
		PersistenceManager pm = PMF.get().getPersistenceManager();
		Article item = null;
		try {
			item = pm.getObjectById(Article.class, id);
		} catch (Exception e) {
			logger.severe(e.getMessage());
		} finally {
			pm.close();
		}

		return item;

	}

	public Pager getPager(String hql, int curpage, int pagesize) {
		int totalRows = 0;
		List resultList = null;
		PageBean pager = null;
		
		// 如果缓存中有就从缓存中取数据
		if (temp == null) {
			
			EntityManager em = EntityManagerHelper.getEntityManager();
			Query query = em.createQuery(hql);
			temp = query.getResultList();
			temp.size();
			logger.info("初始化数据");
			if (em.isOpen()) {
				em.close();
				logger.info("关闭会话");
			}
		}

		totalRows = (temp.size()); // 取得总计录数

		pager = new PageBean(pagesize, curpage, totalRows);
		if (temp.size() > 1) {
			resultList = temp.subList(pager.getStartRow(), pager.getEndRow());
		}
		Pager pagerResult = new Pager();
		pagerResult.setPageBean(pager);
		pagerResult.setResultList(resultList);
		
		return pagerResult;
	}

	public List<Article> list(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Article article) {
		// TODO Auto-generated method stub

	}

}
