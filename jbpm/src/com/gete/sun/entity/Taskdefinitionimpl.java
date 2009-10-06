package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Taskdefinitionimpl entity. @author MyEclipse Persistence Tools
 */

public class Taskdefinitionimpl implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Taskdefinitionimpl taskdefinitionimpl;
	private Swimlanedefinitionimpl swimlanedefinitionimpl;
	private JbpmDescriptor jbpmDescriptor;
	private String class_;
	private Integer dbversion;
	private String name;
	private String descr;
	private Integer priority;
	private String duedate;
	private Boolean block;
	private Boolean signal;
	private String assigneeExpr;
	private String candidatesExpr;
	private Integer taskdefIdx;
	private Set taskdefinitionimpls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Taskdefinitionimpl() {
	}

	/** minimal constructor */
	public Taskdefinitionimpl(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Taskdefinitionimpl(Taskdefinitionimpl taskdefinitionimpl,
			Swimlanedefinitionimpl swimlanedefinitionimpl,
			JbpmDescriptor jbpmDescriptor, String class_, Integer dbversion,
			String name, String descr, Integer priority, String duedate,
			Boolean block, Boolean signal, String assigneeExpr,
			String candidatesExpr, Integer taskdefIdx, Set taskdefinitionimpls) {
		this.taskdefinitionimpl = taskdefinitionimpl;
		this.swimlanedefinitionimpl = swimlanedefinitionimpl;
		this.jbpmDescriptor = jbpmDescriptor;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.name = name;
		this.descr = descr;
		this.priority = priority;
		this.duedate = duedate;
		this.block = block;
		this.signal = signal;
		this.assigneeExpr = assigneeExpr;
		this.candidatesExpr = candidatesExpr;
		this.taskdefIdx = taskdefIdx;
		this.taskdefinitionimpls = taskdefinitionimpls;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public Taskdefinitionimpl getTaskdefinitionimpl() {
		return this.taskdefinitionimpl;
	}

	public void setTaskdefinitionimpl(Taskdefinitionimpl taskdefinitionimpl) {
		this.taskdefinitionimpl = taskdefinitionimpl;
	}

	public Swimlanedefinitionimpl getSwimlanedefinitionimpl() {
		return this.swimlanedefinitionimpl;
	}

	public void setSwimlanedefinitionimpl(
			Swimlanedefinitionimpl swimlanedefinitionimpl) {
		this.swimlanedefinitionimpl = swimlanedefinitionimpl;
	}

	public JbpmDescriptor getJbpmDescriptor() {
		return this.jbpmDescriptor;
	}

	public void setJbpmDescriptor(JbpmDescriptor jbpmDescriptor) {
		this.jbpmDescriptor = jbpmDescriptor;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public String getDuedate() {
		return this.duedate;
	}

	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}

	public Boolean getBlock() {
		return this.block;
	}

	public void setBlock(Boolean block) {
		this.block = block;
	}

	public Boolean getSignal() {
		return this.signal;
	}

	public void setSignal(Boolean signal) {
		this.signal = signal;
	}

	public String getAssigneeExpr() {
		return this.assigneeExpr;
	}

	public void setAssigneeExpr(String assigneeExpr) {
		this.assigneeExpr = assigneeExpr;
	}

	public String getCandidatesExpr() {
		return this.candidatesExpr;
	}

	public void setCandidatesExpr(String candidatesExpr) {
		this.candidatesExpr = candidatesExpr;
	}

	public Integer getTaskdefIdx() {
		return this.taskdefIdx;
	}

	public void setTaskdefIdx(Integer taskdefIdx) {
		this.taskdefIdx = taskdefIdx;
	}

	public Set getTaskdefinitionimpls() {
		return this.taskdefinitionimpls;
	}

	public void setTaskdefinitionimpls(Set taskdefinitionimpls) {
		this.taskdefinitionimpls = taskdefinitionimpls;
	}

}