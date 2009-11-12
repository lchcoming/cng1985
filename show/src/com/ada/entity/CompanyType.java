package com.ada.entity;

/**
 * CompanyType entity. @author MyEclipse Persistence Tools
 */

public class CompanyType implements java.io.Serializable {

	// Fields

	private CompanyTypeId id;

	// Constructors

	/** default constructor */
	public CompanyType() {
	}

	/** full constructor */
	public CompanyType(CompanyTypeId id) {
		this.id = id;
	}

	// Property accessors

	public CompanyTypeId getId() {
		return this.id;
	}

	public void setId(CompanyTypeId id) {
		this.id = id;
	}

}