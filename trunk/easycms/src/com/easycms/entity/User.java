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
 * User entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")

public class User implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private String userName;
	@Persistent
	private String userPassword;
	@Persistent
	private String userProtectionQuestion;
	@Persistent
	private String userProtectionAnswer;
	@Persistent
	private String userTrueName;
	@Persistent
	private Byte userSex;
	@Persistent
	private String userEmail;
	@Persistent
	private String userCompany;
	@Persistent
	private String userWeb;
	@Persistent
	private String userAddress;
	@Persistent
	private String userTel;
	@Persistent
	private String userFax;
	@Persistent
	private Short userLevel;
	@Persistent
	private Integer userLogin;
	@Persistent
	private String userLoginIp;
	@Persistent
	private Date userLoginTime;
	@Persistent
	private String userRegIp;
	@Persistent
	private Date userRegTime;
	@Persistent
	private Byte userAudit;

	// Constructors

	/** default constructor */
	public User() {
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

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserProtectionQuestion() {
		return userProtectionQuestion;
	}

	public void setUserProtectionQuestion(String userProtectionQuestion) {
		this.userProtectionQuestion = userProtectionQuestion;
	}

	public String getUserProtectionAnswer() {
		return userProtectionAnswer;
	}

	public void setUserProtectionAnswer(String userProtectionAnswer) {
		this.userProtectionAnswer = userProtectionAnswer;
	}

	public String getUserTrueName() {
		return userTrueName;
	}

	public void setUserTrueName(String userTrueName) {
		this.userTrueName = userTrueName;
	}

	public Byte getUserSex() {
		return userSex;
	}

	public void setUserSex(Byte userSex) {
		this.userSex = userSex;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserCompany() {
		return userCompany;
	}

	public void setUserCompany(String userCompany) {
		this.userCompany = userCompany;
	}

	public String getUserWeb() {
		return userWeb;
	}

	public void setUserWeb(String userWeb) {
		this.userWeb = userWeb;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getUserTel() {
		return userTel;
	}

	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}

	public String getUserFax() {
		return userFax;
	}

	public void setUserFax(String userFax) {
		this.userFax = userFax;
	}

	public Short getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(Short userLevel) {
		this.userLevel = userLevel;
	}

	public Integer getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(Integer userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserLoginIp() {
		return userLoginIp;
	}

	public void setUserLoginIp(String userLoginIp) {
		this.userLoginIp = userLoginIp;
	}

	public Date getUserLoginTime() {
		return userLoginTime;
	}

	public void setUserLoginTime(Date userLoginTime) {
		this.userLoginTime = userLoginTime;
	}

	public String getUserRegIp() {
		return userRegIp;
	}

	public void setUserRegIp(String userRegIp) {
		this.userRegIp = userRegIp;
	}

	public Date getUserRegTime() {
		return userRegTime;
	}

	public void setUserRegTime(Date userRegTime) {
		this.userRegTime = userRegTime;
	}

	public Byte getUserAudit() {
		return userAudit;
	}

	public void setUserAudit(Byte userAudit) {
		this.userAudit = userAudit;
	}

	

}