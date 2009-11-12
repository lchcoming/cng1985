package com.ada.entity;

import java.sql.Timestamp;

/**
 * Authority entity. @author MyEclipse Persistence Tools
 */

public class Authority implements java.io.Serializable {

	// Fields

	private String authId;
	private String menuId;
	private String menuName;
	private String menuPath;
	private String custId;
	private String userId;
	private Integer checked;
	private String checkUser;
	private Timestamp checkTime;
	private String operUser;
	private Timestamp operTime;
	private Timestamp authStartDate;
	private Timestamp authEndDate;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;
	private String rsrvStr6;
	private String rsrvStr7;
	private String rsrvStr8;
	private String rsrvStr9;
	private String rsrvStr10;
	private String roleName;

	// Constructors

	/** default constructor */
	public Authority() {
	}

	/** minimal constructor */
	public Authority(String authId, String menuId, String menuName,
			String menuPath, String custId, String userId, String operUser,
			Timestamp operTime) {
		this.authId = authId;
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPath = menuPath;
		this.custId = custId;
		this.userId = userId;
		this.operUser = operUser;
		this.operTime = operTime;
	}

	/** full constructor */
	public Authority(String authId, String menuId, String menuName,
			String menuPath, String custId, String userId, Integer checked,
			String checkUser, Timestamp checkTime, String operUser,
			Timestamp operTime, Timestamp authStartDate, Timestamp authEndDate,
			String rsrvStr1, String rsrvStr2, String rsrvStr3, String rsrvStr4,
			String rsrvStr5, String rsrvStr6, String rsrvStr7, String rsrvStr8,
			String rsrvStr9, String rsrvStr10, String roleName) {
		this.authId = authId;
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPath = menuPath;
		this.custId = custId;
		this.userId = userId;
		this.checked = checked;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.operUser = operUser;
		this.operTime = operTime;
		this.authStartDate = authStartDate;
		this.authEndDate = authEndDate;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
		this.rsrvStr6 = rsrvStr6;
		this.rsrvStr7 = rsrvStr7;
		this.rsrvStr8 = rsrvStr8;
		this.rsrvStr9 = rsrvStr9;
		this.rsrvStr10 = rsrvStr10;
		this.roleName = roleName;
	}

	// Property accessors

	public String getAuthId() {
		return this.authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getMenuId() {
		return this.menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return this.menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuPath() {
		return this.menuPath;
	}

	public void setMenuPath(String menuPath) {
		this.menuPath = menuPath;
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

	public Timestamp getAuthStartDate() {
		return this.authStartDate;
	}

	public void setAuthStartDate(Timestamp authStartDate) {
		this.authStartDate = authStartDate;
	}

	public Timestamp getAuthEndDate() {
		return this.authEndDate;
	}

	public void setAuthEndDate(Timestamp authEndDate) {
		this.authEndDate = authEndDate;
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

	public String getRsrvStr10() {
		return this.rsrvStr10;
	}

	public void setRsrvStr10(String rsrvStr10) {
		this.rsrvStr10 = rsrvStr10;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

}