package com.ada.entity;

import java.sql.Timestamp;

/**
 * TradetypeId entity. @author MyEclipse Persistence Tools
 */

public class TradetypeId implements java.io.Serializable {

	// Fields

	private String tradeTypeCode;
	private String tradeName;
	private String bpmId;
	private String judgeRights;
	private String tradeKind;
	private String cancelTag;
	private String transeType;
	private String succeedFwd;
	private String errorFwd;
	private String enableTag;
	private Timestamp startDate;
	private Timestamp endDate;
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
	private Timestamp inDate;
	private String remark;

	// Constructors

	/** default constructor */
	public TradetypeId() {
	}

	/** minimal constructor */
	public TradetypeId(String tradeTypeCode, String tradeName) {
		this.tradeTypeCode = tradeTypeCode;
		this.tradeName = tradeName;
	}

	/** full constructor */
	public TradetypeId(String tradeTypeCode, String tradeName, String bpmId,
			String judgeRights, String tradeKind, String cancelTag,
			String transeType, String succeedFwd, String errorFwd,
			String enableTag, Timestamp startDate, Timestamp endDate,
			String rsrvStr1, String rsrvStr2, String rsrvStr3, String rsrvStr4,
			String rsrvStr5, String rsrvStr6, String rsrvStr7, String rsrvStr8,
			String rsrvStr9, String rsrvStr0, Timestamp inDate, String remark) {
		this.tradeTypeCode = tradeTypeCode;
		this.tradeName = tradeName;
		this.bpmId = bpmId;
		this.judgeRights = judgeRights;
		this.tradeKind = tradeKind;
		this.cancelTag = cancelTag;
		this.transeType = transeType;
		this.succeedFwd = succeedFwd;
		this.errorFwd = errorFwd;
		this.enableTag = enableTag;
		this.startDate = startDate;
		this.endDate = endDate;
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
		this.inDate = inDate;
		this.remark = remark;
	}

	// Property accessors

	public String getTradeTypeCode() {
		return this.tradeTypeCode;
	}

	public void setTradeTypeCode(String tradeTypeCode) {
		this.tradeTypeCode = tradeTypeCode;
	}

