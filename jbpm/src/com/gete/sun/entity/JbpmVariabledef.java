package com.gete.sun.entity;

/**
 * JbpmVariabledef entity. @author MyEclipse Persistence Tools
 */

public class JbpmVariabledef implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmProcess jbpmProcess;
	private JbpmDescriptor jbpmDescriptor;
	private JbpmActivity jbpmActivity;
	private Integer dbversion;
	private String name;
	private String type;
	private String invar;
	private String inexpr;
	private String outvar;
	private String outexpr;
	private Integer processIdx;
	private Integer actIdx;

	// Constructors

	/** default constructor */
	public JbpmVariabledef() {
	}

	/** minimal constructor */
	public JbpmVariabledef(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmVariabledef(JbpmProcess jbpmProcess,
			JbpmDescriptor jbpmDescriptor, JbpmActivity jbpmActivity,
			Integer dbversion, String name, String type, String invar,
			String inexpr, String outvar, String outexpr, Integer processIdx,
			Integer actIdx) {
		this.jbpmProcess = jbpmProcess;
		this.jbpmDescriptor = jbpmDescriptor;
		this.jbpmActivity = jbpmActivity;
		this.dbversion = dbversion;
		this.name = name;
		this.type = type;
		this.invar = invar;
		this.inexpr = inexpr;
		this.outvar = outvar;
		this.outexpr = outexpr;
		this.processIdx = processIdx;
		this.actIdx = actIdx;
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

	public JbpmDescriptor getJbpmDescriptor() {
		return this.jbpmDescriptor;
	}

	public void setJbpmDescriptor(JbpmDescriptor jbpmDescriptor) {
		this.jbpmDescriptor = jbpmDescriptor;
	}

	public JbpmActivity getJbpmActivity() {
		return this.jbpmActivity;
	}

	public void setJbpmActivity(JbpmActivity jbpmActivity) {
		this.jbpmActivity = jbpmActivity;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getInvar() {
		return this.invar;
	}

	public void setInvar(String invar) {
		this.invar = invar;
	}

	public String getInexpr() {
		return this.inexpr;
	}

	public void setInexpr(String inexpr) {
		this.inexpr = inexpr;
	}

	public String getOutvar() {
		return this.outvar;
	}

	public void setOutvar(String outvar) {
		this.outvar = outvar;
	}

	public String getOutexpr() {
		return this.outexpr;
	}

	public void setOutexpr(String outexpr) {
		this.outexpr = outexpr;
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

}