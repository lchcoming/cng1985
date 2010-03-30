/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.action;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 30, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 30, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import com.ada.service.TreeService;
import com.ada.tree.api.TreeMakeBuilder;

public class DataTreeAction {
	private TreeMakeBuilder treeMakeBuilder;
	private TreeService treeService;
	private String trees;

	public String getTrees() {
		return trees;
	}

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTrees(String trees) {
		this.trees = trees;
	}

	public String work() {
		
		trees = treeMakeBuilder.bulid();
		if(null!=type){
			if(type.equals("1")){
				return "datasuccess";
			}
			else{
				return "success";
			}
		}
		else{
			return "success";
		}
		
	}

	public TreeService getTreeService() {
		return treeService;
	}

	public void setTreeService(TreeService treeService) {
		this.treeService = treeService;
	}

	public TreeMakeBuilder getTreeMakeBuilder() {
		return treeMakeBuilder;
	}

	public void setTreeMakeBuilder(TreeMakeBuilder treeMakeBuilder) {
		this.treeMakeBuilder = treeMakeBuilder;
	}
}
