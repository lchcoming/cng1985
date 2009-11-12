package com.ada.entity;

import java.sql.Timestamp;

/**
 * AttachId entity. @author MyEclipse Persistence Tools
 */

public class AttachId implements java.io.Serializable {

	// Fields

	private String attachId;
	private String attachRootId;
	private String attachName;
	private Integer fileType;
	private String filePath;
	private String attachDesc;
	private Integer removeTag;
	private String custId;
	private String userId;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private Float rsrvNum4;
	private Float rsrvNum5;
	private String rsrvStr6;
	private String rsrvStr7;
	private String rsrvStr8;
	private String rsrvStr9;
	private String rsrvStr10;
	private String remark;
	private Timestamp addDate;

	// Constructors

	/** default constructor */
	public AttachId() {
	}

	/** full constructor */
	public AttachId(String attachId, String attachRootId, String attachName,
			Integer fileType, String filePath, String attachDesc,
			Integer removeTag, String custId, String userId, String rsrvStr1,
			String rsrvStr2, String rsrvStr3, Float rsrvNum4, Float rsrvNum5,
			String rsrvStr6, String rsrvStr7, String rsrvStr8, String rsrvStr9,
			String rsrvStr10, String remark, Timestamp addDate) {
		this.attachId = attachId;
		this.attachRootId = attachRootId;
		this.attachName = attachName;
		this.fileType = fileType;
		this.filePath = filePath;
		this.attachDesc = attachDesc;
		this.removeTag = removeTag;
		this.custId = custId;
		this.userId = userId;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvNum4 = rsrvNum4;
		this.rsrvNum5 = rsrvNum5;
		this.rsrvStr6 = rsrvStr6;
		this.rsrvStr7 = rsrvStr7;
		this.rsrvStr8 = rsrvStr8;
		this.rsrvStr9 = rsrvStr9;
		this.rsrvStr10 = rsrvStr10;
		this.remark = remark;
		this.addDate = addDate;
	}

	// Property accessors

