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

import com.ada.dao.api.ArticleDao;
import com.ada.dao.help.Pager;
import com.ada.data.manager.PMF;
import com.ada.model.Article;

public class ArticleDaoImpl {
	private Logger logger = Logger.getLogger("ArticleDaoImpl");

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
		// TODO Auto-generated method stub
		return null;
	}

	public List<Article> list(String hql) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Article article) {
		// TODO Auto-generated method stub

	}

}
