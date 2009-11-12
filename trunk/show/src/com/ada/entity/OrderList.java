package com.ada.entity;

import java.sql.Timestamp;

/**
 * OrderList entity. @author MyEclipse Persistence Tools
 */

public class OrderList implements java.io.Serializable {

	// Fields

	private String tradeId;
	private String orderId;
	private String stockId;
	private String stockName;
	private Integer stockNum;
	private String stockUnit;
	private Float stockPrice;
	private Float stockTotlePrice;
	private Integer state;
	private String operUser;
	private Timestamp operTime;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;
	private String moneytype;
	private String sessionId;

	// Constructors

	/** default constructor */
	public OrderList() {
	}

	/** minimal constructor */
	public OrderList(String tradeId, String stockId, String stockName,
			Integer stockNum, String stockUnit, Float stockPrice,
			Float stockTotlePrice, String operUser, Timestamp operTime) {
		this.tradeId = tradeId;
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockNum = stockNum;
		this.stockUnit = stockUnit;
		this.stockPrice = stockPrice;
		this.stockTotlePrice = stockTotlePrice;
		this.operUser = operUser;
		this.operTime = operTime;
	}

	/** full constructor */
	public OrderList(String tradeId, String orderId, String stockId,
			String stockName, Integer stockNum, String stockUnit,
			Float stockPrice, Float stockTotlePrice, Integer state,
			String operUser, Timestamp operTime, String rsrvStr1,
			String rsrvStr2, String rsrvStr3, String rsrvStr4, String rsrvStr5,
			String moneytype, String sessionId) {
		this.tradeId = tradeId;
		this.orderId = orderId;
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockNum = stockNum;
		this.stockUnit = stockUnit;
		this.stockPrice = stockPrice;
		this.stockTotlePrice = stockTotlePrice;
		this.state = state;
		this.operUser = operUser;
		this.operTime = operTime;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
		this.moneytype = moneytype;
		this.sessionId = sessionId;
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

	public String getStockId() {
		return this.stockId;
	}

	public void setStockId(String stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public Integer getStockNum() {
		return this.stockNum;
	}

	public void setStockNum(Integer stockNum) {
		this.stockNum = stockNum;
	}

	public String getStockUnit() {
		return this.stockUnit;
	}

	public void setStockUnit(String stockUnit) {
		this.stockUnit = stockUnit;
	}

	public Float getStockPrice() {
		return this.stockPrice;
	}

	public void setStockPrice(Float stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Float getStockTotlePrice() {
		return this.stockTotlePrice;
	}

	public void setStockTotlePrice(Float stockTotlePrice) {
		this.stockTotlePrice = stockTotlePrice;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
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

	public String getMoneytype() {
		return this.moneytype;
	}

	public void setMoneytype(String moneytype) {
		this.moneytype = moneytype;
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

}