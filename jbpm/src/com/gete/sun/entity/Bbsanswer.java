package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Bbsanswer entity. @author MyEclipse Persistence Tools
 */

public class Bbsanswer implements java.io.Serializable {

	// Fields

	private String id;
	private Bbsask bbsask;
	private User user;
	private String content;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;

	// Constructors

	/** default constructor */
	public Bbsanswer() {
	}

	/** full constructor */
	public Bbsanswer(Bbsask bbsask, User user, String content, String timestr,
			BigDecimal timeint, String demo1, String demo2) {
		this.bbsask = bbsask;
		this.user = user;
		this.content = content;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Bbsask getBbsask() {
		return this.bbsask;
	}

	public void setBbsask(Bbsask bbsask) {
		this.bbsask = bbsask;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

}