	public String getTradeName() {
		return this.tradeName;
	}

	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}

	public String getBpmId() {
		return this.bpmId;
	}

	public void setBpmId(String bpmId) {
		this.bpmId = bpmId;
	}

	public String getJudgeRights() {
		return this.judgeRights;
	}

	public void setJudgeRights(String judgeRights) {
		this.judgeRights = judgeRights;
	}

	public String getTradeKind() {
		return this.tradeKind;
	}

	public void setTradeKind(String tradeKind) {
		this.tradeKind = tradeKind;
	}

	public String getCancelTag() {
		return this.cancelTag;
	}

	public void setCancelTag(String cancelTag) {
		this.cancelTag = cancelTag;
	}

	public String getTranseType() {
		return this.transeType;
	}

	public void setTranseType(String transeType) {
		this.transeType = transeType;
	}

	public String getSucceedFwd() {
		return this.succeedFwd;
	}

	public void setSucceedFwd(String succeedFwd) {
		this.succeedFwd = succeedFwd;
	}

	public String getErrorFwd() {
		return this.errorFwd;
	}

	public void setErrorFwd(String errorFwd) {
		this.errorFwd = errorFwd;
	}

	public String getEnableTag() {
		return this.enableTag;
	}

	public void setEnableTag(String enableTag) {
		this.enableTag = enableTag;
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

	public Timestamp getInDate() {
		return this.inDate;
	}

	public void setInDate(Timestamp inDate) {
		this.inDate = inDate;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TradetypeId))
			return false;
		TradetypeId castOther = (TradetypeId) other;

		return ((this.getTradeTypeCode() == castOther.getTradeTypeCode()) || (this
				.getTradeTypeCode() != null
				&& castOther.getTradeTypeCode() != null && this
				.getTradeTypeCode().equals(castOther.getTradeTypeCode())))
				&& ((this.getTradeName() == castOther.getTradeName()) || (this
						.getTradeName() != null
						&& castOther.getTradeName() != null && this
						.getTradeName().equals(castOther.getTradeName())))
				&& ((this.getBpmId() == castOther.getBpmId()) || (this
						.getBpmId() != null
						&& castOther.getBpmId() != null && this.getBpmId()
						.equals(castOther.getBpmId())))
				&& ((this.getJudgeRights() == castOther.getJudgeRights()) || (this
						.getJudgeRights() != null
						&& castOther.getJudgeRights() != null && this
						.getJudgeRights().equals(castOther.getJudgeRights())))
				&& ((this.getTradeKind() == castOther.getTradeKind()) || (this
						.getTradeKind() != null
						&& castOther.getTradeKind() != null && this
						.getTradeKind().equals(castOther.getTradeKind())))
				&& ((this.getCancelTag() == castOther.getCancelTag()) || (this
						.getCancelTag() != null
						&& castOther.getCancelTag() != null && this
						.getCancelTag().equals(castOther.getCancelTag())))
				&& ((this.getTranseType() == castOther.getTranseType()) || (this
						.getTranseType() != null
						&& castOther.getTranseType() != null && this
						.getTranseType().equals(castOther.getTranseType())))
				&& ((this.getSucceedFwd() == castOther.getSucceedFwd()) || (this
						.getSucceedFwd() != null
						&& castOther.getSucceedFwd() != null && this
						.getSucceedFwd().equals(castOther.getSucceedFwd())))
				&& ((this.getErrorFwd() == castOther.getErrorFwd()) || (this
						.getErrorFwd() != null
						&& castOther.getErrorFwd() != null && this
						.getErrorFwd().equals(castOther.getErrorFwd())))
				&& ((this.getEnableTag() == castOther.getEnableTag()) || (this
						.getEnableTag() != null
						&& castOther.getEnableTag() != null && this
						.getEnableTag().equals(castOther.getEnableTag())))
				&& ((this.getStartDate() == castOther.getStartDate()) || (this
						.getStartDate() != null
						&& castOther.getStartDate() != null && this
						.getStartDate().equals(castOther.getStartDate())))
				&& ((this.getEndDate() == castOther.getEndDate()) || (this
						.getEndDate() != null
						&& castOther.getEndDate() != null && this.getEndDate()
						.equals(castOther.getEndDate())))
				&& ((this.getRsrvStr1() == castOther.getRsrvStr1()) || (this
						.getRsrvStr1() != null
						&& castOther.getRsrvStr1() != null && this
						.getRsrvStr1().equals(castOther.getRsrvStr1())))
				&& ((this.getRsrvStr2() == castOther.getRsrvStr2()) || (this
						.getRsrvStr2() != null
						&& castOther.getRsrvStr2() != null && this
						.getRsrvStr2().equals(castOther.getRsrvStr2())))
				&& ((this.getRsrvStr3() == castOther.getRsrvStr3()) || (this
						.getRsrvStr3() != null
						&& castOther.getRsrvStr3() != null && this
						.getRsrvStr3().equals(castOther.getRsrvStr3())))
				&& ((this.getRsrvStr4() == castOther.getRsrvStr4()) || (this
						.getRsrvStr4() != null
						&& castOther.getRsrvStr4() != null && this
						.getRsrvStr4().equals(castOther.getRsrvStr4())))
				&& ((this.getRsrvStr5() == castOther.getRsrvStr5()) || (this
						.getRsrvStr5() != null
						&& castOther.getRsrvStr5() != null && this
						.getRsrvStr5().equals(castOther.getRsrvStr5())))
				&& ((this.getRsrvStr6() == castOther.getRsrvStr6()) || (this
						.getRsrvStr6() != null
						&& castOther.getRsrvStr6() != null && this
						.getRsrvStr6().equals(castOther.getRsrvStr6())))
				&& ((this.getRsrvStr7() == castOther.getRsrvStr7()) || (this
						.getRsrvStr7() != null
						&& castOther.getRsrvStr7() != null && this
						.getRsrvStr7().equals(castOther.getRsrvStr7())))
				&& ((this.getRsrvStr8() == castOther.getRsrvStr8()) || (this
						.getRsrvStr8() != null
						&& castOther.getRsrvStr8() != null && this
						.getRsrvStr8().equals(castOther.getRsrvStr8())))
				&& ((this.getRsrvStr9() == castOther.getRsrvStr9()) || (this
						.getRsrvStr9() != null
						&& castOther.getRsrvStr9() != null && this
						.getRsrvStr9().equals(castOther.getRsrvStr9())))
				&& ((this.getRsrvStr0() == castOther.getRsrvStr0()) || (this
						.getRsrvStr0() != null
						&& castOther.getRsrvStr0() != null && this
						.getRsrvStr0().equals(castOther.getRsrvStr0())))
				&& ((this.getInDate() == castOther.getInDate()) || (this
						.getInDate() != null
						&& castOther.getInDate() != null && this.getInDate()
						.equals(castOther.getInDate())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark()
						.equals(castOther.getRemark())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTradeTypeCode() == null ? 0 : this.getTradeTypeCode()
						.hashCode());
		result = 37 * result
				+ (getTradeName() == null ? 0 : this.getTradeName().hashCode());
		result = 37 * result
				+ (getBpmId() == null ? 0 : this.getBpmId().hashCode());
		result = 37
				* result
				+ (getJudgeRights() == null ? 0 : this.getJudgeRights()
						.hashCode());
		result = 37 * result
				+ (getTradeKind() == null ? 0 : this.getTradeKind().hashCode());
		result = 37 * result
				+ (getCancelTag() == null ? 0 : this.getCancelTag().hashCode());
		result = 37
				* result
				+ (getTranseType() == null ? 0 : this.getTranseType()
						.hashCode());
		result = 37
				* result
				+ (getSucceedFwd() == null ? 0 : this.getSucceedFwd()
						.hashCode());
		result = 37 * result
				+ (getErrorFwd() == null ? 0 : this.getErrorFwd().hashCode());
		result = 37 * result
				+ (getEnableTag() == null ? 0 : this.getEnableTag().hashCode());
		result = 37 * result
				+ (getStartDate() == null ? 0 : this.getStartDate().hashCode());
		result = 37 * result
				+ (getEndDate() == null ? 0 : this.getEndDate().hashCode());
		result = 37 * result
				+ (getRsrvStr1() == null ? 0 : this.getRsrvStr1().hashCode());
		result = 37 * result
				+ (getRsrvStr2() == null ? 0 : this.getRsrvStr2().hashCode());
		result = 37 * result
				+ (getRsrvStr3() == null ? 0 : this.getRsrvStr3().hashCode());
		result = 37 * result
				+ (getRsrvStr4() == null ? 0 : this.getRsrvStr4().hashCode());
		result = 37 * result
				+ (getRsrvStr5() == null ? 0 : this.getRsrvStr5().hashCode());
		result = 37 * result
				+ (getRsrvStr6() == null ? 0 : this.getRsrvStr6().hashCode());
		result = 37 * result
				+ (getRsrvStr7() == null ? 0 : this.getRsrvStr7().hashCode());
		result = 37 * result
				+ (getRsrvStr8() == null ? 0 : this.getRsrvStr8().hashCode());
		result = 37 * result
				+ (getRsrvStr9() == null ? 0 : this.getRsrvStr9().hashCode());
		result = 37 * result
				+ (getRsrvStr0() == null ? 0 : this.getRsrvStr0().hashCode());
		result = 37 * result
				+ (getInDate() == null ? 0 : this.getInDate().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		return result;
	}

}