	public String getAttachId() {
		return this.attachId;
	}

	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}

	public String getAttachRootId() {
		return this.attachRootId;
	}

	public void setAttachRootId(String attachRootId) {
		this.attachRootId = attachRootId;
	}

	public String getAttachName() {
		return this.attachName;
	}

	public void setAttachName(String attachName) {
		this.attachName = attachName;
	}

	public Integer getFileType() {
		return this.fileType;
	}

	public void setFileType(Integer fileType) {
		this.fileType = fileType;
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getAttachDesc() {
		return this.attachDesc;
	}

	public void setAttachDesc(String attachDesc) {
		this.attachDesc = attachDesc;
	}

	public Integer getRemoveTag() {
		return this.removeTag;
	}

	public void setRemoveTag(Integer removeTag) {
		this.removeTag = removeTag;
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

	public Float getRsrvNum4() {
		return this.rsrvNum4;
	}

	public void setRsrvNum4(Float rsrvNum4) {
		this.rsrvNum4 = rsrvNum4;
	}

	public Float getRsrvNum5() {
		return this.rsrvNum5;
	}

	public void setRsrvNum5(Float rsrvNum5) {
		this.rsrvNum5 = rsrvNum5;
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

	public String getRsrvStr10() {
		return this.rsrvStr10;
	}

	public void setRsrvStr10(String rsrvStr10) {
		this.rsrvStr10 = rsrvStr10;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AttachId))
			return false;
		AttachId castOther = (AttachId) other;

		return ((this.getAttachId() == castOther.getAttachId()) || (this
				.getAttachId() != null
				&& castOther.getAttachId() != null && this.getAttachId()
				.equals(castOther.getAttachId())))
				&& ((this.getAttachRootId() == castOther.getAttachRootId()) || (this
						.getAttachRootId() != null
						&& castOther.getAttachRootId() != null && this
						.getAttachRootId().equals(castOther.getAttachRootId())))
				&& ((this.getAttachName() == castOther.getAttachName()) || (this
						.getAttachName() != null
						&& castOther.getAttachName() != null && this
						.getAttachName().equals(castOther.getAttachName())))
				&& ((this.getFileType() == castOther.getFileType()) || (this
						.getFileType() != null
						&& castOther.getFileType() != null && this
						.getFileType().equals(castOther.getFileType())))
				&& ((this.getFilePath() == castOther.getFilePath()) || (this
						.getFilePath() != null
						&& castOther.getFilePath() != null && this
						.getFilePath().equals(castOther.getFilePath())))
				&& ((this.getAttachDesc() == castOther.getAttachDesc()) || (this
						.getAttachDesc() != null
						&& castOther.getAttachDesc() != null && this
						.getAttachDesc().equals(castOther.getAttachDesc())))
				&& ((this.getRemoveTag() == castOther.getRemoveTag()) || (this
						.getRemoveTag() != null
						&& castOther.getRemoveTag() != null && this
						.getRemoveTag().equals(castOther.getRemoveTag())))
				&& ((this.getCustId() == castOther.getCustId()) || (this
						.getCustId() != null
						&& castOther.getCustId() != null && this.getCustId()
						.equals(castOther.getCustId())))
				&& ((this.getUserId() == castOther.getUserId()) || (this
						.getUserId() != null
						&& castOther.getUserId() != null && this.getUserId()
						.equals(castOther.getUserId())))
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
				&& ((this.getRsrvNum4() == castOther.getRsrvNum4()) || (this
						.getRsrvNum4() != null
						&& castOther.getRsrvNum4() != null && this
						.getRsrvNum4().equals(castOther.getRsrvNum4())))
				&& ((this.getRsrvNum5() == castOther.getRsrvNum5()) || (this
						.getRsrvNum5() != null
						&& castOther.getRsrvNum5() != null && this
						.getRsrvNum5().equals(castOther.getRsrvNum5())))
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
				&& ((this.getRsrvStr10() == castOther.getRsrvStr10()) || (this
						.getRsrvStr10() != null
						&& castOther.getRsrvStr10() != null && this
						.getRsrvStr10().equals(castOther.getRsrvStr10())))
				&& ((this.getRemark() == castOther.getRemark()) || (this
						.getRemark() != null
						&& castOther.getRemark() != null && this.getRemark()
						.equals(castOther.getRemark())))
				&& ((this.getAddDate() == castOther.getAddDate()) || (this
						.getAddDate() != null
						&& castOther.getAddDate() != null && this.getAddDate()
						.equals(castOther.getAddDate())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getAttachId() == null ? 0 : this.getAttachId().hashCode());
		result = 37
				* result
				+ (getAttachRootId() == null ? 0 : this.getAttachRootId()
						.hashCode());
		result = 37
				* result
				+ (getAttachName() == null ? 0 : this.getAttachName()
						.hashCode());
		result = 37 * result
				+ (getFileType() == null ? 0 : this.getFileType().hashCode());
		result = 37 * result
				+ (getFilePath() == null ? 0 : this.getFilePath().hashCode());
		result = 37
				* result
				+ (getAttachDesc() == null ? 0 : this.getAttachDesc()
						.hashCode());
		result = 37 * result
				+ (getRemoveTag() == null ? 0 : this.getRemoveTag().hashCode());
		result = 37 * result
				+ (getCustId() == null ? 0 : this.getCustId().hashCode());
		result = 37 * result
				+ (getUserId() == null ? 0 : this.getUserId().hashCode());
		result = 37 * result
				+ (getRsrvStr1() == null ? 0 : this.getRsrvStr1().hashCode());
		result = 37 * result
				+ (getRsrvStr2() == null ? 0 : this.getRsrvStr2().hashCode());
		result = 37 * result
				+ (getRsrvStr3() == null ? 0 : this.getRsrvStr3().hashCode());
		result = 37 * result
				+ (getRsrvNum4() == null ? 0 : this.getRsrvNum4().hashCode());
		result = 37 * result
				+ (getRsrvNum5() == null ? 0 : this.getRsrvNum5().hashCode());
		result = 37 * result
				+ (getRsrvStr6() == null ? 0 : this.getRsrvStr6().hashCode());
		result = 37 * result
				+ (getRsrvStr7() == null ? 0 : this.getRsrvStr7().hashCode());
		result = 37 * result
				+ (getRsrvStr8() == null ? 0 : this.getRsrvStr8().hashCode());
		result = 37 * result
				+ (getRsrvStr9() == null ? 0 : this.getRsrvStr9().hashCode());
		result = 37 * result
				+ (getRsrvStr10() == null ? 0 : this.getRsrvStr10().hashCode());
		result = 37 * result
				+ (getRemark() == null ? 0 : this.getRemark().hashCode());
		result = 37 * result
				+ (getAddDate() == null ? 0 : this.getAddDate().hashCode());
		return result;
	}

}