package com.ada.bulider;
import java.util.ArrayList;
import java.util.List;

import com.ada.entity.Tree;
import com.gete.framework.tree.TreeMakeBuilder;
import com.gete.framework.tree.TreeNode;


public class TreeBuilder implements TreeMakeBuilder {
/* (non-Javadoc)
 * @see com.ada.bulider.TreeMakeBuilder#bulider(java.util.List)
 */
public List<TreeNode> bulider(){
	List<Tree> tree=new ArrayList<Tree>();
	List<TreeNode> trees = new ArrayList<TreeNode>();
	TreeNode treeNode;
	for (Tree companyType : tree) {
		treeNode = new TreeNode(companyType.getId().toString(),
				companyType.getTreename(), (companyType
						.getTree() == null ? "" : companyType
						.getTree().getId().toString()));
		//根据不同的条件添加不同的URl地址
			treeNode.setTreeNodeURL("companyDetailList.action?vo.parentId=");
		
		trees.add(treeNode);
	}
	return trees;
}
}

