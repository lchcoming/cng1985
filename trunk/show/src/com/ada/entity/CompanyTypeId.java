package com.ada.entity;

import java.sql.Timestamp;

/**
 * CompanyTypeId entity. @author MyEclipse Persistence Tools
 */

public class CompanyTypeId implements java.io.Serializable {

	// Fields

	private String typeId;
	private String typeName;
	private String typeComment;
	private String typePic;
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

	// Constructors

	/** default constructor */
	public CompanyTypeId() {
	}

	/** minimal constructor */
	public CompanyTypeId(String operUser, Timestamp operTime) {
		this.operUser = operUser;
		this.operTime = operTime;
	}

	/** full constructor */
	public CompanyTypeId(String typeId, String typeName, String typeComment,
			String typePic, Integer checked, String checkUser,
			Timestamp checkTime, String operUser, Timestamp operTime,
			Integer removeTag, String rsrvStr1, String rsrvStr2,
			String rsrvStr3, String rsrvStr4, String rsrvStr5) {
		this.typeId = typeId;
		this.typeName = typeName;
		this.typeComment = typeComment;
		this.typePic = typePic;
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
	}

	// Property accessors

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeComment() {
		return this.typeComment;
	}

	public void setTypeComment(String typeComment) {
		this.typeComment = typeComment;
	}

	public String getTypePic() {
		return this.typePic;
	}

	public void setTypePic(String typePic) {
		this.typePic = typePic;
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

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CompanyTypeId))
			return false;
		CompanyTypeId castOther = (CompanyTypeId) other;

		return ((this.getTypeId() == castOther.getTypeId()) || (this
				.getTypeId() != null
				&& castOther.getTypeId() != null && this.getTypeId().equals(
				castOther.getTypeId())))
				&& ((this.getTypeName() == castOther.getTypeName()) || (this
						.getTypeName() != null
						&& castOther.getTypeName() != null && this
						.getTypeName().equals(castOther.getTypeName())))
				&& ((this.getTypeComment() == castOther.getTypeComment()) || (this
						.getTypeComment() != null
						&& castOther.getTypeComment() != null && this
						.getTypeComment().equals(castOther.getTypeComment())))
				&& ((this.getTypePic() == castOther.getTypePic()) || (this
						.getTypePic() != null
						&& castOther.getTypePic() != null && this.getTypePic()
						.equals(castOther.getTypePic())))
				&& ((this.getChecked() == castOther.getChecked()) || (this
						.getChecked() != null
						&& castOther.getChecked() != null && this.getChecked()
						.equals(castOther.getChecked())))
				&& ((this.getCheckUser() == castOther.getCheckUser()) || (this
						.getCheckUser() != null
						&& castOther.getCheckUser() != null && this
						.getCheckUser().equals(castOther.getCheckUser())))
				&& ((this.getCheckTime() == castOther.getCheckTime()) || (this
						.getCheckTime() != null
						&& castOther.getCheckTime() != null && this
						.getCheckTime().equals(castOther.getCheckTime())))
				&& ((this.getOperUser() == castOther.getOperUser()) || (this
						.getOperUser() != null
						&& castOther.getOperUser() != null && this
						.getOperUser().equals(castOther.getOperUser())))
				&& ((this.getOperTime() == castOther.getOperTime()) || (this
						.getOperTime() != null
						&& castOther.getOperTime() != null && this
						.getOperTime().equals(castOther.getOperTime())))
				&& ((this.getRemoveTag() == castOther.getRemoveTag()) || (this
						.getRemoveTag() != null
						&& castOther.getRemoveTag() != null && this
						.getRemoveTag().equals(castOther.getRemoveTag())))
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
						.getRsrvStr5().equals(castOther.getRsrvStr5())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTypeId() == null ? 0 : this.getTypeId().hashCode());
		result = 37 * result
				+ (getTypeName() == null ? 0 : this.getTypeName().hashCode());
		result = 37
				* result
				+ (getTypeComment() == null ? 0 : this.getTypeComment()
						.hashCode());
		result = 37 * result
				+ (getTypePic() == null ? 0 : this.getTypePic().hashCode());
		result = 37 * result
				+ (getChecked() == null ? 0 : this.getChecked().hashCode());
		result = 37 * result
				+ (getCheckUser() == null ? 0 : this.getCheckUser().hashCode());
		result = 37 * result
				+ (getCheckTime() == null ? 0 : this.getCheckTime().hashCode());
		result = 37 * result
				+ (getOperUser() == null ? 0 : this.getOperUser().hashCode());
		result = 37 * result
				+ (getOperTime() == null ? 0 : this.getOperTime().hashCode());
		result = 37 * result
				+ (getRemoveTag() == null ? 0 : this.getRemoveTag().hashCode());
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
		return result;
	}

}