package com.ada.entity;

import java.sql.Timestamp;

/**
 * Sales entity. @author MyEclipse Persistence Tools
 */

public class Sales implements java.io.Serializable {

	// Fields

	private String salesId;
	private String custId;
	private String productId;
	private Integer productType;
	private String productName;
	private String className;
	private String classId;
	private String areaId;
	private String productAbstract;
	private String productDesc;
	private String productSite;
	private String productUnit;
	private Integer attachTag;
	private String updateUserId;
	private Timestamp updateTime;
	private Timestamp displayTime;
	private Integer display;
	private Timestamp displayEndDate;
	private Timestamp displayStartDate;
	private Integer num;
	private String packType;
	private Float miniSupply;
	private String delivery;
	private String logistics;
	private Integer salePatter;
	private String paymentPatter;
	private String keyword;
	private String bigImg;
	private String midImg;
	private String smallImg;
	private Integer click;
	private Integer commend;
	private String commendUserId;
	private Timestamp commendTime;
	private Integer hotSales;
	private Integer goodSales;
	private String color;
	private String productKey;
	private String productPrivicy;
	private Integer listTop;
	private Float salePrice;
	private Float mutilPrice;
	private String publishUserId;
	private Timestamp publishDate;
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
	private String title;
	private String attach;

	// Constructors

	/** default constructor */
	public Sales() {
	}

	/** minimal constructor */
	public Sales(String salesId) {
		this.salesId = salesId;
	}

	/** full constructor */
	public Sales(String salesId, String custId, String productId,
			Integer productType, String productName, String className,
			String classId, String areaId, String productAbstract,
			String productDesc, String productSite, String productUnit,
			Integer attachTag, String updateUserId, Timestamp updateTime,
			Timestamp displayTime, Integer display, Timestamp displayEndDate,
			Timestamp displayStartDate, Integer num, String packType,
			Float miniSupply, String delivery, String logistics,
			Integer salePatter, String paymentPatter, String keyword,
			String bigImg, String midImg, String smallImg, Integer click,
			Integer commend, String commendUserId, Timestamp commendTime,
			Integer hotSales, Integer goodSales, String color,
			String productKey, String productPrivicy, Integer listTop,
			Float salePrice, Float mutilPrice, String publishUserId,
			Timestamp publishDate, Integer validity, String checkUser,
			Timestamp checkTime, String backReason, String rsrvStr1,
			String rsrvStr2, String rsrvStr3, String rsrvStr4, String rsrvStr5,
			String moneytype, String title, String attach) {
		this.salesId = salesId;
		this.custId = custId;
		this.productId = productId;
		this.productType = productType;
		this.productName = productName;
		this.className = className;
		this.classId = classId;
		this.areaId = areaId;
		this.productAbstract = productAbstract;
		this.productDesc = productDesc;
		this.productSite = productSite;
		this.productUnit = productUnit;
		this.attachTag = attachTag;
		this.updateUserId = updateUserId;
		this.updateTime = updateTime;
		this.displayTime = displayTime;
		this.display = display;
		this.displayEndDate = displayEndDate;
		this.displayStartDate = displayStartDate;
		this.num = num;
		this.packType = packType;
		this.miniSupply = miniSupply;
		this.delivery = delivery;
		this.logistics = logistics;
		this.salePatter = salePatter;
		this.paymentPatter = paymentPatter;
		this.keyword = keyword;
		this.bigImg = bigImg;
		this.midImg = midImg;
		this.smallImg = smallImg;
		this.click = click;
		this.commend = commend;
		this.commendUserId = commendUserId;
		this.commendTime = commendTime;
		this.hotSales = hotSales;
		this.goodSales = goodSales;
		this.color = color;
		this.productKey = productKey;
		this.productPrivicy = productPrivicy;
		this.listTop = listTop;
		this.salePrice = salePrice;
		this.mutilPrice = mutilPrice;
		this.publishUserId = publishUserId;
		this.publishDate = publishDate;
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
		this.title = title;
		this.attach = attach;
	}

