package com.ada.entity;

/**
 * BpmdefinitionDev entity. @author MyEclipse Persistence Tools
 */

public class BpmdefinitionDev implements java.io.Serializable {

	// Fields

	private BpmdefinitionDevId id;

	// Constructors

	/** default constructor */
	public BpmdefinitionDev() {
	}

	/** full constructor */
	public BpmdefinitionDev(BpmdefinitionDevId id) {
		this.id = id;
	}

	// Property accessors

	public BpmdefinitionDevId getId() {
		return this.id;
	}

	public void setId(BpmdefinitionDevId id) {
		this.id = id;
	}

}