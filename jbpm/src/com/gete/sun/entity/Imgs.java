package com.gete.sun.entity;

/**
 * Imgs entity. @author MyEclipse Persistence Tools
 */

public class Imgs implements java.io.Serializable {

	// Fields

	private ImgsId id;

	// Constructors

	/** default constructor */
	public Imgs() {
	}

	/** full constructor */
	public Imgs(ImgsId id) {
		this.id = id;
	}

	// Property accessors

	public ImgsId getId() {
		return this.id;
	}

	public void setId(ImgsId id) {
		this.id = id;
	}

}