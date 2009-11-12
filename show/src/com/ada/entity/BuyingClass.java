package com.ada.entity;

import java.sql.Timestamp;

/**
 * BuyingClass entity. @author MyEclipse Persistence Tools
 */

public class BuyingClass implements java.io.Serializable {

	// Fields

	private String classId;
	private String className;
	private String classDesc;
	private Integer checked;
	private String checkUser;
	private Timestamp checkTime;
	private String operUser;
	private Timestamp operTime;
	private Integer removeTag;
	private String classAttr;
	private String listModel;
	private String indexModel;
	private String contentModel;
	private String storePath;
	private String listRule;
	private String homeName;
	private String articleRule;
	private Integer dynaShow;
	private String remark;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;
	private String rsrvStr6;
	private String rsrvStr7;
	private String rsrvStr8;
	private String rsrvStr9;
	private String rsrvStr0;
	private Timestamp addDate;

	// Constructors

	/** default constructor */
	public BuyingClass() {
	}

	/** minimal constructor */
	public BuyingClass(String classId, String className, String classDesc,
			String operUser, Timestamp operTime, String listModel,
			String indexModel, String contentModel, String storePath,
			String listRule, String homeName, String articleRule) {
		this.classId = classId;
		this.className = className;
		this.classDesc = classDesc;
		this.operUser = operUser;
		this.operTime = operTime;
		this.listModel = listModel;
		this.indexModel = indexModel;
		this.contentModel = contentModel;
		this.storePath = storePath;
		this.listRule = listRule;
		this.homeName = homeName;
		this.articleRule = articleRule;
	}

	/** full constructor */
	public BuyingClass(String classId, String className, String classDesc,
			Integer checked, String checkUser, Timestamp checkTime,
			String operUser, Timestamp operTime, Integer removeTag,
			String classAttr, String listModel, String indexModel,
			String contentModel, String storePath, String listRule,
			String homeName, String articleRule, Integer dynaShow,
			String remark, String rsrvStr1, String rsrvStr2, String rsrvStr3,
			String rsrvStr4, String rsrvStr5, String rsrvStr6, String rsrvStr7,
			String rsrvStr8, String rsrvStr9, String rsrvStr0, Timestamp addDate) {
		this.classId = classId;
		this.className = className;
		this.classDesc = classDesc;
		this.checked = checked;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.operUser = operUser;
		this.operTime = operTime;
		this.removeTag = removeTag;
		this.classAttr = classAttr;
		this.listModel = listModel;
		this.indexModel = indexModel;
		this.contentModel = contentModel;
		this.storePath = storePath;
		this.listRule = listRule;
		this.homeName = homeName;
		this.articleRule = articleRule;
		this.dynaShow = dynaShow;
		this.remark = remark;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
		this.rsrvStr6 = rsrvStr6;
		this.rsrvStr7 = rsrvStr7;
		this.rsrvStr8 = rsrvStr8;
		this.rsrvStr9 = rsrvStr9;
		this.rsrvStr0 = rsrvStr0;
		this.addDate = addDate;
	}

	// Property accessors

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getClassDesc() {
		return this.classDesc;
	}

	public void setClassDesc(String classDesc) {
		this.classDesc = classDesc;
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

	public Integer getRemoveTag() {
		return this.removeTag;
	}

	public void setRemoveTag(Integer removeTag) {
		this.removeTag = removeTag;
	}

	public String getClassAttr() {
		return this.classAttr;
	}

	public void setClassAttr(String classAttr) {
		this.classAttr = classAttr;
	}

	public String getListModel() {
		return this.listModel;
	}

	public void setListModel(String listModel) {
		this.listModel = listModel;
	}

	public String getIndexModel() {
		return this.indexModel;
	}

	public void setIndexModel(String indexModel) {
		this.indexModel = indexModel;
	}

	public String getContentModel() {
		return this.contentModel;
	}

	public void setContentModel(String contentModel) {
		this.contentModel = contentModel;
	}

	public String getStorePath() {
		return this.storePath;
	}

	public void setStorePath(String storePath) {
		this.storePath = storePath;
	}

	public String getListRule() {
		return this.listRule;
	}

	public void setListRule(String listRule) {
		this.listRule = listRule;
	}

	public String getHomeName() {
		return this.homeName;
	}

	public void setHomeName(String homeName) {
		this.homeName = homeName;
	}

	public String getArticleRule() {
		return this.articleRule;
	}

	public void setArticleRule(String articleRule) {
		this.articleRule = articleRule;
	}

	public Integer getDynaShow() {
		return this.dynaShow;
	}

	public void setDynaShow(Integer dynaShow) {
		this.dynaShow = dynaShow;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
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

	public String getRsrvStr6() {
		return this.rsrvStr6;
	}

	public void setRsrvStr6(String rsrvStr6) {
		this.rsrvStr6 = rsrvStr6;
	}

	public String getRsrvStr7() {
		return this.rsrvStr7;
	}

	public void setRsrvStr7(String rsrvStr7) {
		this.rsrvStr7 = rsrvStr7;
	}

	public String getRsrvStr8() {
		return this.rsrvStr8;
	}

	public void setRsrvStr8(String rsrvStr8) {
		this.rsrvStr8 = rsrvStr8;
	}

	public String getRsrvStr9() {
		return this.rsrvStr9;
	}

	public void setRsrvStr9(String rsrvStr9) {
		this.rsrvStr9 = rsrvStr9;
	}

	public String getRsrvStr0() {
		return this.rsrvStr0;
	}

	public void setRsrvStr0(String rsrvStr0) {
		this.rsrvStr0 = rsrvStr0;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

}