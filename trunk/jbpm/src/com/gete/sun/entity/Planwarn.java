package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Planwarn entity. @author MyEclipse Persistence Tools
 */

public class Planwarn implements java.io.Serializable {

	// Fields

	private String id;
	private Contribute contribute;
	private User user;
	private String plantype;
	private String year;
	private String week;
	private String month;
	private String timestr;
	private BigDecimal timeint;

	// Constructors

	/** default constructor */
	public Planwarn() {
	}

	/** minimal constructor */
	public Planwarn(Contribute contribute, User user) {
		this.contribute = contribute;
		this.user = user;
	}

	/** full constructor */
	public Planwarn(Contribute contribute, User user, String plantype,
			String year, String week, String month, String timestr,
			BigDecimal timeint) {
		this.contribute = contribute;
		this.user = user;
		this.plantype = plantype;
		this.year = year;
		this.week = week;
		this.month = month;
		this.timestr = timestr;
		this.timeint = timeint;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Contribute getContribute() {
		return this.contribute;
	}

	public void setContribute(Contribute contribute) {
		this.contribute = contribute;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPlantype() {
		return this.plantype;
	}

	public void setPlantype(String plantype) {
		this.plantype = plantype;
	}

	public String getYear() {
		return this.year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getMonth() {
		return this.month;
	}

	public void setMonth(String month) {
		this.month = month;
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

}