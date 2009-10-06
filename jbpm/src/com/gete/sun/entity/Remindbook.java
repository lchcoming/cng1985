package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Remindbook entity. @author MyEclipse Persistence Tools
 */

public class Remindbook implements java.io.Serializable {

	// Fields

	private String id;
	private User user;
	private String title;
	private String remindtime;
	private String content;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private String type;
	private String weather;
	private String mood;

	// Constructors

	/** default constructor */
	public Remindbook() {
	}

	/** full constructor */
	public Remindbook(User user, String title, String remindtime,
			String content, String timestr, BigDecimal timeint, String demo1,
			String demo2, String type, String weather, String mood) {
		this.user = user;
		this.title = title;
		this.remindtime = remindtime;
		this.content = content;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.type = type;
		this.weather = weather;
		this.mood = mood;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRemindtime() {
		return this.remindtime;
	}

	public void setRemindtime(String remindtime) {
		this.remindtime = remindtime;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getWeather() {
		return this.weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getMood() {
		return this.mood;
	}

	public void setMood(String mood) {
		this.mood = mood;
	}

}