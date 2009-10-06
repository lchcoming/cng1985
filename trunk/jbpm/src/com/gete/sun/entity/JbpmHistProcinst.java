package com.gete.sun.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmHistProcinst entity. @author MyEclipse Persistence Tools
 */

public class JbpmHistProcinst implements java.io.Serializable {

	// Fields

	private String id;
	private JbpmProcess jbpmProcess;
	private Integer dbversion;
	private String procdefid;
	private String key;
	private Timestamp start;
	private Timestamp end;
	private Long duration;
	private String state;
	private String endactivity;
	private Set jbpmHistActinsts = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmHistProcinst() {
	}

	/** minimal constructor */
	public JbpmHistProcinst(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmHistProcinst(JbpmProcess jbpmProcess, Integer dbversion,
			String procdefid, String key, Timestamp start, Timestamp end,
			Long duration, String state, String endactivity,
			Set jbpmHistActinsts) {
		this.jbpmProcess = jbpmProcess;
		this.dbversion = dbversion;
		this.procdefid = procdefid;
		this.key = key;
		this.start = start;
		this.end = end;
		this.duration = duration;
		this.state = state;
		this.endactivity = endactivity;
		this.jbpmHistActinsts = jbpmHistActinsts;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getProcdefid() {
		return this.procdefid;
	}

	public void setProcdefid(String procdefid) {
		this.procdefid = procdefid;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Timestamp getStart() {
		return this.start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getEnd() {
		return this.end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public Long getDuration() {
		return this.duration;
	}

	public void setDuration(Long duration) {
		this.duration = duration;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getEndactivity() {
		return this.endactivity;
	}

	public void setEndactivity(String endactivity) {
		this.endactivity = endactivity;
	}

	public Set getJbpmHistActinsts() {
		return this.jbpmHistActinsts;
	}

	public void setJbpmHistActinsts(Set jbpmHistActinsts) {
		this.jbpmHistActinsts = jbpmHistActinsts;
	}

}