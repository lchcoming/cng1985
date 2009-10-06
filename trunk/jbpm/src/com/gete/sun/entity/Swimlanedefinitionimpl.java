package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Swimlanedefinitionimpl entity. @author MyEclipse Persistence Tools
 */

public class Swimlanedefinitionimpl implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Integer dbversion;
	private String name;
	private Set swimlaneimpls = new HashSet(0);
	private Set taskdefinitionimpls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Swimlanedefinitionimpl() {
	}

	/** minimal constructor */
	public Swimlanedefinitionimpl(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Swimlanedefinitionimpl(Integer dbversion, String name,
			Set swimlaneimpls, Set taskdefinitionimpls) {
		this.dbversion = dbversion;
		this.name = name;
		this.swimlaneimpls = swimlaneimpls;
		this.taskdefinitionimpls = taskdefinitionimpls;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getSwimlaneimpls() {
		return this.swimlaneimpls;
	}

	public void setSwimlaneimpls(Set swimlaneimpls) {
		this.swimlaneimpls = swimlaneimpls;
	}

	public Set getTaskdefinitionimpls() {
		return this.taskdefinitionimpls;
	}

	public void setTaskdefinitionimpls(Set taskdefinitionimpls) {
		this.taskdefinitionimpls = taskdefinitionimpls;
	}

}