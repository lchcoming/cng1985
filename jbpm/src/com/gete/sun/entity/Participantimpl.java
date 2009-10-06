package com.gete.sun.entity;

/**
 * Participantimpl entity. @author MyEclipse Persistence Tools
 */

public class Participantimpl implements java.io.Serializable {

	// Fields

	private Long dbid;
	private Swimlaneimpl swimlaneimpl;
	private Taskimpl taskimpl;
	private Integer dbversion;
	private String identitytype;
	private String identityid;
	private String participation;

	// Constructors

	/** default constructor */
	public Participantimpl() {
	}

	/** minimal constructor */
	public Participantimpl(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public Participantimpl(Swimlaneimpl swimlaneimpl, Taskimpl taskimpl,
			Integer dbversion, String identitytype, String identityid,
			String participation) {
		this.swimlaneimpl = swimlaneimpl;
		this.taskimpl = taskimpl;
		this.dbversion = dbversion;
		this.identitytype = identitytype;
		this.identityid = identityid;
		this.participation = participation;
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

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getIdentitytype() {
		return this.identitytype;
	}

	public void setIdentitytype(String identitytype) {
		this.identitytype = identitytype;
	}

	public String getIdentityid() {
		return this.identityid;
	}

	public void setIdentityid(String identityid) {
		this.identityid = identityid;
	}

	public String getParticipation() {
		return this.participation;
	}

	public void setParticipation(String participation) {
		this.participation = participation;
	}

}