package com.gete.sun.entity;

import java.sql.Timestamp;

/**
 * JbpmJob entity. @author MyEclipse Persistence Tools
 */

public class JbpmJob implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmActivity jbpmActivity;
	private JbpmExecution jbpmExecutionByProcessinstance;
	private JbpmDescriptor jbpmDescriptor;
	private JbpmExecution jbpmExecutionByExecution;
	private String class_;
	private Integer dbversion;
	private Timestamp duedate;
	private Boolean issuspended;
	private Boolean isexclusive;
	private String lockowner;
	private Timestamp lockexptime;
	private String info;
	private String exception;
	private Integer retries;
	private String signal;
	private String event;
	private String repeat;

	// Constructors

	/** default constructor */
	public JbpmJob() {
	}

	/** minimal constructor */
	public JbpmJob(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmJob(JbpmActivity jbpmActivity,
			JbpmExecution jbpmExecutionByProcessinstance,
			JbpmDescriptor jbpmDescriptor,
			JbpmExecution jbpmExecutionByExecution, String class_,
			Integer dbversion, Timestamp duedate, Boolean issuspended,
			Boolean isexclusive, String lockowner, Timestamp lockexptime,
			String info, String exception, Integer retries, String signal,
			String event, String repeat) {
		this.jbpmActivity = jbpmActivity;
		this.jbpmExecutionByProcessinstance = jbpmExecutionByProcessinstance;
		this.jbpmDescriptor = jbpmDescriptor;
		this.jbpmExecutionByExecution = jbpmExecutionByExecution;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.duedate = duedate;
		this.issuspended = issuspended;
		this.isexclusive = isexclusive;
		this.lockowner = lockowner;
		this.lockexptime = lockexptime;
		this.info = info;
		this.exception = exception;
		this.retries = retries;
		this.signal = signal;
		this.event = event;
		this.repeat = repeat;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmActivity getJbpmActivity() {
		return this.jbpmActivity;
	}

	public void setJbpmActivity(JbpmActivity jbpmActivity) {
		this.jbpmActivity = jbpmActivity;
	}

	public JbpmExecution getJbpmExecutionByProcessinstance() {
		return this.jbpmExecutionByProcessinstance;
	}

	public void setJbpmExecutionByProcessinstance(
			JbpmExecution jbpmExecutionByProcessinstance) {
		this.jbpmExecutionByProcessinstance = jbpmExecutionByProcessinstance;
	}

	public JbpmDescriptor getJbpmDescriptor() {
		return this.jbpmDescriptor;
	}

	public void setJbpmDescriptor(JbpmDescriptor jbpmDescriptor) {
		this.jbpmDescriptor = jbpmDescriptor;
	}

	public JbpmExecution getJbpmExecutionByExecution() {
		return this.jbpmExecutionByExecution;
	}

	public void setJbpmExecutionByExecution(
			JbpmExecution jbpmExecutionByExecution) {
		this.jbpmExecutionByExecution = jbpmExecutionByExecution;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public Timestamp getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Timestamp duedate) {
		this.duedate = duedate;
	}

	public Boolean getIssuspended() {
		return this.issuspended;
	}

	public void setIssuspended(Boolean issuspended) {
		this.issuspended = issuspended;
	}

	public Boolean getIsexclusive() {
		return this.isexclusive;
	}

	public void setIsexclusive(Boolean isexclusive) {
		this.isexclusive = isexclusive;
	}

	public String getLockowner() {
		return this.lockowner;
	}

	public void setLockowner(String lockowner) {
		this.lockowner = lockowner;
	}

	public Timestamp getLockexptime() {
		return this.lockexptime;
	}

	public void setLockexptime(Timestamp lockexptime) {
		this.lockexptime = lockexptime;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	public Integer getRetries() {
		return this.retries;
	}

	public void setRetries(Integer retries) {
		this.retries = retries;
	}

	public String getSignal() {
		return this.signal;
	}

	public void setSignal(String signal) {
		this.signal = signal;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getRepeat() {
		return this.repeat;
	}

	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}

}