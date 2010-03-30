package com.gete.framework.tree;

import sunw.io.Serializable;

public class Tree implements Serializable{
	//ѡ��Ƿ�Ϊ��ѡ����ѡ��
	private String multiple;
	//����ͼ��ʾͼ��
	private String icon;
	//�ڵ�չ����ʾͼ��
	private String openIcon;
	private String url;
	private String target;
	//��ڵ㼯�϶���
	private Object treeNodes;
	
	public Tree(){
	}
	public Tree(Object treeNodes){
		this(treeNodes,"","","","","");
	}
	
	public Tree(Object treeNodes,String multiple){
		this(treeNodes,multiple,"","","","");
	}

	public Tree(Object treeNodes,String icon,String openIcon){
		this(treeNodes,"",icon,openIcon,"","");
	}
		
	public Tree(Object treeNodes,String multiple,String icon,String openIcon){
		this(treeNodes,multiple,icon,openIcon,"","");
	}
	
	public Tree(Object treeNodes,String multiple,String icon,String openIcon,String url,String target){
		this.treeNodes = treeNodes;
		this.multiple = multiple;
		this.icon = icon;
		this.openIcon = openIcon;
		this.url = url;
		this.target = target;
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
	public String getMultiple() {
		return multiple;
	}

	/**
	 * @return
	 */
	public String getOpenIcon() {
		return openIcon;
	}

	/**
	 * @return
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * @return
	 */
	public Object getTreeNodes() {
		return treeNodes;
	}

	/**
	 * @return
	 */
	public String getUrl() {
		return url;
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
	public void setMultiple(String string) {
		multiple = string;
	}

	/**
	 * @param string
	 */
	public void setOpenIcon(String string) {
		openIcon = string;
	}

	/**
	 * @param string
	 */
	public void setTarget(String string) {
		target = string;
	}

	/**
	 * @param object
	 */
	public void setTreeNodes(Object object) {
		treeNodes = object;
	}

	/**
	 * @param string
	 */
	public void setUrl(String string) {
		url = string;
	}

}
