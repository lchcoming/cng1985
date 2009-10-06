package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Contactgroup entity. @author MyEclipse Persistence Tools
 */

public class Contactgroup implements java.io.Serializable {

	// Fields

	private String id;
	private User user;
	private String name;
	private String timestr;
	private BigDecimal timeint;
	private Set usercontacts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Contactgroup() {
	}

	/** full constructor */
	public Contactgroup(User user, String name, String timestr,
			BigDecimal timeint, Set usercontacts) {
		this.user = user;
		this.name = name;
		this.timestr = timestr;
		this.timeint = timeint;
		this.usercontacts = usercontacts;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Set getUsercontacts() {
		return this.usercontacts;
	}

	public void setUsercontacts(Set usercontacts) {
		this.usercontacts = usercontacts;
	}

}