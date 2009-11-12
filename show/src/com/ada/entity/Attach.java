package com.ada.entity;

/**
 * Attach entity. @author MyEclipse Persistence Tools
 */

public class Attach implements java.io.Serializable {

	// Fields

	private AttachId id;

	// Constructors

	/** default constructor */
	public Attach() {
	}

	/** full constructor */
	public Attach(AttachId id) {
		this.id = id;
	}

	// Property accessors

	public AttachId getId() {
		return this.id;
	}

	public void setId(AttachId id) {
		this.id = id;
	}

}