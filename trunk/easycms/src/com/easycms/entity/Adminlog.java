package com.easycms.entity;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Adminlog entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Adminlog implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short logType;
	@Persistent
	private Short logLang;
	@Persistent
	private String logUser;
	@Persistent
	private String logIp;
	@Persistent
	private Date logTime;
	@Persistent
	private String logDetails;
	@Persistent
	private String logPage;

	// Constructors

	/** default constructor */
	public Adminlog() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getLogType() {
		return logType;
	}

	public void setLogType(Short logType) {
		this.logType = logType;
	}

	public Short getLogLang() {
		return logLang;
	}

	public void setLogLang(Short logLang) {
		this.logLang = logLang;
	}

	public String getLogUser() {
		return logUser;
	}

	public void setLogUser(String logUser) {
		this.logUser = logUser;
	}

	public String getLogIp() {
		return logIp;
	}

	public void setLogIp(String logIp) {
		this.logIp = logIp;
	}

	public Date getLogTime() {
		return logTime;
	}

	public void setLogTime(Date logTime) {
		this.logTime = logTime;
	}

	public String getLogDetails() {
		return logDetails;
	}

	public void setLogDetails(String logDetails) {
		this.logDetails = logDetails;
	}

	public String getLogPage() {
		return logPage;
	}

	public void setLogPage(String logPage) {
		this.logPage = logPage;
	}

	
}