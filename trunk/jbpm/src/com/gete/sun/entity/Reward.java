package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Reward entity. @author MyEclipse Persistence Tools
 */

public class Reward implements java.io.Serializable {

	// Fields

	private String id;
	private Department department;
	private User user;
	private String reason;
	private String timestr;
	private BigDecimal timeint;
	private Double money;
	private String demo1;
	private String demo2;
	private String title;

	// Constructors

	/** default constructor */
	public Reward() {
	}

	/** full constructor */
	public Reward(Department department, User user, String reason,
			String timestr, BigDecimal timeint, Double money, String demo1,
			String demo2, String title) {
		this.department = department;
		this.user = user;
		this.reason = reason;
		this.timestr = timestr;
		this.timeint = timeint;
		this.money = money;
		this.demo1 = demo1;
		this.demo2 = demo2;
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

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}