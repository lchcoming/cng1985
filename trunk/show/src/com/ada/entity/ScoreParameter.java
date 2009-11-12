package com.ada.entity;

import java.sql.Timestamp;

/**
 * ScoreParameter entity. @author MyEclipse Persistence Tools
 */

public class ScoreParameter implements java.io.Serializable {

	// Fields

	private String scoreParamId;
	private String scoreModelId;
	private String scoreModelName;
	private Float scoreParam;
	private String levelId;
	private String levelName;
	private String scoreModelComment;
	private Integer checked;
	private String checkUser;
	private Timestamp checkTime;
	private String operUser;
	private Timestamp operTime;
	private Integer removeTag;
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
	private String remark;
	private Timestamp addDate;

	// Constructors

	/** default constructor */
	public ScoreParameter() {
	}

	/** minimal constructor */
	public ScoreParameter(String scoreParamId, String scoreModelId,
			String scoreModelName, String levelId, String levelName,
			String operUser, Timestamp operTime) {
		this.scoreParamId = scoreParamId;
		this.scoreModelId = scoreModelId;
		this.scoreModelName = scoreModelName;
		this.levelId = levelId;
		this.levelName = levelName;
		this.operUser = operUser;
		this.operTime = operTime;
	}

	/** full constructor */
	public ScoreParameter(String scoreParamId, String scoreModelId,
			String scoreModelName, Float scoreParam, String levelId,
			String levelName, String scoreModelComment, Integer checked,
			String checkUser, Timestamp checkTime, String operUser,
			Timestamp operTime, Integer removeTag, String rsrvStr1,
			String rsrvStr2, String rsrvStr3, String rsrvStr4, String rsrvStr5,
			String rsrvStr6, String rsrvStr7, String rsrvStr8, String rsrvStr9,
			String rsrvStr0, String remark, Timestamp addDate) {
		this.scoreParamId = scoreParamId;
		this.scoreModelId = scoreModelId;
		this.scoreModelName = scoreModelName;
		this.scoreParam = scoreParam;
		this.levelId = levelId;
		this.levelName = levelName;
		this.scoreModelComment = scoreModelComment;
		this.checked = checked;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.operUser = operUser;
		this.operTime = operTime;
		this.removeTag = removeTag;
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
		this.remark = remark;
		this.addDate = addDate;
	}

	// Property accessors

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

	public String getScoreModelComment() {
		return this.scoreModelComment;
	}

	public void setScoreModelComment(String scoreModelComment) {
		this.scoreModelComment = scoreModelComment;
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

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
	}

}