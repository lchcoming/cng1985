package com.ada.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Navigate entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class Navigate implements java.io.Serializable {

	// Fields

	private Integer id;
	private Navigate navigate;
	private String title;
	private Integer number;
	private Integer leaf;
	private String url;
	private Set navigates = new HashSet(0);

	// Constructors

	/** default constructor */
	public Navigate() {
	}

	/** full constructor */
	public Navigate(Navigate navigate, String title, Integer number,
			Integer leaf, String url, Set navigates) {
		this.navigate = navigate;
		this.title = title;
		this.number = number;
		this.leaf = leaf;
		this.url = url;
		this.navigates = navigates;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Navigate getNavigate() {
		return this.navigate;
	}

	public void setNavigate(Navigate navigate) {
		this.navigate = navigate;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Integer getLeaf() {
		return this.leaf;
	}

	public void setLeaf(Integer leaf) {
		this.leaf = leaf;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Set getNavigates() {
		return this.navigates;
	}

	public void setNavigates(Set navigates) {
		this.navigates = navigates;
	}

}