package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Advise entity. @author MyEclipse Persistence Tools
 */

public class Advise implements java.io.Serializable {

	// Fields

	private String id;
	private User userByReceiverid;
	private User userBySendiuserd;
	private String title;
	private String isread;
	private String content;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;

	// Constructors

	/** default constructor */
	public Advise() {
	}

	/** full constructor */
	public Advise(User userByReceiverid, User userBySendiuserd, String title,
			String isread, String content, String timestr, BigDecimal timeint,
			String demo1, String demo2) {
		this.userByReceiverid = userByReceiverid;
		this.userBySendiuserd = userBySendiuserd;
		this.title = title;
		this.isread = isread;
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

	public User getUserByReceiverid() {
		return this.userByReceiverid;
	}

	public void setUserByReceiverid(User userByReceiverid) {
		this.userByReceiverid = userByReceiverid;
	}

	public User getUserBySendiuserd() {
		return this.userBySendiuserd;
	}

	public void setUserBySendiuserd(User userBySendiuserd) {
		this.userBySendiuserd = userBySendiuserd;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsread() {
		return this.isread;
	}

	public void setIsread(String isread) {
		this.isread = isread;
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