package com.ada.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Tree entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Tree implements java.io.Serializable {

	// Fields

	private Integer id;
	private Tree tree;
	private String treename;
	private Date updatetime;
	private Set trees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Tree() {
	}

	/** full constructor */
	public Tree(Tree tree, String treename, Date updatetime, Set trees) {
		this.tree = tree;
		this.treename = treename;
		this.updatetime = updatetime;
		this.trees = trees;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Tree getTree() {
		return this.tree;
	}

	public void setTree(Tree tree) {
		this.tree = tree;
	}

	public String getTreename() {
		return this.treename;
	}

	public void setTreename(String treename) {
		this.treename = treename;
	}

	public Date getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(Date updatetime) {
		this.updatetime = updatetime;
	}

	public Set getTrees() {
		return this.trees;
	}

	public void setTrees(Set trees) {
		this.trees = trees;
	}

}