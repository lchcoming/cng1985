package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Swimlaneimpl entity. @author MyEclipse Persistence Tools
 */

public class Swimlaneimpl implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Swimlanedefinitionimpl swimlanedefinitionimpl;
	private Integer dbversion;
	private String name;
	private String assignee;
	private Set taskimpls = new HashSet(0);
	private Set participantimpls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Swimlaneimpl() {
	}

	/** minimal constructor */
	public Swimlaneimpl(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Swimlaneimpl(Swimlanedefinitionimpl swimlanedefinitionimpl,
			Integer dbversion, String name, String assignee, Set taskimpls,
			Set participantimpls) {
		this.swimlanedefinitionimpl = swimlanedefinitionimpl;
		this.dbversion = dbversion;
		this.name = name;
		this.assignee = assignee;
		this.taskimpls = taskimpls;
		this.participantimpls = participantimpls;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public Swimlanedefinitionimpl getSwimlanedefinitionimpl() {
		return this.swimlanedefinitionimpl;
	}

	public void setSwimlanedefinitionimpl(
			Swimlanedefinitionimpl swimlanedefinitionimpl) {
		this.swimlanedefinitionimpl = swimlanedefinitionimpl;
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

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public Set getTaskimpls() {
		return this.taskimpls;
	}

	public void setTaskimpls(Set taskimpls) {
		this.taskimpls = taskimpls;
	}

	public Set getParticipantimpls() {
		return this.participantimpls;
	}

	public void setParticipantimpls(Set participantimpls) {
		this.participantimpls = participantimpls;
	}

}