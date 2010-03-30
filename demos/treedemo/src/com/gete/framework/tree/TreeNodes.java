package com.gete.framework.tree;

import java.util.*;

import org.apache.log4j.Logger;

public class TreeNodes {
	private static Logger loger = Logger.getLogger(TreeNodes.class);
	private static List treeNodesList;
	private static Map treeNodesMap;
	private static int size;
	private static TreeNodes instance;
	
	static {
		instance = new TreeNodes();
		treeNodesList = new ArrayList();
		treeNodesMap = new HashMap();
		size = 0;
	}
	
	public TreeNodes(){}
	
	public static TreeNodes getInstance(){
		return instance;
	}
	
	public void add(Object key,Object value){
		Object obj = treeNodesMap.put(key,String.valueOf(++size));
		if(obj == null){
			treeNodesList.add(value); 
		}
	}
	
	public Object set(Object key,Object value){
		int index = indexOf(key);
		if(index >= 0){
			try{
				return treeNodesList.set(index,value);
			}catch(Exception e){
				loger.info("\n"+e.getMessage()+"\n");
				return null;
			}
		}
		return null;
	}
	
	public Object set(int index,Object value){
		if(index >= 0 && index <= size){
			try{
				return treeNodesList.set(index,value);
			}catch(Exception e){
				loger.info("\n"+e.getMessage()+"\n");
				return null;
			}
		}
		return null;
	}
	
	public Object get(int index){
		if(index >size || index < 0)return null;
		return treeNodesList.get(index);
	}
	
	public Object get(Object key){
		int index = indexOf(key);
		if(index >= 0){
			try{
				return treeNodesList.get(index);
			}catch(Exception e){
				loger.info("\n"+e.getMessage()+"\n");
				return null;
			}
		}
		return null;
	}
	
	public int size(){
		return size;
	}

	public int indexOf(Object key){
		String strIndex = (String)treeNodesMap.get(key);
		if(strIndex != null && !strIndex.equals("")){
			try{
				int index = Integer.parseInt(strIndex);
				return index;
			}catch(Exception e){
				loger.info("\n"+e.getMessage()+"\n");
				return -1;
			}
		}
		return -1;
	}
	
	public boolean isEmpty(){
		return treeNodesList.isEmpty();
	}
	
	public void clear(){
		treeNodesList.clear();
		treeNodesMap.clear();
		size = 0;
	}
	
	public Object remove(Object key){
		int index = indexOf(key);
		if(index >= 0){
			try{
				Object obj = treeNodesList.remove(index);
				treeNodesMap.remove(key);
				return obj;
			}catch(Exception e){
				loger.info("\n"+e.getMessage()+"\n");
				return null;
			}
		}
		return null;
	}
	
	public List list(){
		return treeNodesList;
	}
}
