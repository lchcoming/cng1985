package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Bbsborder entity. @author MyEclipse Persistence Tools
 */

public class Bbsborder implements java.io.Serializable {

	// Fields

	private String id;
	private Bbsborder bbsborder;
	private String bordername;
	private String borderdetail;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private Set bbsborders = new HashSet(0);
	private Set bbsasks = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bbsborder() {
	}

	/** full constructor */
	public Bbsborder(Bbsborder bbsborder, String bordername,
			String borderdetail, String timestr, BigDecimal timeint,
			String demo1, String demo2, Set bbsborders, Set bbsasks) {
		this.bbsborder = bbsborder;
		this.bordername = bordername;
		this.borderdetail = borderdetail;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.bbsborders = bbsborders;
		this.bbsasks = bbsasks;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bbsborder getBbsborder() {
		return this.bbsborder;
	}

	public void setBbsborder(Bbsborder bbsborder) {
		this.bbsborder = bbsborder;
	}

	public String getBordername() {
		return this.bordername;
	}

	public void setBordername(String bordername) {
		this.bordername = bordername;
	}

	public String getBorderdetail() {
		return this.borderdetail;
	}

	public void setBorderdetail(String borderdetail) {
		this.borderdetail = borderdetail;
	}

	public String getTimestr() {
		return this.timestr;
	}

	public void setTimestr(String timestr) {
		this.timestr = timestr;
	}

	public BigDecimal getTimeint() {
		return this.timeint;
	}

	public void setTimeint(BigDecimal timeint) {
		this.timeint = timeint;
	}

	public String getDemo1() {
		return this.demo1;
	}

	public void setDemo1(String demo1) {
		this.demo1 = demo1;
	}

	public String getDemo2() {
		return this.demo2;
	}

	public void setDemo2(String demo2) {
		this.demo2 = demo2;
	}

	public Set getBbsborders() {
		return this.bbsborders;
	}

	public void setBbsborders(Set bbsborders) {
		this.bbsborders = bbsborders;
	}

	public Set getBbsasks() {
		return this.bbsasks;
	}

	public void setBbsasks(Set bbsasks) {
		this.bbsasks = bbsasks;
	}

}