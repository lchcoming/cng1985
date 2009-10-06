package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private String id;
	private String depname;
	private String depdetail;
	private String depcode;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private Set waichus = new HashSet(0);
	private Set rewards = new HashSet(0);
	private Set contributes = new HashSet(0);
	private Set users = new HashSet(0);
	private Set moneyplans = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** full constructor */
	public Department(String depname, String depdetail, String depcode,
			String timestr, BigDecimal timeint, String demo1, String demo2,
			Set waichus, Set rewards, Set contributes, Set users, Set moneyplans) {
		this.depname = depname;
		this.depdetail = depdetail;
		this.depcode = depcode;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.waichus = waichus;
		this.rewards = rewards;
		this.contributes = contributes;
		this.users = users;
		this.moneyplans = moneyplans;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepname() {
		return this.depname;
	}

	public void setDepname(String depname) {
		this.depname = depname;
	}

	public String getDepdetail() {
		return this.depdetail;
	}

	public void setDepdetail(String depdetail) {
		this.depdetail = depdetail;
	}

	public String getDepcode() {
		return this.depcode;
	}

	public void setDepcode(String depcode) {
		this.depcode = depcode;
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

	public Set getWaichus() {
		return this.waichus;
	}

	public void setWaichus(Set waichus) {
		this.waichus = waichus;
	}

	public Set getRewards() {
		return this.rewards;
	}

	public void setRewards(Set rewards) {
		this.rewards = rewards;
	}

	public Set getContributes() {
		return this.contributes;
	}

	public void setContributes(Set contributes) {
		this.contributes = contributes;
	}

	public Set getUsers() {
		return this.users;
	}

	public void setUsers(Set users) {
		this.users = users;
	}

	public Set getMoneyplans() {
		return this.moneyplans;
	}

	public void setMoneyplans(Set moneyplans) {
		this.moneyplans = moneyplans;
	}

}