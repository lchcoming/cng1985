/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao.api<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-5<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-5        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao.api;

import java.util.List;

import com.ada.dao.help.Pager;
import com.ada.model.Article;

public interface ArticleDao {

	void add(Article article);

	void delete(Article article);

	void update(Article article);

	void deleteById(String id);

	Article getById(String id);

	Pager getPager(String hql, int curpage, int pagesize);

	List<Article> list(String hql);
}
