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

import java.util.Set;

import com.ada.entity.CailiaoZiyuanType;
import com.ada.entity.CailiaoZiyuanTypeVo;
import com.ada.entity.Tree;
import com.ada.service.TreeService;
import com.ada.tree.api.TreeMakeBuilder;

public class DataTreeMaker implements TreeMakeBuilder {
	private TreeService treeService;
	public TreeService getTreeService() {
		return treeService;
	}
	public void setTreeService(TreeService treeService) {
		this.treeService = treeService;
	}
	public String bulid() {
		// TODO Auto-generated method stub
		return maketree("datatree.action?id=","cai").toString();
	}
	public StringBuffer maketree(String url,
			String target) {
		StringBuffer buffer = new StringBuffer();
		buffer.append("<ul id=\"tree\">");
		
		
		Tree type = treeService.getTreeById(1);
		
		
		if (type.getTrees().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ type.getId().toString() + "\">");
			buffer.append(type.getTreename());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ type.getId().toString() + "\">");
			buffer.append(type.getTreename());
			buffer.append("</a>");
			buffer.append("<ul>");
			Set<Tree> sets = type.getTrees();
			for (Tree cailiaoZiyuanType : sets) {

				if (cailiaoZiyuanType.getTrees().size() < 1) {
					buffer.append("<li>");
					buffer.append("<a target=\"" + target + "\" href =\"" + url
							+ cailiaoZiyuanType.getId().toString() + "\">");
					buffer.append(cailiaoZiyuanType.getTreename());
					buffer.append("</a>");
					buffer.append("</li>");
				} else {
					buffer.append("<li>");
					buffer.append("<a target=\"" + target + "\" href =\"" + url
							+ cailiaoZiyuanType.getId().toString() + "\">");
					buffer.append(cailiaoZiyuanType.getTreename());
					buffer.append("</a>");
					buffer.append("<ul>");
					Set<Tree> ssSet = cailiaoZiyuanType
							.getTrees();
					for (Tree cailiaoZiyuanType2 : ssSet) {
						StringBuffer s = treenode(cailiaoZiyuanType2, url,
								target);
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

	private static StringBuffer treenode(Tree cailiaoZiyuanType,
			String url, String target) {
		StringBuffer buffer = new StringBuffer();
		if (cailiaoZiyuanType.getTrees().size() < 1) {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ cailiaoZiyuanType.getId().toString() + "\">");
			buffer.append(cailiaoZiyuanType.getTreename());
			buffer.append("</a>");
			buffer.append("</li>");
		} else {
			buffer.append("<li>");
			buffer.append("<a target=\"" + target + "\" href =\"" + url
					+ cailiaoZiyuanType.getId().toString() + "\">");
			buffer.append(cailiaoZiyuanType.getTreename());
			buffer.append("</a>");
			buffer.append("<ul>");
			Set<Tree> ssSet = cailiaoZiyuanType.getTrees();
			for (Tree cailiaoZiyuanType2 : ssSet) {
				StringBuffer s = treenode(cailiaoZiyuanType2, url, target);
				buffer.append(s);
			}
			buffer.append("</ul>");
			buffer.append("</li>");

		}
		return buffer;
	}
}

