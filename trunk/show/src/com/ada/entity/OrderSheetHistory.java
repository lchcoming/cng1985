package com.ada.entity;

import java.sql.Timestamp;

/**
 * OrderSheetHistory entity. @author MyEclipse Persistence Tools
 */

public class OrderSheetHistory implements java.io.Serializable {

	// Fields

	private String tradeId;
	private String orderId;
	private String orderName;
	private String buyerCustId;
	private String buyerCustName;
	private String saleCustId;
	private String saleCustName;
	private Integer orderType;
	private String price;
	private String discount;
	private String num;
	private Float money;
	private Timestamp deadDate;
	private String site;
	private String sendStyle;
	private String payStyle;
	private String buyTel;
	private String buyAdd;
	private String buyUser;
	private String buyCode;
	private String buyBank;
	private String buyBankCompany;
	private String buyBankCode;
	private String saleTel;
	private String saleAdd;
	private String saleUser;
	private String saleCode;
	private String saleBank;
	private String saleBankCompany;
	private String saleBankCode;
	private String reveUser;
	private Timestamp startDate;
	private Timestamp endDate;
	private Timestamp operDate;
	private String carriagePay;
	private Float sumMoney;
	private String orderComment;
	private String buyOperUser;
	private String saleOperUser;
	private Timestamp buyInDate;
	private Timestamp saleInDate;
	private String remark;
	private String operUser;
	private Timestamp operTime;
	private String moneytype;

	// Constructors

	/** default constructor */
	public OrderSheetHistory() {
	}

	/** minimal constructor */
	public OrderSheetHistory(String tradeId, String orderId, String orderName,
			String buyerCustId, String buyerCustName, String saleCustId,
			String saleCustName, String price) {
		this.tradeId = tradeId;
		this.orderId = orderId;
		this.orderName = orderName;
		this.buyerCustId = buyerCustId;
		this.buyerCustName = buyerCustName;
		this.saleCustId = saleCustId;
		this.saleCustName = saleCustName;
		this.price = price;
	}

	/** full constructor */
	public OrderSheetHistory(String tradeId, String orderId, String orderName,
			String buyerCustId, String buyerCustName, String saleCustId,
			String saleCustName, Integer orderType, String price,
			String discount, String num, Float money, Timestamp deadDate,
			String site, String sendStyle, String payStyle, String buyTel,
			String buyAdd, String buyUser, String buyCode, String buyBank,
			String buyBankCompany, String buyBankCode, String saleTel,
			String saleAdd, String saleUser, String saleCode, String saleBank,
			String saleBankCompany, String saleBankCode, String reveUser,
			Timestamp startDate, Timestamp endDate, Timestamp operDate,
			String carriagePay, Float sumMoney, String orderComment,
			String buyOperUser, String saleOperUser, Timestamp buyInDate,
			Timestamp saleInDate, String remark, String operUser,
			Timestamp operTime, String moneytype) {
		this.tradeId = tradeId;
		this.orderId = orderId;
		this.orderName = orderName;
		this.buyerCustId = buyerCustId;
		this.buyerCustName = buyerCustName;
		this.saleCustId = saleCustId;
		this.saleCustName = saleCustName;
		this.orderType = orderType;
		this.price = price;
		this.discount = discount;
		this.num = num;
		this.money = money;
		this.deadDate = deadDate;
		this.site = site;
		this.sendStyle = sendStyle;
		this.payStyle = payStyle;
		this.buyTel = buyTel;
		this.buyAdd = buyAdd;
		this.buyUser = buyUser;
		this.buyCode = buyCode;
		this.buyBank = buyBank;
		this.buyBankCompany = buyBankCompany;
		this.buyBankCode = buyBankCode;
		this.saleTel = saleTel;
		this.saleAdd = saleAdd;
		this.saleUser = saleUser;
		this.saleCode = saleCode;
		this.saleBank = saleBank;
		this.saleBankCompany = saleBankCompany;
		this.saleBankCode = saleBankCode;
		this.reveUser = reveUser;
		this.startDate = startDate;
		this.endDate = endDate;
		this.operDate = operDate;
		this.carriagePay = carriagePay;
		this.sumMoney = sumMoney;
		this.orderComment = orderComment;
		this.buyOperUser = buyOperUser;
		this.saleOperUser = saleOperUser;
		this.buyInDate = buyInDate;
		this.saleInDate = saleInDate;
		this.remark = remark;
		this.operUser = operUser;
		this.operTime = operTime;
		this.moneytype = moneytype;
	}

	// Property accessors

