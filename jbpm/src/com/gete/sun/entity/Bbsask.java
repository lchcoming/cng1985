package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Bbsask entity. @author MyEclipse Persistence Tools
 */

public class Bbsask implements java.io.Serializable {

	// Fields

	private String id;
	private Bbsborder bbsborder;
	private User user;
	private String content;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private Set bbsanswers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bbsask() {
	}

	/** full constructor */
	public Bbsask(Bbsborder bbsborder, User user, String content,
			String timestr, BigDecimal timeint, String demo1, String demo2,
			Set bbsanswers) {
		this.bbsborder = bbsborder;
		this.user = user;
		this.content = content;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.bbsanswers = bbsanswers;
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

	public Set getBbsanswers() {
		return this.bbsanswers;
	}

	public void setBbsanswers(Set bbsanswers) {
		this.bbsanswers = bbsanswers;
	}

}