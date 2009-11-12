package com.ada.entity;

import java.sql.Timestamp;

/**
 * Inquiry entity. @author MyEclipse Persistence Tools
 */

public class Inquiry implements java.io.Serializable {

	// Fields

	private InquiryId id;
	private String title;
	private Integer productNum;
	private Float productPrice;
	private String productStyle;
	private String content;
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
	private Integer commentsStatus;
	private String auditUserId;
	private Timestamp auditDate;
	private Integer read;
	private String moneytype;

	// Constructors

	/** default constructor */
	public Inquiry() {
	}

	/** minimal constructor */
	public Inquiry(InquiryId id, String title) {
		this.id = id;
		this.title = title;
	}

	/** full constructor */
	public Inquiry(InquiryId id, String title, Integer productNum,
			Float productPrice, String productStyle, String content,
			String custId, String userId, String userName, String forLeaveId,
			String forLeaveUser, String cellphone, String phone, String email,
			String qq, String contactAddr, String otherContact,
			Timestamp inDate, String remark, Integer commentsStatus,
			String auditUserId, Timestamp auditDate, Integer read,
			String moneytype) {
		this.id = id;
		this.title = title;
		this.productNum = productNum;
		this.productPrice = productPrice;
		this.productStyle = productStyle;
		this.content = content;
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
		this.commentsStatus = commentsStatus;
		this.auditUserId = auditUserId;
		this.auditDate = auditDate;
		this.read = read;
		this.moneytype = moneytype;
	}

	// Property accessors

	public InquiryId getId() {
		return this.id;
	}

	public void setId(InquiryId id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getProductNum() {
		return this.productNum;
	}

	public void setProductNum(Integer productNum) {
		this.productNum = productNum;
	}

	public Float getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductStyle() {
		return this.productStyle;
	}

	public void setProductStyle(String productStyle) {
		this.productStyle = productStyle;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public Integer getCommentsStatus() {
		return this.commentsStatus;
	}

	public void setCommentsStatus(Integer commentsStatus) {
		this.commentsStatus = commentsStatus;
	}

	public String getAuditUserId() {
		return this.auditUserId;
	}

	public void setAuditUserId(String auditUserId) {
		this.auditUserId = auditUserId;
	}

	public Timestamp getAuditDate() {
		return this.auditDate;
	}

	public void setAuditDate(Timestamp auditDate) {
		this.auditDate = auditDate;
	}

	public Integer getRead() {
		return this.read;
	}

	public void setRead(Integer read) {
		this.read = read;
	}

	public String getMoneytype() {
		return this.moneytype;
	}

	public void setMoneytype(String moneytype) {
		this.moneytype = moneytype;
	}

}