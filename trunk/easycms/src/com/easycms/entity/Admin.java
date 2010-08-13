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
 * Admin entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Admin implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private String userName;
	@Persistent
	private String passWord;
	@Persistent
	private String lastLoginIp;
	@Persistent
	private Date lastLoginTime;
	@Persistent
	private Integer logins;
	@Persistent
	private String jurisdiCtion;
	@Persistent
	private Short levels;

	// Constructors

	/** default constructor */
	public Admin() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Integer getLogins() {
		return logins;
	}

	public void setLogins(Integer logins) {
		this.logins = logins;
	}

	public String getJurisdiCtion() {
		return jurisdiCtion;
	}

	public void setJurisdiCtion(String jurisdiCtion) {
		this.jurisdiCtion = jurisdiCtion;
	}

	public Short getLevels() {
		return levels;
	}

	public void setLevels(Short levels) {
		this.levels = levels;
	}

}