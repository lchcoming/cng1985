package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmWireprops entity. @author MyEclipse Persistence Tools
 */

public class JbpmWireprops implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Integer dbversion;
	private Set jbpmTransitions = new HashSet(0);
	private Set jbpmProcesses = new HashSet(0);
	private Set jbpmDescriptors = new HashSet(0);
	private Set jbpmEvents = new HashSet(0);
	private Set jbpmActivities = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmWireprops() {
	}

	/** minimal constructor */
	public JbpmWireprops(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmWireprops(Integer dbversion, Set jbpmTransitions,
			Set jbpmProcesses, Set jbpmDescriptors, Set jbpmEvents,
			Set jbpmActivities) {
		this.dbversion = dbversion;
		this.jbpmTransitions = jbpmTransitions;
		this.jbpmProcesses = jbpmProcesses;
		this.jbpmDescriptors = jbpmDescriptors;
		this.jbpmEvents = jbpmEvents;
		this.jbpmActivities = jbpmActivities;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public Set getJbpmTransitions() {
		return this.jbpmTransitions;
	}

	public void setJbpmTransitions(Set jbpmTransitions) {
		this.jbpmTransitions = jbpmTransitions;
	}

	public Set getJbpmProcesses() {
		return this.jbpmProcesses;
	}

	public void setJbpmProcesses(Set jbpmProcesses) {
		this.jbpmProcesses = jbpmProcesses;
	}

	public Set getJbpmDescriptors() {
		return this.jbpmDescriptors;
	}

	public void setJbpmDescriptors(Set jbpmDescriptors) {
		this.jbpmDescriptors = jbpmDescriptors;
	}

	public Set getJbpmEvents() {
		return this.jbpmEvents;
	}

	public void setJbpmEvents(Set jbpmEvents) {
		this.jbpmEvents = jbpmEvents;
	}

	public Set getJbpmActivities() {
		return this.jbpmActivities;
	}

	public void setJbpmActivities(Set jbpmActivities) {
		this.jbpmActivities = jbpmActivities;
	}

}