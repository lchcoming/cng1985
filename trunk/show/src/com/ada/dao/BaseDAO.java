/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: show<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-13<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-13        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;


public interface BaseDAO<T> {
	 T save(T obj);
	
	 void add(T obj);

	 void delete(T obj);
	
     void deleteAll(Collection collection);

	 void delete(String hql);

	 void update(T obj);

	 void saveOrUpdate(T obj);
	
     void saveOrUpdateAll(Collection collection);

	 T findById(Class c, Serializable id);
	
	 T getById(String clazz, Serializable id);

	 List find(String hql);

	// 获得Hibernate中的一个session
	 Session openSession();

	// 得到总数
	 double getCount(String hql);
	
	 
	 List getList(String hql);
 
     Long getCountRecord(String hql);
}
