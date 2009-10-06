package com.gete.sun.entity;

/**
 * JbpmJpdlExecution entity. @author MyEclipse Persistence Tools
 */

public class JbpmJpdlExecution implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmExecution jbpmExecution;

	// Constructors

	/** default constructor */
	public JbpmJpdlExecution() {
	}

	/** full constructor */
	public JbpmJpdlExecution(JbpmExecution jbpmExecution) {
		this.jbpmExecution = jbpmExecution;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmExecution getJbpmExecution() {
		return this.jbpmExecution;
	}

	public void setJbpmExecution(JbpmExecution jbpmExecution) {
		this.jbpmExecution = jbpmExecution;
	}

}