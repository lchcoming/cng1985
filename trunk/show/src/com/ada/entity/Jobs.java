package com.ada.entity;

import java.sql.Timestamp;

/**
 * Jobs entity. @author MyEclipse Persistence Tools
 */

public class Jobs implements java.io.Serializable {

	// Fields

	private String jobId;
	private String custId;
	private String custName;
	private String title;
	private String jobText;
	private Integer validity;
	private String checkUser;
	private Timestamp checkTime;
	private String operUser;
	private Timestamp operTime;
	private Integer removeTag;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;
	private String jobAddr;
	private Timestamp startDate;
	private Timestamp endDate;
	private Integer jobType;
	private Timestamp addDate;
	private String pay;

	// Constructors

	/** default constructor */
	public Jobs() {
	}

	/** minimal constructor */
	public Jobs(String jobId, String custId, String custName, String title,
			String jobText, String operUser, Timestamp operTime) {
		this.jobId = jobId;
		this.custId = custId;
		this.custName = custName;
		this.title = title;
		this.jobText = jobText;
		this.operUser = operUser;
		this.operTime = operTime;
	}

	/** full constructor */
	public Jobs(String jobId, String custId, String custName, String title,
			String jobText, Integer validity, String checkUser,
			Timestamp checkTime, String operUser, Timestamp operTime,
			Integer removeTag, String rsrvStr1, String rsrvStr2,
			String rsrvStr3, String rsrvStr4, String rsrvStr5, String jobAddr,
			Timestamp startDate, Timestamp endDate, Integer jobType,
			Timestamp addDate, String pay) {
		this.jobId = jobId;
		this.custId = custId;
		this.custName = custName;
		this.title = title;
		this.jobText = jobText;
		this.validity = validity;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.operUser = operUser;
		this.operTime = operTime;
		this.removeTag = removeTag;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
		this.jobAddr = jobAddr;
		this.startDate = startDate;
		this.endDate = endDate;
		this.jobType = jobType;
		this.addDate = addDate;
		this.pay = pay;
	}

	// Property accessors

	public String getJobId() {
		return this.jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getJobText() {
		return this.jobText;
	}

	public void setJobText(String jobText) {
		this.jobText = jobText;
	}

	public Integer getValidity() {
		return this.validity;
	}

	public void setValidity(Integer validity) {
		this.validity = validity;
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

	public Integer getRemoveTag() {
		return this.removeTag;
	}

	public void setRemoveTag(Integer removeTag) {
		this.removeTag = removeTag;
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

	public String getJobAddr() {
		return this.jobAddr;
	}

	public void setJobAddr(String jobAddr) {
		this.jobAddr = jobAddr;
	}

	public Timestamp getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Timestamp startDate) {
		this.startDate = startDate;
	}

	public Timestamp getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Timestamp endDate) {
		this.endDate = endDate;
	}

	public Integer getJobType() {
		return this.jobType;
	}

	public void setJobType(Integer jobType) {
		this.jobType = jobType;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	public String getPay() {
		return this.pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

}