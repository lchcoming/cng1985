package com.ada.entity;

import java.sql.Timestamp;

/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product implements java.io.Serializable {

	// Fields

	private String productId;
	private String custId;
	private String productType;
	private String productName;
	private String productAbstract;
	private String productDesc;
	private String areaId;
	private String productSite;
	private String productUnit;
	private Integer attachTag;
	private String className;
	private String classId;
	private String operUser;
	private Timestamp operTime;
	private Timestamp updateTime;
	private Integer display;
	private Timestamp displayEndDate;
	private Timestamp displayStartDate;
	private String productAblit;
	private Integer num;
	private String miniSupply;
	private Integer salePatter;
	private Integer paymentPatter;
	private String keywords;
	private String bigImg;
	private String midImg;
	private String smallImg;
	private Integer click;
	private Integer commend;
	private String commendUserId;
	private Timestamp commendTime;
	private Integer hotProduct;
	private Integer goodProduct;
	private String color;
	private String productKey;
	private String productPrivicy;
	private String listTop;
	private String productStyle;
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
	private String attachId;

	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String productId, String custId, String productType,
			String productName, String operUser, Timestamp operTime,
			String publishUserId, Timestamp publishDate) {
		this.productId = productId;
		this.custId = custId;
		this.productType = productType;
		this.productName = productName;
		this.operUser = operUser;
		this.operTime = operTime;
		this.publishUserId = publishUserId;
		this.publishDate = publishDate;
	}

	/** full constructor */
	public Product(String productId, String custId, String productType,
			String productName, String productAbstract, String productDesc,
			String areaId, String productSite, String productUnit,
			Integer attachTag, String className, String classId,
			String operUser, Timestamp operTime, Timestamp updateTime,
			Integer display, Timestamp displayEndDate,
			Timestamp displayStartDate, String productAblit, Integer num,
			String miniSupply, Integer salePatter, Integer paymentPatter,
			String keywords, String bigImg, String midImg, String smallImg,
			Integer click, Integer commend, String commendUserId,
			Timestamp commendTime, Integer hotProduct, Integer goodProduct,
			String color, String productKey, String productPrivicy,
			String listTop, String productStyle, String publishUserId,
			Timestamp publishDate, Integer validity, String checkUser,
			Timestamp checkTime, String backReason, String rsrvStr1,
			String rsrvStr2, String rsrvStr3, String rsrvStr4, String rsrvStr5,
			String moneytype, String attachId) {
		this.productId = productId;
		this.custId = custId;
		this.productType = productType;
		this.productName = productName;
		this.productAbstract = productAbstract;
		this.productDesc = productDesc;
		this.areaId = areaId;
		this.productSite = productSite;
		this.productUnit = productUnit;
		this.attachTag = attachTag;
		this.className = className;
		this.classId = classId;
		this.operUser = operUser;
		this.operTime = operTime;
		this.updateTime = updateTime;
		this.display = display;
		this.displayEndDate = displayEndDate;
		this.displayStartDate = displayStartDate;
		this.productAblit = productAblit;
		this.num = num;
		this.miniSupply = miniSupply;
		this.salePatter = salePatter;
		this.paymentPatter = paymentPatter;
		this.keywords = keywords;
		this.bigImg = bigImg;
		this.midImg = midImg;
		this.smallImg = smallImg;
		this.click = click;
		this.commend = commend;
		this.commendUserId = commendUserId;
		this.commendTime = commendTime;
		this.hotProduct = hotProduct;
		this.goodProduct = goodProduct;
		this.color = color;
		this.productKey = productKey;
		this.productPrivicy = productPrivicy;
		this.listTop = listTop;
		this.productStyle = productStyle;
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
		this.attachId = attachId;
	}

	// Property accessors

	public String getProductId() {
		return this.productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
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

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
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

	public String getProductAblit() {
		return this.productAblit;
	}

	public void setProductAblit(String productAblit) {
		this.productAblit = productAblit;
	}

	public Integer getNum() {
		return this.num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getMiniSupply() {
		return this.miniSupply;
	}

	public void setMiniSupply(String miniSupply) {
		this.miniSupply = miniSupply;
	}

	public Integer getSalePatter() {
		return this.salePatter;
	}

	public void setSalePatter(Integer salePatter) {
		this.salePatter = salePatter;
	}

	public Integer getPaymentPatter() {
		return this.paymentPatter;
	}

	public void setPaymentPatter(Integer paymentPatter) {
		this.paymentPatter = paymentPatter;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
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

	public Integer getHotProduct() {
		return this.hotProduct;
	}

	public void setHotProduct(Integer hotProduct) {
		this.hotProduct = hotProduct;
	}

	public Integer getGoodProduct() {
		return this.goodProduct;
	}

	public void setGoodProduct(Integer goodProduct) {
		this.goodProduct = goodProduct;
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

	public String getListTop() {
		return this.listTop;
	}

	public void setListTop(String listTop) {
		this.listTop = listTop;
	}

	public String getProductStyle() {
		return this.productStyle;
	}

	public void setProductStyle(String productStyle) {
		this.productStyle = productStyle;
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

	public String getAttachId() {
		return this.attachId;
	}

	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}

}