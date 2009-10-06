package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Waichu entity. @author MyEclipse Persistence Tools
 */

public class Waichu implements java.io.Serializable {

	// Fields

	private String id;
	private Department department;
	private User user;
	private String reason;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private String startimestr;
	private BigDecimal startimeint;
	private String endtimestr;
	private BigDecimal endtimeint;
	private String title;

	// Constructors

	/** default constructor */
	public Waichu() {
	}

	/** minimal constructor */
	public Waichu(User user, String title) {
		this.user = user;
		this.title = title;
	}

	/** full constructor */
	public Waichu(Department department, User user, String reason,
			String timestr, BigDecimal timeint, String demo1, String demo2,
			String startimestr, BigDecimal startimeint, String endtimestr,
			BigDecimal endtimeint, String title) {
		this.department = department;
		this.user = user;
		this.reason = reason;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.startimestr = startimestr;
		this.startimeint = startimeint;
		this.endtimestr = endtimestr;
		this.endtimeint = endtimeint;
		this.title = title;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
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

	public String getStartimestr() {
		return this.startimestr;
	}

	public void setStartimestr(String startimestr) {
		this.startimestr = startimestr;
	}

	public BigDecimal getStartimeint() {
		return this.startimeint;
	}

	public void setStartimeint(BigDecimal startimeint) {
		this.startimeint = startimeint;
	}

	public String getEndtimestr() {
		return this.endtimestr;
	}

	public void setEndtimestr(String endtimestr) {
		this.endtimestr = endtimestr;
	}

	public BigDecimal getEndtimeint() {
		return this.endtimeint;
	}

	public void setEndtimeint(BigDecimal endtimeint) {
		this.endtimeint = endtimeint;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}