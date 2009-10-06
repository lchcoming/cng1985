package com.gete.sun.entity;

/**
 * JbpmObjectref entity. @author MyEclipse Persistence Tools
 */

public class JbpmObjectref implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmEvent jbpmEvent;
	private JbpmDescriptor jbpmDescriptor;
	private JbpmExcepthndlr jbpmExcepthndlr;
	private String class_;
	private Integer dbversion;
	private String objClass;
	private Long objId;
	private String objExpression;
	private String objExprlang;
	private Boolean propagate;
	private Integer eventIdx;
	private Integer exhndlrIdx;

	// Constructors

	/** default constructor */
	public JbpmObjectref() {
	}

	/** minimal constructor */
	public JbpmObjectref(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmObjectref(JbpmEvent jbpmEvent, JbpmDescriptor jbpmDescriptor,
			JbpmExcepthndlr jbpmExcepthndlr, String class_, Integer dbversion,
			String objClass, Long objId, String objExpression,
			String objExprlang, Boolean propagate, Integer eventIdx,
			Integer exhndlrIdx) {
		this.jbpmEvent = jbpmEvent;
		this.jbpmDescriptor = jbpmDescriptor;
		this.jbpmExcepthndlr = jbpmExcepthndlr;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.objClass = objClass;
		this.objId = objId;
		this.objExpression = objExpression;
		this.objExprlang = objExprlang;
		this.propagate = propagate;
		this.eventIdx = eventIdx;
		this.exhndlrIdx = exhndlrIdx;
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

	public JbpmDescriptor getJbpmDescriptor() {
		return this.jbpmDescriptor;
	}

	public void setJbpmDescriptor(JbpmDescriptor jbpmDescriptor) {
		this.jbpmDescriptor = jbpmDescriptor;
	}

	public JbpmExcepthndlr getJbpmExcepthndlr() {
		return this.jbpmExcepthndlr;
	}

	public void setJbpmExcepthndlr(JbpmExcepthndlr jbpmExcepthndlr) {
		this.jbpmExcepthndlr = jbpmExcepthndlr;
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

	public String getObjClass() {
		return this.objClass;
	}

	public void setObjClass(String objClass) {
		this.objClass = objClass;
	}

	public Long getObjId() {
		return this.objId;
	}

	public void setObjId(Long objId) {
		this.objId = objId;
	}

	public String getObjExpression() {
		return this.objExpression;
	}

	public void setObjExpression(String objExpression) {
		this.objExpression = objExpression;
	}

	public String getObjExprlang() {
		return this.objExprlang;
	}

	public void setObjExprlang(String objExprlang) {
		this.objExprlang = objExprlang;
	}

	public Boolean getPropagate() {
		return this.propagate;
	}

	public void setPropagate(Boolean propagate) {
		this.propagate = propagate;
	}

	public Integer getEventIdx() {
		return this.eventIdx;
	}

	public void setEventIdx(Integer eventIdx) {
		this.eventIdx = eventIdx;
	}

	public Integer getExhndlrIdx() {
		return this.exhndlrIdx;
	}

	public void setExhndlrIdx(Integer exhndlrIdx) {
		this.exhndlrIdx = exhndlrIdx;
	}

}