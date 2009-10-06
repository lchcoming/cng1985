package com.gete.sun.entity;

import java.sql.Timestamp;

/**
 * JbpmTimerdef entity. @author MyEclipse Persistence Tools
 */

public class JbpmTimerdef implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmProcess jbpmProcess;
	private JbpmActivity jbpmActivity;
	private Integer dbversion;
	private String duedatedescr;
	private String repeat;
	private Boolean isexcl;
	private Integer retries;
	private String event;
	private String signal;
	private Timestamp duedate;

	// Constructors

	/** default constructor */
	public JbpmTimerdef() {
	}

	/** minimal constructor */
	public JbpmTimerdef(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmTimerdef(JbpmProcess jbpmProcess, JbpmActivity jbpmActivity,
			Integer dbversion, String duedatedescr, String repeat,
			Boolean isexcl, Integer retries, String event, String signal,
			Timestamp duedate) {
		this.jbpmProcess = jbpmProcess;
		this.jbpmActivity = jbpmActivity;
		this.dbversion = dbversion;
		this.duedatedescr = duedatedescr;
		this.repeat = repeat;
		this.isexcl = isexcl;
		this.retries = retries;
		this.event = event;
		this.signal = signal;
		this.duedate = duedate;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmProcess getJbpmProcess() {
		return this.jbpmProcess;
	}

	public void setJbpmProcess(JbpmProcess jbpmProcess) {
		this.jbpmProcess = jbpmProcess;
	}

	public JbpmActivity getJbpmActivity() {
		return this.jbpmActivity;
	}

	public void setJbpmActivity(JbpmActivity jbpmActivity) {
		this.jbpmActivity = jbpmActivity;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getDuedatedescr() {
		return this.duedatedescr;
	}

	public void setDuedatedescr(String duedatedescr) {
		this.duedatedescr = duedatedescr;
	}

	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

	public Boolean getIsexcl() {
		return this.isexcl;
	}

	public void setIsexcl(Boolean isexcl) {
		this.isexcl = isexcl;
	}

	public Integer getRetries() {
		return this.retries;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getSignal() {
		return this.signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	public Timestamp getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Timestamp duedate) {
		this.duedate = duedate;
	}

}