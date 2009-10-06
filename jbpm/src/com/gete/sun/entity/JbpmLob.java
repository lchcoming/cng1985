package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmLob entity. @author MyEclipse Persistence Tools
 */

public class JbpmLob implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmProcess jbpmProcess;
	private Integer dbversion;
	private String blobValue;
	private String binaryValue;
	private String clobValue;
	private String textValue;
	private String name;
	private Set jbpmVariables = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmLob() {
	}

	/** minimal constructor */
	public JbpmLob(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmLob(JbpmProcess jbpmProcess, Integer dbversion,
			String blobValue, String binaryValue, String clobValue,
			String textValue, String name, Set jbpmVariables) {
		this.jbpmProcess = jbpmProcess;
		this.dbversion = dbversion;
		this.blobValue = blobValue;
		this.binaryValue = binaryValue;
		this.clobValue = clobValue;
		this.textValue = textValue;
		this.name = name;
		this.jbpmVariables = jbpmVariables;
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

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getBlobValue() {
		return this.blobValue;
	}

	public void setBlobValue(String blobValue) {
		this.blobValue = blobValue;
	}

	public String getBinaryValue() {
		return this.binaryValue;
	}

	public void setBinaryValue(String binaryValue) {
		this.binaryValue = binaryValue;
	}

	public String getClobValue() {
		return this.clobValue;
	}

	public void setClobValue(String clobValue) {
		this.clobValue = clobValue;
	}

	public String getTextValue() {
		return this.textValue;
	}

	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getJbpmVariables() {
		return this.jbpmVariables;
	}

	public void setJbpmVariables(Set jbpmVariables) {
		this.jbpmVariables = jbpmVariables;
	}

}