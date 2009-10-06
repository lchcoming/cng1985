package com.gete.sun.entity;

/**
 * JbpmJpdlProcdef entity. @author MyEclipse Persistence Tools
 */

public class JbpmJpdlProcdef implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmProcess jbpmProcess;

	// Constructors

	/** default constructor */
	public JbpmJpdlProcdef() {
	}

	/** full constructor */
	public JbpmJpdlProcdef(JbpmProcess jbpmProcess) {
		this.jbpmProcess = jbpmProcess;
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

}