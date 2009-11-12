package com.ada.entity;

import java.sql.Timestamp;

/**
 * Links entity. @author MyEclipse Persistence Tools
 */

public class Links implements java.io.Serializable {

	// Fields

	private String tradeId;
	private String custId;
	private String linkName;
	private String linkAddr;
	private String linkComment;
	private Integer display;
	private Integer checked;
	private String checkUser;
	private Timestamp checkTime;
	private String operUser;
	private Timestamp operTime;
	private Integer removeTag;
	private String comment;
	private Timestamp addTime;

	// Constructors

	/** default constructor */
	public Links() {
	}

	/** minimal constructor */
	public Links(String tradeId, String custId, String linkName,
			String linkAddr, String operUser, Timestamp operTime,
			Timestamp addTime) {
		this.tradeId = tradeId;
		this.custId = custId;
		this.linkName = linkName;
		this.linkAddr = linkAddr;
		this.operUser = operUser;
		this.operTime = operTime;
		this.addTime = addTime;
	}

	/** full constructor */
	public Links(String tradeId, String custId, String linkName,
			String linkAddr, String linkComment, Integer display,
			Integer checked, String checkUser, Timestamp checkTime,
			String operUser, Timestamp operTime, Integer removeTag,
			String comment, Timestamp addTime) {
		this.tradeId = tradeId;
		this.custId = custId;
		this.linkName = linkName;
		this.linkAddr = linkAddr;
		this.linkComment = linkComment;
		this.display = display;
		this.checked = checked;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.operUser = operUser;
		this.operTime = operTime;
		this.removeTag = removeTag;
		this.comment = comment;
		this.addTime = addTime;
	}

	// Property accessors

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getLinkName() {
		return this.linkName;
	}

	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}

	public String getLinkAddr() {
		return this.linkAddr;
	}

	public void setLinkAddr(String linkAddr) {
		this.linkAddr = linkAddr;
	}

	public String getLinkComment() {
		return this.linkComment;
	}

	public void setLinkComment(String linkComment) {
		this.linkComment = linkComment;
	}

	public Integer getDisplay() {
		return this.display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
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

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Timestamp getAddTime() {
		return this.addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

}