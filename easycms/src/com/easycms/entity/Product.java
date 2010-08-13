package com.easycms.entity;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Product entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")

public class Product implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short productLang;
	@Persistent
	private String productRela;
	@Persistent
	private String productName;
	@Persistent
	private String productNameColor;
	@Persistent
	private String productBrand;
	@Persistent
	private String productModel;
	@Persistent
	private String productCoding;
	@Persistent
	private String productSpeci;
	@Persistent
	private String productColor;
	@Persistent
	private String productPrice;
	@Persistent
	private String productKeyWord;
	@Persistent
	private String productPhoto1;
	@Persistent
	private String productPhoto2;
	@Persistent
	private String productSummary;
	@Persistent
	private String productContent;
	@Persistent
	private Short productSecrecy;
	@Persistent
	private Short productNew;
	@Persistent
	private Short productRecommended;
	@Persistent
	private Short productAudit;
	@Persistent
	private Integer productClick;
	@Persistent
	private Integer productSort;
	@Persistent
	private String productPublished;
	@Persistent
	private Date productTime;

	// Constructors

	/** default constructor */
	public Product() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getProductLang() {
		return productLang;
	}

	public void setProductLang(Short productLang) {
		this.productLang = productLang;
	}

	public String getProductRela() {
		return productRela;
	}

	public void setProductRela(String productRela) {
		this.productRela = productRela;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductNameColor() {
		return productNameColor;
	}

	public void setProductNameColor(String productNameColor) {
		this.productNameColor = productNameColor;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductModel() {
		return productModel;
	}

	public void setProductModel(String productModel) {
		this.productModel = productModel;
	}

	public String getProductCoding() {
		return productCoding;
	}

	public void setProductCoding(String productCoding) {
		this.productCoding = productCoding;
	}

	public String getProductSpeci() {
		return productSpeci;
	}

	public void setProductSpeci(String productSpeci) {
		this.productSpeci = productSpeci;
	}

	public String getProductColor() {
		return productColor;
	}

	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductKeyWord() {
		return productKeyWord;
	}

	public void setProductKeyWord(String productKeyWord) {
		this.productKeyWord = productKeyWord;
	}

	public String getProductPhoto1() {
		return productPhoto1;
	}

	public void setProductPhoto1(String productPhoto1) {
		this.productPhoto1 = productPhoto1;
	}

	public String getProductPhoto2() {
		return productPhoto2;
	}

	public void setProductPhoto2(String productPhoto2) {
		this.productPhoto2 = productPhoto2;
	}

	public String getProductSummary() {
		return productSummary;
	}

	public void setProductSummary(String productSummary) {
		this.productSummary = productSummary;
	}

	public String getProductContent() {
		return productContent;
	}

	public void setProductContent(String productContent) {
		this.productContent = productContent;
	}

	public Short getProductSecrecy() {
		return productSecrecy;
	}

	public void setProductSecrecy(Short productSecrecy) {
		this.productSecrecy = productSecrecy;
	}

	public Short getProductNew() {
		return productNew;
	}

	public void setProductNew(Short productNew) {
		this.productNew = productNew;
	}

	public Short getProductRecommended() {
		return productRecommended;
	}

	public void setProductRecommended(Short productRecommended) {
		this.productRecommended = productRecommended;
	}

	public Short getProductAudit() {
		return productAudit;
	}

	public void setProductAudit(Short productAudit) {
		this.productAudit = productAudit;
	}

	public Integer getProductClick() {
		return productClick;
	}

	public void setProductClick(Integer productClick) {
		this.productClick = productClick;
	}

	public Integer getProductSort() {
		return productSort;
	}

	public void setProductSort(Integer productSort) {
		this.productSort = productSort;
	}

	public String getProductPublished() {
		return productPublished;
	}

	public void setProductPublished(String productPublished) {
		this.productPublished = productPublished;
	}

	public Date getProductTime() {
		return productTime;
	}

	public void setProductTime(Date productTime) {
		this.productTime = productTime;
	}

	

}