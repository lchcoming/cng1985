/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.service;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 29, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.service;

import com.ada.dao.TreeDAO;
import com.ada.entity.Tree;

public class TreeServiceImpl implements TreeService {
	private TreeDAO treeDAO;

	public TreeDAO getTreeDAO() {
		return treeDAO;
	}

	public void setTreeDAO(TreeDAO treeDAO) {
		this.treeDAO = treeDAO;
	}
	public Tree getTreeById(int id){
		Tree tree=	treeDAO.findById(id);
		return tree;
	}
}
