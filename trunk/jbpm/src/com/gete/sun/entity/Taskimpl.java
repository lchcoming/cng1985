package com.gete.sun.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Taskimpl entity. @author MyEclipse Persistence Tools
 */

public class Taskimpl implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Swimlaneimpl swimlaneimpl;
	private Taskimpl taskimpl;
	private String class_;
	private Integer dbversion;
	private String id;
	private String name;
	private String descr;
	private String assignee;
	private Integer priority;
	private Timestamp create;
	private Timestamp duedate;
	private Integer progress;
	private String execution;
	private Long hisdbid;
	private Set taskimpls = new HashSet(0);
	private Set jbpmComments = new HashSet(0);
	private Set participantimpls = new HashSet(0);

	// Constructors

	/** default constructor */
	public Taskimpl() {
	}

	/** minimal constructor */
	public Taskimpl(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Taskimpl(Swimlaneimpl swimlaneimpl, Taskimpl taskimpl,
			String class_, Integer dbversion, String id, String name,
			String descr, String assignee, Integer priority, Timestamp create,
			Timestamp duedate, Integer progress, String execution,
			Long hisdbid, Set taskimpls, Set jbpmComments, Set participantimpls) {
		this.swimlaneimpl = swimlaneimpl;
		this.taskimpl = taskimpl;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.id = id;
		this.name = name;
		this.descr = descr;
		this.assignee = assignee;
		this.priority = priority;
		this.create = create;
		this.duedate = duedate;
		this.progress = progress;
		this.execution = execution;
		this.hisdbid = hisdbid;
		this.taskimpls = taskimpls;
		this.jbpmComments = jbpmComments;
		this.participantimpls = participantimpls;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public Swimlaneimpl getSwimlaneimpl() {
		return this.swimlaneimpl;
	}

	public void setSwimlaneimpl(Swimlaneimpl swimlaneimpl) {
		this.swimlaneimpl = swimlaneimpl;
	}

	public Taskimpl getTaskimpl() {
		return this.taskimpl;
	}

	public void setTaskimpl(Taskimpl taskimpl) {
		this.taskimpl = taskimpl;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getAssignee() {
		return this.assignee;
	}

	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Timestamp getCreate() {
		return this.create;
	}

	public void setCreate(Timestamp create) {
		this.create = create;
	}

	public Timestamp getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Timestamp duedate) {
		this.duedate = duedate;
	}

	public Integer getProgress() {
		return this.progress;
	}

	public void setProgress(Integer progress) {
		this.progress = progress;
	}

	public String getExecution() {
		return this.execution;
	}

	public void setExecution(String execution) {
		this.execution = execution;
	}

	public Long getHisdbid() {
		return this.hisdbid;
	}

	public void setHisdbid(Long hisdbid) {
		this.hisdbid = hisdbid;
	}

	public Set getTaskimpls() {
		return this.taskimpls;
	}

	public void setTaskimpls(Set taskimpls) {
		this.taskimpls = taskimpls;
	}

	public Set getJbpmComments() {
		return this.jbpmComments;
	}

	public void setJbpmComments(Set jbpmComments) {
		this.jbpmComments = jbpmComments;
	}

	public Set getParticipantimpls() {
		return this.participantimpls;
	}

	public void setParticipantimpls(Set participantimpls) {
		this.participantimpls = participantimpls;
	}

}