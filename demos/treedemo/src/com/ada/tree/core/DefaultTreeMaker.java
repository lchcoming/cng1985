/** 
 * CopyRright (c)1985-20102009:ada.young <br />                             
 * Project: treedemo<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:package com.ada.tree;<br />                             
 * Author：ada.young <br />                  
 * Create Date：  Mar 29, 2010<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:Mar 29, 20102009-10-28        <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */
package com.ada.tree.core;

import java.util.List;

import com.ada.tree.api.NodeMakeBuilder;
import com.ada.tree.api.TreeMakeBuilder;

public class DefaultTreeMaker implements TreeMakeBuilder, NodeMakeBuilder {

	/* (non-Javadoc)
	 * @see com.ada.tree.NodeMakeBuilder#bulid(com.ada.tree.TreeNode)
	 */
	public String bulid(TreeNode root) {
		return null;
	}
	public String bulid() {
		return null;
	}
	public StringBuffer maketree(TreeNode type, String url,
			String target) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<ul>");
		if (type.get_childrenNodes().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ type.getParamid() + "\">");
			buffer.append(type.getName());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ type.getParamid() + "\">");
			buffer.append(type.getName());
			buffer.append("</a>");
			buffer.append("<ul>");
			List<TreeNode> sets = type.get_childrenNodes();
			System.out.println(sets.size());
			for (TreeNode cailiaoZiyuanType : sets) {

				if (cailiaoZiyuanType.get_childrenNodes().size() < 1) {
					buffer.append("<li>");
					buffer.append("<a target=\"" + target + "\" href =\"" + url
							+ cailiaoZiyuanType.getParamid() + "\">");
					buffer.append(cailiaoZiyuanType.getName());
					buffer.append("</a>");
					buffer.append("</li>");
				} else {
					buffer.append("<li>");
					buffer.append("<a target=\"" + target + "\" href =\"" + url
							+ cailiaoZiyuanType.getParamid() + "\">");
					buffer.append(cailiaoZiyuanType.getName());
					buffer.append("</a>");
					buffer.append("<ul>");
					List<TreeNode> ssSet = cailiaoZiyuanType
							.get_childrenNodes();
					for (TreeNode cailiaoZiyuanType2 : ssSet) {
						StringBuffer s = treenode(cailiaoZiyuanType2, url,
								target);
						buffer.append(s);
						// System.out.println("!!!!!!!!!!!!!!!!");
						// buffer.append("<li>");
						// System.out.println(cailiaoZiyuanType2.getCailiaoTypeName());
						// buffer.append(cailiaoZiyuanType2.getCailiaoTypeName());
						// buffer.append("</li>");
						// System.out.println("!!!!!!!!!!!!!!!!");
					}
					buffer.append("</ul>");
					buffer.append("</li>");

				}
			}
			buffer.append("</ul>");

			buffer.append("</li>");
		}
		buffer.append("</ul>");
		return buffer;
	}

	private static StringBuffer treenode(TreeNode cailiaoZiyuanType,
			String url, String target) {
		StringBuffer buffer = new StringBuffer();
		if (cailiaoZiyuanType.get_childrenNodes().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ cailiaoZiyuanType.getParamid() + "\">");
			buffer.append(cailiaoZiyuanType.getName());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ cailiaoZiyuanType.getParamid() + "\">");
			buffer.append(cailiaoZiyuanType.getName());
			buffer.append("</a>");
			buffer.append("<ul>");
			List<TreeNode> ssSet = cailiaoZiyuanType.get_childrenNodes();
			for (TreeNode cailiaoZiyuanType2 : ssSet) {
				StringBuffer s = treenode(cailiaoZiyuanType2, url, target);
				buffer.append(s);
			}
			buffer.append("</ul>");
			buffer.append("</li>");

		}
		return buffer;
	}
	
	
	
	public StringBuffer maketree(TreeNode treenode) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<ul id=\"browser\">");
		//处理只有一个根节点的TreeNode
		if (null==treenode.get_childrenNodes()||treenode.get_childrenNodes().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + treenode.getTarget() + "\" href =\"" + treenode.getTreeNodeURL()
					+ treenode.getParamid() + "\">");
			buffer.append(treenode.getName());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {			
							//处理有多个节点的TreeNode
							buffer.append("<li>");
							buffer.append("<a target=\"" + treenode.getTarget() + "\" href =\"" + treenode.getTreeNodeURL()
									+ treenode.getParamid() + "\">");
							buffer.append(treenode.getName());
							buffer.append("</a>");
							buffer.append("<ul>");
							List<TreeNode> items = treenode.get_childrenNodes();
							for (TreeNode item : items) {
				
								if (item.get_childrenNodes().size() < 1) {
									buffer.append("<li>");
									buffer.append("<a target=\"" + treenode.getTarget() + "\" href =\"" + item.getTreeNodeURL()
											+ item.getParamid() + "\">");
									buffer.append(item.getName());
									buffer.append("</a>");
									buffer.append("</li>");
								} else {
									buffer.append("<li>");
									buffer.append("<a target=\"" + treenode.getTarget() + "\" href =\"" + item.getTreeNodeURL()
											+ item.getParamid() + "\">");
									buffer.append(item.getName());
									buffer.append("</a>");
									buffer.append("<ul>");
									List<TreeNode> ssSet = item
											.get_childrenNodes();
									for (TreeNode cailiaoZiyuanType2 : ssSet) {
										StringBuffer s = treenode(cailiaoZiyuanType2);
										buffer.append(s);
									}
									buffer.append("</ul>");
									buffer.append("</li>");

									}
								}
								buffer.append("</ul>");
					
								buffer.append("</li>");
		}
		buffer.append("</ul>");
		return buffer;
	}

	private static StringBuffer treenode(TreeNode cailiaoZiyuanType) {
		StringBuffer buffer = new StringBuffer();
		if (cailiaoZiyuanType.get_childrenNodes().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + cailiaoZiyuanType.getTarget() + "\" href =\"" + cailiaoZiyuanType.getTreeNodeURL()
					+ cailiaoZiyuanType.getParamid() + "\">");
			buffer.append(cailiaoZiyuanType.getName());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + cailiaoZiyuanType.getTarget() + "\" href =\"" + cailiaoZiyuanType.getTreeNodeURL()
					+ cailiaoZiyuanType.getParamid() + "\">");
			buffer.append(cailiaoZiyuanType.getName());
			buffer.append("</a>");
			buffer.append("<ul>");
			List<TreeNode> childrens = cailiaoZiyuanType.get_childrenNodes();
			for (TreeNode item : childrens) {
				StringBuffer s = treenode(item);
				buffer.append(s);
			}
			buffer.append("</ul>");
			buffer.append("</li>");

		}
		return buffer;
	}
}

