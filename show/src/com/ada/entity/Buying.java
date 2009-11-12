package com.ada.entity;

import java.sql.Timestamp;

/**
 * Buying entity. @author MyEclipse Persistence Tools
 */

public class Buying implements java.io.Serializable {

	// Fields

	private String buyingId;
	private String custId;
	private Integer buyingType;
	private String buyingName;
	private String buyingAbstract;
	private String buyingDesc;
	private String buyingSite;
	private String buyingUnit;
	private Integer attachTag;
	private String className;
	private String classId;
	private String areaId;
	private String operUser;
	private Timestamp operTime;
	private Timestamp updateTime;
	private Float buyingNum;
	private Integer salePatter;
	private String expectPrices;
	private String packType;
	private String delivery;
	private String certifyReq;
	private String productSpecReq;
	private String logistics;
	private Integer paymentPatter;
	private Timestamp startDate;
	private Timestamp endDate;
	private String keywords;
	private Integer click;
	private Integer commend;
	private String commendUserId;
	private Timestamp commendTime;
	private Integer hotBuying;
	private Integer goodBuying;
	private String color;
	private String buyingKey;
	private String buyingPrivicy;
	private Integer listTop;
	private String publishUserId;
	private Timestamp publishDate;
	private Integer display;
	private Integer validity;
	private String checkUser;
	private Timestamp checkTime;
	private String backReason;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;
	private String moneytype;
	private String attachId;

	// Constructors

	/** default constructor */
	public Buying() {
	}

	/** minimal constructor */
	public Buying(String buyingId, String custId, String buyingName,
			String operUser, Timestamp operTime) {
		this.buyingId = buyingId;
		this.custId = custId;
		this.buyingName = buyingName;
		this.operUser = operUser;
		this.operTime = operTime;
	}

	/** full constructor */
	public Buying(String buyingId, String custId, Integer buyingType,
			String buyingName, String buyingAbstract, String buyingDesc,
			String buyingSite, String buyingUnit, Integer attachTag,
			String className, String classId, String areaId, String operUser,
			Timestamp operTime, Timestamp updateTime, Float buyingNum,
			Integer salePatter, String expectPrices, String packType,
			String delivery, String certifyReq, String productSpecReq,
			String logistics, Integer paymentPatter, Timestamp startDate,
			Timestamp endDate, String keywords, Integer click, Integer commend,
			String commendUserId, Timestamp commendTime, Integer hotBuying,
			Integer goodBuying, String color, String buyingKey,
			String buyingPrivicy, Integer listTop, String publishUserId,
			Timestamp publishDate, Integer display, Integer validity,
			String checkUser, Timestamp checkTime, String backReason,
			String rsrvStr1, String rsrvStr2, String rsrvStr3, String rsrvStr4,
			String rsrvStr5, String moneytype, String attachId) {
		this.buyingId = buyingId;
		this.custId = custId;
		this.buyingType = buyingType;
		this.buyingName = buyingName;
		this.buyingAbstract = buyingAbstract;
		this.buyingDesc = buyingDesc;
		this.buyingSite = buyingSite;
		this.buyingUnit = buyingUnit;
		this.attachTag = attachTag;
		this.className = className;
		this.classId = classId;
		this.areaId = areaId;
		this.operUser = operUser;
		this.operTime = operTime;
		this.updateTime = updateTime;
		this.buyingNum = buyingNum;
		this.salePatter = salePatter;
		this.expectPrices = expectPrices;
		this.packType = packType;
		this.delivery = delivery;
		this.certifyReq = certifyReq;
		this.productSpecReq = productSpecReq;
		this.logistics = logistics;
		this.paymentPatter = paymentPatter;
		this.startDate = startDate;
		this.endDate = endDate;
		this.keywords = keywords;
		this.click = click;
		this.commend = commend;
		this.commendUserId = commendUserId;
		this.commendTime = commendTime;
		this.hotBuying = hotBuying;
		this.goodBuying = goodBuying;
		this.color = color;
		this.buyingKey = buyingKey;
		this.buyingPrivicy = buyingPrivicy;
		this.listTop = listTop;
		this.publishUserId = publishUserId;
		this.publishDate = publishDate;
		this.display = display;
		this.validity = validity;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.backReason = backReason;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
		this.moneytype = moneytype;
		this.attachId = attachId;
	}

