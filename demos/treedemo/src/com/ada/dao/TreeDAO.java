/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dao;

import java.util.List;

import com.ada.entity.Tree;

<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 29, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao;

import java.util.List;

import com.ada.entity.Tree;

public interface TreeDAO {

	void save(Tree transientInstance);

	void delete(Tree persistentInstance);

	Tree findById(java.lang.Integer id);

	List findByExample(Tree instance);

	List findByProperty(String propertyName, Object value);

	List findByTreename(Object treename);

	List findAll();

	Tree merge(Tree detachedInstance);

	void attachDirty(Tree instance);

	void attachClean(Tree instance);

}
