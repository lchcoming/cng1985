/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.dao<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-4<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-4        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dao.core;

import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import com.ada.data.manager.PMF;
import com.ada.data.page.PageBean;
import com.ada.data.page.Pager;

public class PMFDaoImpl {
	@SuppressWarnings("unchecked")
	public Pager getpage(String hql, int currentPage, int pageSize) {
		List resultList = null;
		PageBean pager = null;
		PersistenceManager manager = PMF.get().getPersistenceManager();
		try {

			Query query = manager.newQuery(hql);
			// query.setRange(arg0, arg1)
			Object result = query.execute();
			resultList = (List) result;
			pager = new PageBean(pageSize, currentPage, resultList.size());
			resultList.size();

		} finally {
			manager.close();
		}

		Pager pagerResult = new Pager();
		pagerResult.setPageBean(pager);
		if (pager.getTotalRows() > 1) {
			System.out.println("getTotalRows" + pager.getTotalRows());
			System.out.println("star" + pager.getStartRow());
			System.out.println("end" + pager.getEndRow());
			pagerResult.setResultList(resultList.subList(pager.getStartRow(),
					pager.getEndRow()));

		}
		if (!manager.isClosed()) {
			manager.close();
		}

		return pagerResult;
	}
}
