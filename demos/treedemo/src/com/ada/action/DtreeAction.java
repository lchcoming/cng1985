/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.action;<br />                             
 * Author£ºada.young <br />                  
 * Create Date£º  Mar 31, 2010<br />   
 * Modified By£ºada.young          <br />                                
 * Modified Date:Mar 31, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.action;

import com.ada.dtree.api.NodeBuilder;
import com.ada.dtree.api.TreeMaker;
import com.ada.dtree.core.TreeMakerImpl;

public class DtreeAction {
	private String trees;
    private NodeBuilder builder;
    private TreeMaker maker;
	public String getTrees() {
		return trees;
	}
public NodeBuilder getBuilder() {
		return builder;
	}
	public void setBuilder(NodeBuilder builder) {
		this.builder = builder;
	}
public DtreeAction(){
	maker = new TreeMakerImpl();
}
	public void setTrees(String trees) {
		this.trees = trees;
	}

	public String work() {
		trees=maker.make(builder);
		return "success";
	}
}
