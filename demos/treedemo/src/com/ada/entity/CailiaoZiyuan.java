package com.ada.entity;

import java.util.Date;

/**
 * CailiaoZiyuan entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class CailiaoZiyuan implements java.io.Serializable {

	// Fields

	private String cailiaoZiyuanId;
	private String cailiaoTypeId;
	private String companyNo;
	private String cailiaoNo;
	private String cailiaoName;
	private String cailiaoPinpai;
	private String cailiaoDanwei;
	private Double cailiaoAdPrice;
	private String cailiaoGuige;
	private String cailiaoType;
	private String cailiaoInTime;
	private Date cailiaoLastUpdateTime;
	private Byte cailiaoDelete;
	private String demo1;
	private String demo2;
	private String demo3;
	private String demo4;

	// Constructors

	/** default constructor */
	public CailiaoZiyuan() {
	}

	/** minimal constructor */
	public CailiaoZiyuan(String cailiaoZiyuanId) {
		this.cailiaoZiyuanId = cailiaoZiyuanId;
	}

	/** full constructor */
	public CailiaoZiyuan(String cailiaoZiyuanId, String cailiaoTypeId,
			String companyNo, String cailiaoNo, String cailiaoName,
			String cailiaoPinpai, String cailiaoDanwei, Double cailiaoAdPrice,
			String cailiaoGuige, String cailiaoType, String cailiaoInTime,
			Date cailiaoLastUpdateTime, Byte cailiaoDelete, String demo1,
			String demo2, String demo3, String demo4) {
		this.cailiaoZiyuanId = cailiaoZiyuanId;
		this.cailiaoTypeId = cailiaoTypeId;
		this.companyNo = companyNo;
		this.cailiaoNo = cailiaoNo;
		this.cailiaoName = cailiaoName;
		this.cailiaoPinpai = cailiaoPinpai;
		this.cailiaoDanwei = cailiaoDanwei;
		this.cailiaoAdPrice = cailiaoAdPrice;
		this.cailiaoGuige = cailiaoGuige;
		this.cailiaoType = cailiaoType;
		this.cailiaoInTime = cailiaoInTime;
		this.cailiaoLastUpdateTime = cailiaoLastUpdateTime;
		this.cailiaoDelete = cailiaoDelete;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.demo3 = demo3;
		this.demo4 = demo4;
	}

	// Property accessors

	public String getCailiaoZiyuanId() {
		return this.cailiaoZiyuanId;
	}

	public void setCailiaoZiyuanId(String cailiaoZiyuanId) {
		this.cailiaoZiyuanId = cailiaoZiyuanId;
	}

	public String getCailiaoTypeId() {
		return this.cailiaoTypeId;
	}

	public void setCailiaoTypeId(String cailiaoTypeId) {
		this.cailiaoTypeId = cailiaoTypeId;
	}

	public String getCompanyNo() {
		return this.companyNo;
	}

	public void setCompanyNo(String companyNo) {
		this.companyNo = companyNo;
	}

	public String getCailiaoNo() {
		return this.cailiaoNo;
	}

	public void setCailiaoNo(String cailiaoNo) {
		this.cailiaoNo = cailiaoNo;
	}

	public String getCailiaoName() {
		return this.cailiaoName;
	}

	public void setCailiaoName(String cailiaoName) {
		this.cailiaoName = cailiaoName;
	}

	public String getCailiaoPinpai() {
		return this.cailiaoPinpai;
	}

	public void setCailiaoPinpai(String cailiaoPinpai) {
		this.cailiaoPinpai = cailiaoPinpai;
	}

	public String getCailiaoDanwei() {
		return this.cailiaoDanwei;
	}

	public void setCailiaoDanwei(String cailiaoDanwei) {
		this.cailiaoDanwei = cailiaoDanwei;
	}

	public Double getCailiaoAdPrice() {
		return this.cailiaoAdPrice;
	}

	public void setCailiaoAdPrice(Double cailiaoAdPrice) {
		this.cailiaoAdPrice = cailiaoAdPrice;
	}

	public String getCailiaoGuige() {
		return this.cailiaoGuige;
	}

	public void setCailiaoGuige(String cailiaoGuige) {
		this.cailiaoGuige = cailiaoGuige;
	}

	public String getCailiaoType() {
		return this.cailiaoType;
	}

	public void setCailiaoType(String cailiaoType) {
		this.cailiaoType = cailiaoType;
	}

	public String getCailiaoInTime() {
		return this.cailiaoInTime;
	}

	public void setCailiaoInTime(String cailiaoInTime) {
		this.cailiaoInTime = cailiaoInTime;
	}

	public Date getCailiaoLastUpdateTime() {
		return this.cailiaoLastUpdateTime;
	}

	public void setCailiaoLastUpdateTime(Date cailiaoLastUpdateTime) {
		this.cailiaoLastUpdateTime = cailiaoLastUpdateTime;
	}

	public Byte getCailiaoDelete() {
		return this.cailiaoDelete;
	}

	public void setCailiaoDelete(Byte cailiaoDelete) {
		this.cailiaoDelete = cailiaoDelete;
	}

	public String getDemo1() {
		return this.demo1;
	}

	public void setDemo1(String demo1) {
		this.demo1 = demo1;
	}

	public String getDemo2() {
		return this.demo2;
	}

	public void setDemo2(String demo2) {
		this.demo2 = demo2;
	}

	public String getDemo3() {
		return this.demo3;
	}

	public void setDemo3(String demo3) {
		this.demo3 = demo3;
	}

	public String getDemo4() {
		return this.demo4;
	}

	public void setDemo4(String demo4) {
		this.demo4 = demo4;
	}

}