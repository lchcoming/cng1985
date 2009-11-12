package com.ada.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */

public class Company implements java.io.Serializable {

	// Fields

	private String custId;
	private String accountId;
	private String custName;
	private Integer custType;
	private Integer custState;
	private String psptTypeCode;
	private String psptId;
	private String psptAddr;
	private String eparchyCode;
	private String cityCode;
	private String developeChannel;
	private String developeMan;
	private String classId;
	private String groupAttr;
	private String clientStatus;
	private Integer userCount;
	private String companyAddress;
	private String postCode;
	private String website;
	private String faxNbr;
	private String email;
	private String groupContactPhone;
	private String cellPhone;
	private String enterpriseScope;
	private String province;
	private String city;
	private String callingTypeCode;
	private String callingSubTypeCode;
	private String tradeClass1;
	private String tradeClass2;
	private String callingAreaCode;
	private String enterpriseTypeCode;
	private String enterpriseSizeCode;
	private String juristicCustId;
	private String juristic;
	private String juristicTypeCode;
	private String allEmpCount;
	private String chinaEmpCount;
	private String localEmpCount;
	private String groupMemo;
	private String regMoney;
	private String custAim;
	private String abbreviated;
	private String scope;
	private Timestamp addDate;
	private String levelId;
	private String levelName;
	private String custClassDesc;
	private Integer listTop;
	private Integer commend;
	private String commendUserId;
	private Timestamp commendTime;
	private Integer display;
	private String checkUser;
	private Timestamp checkTime;
	private String backReason;
	private Integer propertyValue;
	private Integer integration;
	private Integer xunibi;
	private Date lastTime;
	private String images;
	private String operUser;
	private Timestamp operTime;
	private String rsrvStr1;
	private String rsrvStr2;
	private String rsrvStr3;
	private String rsrvStr4;
	private String rsrvStr5;

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(String custId, String custName, String eparchyCode) {
		this.custId = custId;
		this.custName = custName;
		this.eparchyCode = eparchyCode;
	}

	/** full constructor */
	public Company(String custId, String accountId, String custName,
			Integer custType, Integer custState, String psptTypeCode,
			String psptId, String psptAddr, String eparchyCode,
			String cityCode, String developeChannel, String developeMan,
			String classId, String groupAttr, String clientStatus,
			Integer userCount, String companyAddress, String postCode,
			String website, String faxNbr, String email,
			String groupContactPhone, String cellPhone, String enterpriseScope,
			String province, String city, String callingTypeCode,
			String callingSubTypeCode, String tradeClass1, String tradeClass2,
			String callingAreaCode, String enterpriseTypeCode,
			String enterpriseSizeCode, String juristicCustId, String juristic,
			String juristicTypeCode, String allEmpCount, String chinaEmpCount,
			String localEmpCount, String groupMemo, String regMoney,
			String custAim, String abbreviated, String scope,
			Timestamp addDate, String levelId, String levelName,
			String custClassDesc, Integer listTop, Integer commend,
			String commendUserId, Timestamp commendTime, Integer display,
			String checkUser, Timestamp checkTime, String backReason,
			Integer propertyValue, Integer integration, Integer xunibi,
			Date lastTime, String images, String operUser, Timestamp operTime,
			String rsrvStr1, String rsrvStr2, String rsrvStr3, String rsrvStr4,
			String rsrvStr5) {
		this.custId = custId;
		this.accountId = accountId;
		this.custName = custName;
		this.custType = custType;
		this.custState = custState;
		this.psptTypeCode = psptTypeCode;
		this.psptId = psptId;
		this.psptAddr = psptAddr;
		this.eparchyCode = eparchyCode;
		this.cityCode = cityCode;
		this.developeChannel = developeChannel;
		this.developeMan = developeMan;
		this.classId = classId;
		this.groupAttr = groupAttr;
		this.clientStatus = clientStatus;
		this.userCount = userCount;
		this.companyAddress = companyAddress;
		this.postCode = postCode;
		this.website = website;
		this.faxNbr = faxNbr;
		this.email = email;
		this.groupContactPhone = groupContactPhone;
		this.cellPhone = cellPhone;
		this.enterpriseScope = enterpriseScope;
		this.province = province;
		this.city = city;
		this.callingTypeCode = callingTypeCode;
		this.callingSubTypeCode = callingSubTypeCode;
		this.tradeClass1 = tradeClass1;
		this.tradeClass2 = tradeClass2;
		this.callingAreaCode = callingAreaCode;
		this.enterpriseTypeCode = enterpriseTypeCode;
		this.enterpriseSizeCode = enterpriseSizeCode;
		this.juristicCustId = juristicCustId;
		this.juristic = juristic;
		this.juristicTypeCode = juristicTypeCode;
		this.allEmpCount = allEmpCount;
		this.chinaEmpCount = chinaEmpCount;
		this.localEmpCount = localEmpCount;
		this.groupMemo = groupMemo;
		this.regMoney = regMoney;
		this.custAim = custAim;
		this.abbreviated = abbreviated;
		this.scope = scope;
		this.addDate = addDate;
		this.levelId = levelId;
		this.levelName = levelName;
		this.custClassDesc = custClassDesc;
		this.listTop = listTop;
		this.commend = commend;
		this.commendUserId = commendUserId;
		this.commendTime = commendTime;
		this.display = display;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.backReason = backReason;
		this.propertyValue = propertyValue;
		this.integration = integration;
		this.xunibi = xunibi;
		this.lastTime = lastTime;
		this.images = images;
		this.operUser = operUser;
		this.operTime = operTime;
		this.rsrvStr1 = rsrvStr1;
		this.rsrvStr2 = rsrvStr2;
		this.rsrvStr3 = rsrvStr3;
		this.rsrvStr4 = rsrvStr4;
		this.rsrvStr5 = rsrvStr5;
	}

