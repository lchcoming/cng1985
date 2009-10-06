package com.gete.sun.entity;

/**
 * JbpmArgdescriptor entity. @author MyEclipse Persistence Tools
 */

public class JbpmArgdescriptor implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmOperation jbpmOperation;
	private JbpmDescriptor jbpmDescriptorByObjargDescr;
	private JbpmDescriptor jbpmDescriptorByDescriptor;
	private Integer dbversion;
	private String typename;
	private Integer objargDescrIdx;
	private Integer operIdx;

	// Constructors

	/** default constructor */
	public JbpmArgdescriptor() {
	}

	/** minimal constructor */
	public JbpmArgdescriptor(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmArgdescriptor(JbpmOperation jbpmOperation,
			JbpmDescriptor jbpmDescriptorByObjargDescr,
			JbpmDescriptor jbpmDescriptorByDescriptor, Integer dbversion,
			String typename, Integer objargDescrIdx, Integer operIdx) {
		this.jbpmOperation = jbpmOperation;
		this.jbpmDescriptorByObjargDescr = jbpmDescriptorByObjargDescr;
		this.jbpmDescriptorByDescriptor = jbpmDescriptorByDescriptor;
		this.dbversion = dbversion;
		this.typename = typename;
		this.objargDescrIdx = objargDescrIdx;
		this.operIdx = operIdx;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmOperation getJbpmOperation() {
		return this.jbpmOperation;
	}

	public void setJbpmOperation(JbpmOperation jbpmOperation) {
		this.jbpmOperation = jbpmOperation;
	}

	public JbpmDescriptor getJbpmDescriptorByObjargDescr() {
		return this.jbpmDescriptorByObjargDescr;
	}

	public void setJbpmDescriptorByObjargDescr(
			JbpmDescriptor jbpmDescriptorByObjargDescr) {
		this.jbpmDescriptorByObjargDescr = jbpmDescriptorByObjargDescr;
	}

	public JbpmDescriptor getJbpmDescriptorByDescriptor() {
		return this.jbpmDescriptorByDescriptor;
	}

	public void setJbpmDescriptorByDescriptor(
			JbpmDescriptor jbpmDescriptorByDescriptor) {
		this.jbpmDescriptorByDescriptor = jbpmDescriptorByDescriptor;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Integer getObjargDescrIdx() {
		return this.objargDescrIdx;
	}

	public void setObjargDescrIdx(Integer objargDescrIdx) {
		this.objargDescrIdx = objargDescrIdx;
	}

	public Integer getOperIdx() {
		return this.operIdx;
	}

	public void setOperIdx(Integer operIdx) {
		this.operIdx = operIdx;
	}

}