	// Property accessors

	public String getSalesId() {
		return this.salesId;
	}

	public void setSalesId(String salesId) {
		this.salesId = salesId;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Integer getProductType() {
		return this.productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public String getProductAbstract() {
		return this.productAbstract;
	}

	public void setProductAbstract(String productAbstract) {
		this.productAbstract = productAbstract;
	}

	public String getProductDesc() {
		return this.productDesc;
	}

	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	public String getProductSite() {
		return this.productSite;
	}

	public void setProductSite(String productSite) {
		this.productSite = productSite;
	}

	public String getProductUnit() {
		return this.productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public Integer getAttachTag() {
		return this.attachTag;
	}

	public void setAttachTag(Integer attachTag) {
		this.attachTag = attachTag;
	}

	public String getUpdateUserId() {
		return this.updateUserId;
	}

	public void setUpdateUserId(String updateUserId) {
		this.updateUserId = updateUserId;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public Timestamp getDisplayTime() {
		return this.displayTime;
	}

	public void setDisplayTime(Timestamp displayTime) {
		this.displayTime = displayTime;
	}

	public Integer getDisplay() {
		return this.display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
	}

	public Timestamp getDisplayEndDate() {
		return this.displayEndDate;
	}

	public void setDisplayEndDate(Timestamp displayEndDate) {
		this.displayEndDate = displayEndDate;
	}

	public Timestamp getDisplayStartDate() {
		return this.displayStartDate;
	}

	public void setDisplayStartDate(Timestamp displayStartDate) {
		this.displayStartDate = displayStartDate;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getPackType() {
		return this.packType;
	}

	public void setPackType(String packType) {
		this.packType = packType;
	}

	public Float getMiniSupply() {
		return this.miniSupply;
	}

	public void setMiniSupply(Float miniSupply) {
		this.miniSupply = miniSupply;
	}

	public String getDelivery() {
		return this.delivery;
	}

	public void setDelivery(String delivery) {
		this.delivery = delivery;
	}

	public String getLogistics() {
		return this.logistics;
	}

	public void setLogistics(String logistics) {
		this.logistics = logistics;
	}

	public Integer getSalePatter() {
		return this.salePatter;
	}

	public void setSalePatter(Integer salePatter) {
		this.salePatter = salePatter;
	}

	public String getPaymentPatter() {
		return this.paymentPatter;
	}

	public void setPaymentPatter(String paymentPatter) {
		this.paymentPatter = paymentPatter;
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getBigImg() {
		return this.bigImg;
	}

	public void setBigImg(String bigImg) {
		this.bigImg = bigImg;
	}

	public String getMidImg() {
		return this.midImg;
	}

	public void setMidImg(String midImg) {
		this.midImg = midImg;
	}

	public String getSmallImg() {
		return this.smallImg;
	}

	public void setSmallImg(String smallImg) {
		this.smallImg = smallImg;
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

	public Integer getHotSales() {
		return this.hotSales;
	}

	public void setHotSales(Integer hotSales) {
		this.hotSales = hotSales;
	}

	public Integer getGoodSales() {
		return this.goodSales;
	}

	public void setGoodSales(Integer goodSales) {
		this.goodSales = goodSales;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getProductKey() {
		return this.productKey;
	}

	public void setProductKey(String productKey) {
		this.productKey = productKey;
	}

	public String getProductPrivicy() {
		return this.productPrivicy;
	}

	public void setProductPrivicy(String productPrivicy) {
		this.productPrivicy = productPrivicy;
	}

	public Integer getListTop() {
		return this.listTop;
	}

	public void setListTop(Integer listTop) {
		this.listTop = listTop;
	}

	public Float getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Float salePrice) {
		this.salePrice = salePrice;
	}

	public Float getMutilPrice() {
		return this.mutilPrice;
	}

	public void setMutilPrice(Float mutilPrice) {
		this.mutilPrice = mutilPrice;
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAttach() {
		return this.attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

}