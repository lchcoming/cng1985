/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.tree;<br />                             
 * Author��ada.young <br />                  
 * Create Date��  Mar 29, 2010<br />   
 * Modified By��ada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.tree.core;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {

	//�ڵ���
	private String paramid;
	//�ڵ���
	private String name;
	//�ڵ�URL
	private String treeNodeURL;
	//���ڵ�
	private TreeNode _parsent;
	//�ӽڵ�
	private List<TreeNode> _childrenNodes;
    //���ڴ򿪷�ʽ
	public TreeNode(){
		_childrenNodes=new ArrayList<TreeNode>();
		paramid="";
		name="";
		treeNodeURL="";
	}
	private String target;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TreeNode get_parsent() {
		return _parsent;
	}

	public void set_parsent(TreeNode _parsent) {
		this._parsent = _parsent;
	}

	public List<TreeNode> get_childrenNodes() {
		return _childrenNodes;
	}

	public void set_childrenNodes(List<TreeNode> nodes) {
		_childrenNodes = nodes;
	}

	public String getTreeNodeURL() {
		return treeNodeURL;
	}

	public void setTreeNodeURL(String treeNodeURL) {
		this.treeNodeURL = treeNodeURL;
	}

	public String getParamid() {
		return paramid;
	}

	public void setParamid(String paramid) {
		this.paramid = paramid;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
