package com.gete.sun.entity;

import java.sql.Timestamp;

/**
 * JbpmHistActinst entity. @author MyEclipse Persistence Tools
 */

public class JbpmHistActinst implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmHistProcinst jbpmHistProcinst;
	private JbpmActivity jbpmActivity;
	private String class_;
	private Integer dbversion;
	private String execution;
	private String activityName;
	private Timestamp start;
	private Timestamp end;
	private Long duration;
	private String transition;
	private String assignee;

	// Constructors

	/** default constructor */
	public JbpmHistActinst() {
	}

	/** minimal constructor */
	public JbpmHistActinst(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmHistActinst(JbpmHistProcinst jbpmHistProcinst,
			JbpmActivity jbpmActivity, String class_, Integer dbversion,
			String execution, String activityName, Timestamp start,
			Timestamp end, Long duration, String transition, String assignee) {
		this.jbpmHistProcinst = jbpmHistProcinst;
		this.jbpmActivity = jbpmActivity;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.execution = execution;
		this.activityName = activityName;
		this.start = start;
		this.end = end;
		this.duration = duration;
		this.transition = transition;
		this.assignee = assignee;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmHistProcinst getJbpmHistProcinst() {
		return this.jbpmHistProcinst;
	}

	public void setJbpmHistProcinst(JbpmHistProcinst jbpmHistProcinst) {
		this.jbpmHistProcinst = jbpmHistProcinst;
	}

	public JbpmActivity getJbpmActivity() {
		return this.jbpmActivity;
	}

	public void setJbpmActivity(JbpmActivity jbpmActivity) {
		this.jbpmActivity = jbpmActivity;
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

	public String getExecution() {
		return this.execution;
	}

	public void setExecution(String execution) {
		this.execution = execution;
	}

	public String getActivityName() {
		return this.activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public Timestamp getStart() {
		return this.start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getEnd() {
		return this.end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getTransition() {
		return this.transition;
	}

	public void setTransition(String transition) {
		this.transition = transition;
	}

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

}