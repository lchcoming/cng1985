package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private String id;
	private Department department;
	private String loginname;
	private String realname;
	private String password;
	private String work;
	private String birthday;
	private String photopath;
	private String telephone;
	private String email;
	private String qq;
	private String address;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private Set contributes = new HashSet(0);
	private Set moneyplansForOfferuserid = new HashSet(0);
	private Set userRoles = new HashSet(0);
	private Set rewards = new HashSet(0);
	private Set planwarns = new HashSet(0);
	private Set bbsasks = new HashSet(0);
	private Set contactgroups = new HashSet(0);
	private Set moneyplansForFinanceuserid = new HashSet(0);
	private Set moneyplansForDepuserid = new HashSet(0);
	private Set plans = new HashSet(0);
	private Set advisesForSendiuserd = new HashSet(0);
	private Set sportsinfos = new HashSet(0);
	private Set remindbooks = new HashSet(0);
	private Set moneyplansForManagerid = new HashSet(0);
	private Set moniteworkdetails = new HashSet(0);
	private Set moneyplansForVicepresidentid = new HashSet(0);
	private Set waichus = new HashSet(0);
	private Set advisesForReceiverid = new HashSet(0);
	private Set moneyplansForPresidentid = new HashSet(0);
	private Set moneyplansForMaterialuserid = new HashSet(0);
	private Set usercontacts = new HashSet(0);
	private Set bbsanswers = new HashSet(0);
	private Set filedetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(Department department, String loginname, String realname,
			String password, String work, String birthday, String photopath,
			String telephone, String email, String qq, String address,
			String timestr, BigDecimal timeint, String demo1, String demo2,
			Set contributes, Set moneyplansForOfferuserid, Set userRoles,
			Set rewards, Set planwarns, Set bbsasks, Set contactgroups,
			Set moneyplansForFinanceuserid, Set moneyplansForDepuserid,
			Set plans, Set advisesForSendiuserd, Set sportsinfos,
			Set remindbooks, Set moneyplansForManagerid, Set moniteworkdetails,
			Set moneyplansForVicepresidentid, Set waichus,
			Set advisesForReceiverid, Set moneyplansForPresidentid,
			Set moneyplansForMaterialuserid, Set usercontacts, Set bbsanswers,
			Set filedetails) {
		this.department = department;
		this.loginname = loginname;
		this.realname = realname;
		this.password = password;
		this.work = work;
		this.birthday = birthday;
		this.photopath = photopath;
		this.telephone = telephone;
		this.email = email;
		this.qq = qq;
		this.address = address;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.contributes = contributes;
		this.moneyplansForOfferuserid = moneyplansForOfferuserid;
		this.userRoles = userRoles;
		this.rewards = rewards;
		this.planwarns = planwarns;
		this.bbsasks = bbsasks;
		this.contactgroups = contactgroups;
		this.moneyplansForFinanceuserid = moneyplansForFinanceuserid;
		this.moneyplansForDepuserid = moneyplansForDepuserid;
		this.plans = plans;
		this.advisesForSendiuserd = advisesForSendiuserd;
		this.sportsinfos = sportsinfos;
		this.remindbooks = remindbooks;
		this.moneyplansForManagerid = moneyplansForManagerid;
		this.moniteworkdetails = moniteworkdetails;
		this.moneyplansForVicepresidentid = moneyplansForVicepresidentid;
		this.waichus = waichus;
		this.advisesForReceiverid = advisesForReceiverid;
		this.moneyplansForPresidentid = moneyplansForPresidentid;
		this.moneyplansForMaterialuserid = moneyplansForMaterialuserid;
		this.usercontacts = usercontacts;
		this.bbsanswers = bbsanswers;
		this.filedetails = filedetails;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getLoginname() {
		return this.loginname;
	}

	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}

	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhotopath() {
		return this.photopath;
	}

	public void setPhotopath(String photopath) {
		this.photopath = photopath;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQq() {
		return this.qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTimestr() {
		return this.timestr;
	}

	public void setTimestr(String timestr) {
		this.timestr = timestr;
	}

	public BigDecimal getTimeint() {
		return this.timeint;
	}

	public void setTimeint(BigDecimal timeint) {
		this.timeint = timeint;
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

	public Set getContributes() {
		return this.contributes;
	}

	public void setContributes(Set contributes) {
		this.contributes = contributes;
	}

	public Set getMoneyplansForOfferuserid() {
		return this.moneyplansForOfferuserid;
	}

	public void setMoneyplansForOfferuserid(Set moneyplansForOfferuserid) {
		this.moneyplansForOfferuserid = moneyplansForOfferuserid;
	}

	public Set getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set userRoles) {
		this.userRoles = userRoles;
	}

	public Set getRewards() {
		return this.rewards;
	}

	public void setRewards(Set rewards) {
		this.rewards = rewards;
	}

	public Set getPlanwarns() {
		return this.planwarns;
	}

	public void setPlanwarns(Set planwarns) {
		this.planwarns = planwarns;
	}

	public Set getBbsasks() {
		return this.bbsasks;
	}

	public void setBbsasks(Set bbsasks) {
		this.bbsasks = bbsasks;
	}

	public Set getContactgroups() {
		return this.contactgroups;
	}

	public void setContactgroups(Set contactgroups) {
		this.contactgroups = contactgroups;
	}

	public Set getMoneyplansForFinanceuserid() {
		return this.moneyplansForFinanceuserid;
	}

	public void setMoneyplansForFinanceuserid(Set moneyplansForFinanceuserid) {
		this.moneyplansForFinanceuserid = moneyplansForFinanceuserid;
	}

	public Set getMoneyplansForDepuserid() {
		return this.moneyplansForDepuserid;
	}

	public void setMoneyplansForDepuserid(Set moneyplansForDepuserid) {
		this.moneyplansForDepuserid = moneyplansForDepuserid;
	}

	public Set getPlans() {
		return this.plans;
	}

	public void setPlans(Set plans) {
		this.plans = plans;
	}

	public Set getAdvisesForSendiuserd() {
		return this.advisesForSendiuserd;
	}

	public void setAdvisesForSendiuserd(Set advisesForSendiuserd) {
		this.advisesForSendiuserd = advisesForSendiuserd;
	}

	public Set getSportsinfos() {
		return this.sportsinfos;
	}

	public void setSportsinfos(Set sportsinfos) {
		this.sportsinfos = sportsinfos;
	}

	public Set getRemindbooks() {
		return this.remindbooks;
	}

	public void setRemindbooks(Set remindbooks) {
		this.remindbooks = remindbooks;
	}

	public Set getMoneyplansForManagerid() {
		return this.moneyplansForManagerid;
	}

	public void setMoneyplansForManagerid(Set moneyplansForManagerid) {
		this.moneyplansForManagerid = moneyplansForManagerid;
	}

	public Set getMoniteworkdetails() {
		return this.moniteworkdetails;
	}

	public void setMoniteworkdetails(Set moniteworkdetails) {
		this.moniteworkdetails = moniteworkdetails;
	}

	public Set getMoneyplansForVicepresidentid() {
		return this.moneyplansForVicepresidentid;
	}

	public void setMoneyplansForVicepresidentid(Set moneyplansForVicepresidentid) {
		this.moneyplansForVicepresidentid = moneyplansForVicepresidentid;
	}

	public Set getWaichus() {
		return this.waichus;
	}

	public void setWaichus(Set waichus) {
		this.waichus = waichus;
	}

	public Set getAdvisesForReceiverid() {
		return this.advisesForReceiverid;
	}

	public void setAdvisesForReceiverid(Set advisesForReceiverid) {
		this.advisesForReceiverid = advisesForReceiverid;
	}

	public Set getMoneyplansForPresidentid() {
		return this.moneyplansForPresidentid;
	}

	public void setMoneyplansForPresidentid(Set moneyplansForPresidentid) {
		this.moneyplansForPresidentid = moneyplansForPresidentid;
	}

	public Set getMoneyplansForMaterialuserid() {
		return this.moneyplansForMaterialuserid;
	}

	public void setMoneyplansForMaterialuserid(Set moneyplansForMaterialuserid) {
		this.moneyplansForMaterialuserid = moneyplansForMaterialuserid;
	}

	public Set getUsercontacts() {
		return this.usercontacts;
	}

	public void setUsercontacts(Set usercontacts) {
		this.usercontacts = usercontacts;
	}

	public Set getBbsanswers() {
		return this.bbsanswers;
	}

	public void setBbsanswers(Set bbsanswers) {
		this.bbsanswers = bbsanswers;
	}

	public Set getFiledetails() {
		return this.filedetails;
	}

	public void setFiledetails(Set filedetails) {
		this.filedetails = filedetails;
	}

}