package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Moniteworkmain entity. @author MyEclipse Persistence Tools
 */

public class Moniteworkmain implements java.io.Serializable {

	// Fields

	private String id;
	private String title;
	private String code;
	private String timestr;
	private BigDecimal timeint;
	private String demo3;
	private String demo4;
	private Set moniteworkdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Moniteworkmain() {
	}

	/** full constructor */
	public Moniteworkmain(String title, String code, String timestr,
			BigDecimal timeint, String demo3, String demo4,
			Set moniteworkdetails) {
		this.title = title;
		this.code = code;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo3 = demo3;
		this.demo4 = demo4;
		this.moniteworkdetails = moniteworkdetails;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public Set getMoniteworkdetails() {
		return this.moniteworkdetails;
	}

	public void setMoniteworkdetails(Set moniteworkdetails) {
		this.moniteworkdetails = moniteworkdetails;
	}

}