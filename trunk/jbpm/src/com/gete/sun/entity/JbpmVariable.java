package com.gete.sun.entity;

import java.sql.Timestamp;

/**
 * JbpmVariable entity. @author MyEclipse Persistence Tools
 */

public class JbpmVariable implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmLob jbpmLob;
	private JbpmExecution jbpmExecutionByProcinst;
	private JbpmExecution jbpmExecutionByExecution;
	private String class_;
	private Integer dbversion;
	private String key;
	private String querytext;
	private String converter;
	private Timestamp dateValue;
	private Double doubleValue;
	private Long longValue;
	private String stringValue;

	// Constructors

	/** default constructor */
	public JbpmVariable() {
	}

	/** minimal constructor */
	public JbpmVariable(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmVariable(JbpmLob jbpmLob, JbpmExecution jbpmExecutionByProcinst,
			JbpmExecution jbpmExecutionByExecution, String class_,
			Integer dbversion, String key, String querytext, String converter,
			Timestamp dateValue, Double doubleValue, Long longValue,
			String stringValue) {
		this.jbpmLob = jbpmLob;
		this.jbpmExecutionByProcinst = jbpmExecutionByProcinst;
		this.jbpmExecutionByExecution = jbpmExecutionByExecution;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.key = key;
		this.querytext = querytext;
		this.converter = converter;
		this.dateValue = dateValue;
		this.doubleValue = doubleValue;
		this.longValue = longValue;
		this.stringValue = stringValue;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmLob getJbpmLob() {
		return this.jbpmLob;
	}

	public void setJbpmLob(JbpmLob jbpmLob) {
		this.jbpmLob = jbpmLob;
	}

	public JbpmExecution getJbpmExecutionByProcinst() {
		return this.jbpmExecutionByProcinst;
	}

	public void setJbpmExecutionByProcinst(JbpmExecution jbpmExecutionByProcinst) {
		this.jbpmExecutionByProcinst = jbpmExecutionByProcinst;
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

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getQuerytext() {
		return this.querytext;
	}

	public void setQuerytext(String querytext) {
		this.querytext = querytext;
	}

	public String getConverter() {
		return this.converter;
	}

	public void setConverter(String converter) {
		this.converter = converter;
	}

	public Timestamp getDateValue() {
		return this.dateValue;
	}

	public void setDateValue(Timestamp dateValue) {
		this.dateValue = dateValue;
	}

	public Double getDoubleValue() {
		return this.doubleValue;
	}

	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public Long getLongValue() {
		return this.longValue;
	}

	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public void setStringValue(String stringValue) {
		this.stringValue = stringValue;
	}

}