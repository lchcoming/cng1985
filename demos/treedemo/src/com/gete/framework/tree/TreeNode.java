package com.gete.framework.tree;

import java.util.*;
import java.io.Serializable;

public class TreeNode implements Serializable{

  /*��ڵ����*/
  private String treeNodeName;
  /*��ڵ��ʶ��*/
  private String parentTreeNodeID;
  /*��ڵ��ʶ��*/
  private String treeNodeKey;

  private String treeNodeID;
  /*��ڵ���*/
  /*��ڵ㳬l��*/
  private String treeNodeURL;
  /*��ڵ�����*/
  private String treeNodeType;
  /*��ڵ�ͼ��*/
  private String icon;
  /*��ڵ�չ��ͼ��*/
  private String openIcon;
  
  //ѡ��Ƿ�Ϊ��ѡ����ѡ��
  private String multiple;
  
  
  /*��ڵ��Ƿ�ѡ������ڵ���ж�ѡ��ѡ��ʱʹ��*/
  private boolean folder = false;

  public TreeNode() {
  }

  public TreeNode(String treeNodeID, String treeNodeName,
                  String parentTreeNodeID) {
    this.treeNodeID = treeNodeID;
    this.treeNodeName = treeNodeName;
    this.parentTreeNodeID = parentTreeNodeID;
  }
  
  public TreeNode(String treeNodeID, String treeNodeName,
				  String parentTreeNodeID,String multiple) {
	this.treeNodeID = treeNodeID;
	this.treeNodeName = treeNodeName;
	this.parentTreeNodeID = parentTreeNodeID;
	this.multiple = multiple;
  }
  
  public TreeNode(String treeNodeID, String treeNodeName,
				  String parentTreeNodeID,String icon,String openIcon) {
	this.treeNodeID = treeNodeID;
	this.treeNodeName = treeNodeName;
	this.parentTreeNodeID = parentTreeNodeID;
	this.icon = icon;
	this.openIcon = openIcon;
  }
  public TreeNode(String treeNodeID, String treeNodeName,
                  String parentTreeNodeID,String multiple,boolean isFolder) {
    this.treeNodeID = treeNodeID;
    this.treeNodeName = treeNodeName;
    this.parentTreeNodeID = parentTreeNodeID;
	this.multiple = multiple;
    this.folder = isFolder;
  }

  public String getParentTreeNodeID() {
    return parentTreeNodeID;
  }

  public String getTreeNodeKey() {
    return treeNodeKey;
  }

  public String getTreeNodeID() {
    return treeNodeID;
  }

  public String getTreeNodeName() {
    return treeNodeName;
  }

  public void setTreeNodeName(String treeNodeName) {
    this.treeNodeName = treeNodeName;
  }

  public void setTreeNodeKey(String treeNodeKey) {
    this.treeNodeKey = treeNodeKey;
  }

  public void setTreeNodeID(String treeNodeID) {
    this.treeNodeID = treeNodeID;
  }

  public void setParentTreeNodeID(String parentTreeNodeID) {
    this.parentTreeNodeID = parentTreeNodeID;
  }

  public String getTreeNodeURL() {
    return treeNodeURL;
  }

  public void setTreeNodeURL(String treeNodeURL) {
    this.treeNodeURL = treeNodeURL;
  }

  public String getTreeNodeType() {
    return treeNodeType;
  }

  public void setTreeNodeType(String treeNodeType) {
    this.treeNodeType = treeNodeType;
  }

  public boolean isFolder() {
    return folder;
  }

  public void setFolder(boolean folder) {
    this.folder = folder;
  }

/**
 * @return
 */
public String getMultiple() {
	return multiple;
}

/**
 * @param string
 */
public void setMultiple(String string) {
	multiple = string;
}

/**
 * @return
 */
public String getIcon() {
	return icon;
}

/**
 * @return
 */
public String getOpenIcon() {
	return openIcon;
}

/**
 * @param string
 */
public void setIcon(String string) {
	icon = string;
}

/**
 * @param string
 */
public void setOpenIcon(String string) {
	openIcon = string;
}

}