	// Property accessors

	public String getBuyingId() {
		return this.buyingId;
	}

	public void setBuyingId(String buyingId) {
		this.buyingId = buyingId;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public Integer getBuyingType() {
		return this.buyingType;
	}

	public void setBuyingType(Integer buyingType) {
		this.buyingType = buyingType;
	}

	public String getBuyingName() {
		return this.buyingName;
	}

	public void setBuyingName(String buyingName) {
		this.buyingName = buyingName;
	}

	public String getBuyingAbstract() {
		return this.buyingAbstract;
	}

	public void setBuyingAbstract(String buyingAbstract) {
		this.buyingAbstract = buyingAbstract;
	}

	public String getBuyingDesc() {
		return this.buyingDesc;
	}

	public void setBuyingDesc(String buyingDesc) {
		this.buyingDesc = buyingDesc;
	}

	public String getBuyingSite() {
		return this.buyingSite;
	}

	public void setBuyingSite(String buyingSite) {
		this.buyingSite = buyingSite;
	}

	public String getBuyingUnit() {
		return this.buyingUnit;
	}

	public void setBuyingUnit(String buyingUnit) {
		this.buyingUnit = buyingUnit;
	}

	public Integer getAttachTag() {
		return this.attachTag;
	}

	public void setAttachTag(Integer attachTag) {
		this.attachTag = attachTag;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
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

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Float getBuyingNum() {
		return this.buyingNum;
	}

	public void setBuyingNum(Float buyingNum) {
		this.buyingNum = buyingNum;
	}

	public Integer getSalePatter() {
		return this.salePatter;
	}

	public void setSalePatter(Integer salePatter) {
		this.salePatter = salePatter;
	}

	public String getExpectPrices() {
		return this.expectPrices;
	}

	public void setExpectPrices(String expectPrices) {
		this.expectPrices = expectPrices;
	}

	public String getPackType() {
		return this.packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public String getDelivery() {
		return this.delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getCertifyReq() {
		return this.certifyReq;
	}

	public void setCertifyReq(String certifyReq) {
		this.certifyReq = certifyReq;
	}

	public String getProductSpecReq() {
		return this.productSpecReq;
	}

	public void setProductSpecReq(String productSpecReq) {
		this.productSpecReq = productSpecReq;
	}

	public String getLogistics() {
		return this.logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public Integer getPaymentPatter() {
		return this.paymentPatter;
	}

	public void setPaymentPatter(Integer paymentPatter) {
		this.paymentPatter = paymentPatter;
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

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Integer getClick() {
		return this.click;
	}

	public void setClick(Integer click) {
		this.click = click;
	}

	public Integer getCommend() {
		return this.commend;
	}

	public void setCommend(Integer commend) {
		this.commend = commend;
	}

	public String getCommendUserId() {
		return this.commendUserId;
	}

	public void setCommendUserId(String commendUserId) {
		this.commendUserId = commendUserId;
	}

	public Timestamp getCommendTime() {
		return this.commendTime;
	}

	public void setCommendTime(Timestamp commendTime) {
		this.commendTime = commendTime;
	}

	public Integer getHotBuying() {
		return this.hotBuying;
	}

	public void setHotBuying(Integer hotBuying) {
		this.hotBuying = hotBuying;
	}

	public Integer getGoodBuying() {
		return this.goodBuying;
	}

	public void setGoodBuying(Integer goodBuying) {
		this.goodBuying = goodBuying;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBuyingKey() {
		return this.buyingKey;
	}

	public void setBuyingKey(String buyingKey) {
		this.buyingKey = buyingKey;
	}

	public String getBuyingPrivicy() {
		return this.buyingPrivicy;
	}

	public void setBuyingPrivicy(String buyingPrivicy) {
		this.buyingPrivicy = buyingPrivicy;
	}

	public Integer getListTop() {
		return this.listTop;
	}

	public void setListTop(Integer listTop) {
		this.listTop = listTop;
	}

	public String getPublishUserId() {
		return this.publishUserId;
	}

	public void setPublishUserId(String publishUserId) {
		this.publishUserId = publishUserId;
	}

	public Timestamp getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getDisplay() {
		return this.display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
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

	public String getBackReason() {
		return this.backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
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

	public String getAttachId() {
		return this.attachId;
	}

	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}

}