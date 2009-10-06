package com.gete.sun.entity;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Moneyplan entity. @author MyEclipse Persistence Tools
 */

public class Moneyplan implements java.io.Serializable {

	// Fields

	private String id;
	private User userByVicepresidentid;
	private User userByFinanceuserid;
	private Department department;
	private User userByOfferuserid;
	private User userByPresidentid;
	private User userByMaterialuserid;
	private User userByManagerid;
	private User userByDepuserid;
	private String depuserview;
	private String financeuserview;
	private String managerview;
	private String aduitflag;
	private String aduitgrede;
	private String timestr;
	private BigDecimal timeint;
	private String demo1;
	private String demo2;
	private String demo3;
	private String demo4;
	private String vicepresidentview;
	private String presidentview;
	private String materialuserview;
	private Set moneyplandetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Moneyplan() {
	}

	/** full constructor */
	public Moneyplan(User userByVicepresidentid, User userByFinanceuserid,
			Department department, User userByOfferuserid,
			User userByPresidentid, User userByMaterialuserid,
			User userByManagerid, User userByDepuserid, String depuserview,
			String financeuserview, String managerview, String aduitflag,
			String aduitgrede, String timestr, BigDecimal timeint,
			String demo1, String demo2, String demo3, String demo4,
			String vicepresidentview, String presidentview,
			String materialuserview, Set moneyplandetails) {
		this.userByVicepresidentid = userByVicepresidentid;
		this.userByFinanceuserid = userByFinanceuserid;
		this.department = department;
		this.userByOfferuserid = userByOfferuserid;
		this.userByPresidentid = userByPresidentid;
		this.userByMaterialuserid = userByMaterialuserid;
		this.userByManagerid = userByManagerid;
		this.userByDepuserid = userByDepuserid;
		this.depuserview = depuserview;
		this.financeuserview = financeuserview;
		this.managerview = managerview;
		this.aduitflag = aduitflag;
		this.aduitgrede = aduitgrede;
		this.timestr = timestr;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.demo3 = demo3;
		this.demo4 = demo4;
		this.vicepresidentview = vicepresidentview;
		this.presidentview = presidentview;
		this.materialuserview = materialuserview;
		this.moneyplandetails = moneyplandetails;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUserByVicepresidentid() {
		return this.userByVicepresidentid;
	}

	public void setUserByVicepresidentid(User userByVicepresidentid) {
		this.userByVicepresidentid = userByVicepresidentid;
	}

	public User getUserByFinanceuserid() {
		return this.userByFinanceuserid;
	}

	public void setUserByFinanceuserid(User userByFinanceuserid) {
		this.userByFinanceuserid = userByFinanceuserid;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public User getUserByOfferuserid() {
		return this.userByOfferuserid;
	}

	public void setUserByOfferuserid(User userByOfferuserid) {
		this.userByOfferuserid = userByOfferuserid;
	}

	public User getUserByPresidentid() {
		return this.userByPresidentid;
	}

	public void setUserByPresidentid(User userByPresidentid) {
		this.userByPresidentid = userByPresidentid;
	}

	public User getUserByMaterialuserid() {
		return this.userByMaterialuserid;
	}

	public void setUserByMaterialuserid(User userByMaterialuserid) {
		this.userByMaterialuserid = userByMaterialuserid;
	}

	public User getUserByManagerid() {
		return this.userByManagerid;
	}

	public void setUserByManagerid(User userByManagerid) {
		this.userByManagerid = userByManagerid;
	}

	public User getUserByDepuserid() {
		return this.userByDepuserid;
	}

	public void setUserByDepuserid(User userByDepuserid) {
		this.userByDepuserid = userByDepuserid;
	}

	public String getDepuserview() {
		return this.depuserview;
	}

	public void setDepuserview(String depuserview) {
		this.depuserview = depuserview;
	}

	public String getFinanceuserview() {
		return this.financeuserview;
	}

	public void setFinanceuserview(String financeuserview) {
		this.financeuserview = financeuserview;
	}

	public String getManagerview() {
		return this.managerview;
	}

	public void setManagerview(String managerview) {
		this.managerview = managerview;
	}

	public String getAduitflag() {
		return this.aduitflag;
	}

	public void setAduitflag(String aduitflag) {
		this.aduitflag = aduitflag;
	}

	public String getAduitgrede() {
		return this.aduitgrede;
	}

	public void setAduitgrede(String aduitgrede) {
		this.aduitgrede = aduitgrede;
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

	public String getDemo3() {
		return this.demo3;
	}

	public void setDemo3(String demo3) {
		this.demo3 = demo3;
	}

	public String getDemo4() {
		return this.demo4;
	}

	public void setDemo4(String demo4) {
		this.demo4 = demo4;
	}

	public String getVicepresidentview() {
		return this.vicepresidentview;
	}

	public void setVicepresidentview(String vicepresidentview) {
		this.vicepresidentview = vicepresidentview;
	}

	public String getPresidentview() {
		return this.presidentview;
	}

	public void setPresidentview(String presidentview) {
		this.presidentview = presidentview;
	}

	public String getMaterialuserview() {
		return this.materialuserview;
	}

	public void setMaterialuserview(String materialuserview) {
		this.materialuserview = materialuserview;
	}

	public Set getMoneyplandetails() {
		return this.moneyplandetails;
	}

	public void setMoneyplandetails(Set moneyplandetails) {
		this.moneyplandetails = moneyplandetails;
	}

}