	public String getTradeId() {
		return this.tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public String getOrderId() {
		return this.orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderName() {
		return this.orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public String getBuyerCustId() {
		return this.buyerCustId;
	}

	public void setBuyerCustId(String buyerCustId) {
		this.buyerCustId = buyerCustId;
	}

	public String getBuyerCustName() {
		return this.buyerCustName;
	}

	public void setBuyerCustName(String buyerCustName) {
		this.buyerCustName = buyerCustName;
	}

	public String getSaleCustId() {
		return this.saleCustId;
	}

	public void setSaleCustId(String saleCustId) {
		this.saleCustId = saleCustId;
	}

	public String getSaleCustName() {
		return this.saleCustName;
	}

	public void setSaleCustName(String saleCustName) {
		this.saleCustName = saleCustName;
	}

	public Integer getOrderType() {
		return this.orderType;
	}

	public void setOrderType(Integer orderType) {
		this.orderType = orderType;
	}

	public String getPrice() {
		return this.price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getDiscount() {
		return this.discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public String getNum() {
		return this.num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public Float getMoney() {
		return this.money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public Timestamp getDeadDate() {
		return this.deadDate;
	}

	public void setDeadDate(Timestamp deadDate) {
		this.deadDate = deadDate;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public String getSendStyle() {
		return this.sendStyle;
	}

	public void setSendStyle(String sendStyle) {
		this.sendStyle = sendStyle;
	}

	public String getPayStyle() {
		return this.payStyle;
	}

	public void setPayStyle(String payStyle) {
		this.payStyle = payStyle;
	}

	public String getBuyTel() {
		return this.buyTel;
	}

	public void setBuyTel(String buyTel) {
		this.buyTel = buyTel;
	}

	public String getBuyAdd() {
		return this.buyAdd;
	}

	public void setBuyAdd(String buyAdd) {
		this.buyAdd = buyAdd;
	}

	public String getBuyUser() {
		return this.buyUser;
	}

	public void setBuyUser(String buyUser) {
		this.buyUser = buyUser;
	}

	public String getBuyCode() {
		return this.buyCode;
	}

	public void setBuyCode(String buyCode) {
		this.buyCode = buyCode;
	}

	public String getBuyBank() {
		return this.buyBank;
	}

	public void setBuyBank(String buyBank) {
		this.buyBank = buyBank;
	}

	public String getBuyBankCompany() {
		return this.buyBankCompany;
	}

	public void setBuyBankCompany(String buyBankCompany) {
		this.buyBankCompany = buyBankCompany;
	}

	public String getBuyBankCode() {
		return this.buyBankCode;
	}

	public void setBuyBankCode(String buyBankCode) {
		this.buyBankCode = buyBankCode;
	}

	public String getSaleTel() {
		return this.saleTel;
	}

	public void setSaleTel(String saleTel) {
		this.saleTel = saleTel;
	}

	public String getSaleAdd() {
		return this.saleAdd;
	}

	public void setSaleAdd(String saleAdd) {
		this.saleAdd = saleAdd;
	}

	public String getSaleUser() {
		return this.saleUser;
	}

	public void setSaleUser(String saleUser) {
		this.saleUser = saleUser;
	}

	public String getSaleCode() {
		return this.saleCode;
	}

	public void setSaleCode(String saleCode) {
		this.saleCode = saleCode;
	}

	public String getSaleBank() {
		return this.saleBank;
	}

	public void setSaleBank(String saleBank) {
		this.saleBank = saleBank;
	}

	public String getSaleBankCompany() {
		return this.saleBankCompany;
	}

	public void setSaleBankCompany(String saleBankCompany) {
		this.saleBankCompany = saleBankCompany;
	}

	public String getSaleBankCode() {
		return this.saleBankCode;
	}

	public void setSaleBankCode(String saleBankCode) {
		this.saleBankCode = saleBankCode;
	}

	public String getReveUser() {
		return this.reveUser;
	}

	public void setReveUser(String reveUser) {
		this.reveUser = reveUser;
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

	public Timestamp getOperDate() {
		return this.operDate;
	}

	public void setOperDate(Timestamp operDate) {
		this.operDate = operDate;
	}

	public String getCarriagePay() {
		return this.carriagePay;
	}

	public void setCarriagePay(String carriagePay) {
		this.carriagePay = carriagePay;
	}

	public Float getSumMoney() {
		return this.sumMoney;
	}

	public void setSumMoney(Float sumMoney) {
		this.sumMoney = sumMoney;
	}

	public String getOrderComment() {
		return this.orderComment;
	}

	public void setOrderComment(String orderComment) {
		this.orderComment = orderComment;
	}

	public String getBuyOperUser() {
		return this.buyOperUser;
	}

	public void setBuyOperUser(String buyOperUser) {
		this.buyOperUser = buyOperUser;
	}

	public String getSaleOperUser() {
		return this.saleOperUser;
	}

	public void setSaleOperUser(String saleOperUser) {
		this.saleOperUser = saleOperUser;
	}

	public Timestamp getBuyInDate() {
		return this.buyInDate;
	}

	public void setBuyInDate(Timestamp buyInDate) {
		this.buyInDate = buyInDate;
	}

	public Timestamp getSaleInDate() {
		return this.saleInDate;
	}

	public void setSaleInDate(Timestamp saleInDate) {
		this.saleInDate = saleInDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getMoneytype() {
		return this.moneytype;
	}

	public void setMoneytype(String moneytype) {
		this.moneytype = moneytype;
	}

}