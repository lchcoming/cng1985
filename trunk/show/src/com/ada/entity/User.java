package com.ada.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String userId;
	private String userName;
	private String custId;
	private String custName;
	private Integer userState;
	private Timestamp userStateDate;
	private String passwd;
	private Integer userType;
	private String userClass;
	private String eparchyCode;
	private String cityCode;
	private String departmentCode;
	private String passwdQues;
	private String passwdAnswer;
	private Date regDate;
	private String regType;
	private Integer webLoginTag;
	private String nickname;
	private String psptTypeCode;
	private String psptId;
	private Timestamp psptEndDate;
	private String psptAddr;
	private String sex;
	private Timestamp birthday;
	private String localNativeCode;
	private Integer population;
	private String folkCode;
	private String phone;
	private String cellphone;
	private String postCode;
	private String postAddr;
	private String fax;
	private String qq;
	private String blog;
	private String email;
	private String contactName;
	private String homeAddr;
	private String workName;
	private String workDepart;
	private String job;
	private String jobTypeCode;
	private String educateDegreeCode;
	private String marriage;
	private String communityId;
	private Float scoreValue;
	private Float creditClass;
	private String vitality;
	private Integer lock;
	private String checkUser;
	private Timestamp checkTime;
	private String backReason;
	private String operUser;
	private Timestamp operTime;
	private String remark;
	private Timestamp addDate;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String userId, String userName, String custId) {
		this.userId = userId;
		this.userName = userName;
		this.custId = custId;
	}

	/** full constructor */
	public User(String userId, String userName, String custId, String custName,
			Integer userState, Timestamp userStateDate, String passwd,
			Integer userType, String userClass, String eparchyCode,
			String cityCode, String departmentCode, String passwdQues,
			String passwdAnswer, Date regDate, String regType,
			Integer webLoginTag, String nickname, String psptTypeCode,
			String psptId, Timestamp psptEndDate, String psptAddr, String sex,
			Timestamp birthday, String localNativeCode, Integer population,
			String folkCode, String phone, String cellphone, String postCode,
			String postAddr, String fax, String qq, String blog, String email,
			String contactName, String homeAddr, String workName,
			String workDepart, String job, String jobTypeCode,
			String educateDegreeCode, String marriage, String communityId,
			Float scoreValue, Float creditClass, String vitality, Integer lock,
			String checkUser, Timestamp checkTime, String backReason,
			String operUser, Timestamp operTime, String remark,
			Timestamp addDate, String rsrvStr1, String rsrvStr2,
			String rsrvStr3, String rsrvStr4, String rsrvStr5) {
		this.userId = userId;
		this.userName = userName;
		this.custId = custId;
		this.custName = custName;
		this.userState = userState;
		this.userStateDate = userStateDate;
		this.passwd = passwd;
		this.userType = userType;
		this.userClass = userClass;
		this.eparchyCode = eparchyCode;
		this.cityCode = cityCode;
		this.departmentCode = departmentCode;
		this.passwdQues = passwdQues;
		this.passwdAnswer = passwdAnswer;
		this.regDate = regDate;
		this.regType = regType;
		this.webLoginTag = webLoginTag;
		this.nickname = nickname;
		this.psptTypeCode = psptTypeCode;
		this.psptId = psptId;
		this.psptEndDate = psptEndDate;
		this.psptAddr = psptAddr;
		this.sex = sex;
		this.birthday = birthday;
		this.localNativeCode = localNativeCode;
		this.population = population;
		this.folkCode = folkCode;
		this.phone = phone;
		this.cellphone = cellphone;
		this.postCode = postCode;
		this.postAddr = postAddr;
		this.fax = fax;
		this.qq = qq;
		this.blog = blog;
		this.email = email;
		this.contactName = contactName;
		this.homeAddr = homeAddr;
		this.workName = workName;
		this.workDepart = workDepart;
		this.job = job;
		this.jobTypeCode = jobTypeCode;
		this.educateDegreeCode = educateDegreeCode;
		this.marriage = marriage;
		this.communityId = communityId;
		this.scoreValue = scoreValue;
		this.creditClass = creditClass;
		this.vitality = vitality;
		this.lock = lock;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.backReason = backReason;
		this.operUser = operUser;
		this.operTime = operTime;
		this.remark = remark;
		this.addDate = addDate;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getUserState() {
		return this.userState;
	}

	public void setUserState(Integer userState) {
		this.userState = userState;
	}

	public Timestamp getUserStateDate() {
		return this.userStateDate;
	}

	public void setUserStateDate(Timestamp userStateDate) {
		this.userStateDate = userStateDate;
	}

	public String getPasswd() {
		return this.passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Integer getUserType() {
		return this.userType;
	}

	public void setUserType(Integer userType) {
		this.userType = userType;
	}

	public String getUserClass() {
		return this.userClass;
	}

	public void setUserClass(String userClass) {
		this.userClass = userClass;
	}

	public String getEparchyCode() {
		return this.eparchyCode;
	}

	public void setEparchyCode(String eparchyCode) {
		this.eparchyCode = eparchyCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDepartmentCode() {
		return this.departmentCode;
	}

	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}

	public String getPasswdQues() {
		return this.passwdQues;
	}

	public void setPasswdQues(String passwdQues) {
		this.passwdQues = passwdQues;
	}

	public String getPasswdAnswer() {
		return this.passwdAnswer;
	}

	public void setPasswdAnswer(String passwdAnswer) {
		this.passwdAnswer = passwdAnswer;
	}

	public Date getRegDate() {
		return this.regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getRegType() {
		return this.regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public Integer getWebLoginTag() {
		return this.webLoginTag;
	}

	public void setWebLoginTag(Integer webLoginTag) {
		this.webLoginTag = webLoginTag;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPsptTypeCode() {
		return this.psptTypeCode;
	}

	public void setPsptTypeCode(String psptTypeCode) {
		this.psptTypeCode = psptTypeCode;
	}

	public String getPsptId() {
		return this.psptId;
	}

	public void setPsptId(String psptId) {
		this.psptId = psptId;
	}

	public Timestamp getPsptEndDate() {
		return this.psptEndDate;
	}

	public void setPsptEndDate(Timestamp psptEndDate) {
		this.psptEndDate = psptEndDate;
	}

	public String getPsptAddr() {
		return this.psptAddr;
	}

	public void setPsptAddr(String psptAddr) {
		this.psptAddr = psptAddr;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public String getLocalNativeCode() {
		return this.localNativeCode;
	}

	public void setLocalNativeCode(String localNativeCode) {
		this.localNativeCode = localNativeCode;
	}

	public Integer getPopulation() {
		return this.population;
	}

	public void setPopulation(Integer population) {
		this.population = population;
	}

	public String getFolkCode() {
		return this.folkCode;
	}

	public void setFolkCode(String folkCode) {
		this.folkCode = folkCode;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getPostAddr() {
		return this.postAddr;
	}

	public void setPostAddr(String postAddr) {
		this.postAddr = postAddr;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getBlog() {
		return this.blog;
	}

	public void setBlog(String blog) {
		this.blog = blog;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getHomeAddr() {
		return this.homeAddr;
	}

	public void setHomeAddr(String homeAddr) {
		this.homeAddr = homeAddr;
	}

	public String getWorkName() {
		return this.workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkDepart() {
		return this.workDepart;
	}

	public void setWorkDepart(String workDepart) {
		this.workDepart = workDepart;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getJobTypeCode() {
		return this.jobTypeCode;
	}

	public void setJobTypeCode(String jobTypeCode) {
		this.jobTypeCode = jobTypeCode;
	}

	public String getEducateDegreeCode() {
		return this.educateDegreeCode;
	}

	public void setEducateDegreeCode(String educateDegreeCode) {
		this.educateDegreeCode = educateDegreeCode;
	}

	public String getMarriage() {
		return this.marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public String getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(String communityId) {
		this.communityId = communityId;
	}

	public Float getScoreValue() {
		return this.scoreValue;
	}

	public void setScoreValue(Float scoreValue) {
		this.scoreValue = scoreValue;
	}

	public Float getCreditClass() {
		return this.creditClass;
	}

	public void setCreditClass(Float creditClass) {
		this.creditClass = creditClass;
	}

	public String getVitality() {
		return this.vitality;
	}

	public void setVitality(String vitality) {
		this.vitality = vitality;
	}

	public Integer getLock() {
		return this.lock;
	}

	public void setLock(Integer lock) {
		this.lock = lock;
	}

	public String getCheckUser() {
		return this.checkUser;
	}

	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getBackReason() {
		return this.backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
	}

	public String getOperUser() {
		return this.operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public Timestamp getOperTime() {
		return this.operTime;
	}

	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	public String getRsrvStr1() {
		return this.rsrvStr1;
	}

	public void setRsrvStr1(String rsrvStr1) {
		this.rsrvStr1 = rsrvStr1;
	}

	public String getRsrvStr2() {
		return this.rsrvStr2;
	}

	public void setRsrvStr2(String rsrvStr2) {
		this.rsrvStr2 = rsrvStr2;
	}

	public String getRsrvStr3() {
		return this.rsrvStr3;
	}

	public void setRsrvStr3(String rsrvStr3) {
		this.rsrvStr3 = rsrvStr3;
	}

	public String getRsrvStr4() {
		return this.rsrvStr4;
	}

	public void setRsrvStr4(String rsrvStr4) {
		this.rsrvStr4 = rsrvStr4;
	}

	public String getRsrvStr5() {
		return this.rsrvStr5;
	}

	public void setRsrvStr5(String rsrvStr5) {
		this.rsrvStr5 = rsrvStr5;
	}

}