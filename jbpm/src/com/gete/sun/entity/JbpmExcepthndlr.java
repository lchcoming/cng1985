package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmExcepthndlr entity. @author MyEclipse Persistence Tools
 */

public class JbpmExcepthndlr implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmEvent jbpmEvent;
	private JbpmProcess jbpmProcess;
	private JbpmActivity jbpmActivity;
	private JbpmTransition jbpmTransition;
	private Integer dbversion;
	private String exceptClass;
	private Boolean transact;
	private Boolean rethrowMasked;
	private String transitionname;
	private String nodename;
	private Integer processIdx;
	private Integer actIdx;
	private Integer transitionIdx;
	private Integer eventIdx;
	private Set jbpmObjectrefs = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmExcepthndlr() {
	}

	/** minimal constructor */
	public JbpmExcepthndlr(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmExcepthndlr(JbpmEvent jbpmEvent, JbpmProcess jbpmProcess,
			JbpmActivity jbpmActivity, JbpmTransition jbpmTransition,
			Integer dbversion, String exceptClass, Boolean transact,
			Boolean rethrowMasked, String transitionname, String nodename,
			Integer processIdx, Integer actIdx, Integer transitionIdx,
			Integer eventIdx, Set jbpmObjectrefs) {
		this.jbpmEvent = jbpmEvent;
		this.jbpmProcess = jbpmProcess;
		this.jbpmActivity = jbpmActivity;
		this.jbpmTransition = jbpmTransition;
		this.dbversion = dbversion;
		this.exceptClass = exceptClass;
		this.transact = transact;
		this.rethrowMasked = rethrowMasked;
		this.transitionname = transitionname;
		this.nodename = nodename;
		this.processIdx = processIdx;
		this.actIdx = actIdx;
		this.transitionIdx = transitionIdx;
		this.eventIdx = eventIdx;
		this.jbpmObjectrefs = jbpmObjectrefs;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmEvent getJbpmEvent() {
		return this.jbpmEvent;
	}

	public void setJbpmEvent(JbpmEvent jbpmEvent) {
		this.jbpmEvent = jbpmEvent;
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

	public JbpmTransition getJbpmTransition() {
		return this.jbpmTransition;
	}

	public void setJbpmTransition(JbpmTransition jbpmTransition) {
		this.jbpmTransition = jbpmTransition;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getExceptClass() {
		return this.exceptClass;
	}

	public void setExceptClass(String exceptClass) {
		this.exceptClass = exceptClass;
	}

	public Boolean getTransact() {
		return this.transact;
	}

	public void setTransact(Boolean transact) {
		this.transact = transact;
	}

	public Boolean getRethrowMasked() {
		return this.rethrowMasked;
	}

	public void setRethrowMasked(Boolean rethrowMasked) {
		this.rethrowMasked = rethrowMasked;
	}

	public String getTransitionname() {
		return this.transitionname;
	}

	public void setTransitionname(String transitionname) {
		this.transitionname = transitionname;
	}

	public String getNodename() {
		return this.nodename;
	}

	public void setNodename(String nodename) {
		this.nodename = nodename;
	}

	public Integer getProcessIdx() {
		return this.processIdx;
	}

	public void setProcessIdx(Integer processIdx) {
		this.processIdx = processIdx;
	}

	public Integer getActIdx() {
		return this.actIdx;
	}

	public void setActIdx(Integer actIdx) {
		this.actIdx = actIdx;
	}

	public Integer getTransitionIdx() {
		return this.transitionIdx;
	}

	public void setTransitionIdx(Integer transitionIdx) {
		this.transitionIdx = transitionIdx;
	}

	public Integer getEventIdx() {
		return this.eventIdx;
	}

	public void setEventIdx(Integer eventIdx) {
		this.eventIdx = eventIdx;
	}

	public Set getJbpmObjectrefs() {
		return this.jbpmObjectrefs;
	}

	public void setJbpmObjectrefs(Set jbpmObjectrefs) {
		this.jbpmObjectrefs = jbpmObjectrefs;
	}

}