package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Companystructure entity. @author MyEclipse Persistence Tools
 */

public class Companystructure implements java.io.Serializable {

	// Fields

	private String id;
	private String type;
	private String content;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private String demo3;
	private String demo4;

	// Constructors

	/** default constructor */
	public Companystructure() {
	}

	/** full constructor */
	public Companystructure(String type, String content, String timestr,
			BigDecimal timeint, String demo1, String demo2, String demo3,
			String demo4) {
		this.type = type;
		this.content = content;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.demo3 = demo3;
		this.demo4 = demo4;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
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

	public String getDemo3() {
		return this.demo3;
	}

	public void setDemo3(String demo3) {
		this.demo3 = demo3;
	}

	public String getDemo4() {
		return this.demo4;
	}

	public void setDemo4(String demo4) {
		this.demo4 = demo4;
	}

}