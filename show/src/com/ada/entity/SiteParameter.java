package com.ada.entity;

import java.sql.Timestamp;

/**
 * SiteParameter entity. @author MyEclipse Persistence Tools
 */

public class SiteParameter implements java.io.Serializable {

	// Fields

	private String paramId;
	private String paramName;
	private String paramValue;
	private String paramComment;
	private String remark;
	private Integer checked;
	private String checkUser;
	private Timestamp checkTime;
	private Timestamp operTime;
	private String operUser;
	private Integer removeTag;
	private Integer rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;
	private String rsrvStr6;
	private String rsrvStr7;
	private String rsrvStr8;
	private String rsrvStr9;
	private String rsrvStr10;

	// Constructors

	/** default constructor */
	public SiteParameter() {
	}

	/** minimal constructor */
	public SiteParameter(String paramId, String paramName, String paramValue,
			Timestamp operTime, String operUser) {
		this.paramId = paramId;
		this.paramName = paramName;
		this.paramValue = paramValue;
		this.operTime = operTime;
		this.operUser = operUser;
	}

	/** full constructor */
	public SiteParameter(String paramId, String paramName, String paramValue,
			String paramComment, String remark, Integer checked,
			String checkUser, Timestamp checkTime, Timestamp operTime,
			String operUser, Integer removeTag, Integer rsrvStr1,
			String rsrvStr2, String rsrvStr3, String rsrvStr4, String rsrvStr5,
			String rsrvStr6, String rsrvStr7, String rsrvStr8, String rsrvStr9,
			String rsrvStr10) {
		this.paramId = paramId;
		this.paramName = paramName;
		this.paramValue = paramValue;
		this.paramComment = paramComment;
		this.remark = remark;
		this.checked = checked;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.operTime = operTime;
		this.operUser = operUser;
		this.removeTag = removeTag;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
		this.rsrvStr6 = rsrvStr6;
		this.rsrvStr7 = rsrvStr7;
		this.rsrvStr8 = rsrvStr8;
		this.rsrvStr9 = rsrvStr9;
		this.rsrvStr10 = rsrvStr10;
	}

	// Property accessors

	public String getParamId() {
		return this.paramId;
	}

	public void setParamId(String paramId) {
		this.paramId = paramId;
	}

	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
	}

	public String getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
	}

	public String getParamComment() {
		return this.paramComment;
	}

	public void setParamComment(String paramComment) {
		this.paramComment = paramComment;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getChecked() {
		return this.checked;
	}

	public void setChecked(Integer checked) {
		this.checked = checked;
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

	public Timestamp getOperTime() {
		return this.operTime;
	}

	public void setOperTime(Timestamp operTime) {
		this.operTime = operTime;
	}

	public String getOperUser() {
		return this.operUser;
	}

	public void setOperUser(String operUser) {
		this.operUser = operUser;
	}

	public Integer getRemoveTag() {
		return this.removeTag;
	}

	public void setRemoveTag(Integer removeTag) {
		this.removeTag = removeTag;
	}

	public Integer getRsrvStr1() {
		return this.rsrvStr1;
	}

	public void setRsrvStr1(Integer rsrvStr1) {
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

	public String getRsrvStr6() {
		return this.rsrvStr6;
	}

	public void setRsrvStr6(String rsrvStr6) {
		this.rsrvStr6 = rsrvStr6;
	}

	public String getRsrvStr7() {
		return this.rsrvStr7;
	}

	public void setRsrvStr7(String rsrvStr7) {
		this.rsrvStr7 = rsrvStr7;
	}

	public String getRsrvStr8() {
		return this.rsrvStr8;
	}

	public void setRsrvStr8(String rsrvStr8) {
		this.rsrvStr8 = rsrvStr8;
	}

	public String getRsrvStr9() {
		return this.rsrvStr9;
	}

	public void setRsrvStr9(String rsrvStr9) {
		this.rsrvStr9 = rsrvStr9;
	}

	public String getRsrvStr10() {
		return this.rsrvStr10;
	}

	public void setRsrvStr10(String rsrvStr10) {
		this.rsrvStr10 = rsrvStr10;
	}

}