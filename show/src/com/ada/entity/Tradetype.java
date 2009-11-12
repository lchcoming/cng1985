package com.ada.entity;

/**
 * Tradetype entity. @author MyEclipse Persistence Tools
 */

public class Tradetype implements java.io.Serializable {

	// Fields

	private TradetypeId id;

	// Constructors

	/** default constructor */
	public Tradetype() {
	}

	/** full constructor */
	public Tradetype(TradetypeId id) {
		this.id = id;
	}

	// Property accessors

	public TradetypeId getId() {
		return this.id;
	}

	public void setId(TradetypeId id) {
		this.id = id;
	}

}