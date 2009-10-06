package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmTransition entity. @author MyEclipse Persistence Tools
 */

public class JbpmTransition implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmActivity jbpmActivityBySrc;
	private JbpmActivity jbpmActivityByDestination;
	private JbpmProcess jbpmProcess;
	private JbpmActivity jbpmActivityByDest;
	private JbpmActivity jbpmActivityBySource;
	private JbpmDescriptor jbpmDescriptor;
	private JbpmWireprops jbpmWireprops;
	private Integer dbversion;
	private String name;
	private String descr;
	private Boolean takeasync;
	private Integer inIdx;
	private Integer outIdx;
	private Set jbpmActivities = new HashSet(0);
	private Set jbpmExcepthndlrs = new HashSet(0);
	private Set jbpmEvents = new HashSet(0);
	private Set jbpmExecutions = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmTransition() {
	}

	/** minimal constructor */
	public JbpmTransition(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmTransition(JbpmActivity jbpmActivityBySrc,
			JbpmActivity jbpmActivityByDestination, JbpmProcess jbpmProcess,
			JbpmActivity jbpmActivityByDest, JbpmActivity jbpmActivityBySource,
			JbpmDescriptor jbpmDescriptor, JbpmWireprops jbpmWireprops,
			Integer dbversion, String name, String descr, Boolean takeasync,
			Integer inIdx, Integer outIdx, Set jbpmActivities,
			Set jbpmExcepthndlrs, Set jbpmEvents, Set jbpmExecutions) {
		this.jbpmActivityBySrc = jbpmActivityBySrc;
		this.jbpmActivityByDestination = jbpmActivityByDestination;
		this.jbpmProcess = jbpmProcess;
		this.jbpmActivityByDest = jbpmActivityByDest;
		this.jbpmActivityBySource = jbpmActivityBySource;
		this.jbpmDescriptor = jbpmDescriptor;
		this.jbpmWireprops = jbpmWireprops;
		this.dbversion = dbversion;
		this.name = name;
		this.descr = descr;
		this.takeasync = takeasync;
		this.inIdx = inIdx;
		this.outIdx = outIdx;
		this.jbpmActivities = jbpmActivities;
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
		this.jbpmEvents = jbpmEvents;
		this.jbpmExecutions = jbpmExecutions;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmActivity getJbpmActivityBySrc() {
		return this.jbpmActivityBySrc;
	}

	public void setJbpmActivityBySrc(JbpmActivity jbpmActivityBySrc) {
		this.jbpmActivityBySrc = jbpmActivityBySrc;
	}

	public JbpmActivity getJbpmActivityByDestination() {
		return this.jbpmActivityByDestination;
	}

	public void setJbpmActivityByDestination(
			JbpmActivity jbpmActivityByDestination) {
		this.jbpmActivityByDestination = jbpmActivityByDestination;
	}

	public JbpmProcess getJbpmProcess() {
		return this.jbpmProcess;
	}

	public void setJbpmProcess(JbpmProcess jbpmProcess) {
		this.jbpmProcess = jbpmProcess;
	}

	public JbpmActivity getJbpmActivityByDest() {
		return this.jbpmActivityByDest;
	}

	public void setJbpmActivityByDest(JbpmActivity jbpmActivityByDest) {
		this.jbpmActivityByDest = jbpmActivityByDest;
	}

	public JbpmActivity getJbpmActivityBySource() {
		return this.jbpmActivityBySource;
	}

	public void setJbpmActivityBySource(JbpmActivity jbpmActivityBySource) {
		this.jbpmActivityBySource = jbpmActivityBySource;
	}

	public JbpmDescriptor getJbpmDescriptor() {
		return this.jbpmDescriptor;
	}

	public void setJbpmDescriptor(JbpmDescriptor jbpmDescriptor) {
		this.jbpmDescriptor = jbpmDescriptor;
	}

	public JbpmWireprops getJbpmWireprops() {
		return this.jbpmWireprops;
	}

	public void setJbpmWireprops(JbpmWireprops jbpmWireprops) {
		this.jbpmWireprops = jbpmWireprops;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Boolean getTakeasync() {
		return this.takeasync;
	}

	public void setTakeasync(Boolean takeasync) {
		this.takeasync = takeasync;
	}

	public Integer getInIdx() {
		return this.inIdx;
	}

	public void setInIdx(Integer inIdx) {
		this.inIdx = inIdx;
	}

	public Integer getOutIdx() {
		return this.outIdx;
	}

	public void setOutIdx(Integer outIdx) {
		this.outIdx = outIdx;
	}

	public Set getJbpmActivities() {
		return this.jbpmActivities;
	}

	public void setJbpmActivities(Set jbpmActivities) {
		this.jbpmActivities = jbpmActivities;
	}

	public Set getJbpmExcepthndlrs() {
		return this.jbpmExcepthndlrs;
	}

	public void setJbpmExcepthndlrs(Set jbpmExcepthndlrs) {
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
	}

	public Set getJbpmEvents() {
		return this.jbpmEvents;
	}

	public void setJbpmEvents(Set jbpmEvents) {
		this.jbpmEvents = jbpmEvents;
	}

	public Set getJbpmExecutions() {
		return this.jbpmExecutions;
	}

	public void setJbpmExecutions(Set jbpmExecutions) {
		this.jbpmExecutions = jbpmExecutions;
	}

}