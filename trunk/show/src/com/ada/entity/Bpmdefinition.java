package com.ada.entity;

/**
 * Bpmdefinition entity. @author MyEclipse Persistence Tools
 */

public class Bpmdefinition implements java.io.Serializable {

	// Fields

	private BpmdefinitionId id;

	// Constructors

	/** default constructor */
	public Bpmdefinition() {
	}

	/** full constructor */
	public Bpmdefinition(BpmdefinitionId id) {
		this.id = id;
	}

	// Property accessors

	public BpmdefinitionId getId() {
		return this.id;
	}

	public void setId(BpmdefinitionId id) {
		this.id = id;
	}

}