package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Role entity. @author MyEclipse Persistence Tools
 */

public class Role implements java.io.Serializable {

	// Fields

	private String id;
	private String rolename;
	private String roledetail;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private Set userRoles = new HashSet(0);

	// Constructors

	/** default constructor */
	public Role() {
	}

	/** full constructor */
	public Role(String rolename, String roledetail, String timestr,
			BigDecimal timeint, String demo1, String demo2, Set userRoles) {
		this.rolename = rolename;
		this.roledetail = roledetail;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.userRoles = userRoles;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRolename() {
		return this.rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoledetail() {
		return this.roledetail;
	}

	public void setRoledetail(String roledetail) {
		this.roledetail = roledetail;
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

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

}