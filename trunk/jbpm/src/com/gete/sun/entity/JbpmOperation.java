package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmOperation entity. @author MyEclipse Persistence Tools
 */

public class JbpmOperation implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmDescriptor jbpmDescriptorByObjoperDescr;
	private JbpmDescriptor jbpmDescriptorByDescr;
	private String class_;
	private Integer dbversion;
	private String text;
	private Integer objoperDescrIdx;
	private Set jbpmArgdescriptors = new HashSet(0);
	private Set jbpmJpdlActivities = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmOperation() {
	}

	/** minimal constructor */
	public JbpmOperation(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmOperation(JbpmDescriptor jbpmDescriptorByObjoperDescr,
			JbpmDescriptor jbpmDescriptorByDescr, String class_,
			Integer dbversion, String text, Integer objoperDescrIdx,
			Set jbpmArgdescriptors, Set jbpmJpdlActivities) {
		this.jbpmDescriptorByObjoperDescr = jbpmDescriptorByObjoperDescr;
		this.jbpmDescriptorByDescr = jbpmDescriptorByDescr;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.text = text;
		this.objoperDescrIdx = objoperDescrIdx;
		this.jbpmArgdescriptors = jbpmArgdescriptors;
		this.jbpmJpdlActivities = jbpmJpdlActivities;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmDescriptor getJbpmDescriptorByObjoperDescr() {
		return this.jbpmDescriptorByObjoperDescr;
	}

	public void setJbpmDescriptorByObjoperDescr(
			JbpmDescriptor jbpmDescriptorByObjoperDescr) {
		this.jbpmDescriptorByObjoperDescr = jbpmDescriptorByObjoperDescr;
	}

	public JbpmDescriptor getJbpmDescriptorByDescr() {
		return this.jbpmDescriptorByDescr;
	}

	public void setJbpmDescriptorByDescr(JbpmDescriptor jbpmDescriptorByDescr) {
		this.jbpmDescriptorByDescr = jbpmDescriptorByDescr;
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

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getObjoperDescrIdx() {
		return this.objoperDescrIdx;
	}

	public void setObjoperDescrIdx(Integer objoperDescrIdx) {
		this.objoperDescrIdx = objoperDescrIdx;
	}

	public Set getJbpmArgdescriptors() {
		return this.jbpmArgdescriptors;
	}

	public void setJbpmArgdescriptors(Set jbpmArgdescriptors) {
		this.jbpmArgdescriptors = jbpmArgdescriptors;
	}

	public Set getJbpmJpdlActivities() {
		return this.jbpmJpdlActivities;
	}

	public void setJbpmJpdlActivities(Set jbpmJpdlActivities) {
		this.jbpmJpdlActivities = jbpmJpdlActivities;
	}

}