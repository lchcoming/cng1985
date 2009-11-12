package com.ada.entity;

import java.sql.Timestamp;

/**
 * BpmdefinitionDevId entity. @author MyEclipse Persistence Tools
 */

public class BpmdefinitionDevId implements java.io.Serializable {

	// Fields

	private String tradeTypeCode;
	private String bpmId;
	private String nodeId;
	private String nodeType;
	private String nodeSequence;
	private String nodeClass;
	private String nodeMethod;
	private String outQuery;
	private String outBuffer;
	private String undoTag;
	private String undeClass;
	private String undoMethod;
	private String undoOutQuery;
	private String undoOutBuffer;
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
	public BpmdefinitionDevId() {
	}

	/** minimal constructor */
	public BpmdefinitionDevId(String tradeTypeCode, String bpmId, String nodeId) {
		this.tradeTypeCode = tradeTypeCode;
		this.bpmId = bpmId;
		this.nodeId = nodeId;
	}

	/** full constructor */
	public BpmdefinitionDevId(String tradeTypeCode, String bpmId,
			String nodeId, String nodeType, String nodeSequence,
			String nodeClass, String nodeMethod, String outQuery,
			String outBuffer, String undoTag, String undeClass,
			String undoMethod, String undoOutQuery, String undoOutBuffer,
			String rsrvStr1, String rsrvStr2, String rsrvStr3, String rsrvStr4,
			String rsrvStr5, String rsrvStr6, String rsrvStr7, String rsrvStr8,
			String rsrvStr9, String rsrvStr0, Timestamp inDate, String remark) {
		this.tradeTypeCode = tradeTypeCode;
		this.bpmId = bpmId;
		this.nodeId = nodeId;
		this.nodeType = nodeType;
		this.nodeSequence = nodeSequence;
		this.nodeClass = nodeClass;
		this.nodeMethod = nodeMethod;
		this.outQuery = outQuery;
		this.outBuffer = outBuffer;
		this.undoTag = undoTag;
		this.undeClass = undeClass;
		this.undoMethod = undoMethod;
		this.undoOutQuery = undoOutQuery;
		this.undoOutBuffer = undoOutBuffer;
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

	public String getBpmId() {
		return this.bpmId;
	}

	public void setBpmId(String bpmId) {
		this.bpmId = bpmId;
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeType() {
		return this.nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getNodeSequence() {
		return this.nodeSequence;
	}

	public void setNodeSequence(String nodeSequence) {
		this.nodeSequence = nodeSequence;
	}

	public String getNodeClass() {
		return this.nodeClass;
	}

	public void setNodeClass(String nodeClass) {
		this.nodeClass = nodeClass;
	}

	public String getNodeMethod() {
		return this.nodeMethod;
	}

	public void setNodeMethod(String nodeMethod) {
		this.nodeMethod = nodeMethod;
	}

	public String getOutQuery() {
		return this.outQuery;
	}

	public void setOutQuery(String outQuery) {
		this.outQuery = outQuery;
	}

	public String getOutBuffer() {
		return this.outBuffer;
	}

	public void setOutBuffer(String outBuffer) {
		this.outBuffer = outBuffer;
	}

	public String getUndoTag() {
		return this.undoTag;
	}

	public void setUndoTag(String undoTag) {
		this.undoTag = undoTag;
	}

	public String getUndeClass() {
		return this.undeClass;
	}

	public void setUndeClass(String undeClass) {
		this.undeClass = undeClass;
	}

	public String getUndoMethod() {
		return this.undoMethod;
	}

	public void setUndoMethod(String undoMethod) {
		this.undoMethod = undoMethod;
	}

	public String getUndoOutQuery() {
		return this.undoOutQuery;
	}

	public void setUndoOutQuery(String undoOutQuery) {
		this.undoOutQuery = undoOutQuery;
	}

	public String getUndoOutBuffer() {
		return this.undoOutBuffer;
	}

	public void setUndoOutBuffer(String undoOutBuffer) {
		this.undoOutBuffer = undoOutBuffer;
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
		if (!(other instanceof BpmdefinitionDevId))
			return false;
		BpmdefinitionDevId castOther = (BpmdefinitionDevId) other;

		return ((this.getTradeTypeCode() == castOther.getTradeTypeCode()) || (this
				.getTradeTypeCode() != null
				&& castOther.getTradeTypeCode() != null && this
				.getTradeTypeCode().equals(castOther.getTradeTypeCode())))
				&& ((this.getBpmId() == castOther.getBpmId()) || (this
						.getBpmId() != null
						&& castOther.getBpmId() != null && this.getBpmId()
						.equals(castOther.getBpmId())))
				&& ((this.getNodeId() == castOther.getNodeId()) || (this
						.getNodeId() != null
						&& castOther.getNodeId() != null && this.getNodeId()
						.equals(castOther.getNodeId())))
				&& ((this.getNodeType() == castOther.getNodeType()) || (this
						.getNodeType() != null
						&& castOther.getNodeType() != null && this
						.getNodeType().equals(castOther.getNodeType())))
				&& ((this.getNodeSequence() == castOther.getNodeSequence()) || (this
						.getNodeSequence() != null
						&& castOther.getNodeSequence() != null && this
						.getNodeSequence().equals(castOther.getNodeSequence())))
				&& ((this.getNodeClass() == castOther.getNodeClass()) || (this
						.getNodeClass() != null
						&& castOther.getNodeClass() != null && this
						.getNodeClass().equals(castOther.getNodeClass())))
				&& ((this.getNodeMethod() == castOther.getNodeMethod()) || (this
						.getNodeMethod() != null
						&& castOther.getNodeMethod() != null && this
						.getNodeMethod().equals(castOther.getNodeMethod())))
				&& ((this.getOutQuery() == castOther.getOutQuery()) || (this
						.getOutQuery() != null
						&& castOther.getOutQuery() != null && this
						.getOutQuery().equals(castOther.getOutQuery())))
				&& ((this.getOutBuffer() == castOther.getOutBuffer()) || (this
						.getOutBuffer() != null
						&& castOther.getOutBuffer() != null && this
						.getOutBuffer().equals(castOther.getOutBuffer())))
				&& ((this.getUndoTag() == castOther.getUndoTag()) || (this
						.getUndoTag() != null
						&& castOther.getUndoTag() != null && this.getUndoTag()
						.equals(castOther.getUndoTag())))
				&& ((this.getUndeClass() == castOther.getUndeClass()) || (this
						.getUndeClass() != null
						&& castOther.getUndeClass() != null && this
						.getUndeClass().equals(castOther.getUndeClass())))
				&& ((this.getUndoMethod() == castOther.getUndoMethod()) || (this
						.getUndoMethod() != null
						&& castOther.getUndoMethod() != null && this
						.getUndoMethod().equals(castOther.getUndoMethod())))
				&& ((this.getUndoOutQuery() == castOther.getUndoOutQuery()) || (this
						.getUndoOutQuery() != null
						&& castOther.getUndoOutQuery() != null && this
						.getUndoOutQuery().equals(castOther.getUndoOutQuery())))
				&& ((this.getUndoOutBuffer() == castOther.getUndoOutBuffer()) || (this
						.getUndoOutBuffer() != null
						&& castOther.getUndoOutBuffer() != null && this
						.getUndoOutBuffer()
						.equals(castOther.getUndoOutBuffer())))
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
				+ (getBpmId() == null ? 0 : this.getBpmId().hashCode());
		result = 37 * result
				+ (getNodeId() == null ? 0 : this.getNodeId().hashCode());
		result = 37 * result
				+ (getNodeType() == null ? 0 : this.getNodeType().hashCode());
		result = 37
				* result
				+ (getNodeSequence() == null ? 0 : this.getNodeSequence()
						.hashCode());
		result = 37 * result
				+ (getNodeClass() == null ? 0 : this.getNodeClass().hashCode());
		result = 37
				* result
				+ (getNodeMethod() == null ? 0 : this.getNodeMethod()
						.hashCode());
		result = 37 * result
				+ (getOutQuery() == null ? 0 : this.getOutQuery().hashCode());
		result = 37 * result
				+ (getOutBuffer() == null ? 0 : this.getOutBuffer().hashCode());
		result = 37 * result
				+ (getUndoTag() == null ? 0 : this.getUndoTag().hashCode());
		result = 37 * result
				+ (getUndeClass() == null ? 0 : this.getUndeClass().hashCode());
		result = 37
				* result
				+ (getUndoMethod() == null ? 0 : this.getUndoMethod()
						.hashCode());
		result = 37
				* result
				+ (getUndoOutQuery() == null ? 0 : this.getUndoOutQuery()
						.hashCode());
		result = 37
				* result
				+ (getUndoOutBuffer() == null ? 0 : this.getUndoOutBuffer()
						.hashCode());
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