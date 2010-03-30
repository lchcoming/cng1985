package com.ada.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * CailiaoZiyuanType entity.
 * 
 * @author MyEclipse Persistence Tools
 */

public class CailiaoZiyuanType implements java.io.Serializable {

	// Fields

	private String cailiaoTypeId;
	private CailiaoZiyuanType cailiaoZiyuanType;
	private String cailiaoTypeName;
	private Date cailiaoTypeCreatTime;
	private String cailiaoTypeBy;
	private Date cailiaoUpdateTime;
	private String cailiaoUpdateBy;
	private String demo1;
	private String demo2;
	private String demo3;
	private String demo4;
	private String demo5;
	private Set cailiaoZiyuanTypes = new HashSet(0);
	private Set cailiaoZiyuans = new HashSet(0);

	// Constructors

	/** default constructor */
	public CailiaoZiyuanType() {
	}

	/** full constructor */
	public CailiaoZiyuanType(CailiaoZiyuanType cailiaoZiyuanType,
			String cailiaoTypeName, Date cailiaoTypeCreatTime,
			String cailiaoTypeBy, Date cailiaoUpdateTime,
			String cailiaoUpdateBy, String demo1, String demo2, String demo3,
			String demo4, String demo5, Set cailiaoZiyuanTypes,
			Set cailiaoZiyuans) {
		this.cailiaoZiyuanType = cailiaoZiyuanType;
		this.cailiaoTypeName = cailiaoTypeName;
		this.cailiaoTypeCreatTime = cailiaoTypeCreatTime;
		this.cailiaoTypeBy = cailiaoTypeBy;
		this.cailiaoUpdateTime = cailiaoUpdateTime;
		this.cailiaoUpdateBy = cailiaoUpdateBy;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.demo3 = demo3;
		this.demo4 = demo4;
		this.demo5 = demo5;
		this.cailiaoZiyuanTypes = cailiaoZiyuanTypes;
		this.cailiaoZiyuans = cailiaoZiyuans;
	}

	// Property accessors

	public String getCailiaoTypeId() {
		return this.cailiaoTypeId;
	}

	public void setCailiaoTypeId(String cailiaoTypeId) {
		this.cailiaoTypeId = cailiaoTypeId;
	}

	public CailiaoZiyuanType getCailiaoZiyuanType() {
		return this.cailiaoZiyuanType;
	}

	public void setCailiaoZiyuanType(CailiaoZiyuanType cailiaoZiyuanType) {
		this.cailiaoZiyuanType = cailiaoZiyuanType;
	}

	public String getCailiaoTypeName() {
		return this.cailiaoTypeName;
	}

	public void setCailiaoTypeName(String cailiaoTypeName) {
		this.cailiaoTypeName = cailiaoTypeName;
	}

	public Date getCailiaoTypeCreatTime() {
		return this.cailiaoTypeCreatTime;
	}

	public void setCailiaoTypeCreatTime(Date cailiaoTypeCreatTime) {
		this.cailiaoTypeCreatTime = cailiaoTypeCreatTime;
	}

	public String getCailiaoTypeBy() {
		return this.cailiaoTypeBy;
	}

	public void setCailiaoTypeBy(String cailiaoTypeBy) {
		this.cailiaoTypeBy = cailiaoTypeBy;
	}

	public Date getCailiaoUpdateTime() {
		return this.cailiaoUpdateTime;
	}

	public void setCailiaoUpdateTime(Date cailiaoUpdateTime) {
		this.cailiaoUpdateTime = cailiaoUpdateTime;
	}

	public String getCailiaoUpdateBy() {
		return this.cailiaoUpdateBy;
	}

	public void setCailiaoUpdateBy(String cailiaoUpdateBy) {
		this.cailiaoUpdateBy = cailiaoUpdateBy;
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

	public String getDemo5() {
		return this.demo5;
	}

	public void setDemo5(String demo5) {
		this.demo5 = demo5;
	}

	public Set getCailiaoZiyuanTypes() {
		return this.cailiaoZiyuanTypes;
	}

	public void setCailiaoZiyuanTypes(Set cailiaoZiyuanTypes) {
		this.cailiaoZiyuanTypes = cailiaoZiyuanTypes;
	}

	public Set getCailiaoZiyuans() {
		return this.cailiaoZiyuans;
	}

	public void setCailiaoZiyuans(Set cailiaoZiyuans) {
		this.cailiaoZiyuans = cailiaoZiyuans;
	}

}