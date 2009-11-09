/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Sun_PS<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.gete.sunps.page<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-10-28<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.data.page;

import java.io.Serializable;

public class PagerVo implements Serializable {
	
	
	
	private String id;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int currentPage;

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	private Pager pager;

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}
}
