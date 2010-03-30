package com.ada.entity;

/** 
 * CopyRright (c)1985-2009: <br />                             
 * Project: Sun_ps<br />                                           
 * Module ID:    <br />   
 * Comments:            <br />                                  
 * JDK version used:<JDK1.6><br />                                 
 * Namespace:com.gete.sunps.cailiaoziyuantype.vo<br />                             
 * Author：ada.young <br />                  
 * Create Date�?  2009-10-20<br />   
 * Modified By：ada.young          <br />                                
 * Modified Date:2009-10-20          <br />                               
 * Why & What is modified <br />   
 * Version: 1.01         <br />       
 */

import java.util.List;

import com.gete.framework.tree.TreeNode;


public class CailiaoZiyuanTypeVo  {
	private CailiaoZiyuanType cailiaoZiyuanType;
    private List<TreeNode> treenodes;
	private List<CailiaoZiyuanType> cailiaoZiyuanTypes;
    private String trees;  
	public String getTrees() {
		return trees;
	}

	public void setTrees(String trees) {
		this.trees = trees;
	}

	

	public CailiaoZiyuanType getCailiaoZiyuanType() {
		return cailiaoZiyuanType;
	}

	public List<CailiaoZiyuanType> getCailiaoZiyuanTypes() {
		return cailiaoZiyuanTypes;
	}
	
	public List<TreeNode> getTreenodes() {
		return treenodes;
	}

	public void setCailiaoZiyuanType(CailiaoZiyuanType cailiaoZiyuanType) {
		this.cailiaoZiyuanType = cailiaoZiyuanType;
	}
	public void setCailiaoZiyuanTypes(List<CailiaoZiyuanType> cailiaoZiyuanTypes) {
		this.cailiaoZiyuanTypes = cailiaoZiyuanTypes;
	}

	

	public void setTreenodes(List<TreeNode> treenodes) {
		this.treenodes = treenodes;
		
	}
}
