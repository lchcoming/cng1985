package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Borderinfo entity. @author MyEclipse Persistence Tools
 */

public class Borderinfo implements java.io.Serializable {

	// Fields

	private String id;
	private String title;
	private String content;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;

	// Constructors

	/** default constructor */
	public Borderinfo() {
	}

	/** full constructor */
	public Borderinfo(String title, String content, String timestr,
			BigDecimal timeint, String demo1, String demo2) {
		this.title = title;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
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