/** 
 * CopyRright (c)1985-2009:ada.young <br />                             
 * Project: Hope<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.ada.service.impl<br />                             
 * Author：ada.young <br />                  
 * Create Date：  2009-11-1<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-11-1        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.service.impl;

import com.ada.data.adapter.ArticleEMFAdapter;
import com.ada.data.page.Pager;
import com.ada.model.Article;
import com.ada.service.ArticleService;

public class ArticleServiceImpl implements ArticleService{

	public static Pager pager;
	public static Pager getpage() {
		if(null==pager){
			initData();
		}
		return pager;
	}
	public static void initData(){
		ArticleEMFAdapter e=new ArticleEMFAdapter();
		String hql="select from " + Article.class.getName();
		hql+=" order by date desc ";
		pager=e.getpage(hql, 1, 15);
	}
}
