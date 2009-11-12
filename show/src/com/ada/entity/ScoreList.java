package com.ada.entity;

import java.sql.Timestamp;

/**
 * ScoreList entity. @author MyEclipse Persistence Tools
 */

public class ScoreList implements java.io.Serializable {

	// Fields

	private String listId;
	private String custId;
	private String userId;
	private String scoreParamId;
	private String scoreModelId;
	private String scoreModelName;
	private Float scoreParam;
	private String levelId;
	private String levelName;
	private Timestamp addDate;
	private String remark;

	// Constructors

	/** default constructor */
	public ScoreList() {
	}

	/** minimal constructor */
	public ScoreList(String listId, String custId, String userId,
			String scoreParamId, String scoreModelId, String scoreModelName,
			Float scoreParam, String levelId, String levelName) {
		this.listId = listId;
		this.custId = custId;
		this.userId = userId;
		this.scoreParamId = scoreParamId;
		this.scoreModelId = scoreModelId;
		this.scoreModelName = scoreModelName;
		this.scoreParam = scoreParam;
		this.levelId = levelId;
		this.levelName = levelName;
	}

	/** full constructor */
	public ScoreList(String listId, String custId, String userId,
			String scoreParamId, String scoreModelId, String scoreModelName,
			Float scoreParam, String levelId, String levelName,
			Timestamp addDate, String remark) {
		this.listId = listId;
		this.custId = custId;
		this.userId = userId;
		this.scoreParamId = scoreParamId;
		this.scoreModelId = scoreModelId;
		this.scoreModelName = scoreModelName;
		this.scoreParam = scoreParam;
		this.levelId = levelId;
		this.levelName = levelName;
		this.addDate = addDate;
		this.remark = remark;
	}

	// Property accessors

	public String getListId() {
		return this.listId;
	}

	public void setListId(String listId) {
		this.listId = listId;
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

	public String getScoreParamId() {
		return this.scoreParamId;
	}

	public void setScoreParamId(String scoreParamId) {
		this.scoreParamId = scoreParamId;
	}

	public String getScoreModelId() {
		return this.scoreModelId;
	}

	public void setScoreModelId(String scoreModelId) {
		this.scoreModelId = scoreModelId;
	}

	public String getScoreModelName() {
		return this.scoreModelName;
	}

	public void setScoreModelName(String scoreModelName) {
		this.scoreModelName = scoreModelName;
	}

	public Float getScoreParam() {
		return this.scoreParam;
	}

	public void setScoreParam(Float scoreParam) {
		this.scoreParam = scoreParam;
	}

	public String getLevelId() {
		return this.levelId;
	}

	public void setLevelId(String levelId) {
		this.levelId = levelId;
	}

	public String getLevelName() {
		return this.levelName;
	}

	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}