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
package com.ada.dao.spring;

import java.util.List;

import org.springframework.orm.jdo.support.JdoDaoSupport;

import com.ada.dao.api.ArticleDao;
import com.ada.dao.help.Pager;
import com.ada.model.Article;

public class ArticleDaoImpl extends JdoDaoSupport implements ArticleDao{

	@Override
	public void add(Article article) {
		this.getJdoTemplate().makePersistent(article);
		
	}

	@Override
	public void delete(Article article) {
		this.getJdoTemplate().deletePersistent(article);
		
	}

	@Override
	public void deleteById(String id) {
		
		
	}

	@Override
	public void getById(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pager getPager(String hql, int curpage, int pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Article> list(String hql) {
		this.getJdoTemplate().find(hql);
		return null;
	}

	@Override
	public void update(Article article) {
		// TODO Auto-generated method stub
		
	}

}