	// Property accessors

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getCustName() {
		return this.custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Integer getCustType() {
		return this.custType;
	}

	public void setCustType(Integer custType) {
		this.custType = custType;
	}

	public Integer getCustState() {
		return this.custState;
	}

	public void setCustState(Integer custState) {
		this.custState = custState;
	}

	public String getPsptTypeCode() {
		return this.psptTypeCode;
	}

	public void setPsptTypeCode(String psptTypeCode) {
		this.psptTypeCode = psptTypeCode;
	}

	public String getPsptId() {
		return this.psptId;
	}

	public void setPsptId(String psptId) {
		this.psptId = psptId;
	}

	public String getPsptAddr() {
		return this.psptAddr;
	}

	public void setPsptAddr(String psptAddr) {
		this.psptAddr = psptAddr;
	}

	public String getEparchyCode() {
		return this.eparchyCode;
	}

	public void setEparchyCode(String eparchyCode) {
		this.eparchyCode = eparchyCode;
	}

	public String getCityCode() {
		return this.cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDevelopeChannel() {
		return this.developeChannel;
	}

	public void setDevelopeChannel(String developeChannel) {
		this.developeChannel = developeChannel;
	}

	public String getDevelopeMan() {
		return this.developeMan;
	}

	public void setDevelopeMan(String developeMan) {
		this.developeMan = developeMan;
	}

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getGroupAttr() {
		return this.groupAttr;
	}

	public void setGroupAttr(String groupAttr) {
		this.groupAttr = groupAttr;
	}

	public String getClientStatus() {
		return this.clientStatus;
	}

	public void setClientStatus(String clientStatus) {
		this.clientStatus = clientStatus;
	}

	public Integer getUserCount() {
		return this.userCount;
	}

	public void setUserCount(Integer userCount) {
		this.userCount = userCount;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getWebsite() {
		return this.website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getFaxNbr() {
		return this.faxNbr;
	}

	public void setFaxNbr(String faxNbr) {
		this.faxNbr = faxNbr;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGroupContactPhone() {
		return this.groupContactPhone;
	}

	public void setGroupContactPhone(String groupContactPhone) {
		this.groupContactPhone = groupContactPhone;
	}

	public String getCellPhone() {
		return this.cellPhone;
	}

	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getEnterpriseScope() {
		return this.enterpriseScope;
	}

	public void setEnterpriseScope(String enterpriseScope) {
		this.enterpriseScope = enterpriseScope;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCallingTypeCode() {
		return this.callingTypeCode;
	}

	public void setCallingTypeCode(String callingTypeCode) {
		this.callingTypeCode = callingTypeCode;
	}

	public String getCallingSubTypeCode() {
		return this.callingSubTypeCode;
	}

	public void setCallingSubTypeCode(String callingSubTypeCode) {
		this.callingSubTypeCode = callingSubTypeCode;
	}

	public String getTradeClass1() {
		return this.tradeClass1;
	}

	public void setTradeClass1(String tradeClass1) {
		this.tradeClass1 = tradeClass1;
	}

	public String getTradeClass2() {
		return this.tradeClass2;
	}

	public void setTradeClass2(String tradeClass2) {
		this.tradeClass2 = tradeClass2;
	}

	public String getCallingAreaCode() {
		return this.callingAreaCode;
	}

	public void setCallingAreaCode(String callingAreaCode) {
		this.callingAreaCode = callingAreaCode;
	}

	public String getEnterpriseTypeCode() {
		return this.enterpriseTypeCode;
	}

	public void setEnterpriseTypeCode(String enterpriseTypeCode) {
		this.enterpriseTypeCode = enterpriseTypeCode;
	}

	public String getEnterpriseSizeCode() {
		return this.enterpriseSizeCode;
	}

	public void setEnterpriseSizeCode(String enterpriseSizeCode) {
		this.enterpriseSizeCode = enterpriseSizeCode;
	}

	public String getJuristicCustId() {
		return this.juristicCustId;
	}

	public void setJuristicCustId(String juristicCustId) {
		this.juristicCustId = juristicCustId;
	}

	public String getJuristic() {
		return this.juristic;
	}

	public void setJuristic(String juristic) {
		this.juristic = juristic;
	}

	public String getJuristicTypeCode() {
		return this.juristicTypeCode;
	}

	public void setJuristicTypeCode(String juristicTypeCode) {
		this.juristicTypeCode = juristicTypeCode;
	}

	public String getAllEmpCount() {
		return this.allEmpCount;
	}

	public void setAllEmpCount(String allEmpCount) {
		this.allEmpCount = allEmpCount;
	}

	public String getChinaEmpCount() {
		return this.chinaEmpCount;
	}

	public void setChinaEmpCount(String chinaEmpCount) {
		this.chinaEmpCount = chinaEmpCount;
	}

	public String getLocalEmpCount() {
		return this.localEmpCount;
	}

	public void setLocalEmpCount(String localEmpCount) {
		this.localEmpCount = localEmpCount;
	}

	public String getGroupMemo() {
		return this.groupMemo;
	}

	public void setGroupMemo(String groupMemo) {
		this.groupMemo = groupMemo;
	}

	public String getRegMoney() {
		return this.regMoney;
	}

	public void setRegMoney(String regMoney) {
		this.regMoney = regMoney;
	}

	public String getCustAim() {
		return this.custAim;
	}

	public void setCustAim(String custAim) {
		this.custAim = custAim;
	}

	public String getAbbreviated() {
		return this.abbreviated;
	}

	public void setAbbreviated(String abbreviated) {
		this.abbreviated = abbreviated;
	}

	public String getScope() {
		return this.scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public Timestamp getAddDate() {
		return this.addDate;
	}

	public void setAddDate(Timestamp addDate) {
		this.addDate = addDate;
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

	public String getCustClassDesc() {
		return this.custClassDesc;
	}

	public void setCustClassDesc(String custClassDesc) {
		this.custClassDesc = custClassDesc;
	}

	public Integer getListTop() {
		return this.listTop;
	}

	public void setListTop(Integer listTop) {
		this.listTop = listTop;
	}

	public Integer getCommend() {
		return this.commend;
	}

	public void setCommend(Integer commend) {
		this.commend = commend;
	}

	public String getCommendUserId() {
		return this.commendUserId;
	}

	public void setCommendUserId(String commendUserId) {
		this.commendUserId = commendUserId;
	}

	public Timestamp getCommendTime() {
		return this.commendTime;
	}

	public void setCommendTime(Timestamp commendTime) {
		this.commendTime = commendTime;
	}

	public Integer getDisplay() {
		return this.display;
	}

	public void setDisplay(Integer display) {
		this.display = display;
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

	public String getBackReason() {
		return this.backReason;
	}

	public void setBackReason(String backReason) {
		this.backReason = backReason;
	}

	public Integer getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(Integer propertyValue) {
		this.propertyValue = propertyValue;
	}

	public Integer getIntegration() {
		return this.integration;
	}

	public void setIntegration(Integer integration) {
		this.integration = integration;
	}

	public Integer getXunibi() {
		return this.xunibi;
	}

	public void setXunibi(Integer xunibi) {
		this.xunibi = xunibi;
	}

	public Date getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getImages() {
		return this.images;
	}

	public void setImages(String images) {
		this.images = images;
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

}