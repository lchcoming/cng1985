/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.dtree.demo;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 31, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.dtree.demo;

import java.util.ArrayList;
import java.util.List;

import com.ada.dtree.core.TreeNode;
import com.ada.dwr.Navigate;

public class DemoMaker {
	public List<TreeNode> nodes() {
		NavigateDao dao=NavigateDao.getInstanece();
		List<Navigate> list=	dao.listall();
		List<TreeNode> nodes=new ArrayList<TreeNode>();
		for(Navigate item:list){
			TreeNode	node=new TreeNode();
			node.setId(item.getId());
			node.setPid(item.getParentId());
			node.setName(item.getTitle());
			node.setUrl(item.getUrl());
			nodes.add(node);
		}
		return nodes;
	}
}
