/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.action;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 29, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import com.ada.tree.core.DefaultTreeMaker;
import com.ada.tree.core.TreeNode;

public class TreeAction {
	private String trees;

	public String getTrees() {
		return trees;
	}

	public void setTrees(String trees) {
		this.trees = trees;
	}

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String work() {
		DefaultTreeMaker maker = new DefaultTreeMaker();
		TreeNode node = new TreeNode();
		node.setTarget("self");
		node.setName("adadsafds");
		node.setTreeNodeURL("#");
		TreeNode node1 = new TreeNode();
		node1.setTarget("self");
		node1.setName("adasdfsdf");
		node1.setTreeNodeURL("#");
		node.get_childrenNodes().add(node1);
		node.get_childrenNodes().add(node1);
		node.get_childrenNodes().add(node1);
		node.get_childrenNodes().add(node1);
		node.get_childrenNodes().add(node1);
		node.get_childrenNodes().add(node1);
		trees = maker.maketree(node).toString();
		return "success";
	}
}
