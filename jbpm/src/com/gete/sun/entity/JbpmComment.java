package com.gete.sun.entity;

import java.sql.Timestamp;

/**
 * JbpmComment entity. @author MyEclipse Persistence Tools
 */

public class JbpmComment implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Taskimpl taskimpl;
	private String class_;
	private Integer dbversion;
	private String userid;
	private Timestamp time;
	private String message;
	private Long parent;
	private Integer parentIdx;
	private Integer taskIdx;

	// Constructors

	/** default constructor */
	public JbpmComment() {
	}

	/** minimal constructor */
	public JbpmComment(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmComment(Taskimpl taskimpl, String class_, Integer dbversion,
			String userid, Timestamp time, String message, Long parent,
			Integer parentIdx, Integer taskIdx) {
		this.taskimpl = taskimpl;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.userid = userid;
		this.time = time;
		this.message = message;
		this.parent = parent;
		this.parentIdx = parentIdx;
		this.taskIdx = taskIdx;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public Taskimpl getTaskimpl() {
		return this.taskimpl;
	}

	public void setTaskimpl(Taskimpl taskimpl) {
		this.taskimpl = taskimpl;
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

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getParent() {
		return this.parent;
	}

	public void setParent(Long parent) {
		this.parent = parent;
	}

	public Integer getParentIdx() {
		return this.parentIdx;
	}

	public void setParentIdx(Integer parentIdx) {
		this.parentIdx = parentIdx;
	}

	public Integer getTaskIdx() {
		return this.taskIdx;
	}

	public void setTaskIdx(Integer taskIdx) {
		this.taskIdx = taskIdx;
	}

}