package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Bargaintype entity. @author MyEclipse Persistence Tools
 */

public class Bargaintype implements java.io.Serializable {

	// Fields

	private Integer bargaintypeId;
	private String name;
	private Set bargains = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bargaintype() {
	}

	/** full constructor */
	public Bargaintype(String name, Set bargains) {
		this.name = name;
		this.bargains = bargains;
	}

	// Property accessors

	public Integer getBargaintypeId() {
		return this.bargaintypeId;
	}

	public void setBargaintypeId(Integer bargaintypeId) {
		this.bargaintypeId = bargaintypeId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBargains() {
		return this.bargains;
	}

	public void setBargains(Set bargains) {
		this.bargains = bargains;
	}

}