package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmEvent entity. @author MyEclipse Persistence Tools
 */

public class JbpmEvent implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmProcess jbpmProcessByProcess;
	private JbpmProcess jbpmProcessByProcessdef;
	private JbpmWireprops jbpmWireprops;
	private JbpmActivity jbpmActivity;
	private JbpmTransition jbpmTransition;
	private Integer dbversion;
	private String name;
	private Set jbpmExcepthndlrs = new HashSet(0);
	private Set jbpmObjectrefs = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmEvent() {
	}

	/** minimal constructor */
	public JbpmEvent(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmEvent(JbpmProcess jbpmProcessByProcess,
			JbpmProcess jbpmProcessByProcessdef, JbpmWireprops jbpmWireprops,
			JbpmActivity jbpmActivity, JbpmTransition jbpmTransition,
			Integer dbversion, String name, Set jbpmExcepthndlrs,
			Set jbpmObjectrefs) {
		this.jbpmProcessByProcess = jbpmProcessByProcess;
		this.jbpmProcessByProcessdef = jbpmProcessByProcessdef;
		this.jbpmWireprops = jbpmWireprops;
		this.jbpmActivity = jbpmActivity;
		this.jbpmTransition = jbpmTransition;
		this.dbversion = dbversion;
		this.name = name;
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
		this.jbpmObjectrefs = jbpmObjectrefs;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmProcess getJbpmProcessByProcess() {
		return this.jbpmProcessByProcess;
	}

	public void setJbpmProcessByProcess(JbpmProcess jbpmProcessByProcess) {
		this.jbpmProcessByProcess = jbpmProcessByProcess;
	}

	public JbpmProcess getJbpmProcessByProcessdef() {
		return this.jbpmProcessByProcessdef;
	}

	public void setJbpmProcessByProcessdef(JbpmProcess jbpmProcessByProcessdef) {
		this.jbpmProcessByProcessdef = jbpmProcessByProcessdef;
	}

	public JbpmWireprops getJbpmWireprops() {
		return this.jbpmWireprops;
	}

	public void setJbpmWireprops(JbpmWireprops jbpmWireprops) {
		this.jbpmWireprops = jbpmWireprops;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getJbpmExcepthndlrs() {
		return this.jbpmExcepthndlrs;
	}

	public void setJbpmExcepthndlrs(Set jbpmExcepthndlrs) {
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
	}

	public Set getJbpmObjectrefs() {
		return this.jbpmObjectrefs;
	}

	public void setJbpmObjectrefs(Set jbpmObjectrefs) {
		this.jbpmObjectrefs = jbpmObjectrefs;
	}

}