/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao.factory<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-5<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-5        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao.factory;

import javax.jdo.PersistenceManager;
import javax.persistence.EntityManager;

import com.ada.data.manager.EMF;
import com.ada.data.manager.PMF;

public class DataFactory {
	public synchronized PersistenceManager createPersistenceManager() {
		return PMF.get().getPersistenceManagerProxy();
	}

	public synchronized EntityManager createEntityManager() {
		return EMF.get().createEntityManager();
	}
}
