package com.ada.entity;

import java.sql.Timestamp;

/**
 * Leavewords entity. @author MyEclipse Persistence Tools
 */

public class Leavewords implements java.io.Serializable {

	// Fields

	private String leaveId;
	private String newId;
	private String title;
	private String content;
	private Integer wordType;
	private String custId;
	private String userId;
	private String userName;
	private String forLeaveId;
	private String forLeaveUser;
	private String cellphone;
	private String phone;
	private String email;
	private String qq;
	private String contactAddr;
	private String otherContact;
	private Timestamp inDate;
	private String remark;
	private Integer checked;
	private String checkUser;
	private Timestamp checkTime;
	private Integer read;
	private String forLeaveCust;

	// Constructors

	/** default constructor */
	public Leavewords() {
	}

	/** minimal constructor */
	public Leavewords(String leaveId, String newId, String title,
			String content, Integer wordType, String forLeaveCust) {
		this.leaveId = leaveId;
		this.newId = newId;
		this.title = title;
		this.content = content;
		this.wordType = wordType;
		this.forLeaveCust = forLeaveCust;
	}

	/** full constructor */
	public Leavewords(String leaveId, String newId, String title,
			String content, Integer wordType, String custId, String userId,
			String userName, String forLeaveId, String forLeaveUser,
			String cellphone, String phone, String email, String qq,
			String contactAddr, String otherContact, Timestamp inDate,
			String remark, Integer checked, String checkUser,
			Timestamp checkTime, Integer read, String forLeaveCust) {
		this.leaveId = leaveId;
		this.newId = newId;
		this.title = title;
		this.content = content;
		this.wordType = wordType;
		this.custId = custId;
		this.userId = userId;
		this.userName = userName;
		this.forLeaveId = forLeaveId;
		this.forLeaveUser = forLeaveUser;
		this.cellphone = cellphone;
		this.phone = phone;
		this.email = email;
		this.qq = qq;
		this.contactAddr = contactAddr;
		this.otherContact = otherContact;
		this.inDate = inDate;
		this.remark = remark;
		this.checked = checked;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.read = read;
		this.forLeaveCust = forLeaveCust;
	}

	// Property accessors

	public String getLeaveId() {
		return this.leaveId;
	}

	public void setLeaveId(String leaveId) {
		this.leaveId = leaveId;
	}

	public String getNewId() {
		return this.newId;
	}

	public void setNewId(String newId) {
		this.newId = newId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getWordType() {
		return this.wordType;
	}

	public void setWordType(Integer wordType) {
		this.wordType = wordType;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

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

	public String getForLeaveId() {
		return this.forLeaveId;
	}

	public void setForLeaveId(String forLeaveId) {
		this.forLeaveId = forLeaveId;
	}

	public String getForLeaveUser() {
		return this.forLeaveUser;
	}

	public void setForLeaveUser(String forLeaveUser) {
		this.forLeaveUser = forLeaveUser;
	}

	public String getCellphone() {
		return this.cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getContactAddr() {
		return this.contactAddr;
	}

	public void setContactAddr(String contactAddr) {
		this.contactAddr = contactAddr;
	}

	public String getOtherContact() {
		return this.otherContact;
	}

	public void setOtherContact(String otherContact) {
		this.otherContact = otherContact;
	}

	public Timestamp getInDate() {
		return this.inDate;
	}

	public void setInDate(Timestamp inDate) {
		this.inDate = inDate;
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

	public Integer getRead() {
		return this.read;
	}

	public void setRead(Integer read) {
		this.read = read;
	}

	public String getForLeaveCust() {
		return this.forLeaveCust;
	}

	public void setForLeaveCust(String forLeaveCust) {
		this.forLeaveCust = forLeaveCust;
	}

}