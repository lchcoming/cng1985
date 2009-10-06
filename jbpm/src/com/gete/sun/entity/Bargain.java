package com.gete.sun.entity;

/**
 * Bargain entity. @author MyEclipse Persistence Tools
 */

public class Bargain implements java.io.Serializable {

	// Fields

	private String bargainId;
	private Bargaintype bargaintype;
	private String nom;
	private String time;
	private String itemname;
	private String companyname;
	private String bargainname;
	private Integer bargaincopies;
	private Integer bargainpages;
	private Long bargainmoney;
	private String mansscomments;
	private String manssignature;
	private String manscomments;
	private String mansignature;
	private String depscomments;
	private String depsignature;
	private String budgetscomments;
	private String budgetsignature;
	private String mscomments;
	private String msignature;
	private Integer office;
	private Integer finance;
	private Integer timeint;
	private String demo1;
	private String demo2;
	private String demo3;
	private String demo4;
	private String demo5;
	private String demo6;
	private String demo7;
	private String demo8;
	private String users;

	// Constructors

	/** default constructor */
	public Bargain() {
	}

	/** full constructor */
	public Bargain(Bargaintype bargaintype, String nom, String time,
			String itemname, String companyname, String bargainname,
			Integer bargaincopies, Integer bargainpages, Long bargainmoney,
			String mansscomments, String manssignature, String manscomments,
			String mansignature, String depscomments, String depsignature,
			String budgetscomments, String budgetsignature, String mscomments,
			String msignature, Integer office, Integer finance,
			Integer timeint, String demo1, String demo2, String demo3,
			String demo4, String demo5, String demo6, String demo7,
			String demo8, String users) {
		this.bargaintype = bargaintype;
		this.nom = nom;
		this.time = time;
		this.itemname = itemname;
		this.companyname = companyname;
		this.bargainname = bargainname;
		this.bargaincopies = bargaincopies;
		this.bargainpages = bargainpages;
		this.bargainmoney = bargainmoney;
		this.mansscomments = mansscomments;
		this.manssignature = manssignature;
		this.manscomments = manscomments;
		this.mansignature = mansignature;
		this.depscomments = depscomments;
		this.depsignature = depsignature;
		this.budgetscomments = budgetscomments;
		this.budgetsignature = budgetsignature;
		this.mscomments = mscomments;
		this.msignature = msignature;
		this.office = office;
		this.finance = finance;
		this.timeint = timeint;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.demo3 = demo3;
		this.demo4 = demo4;
		this.demo5 = demo5;
		this.demo6 = demo6;
		this.demo7 = demo7;
		this.demo8 = demo8;
		this.users = users;
	}

	// Property accessors

	public String getBargainId() {
		return this.bargainId;
	}

	public void setBargainId(String bargainId) {
		this.bargainId = bargainId;
	}

	public Bargaintype getBargaintype() {
		return this.bargaintype;
	}

	public void setBargaintype(Bargaintype bargaintype) {
		this.bargaintype = bargaintype;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getItemname() {
		return this.itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public String getBargainname() {
		return this.bargainname;
	}

	public void setBargainname(String bargainname) {
		this.bargainname = bargainname;
	}

	public Integer getBargaincopies() {
		return this.bargaincopies;
	}

	public void setBargaincopies(Integer bargaincopies) {
		this.bargaincopies = bargaincopies;
	}

	public Integer getBargainpages() {
		return this.bargainpages;
	}

	public void setBargainpages(Integer bargainpages) {
		this.bargainpages = bargainpages;
	}

	public Long getBargainmoney() {
		return this.bargainmoney;
	}

	public void setBargainmoney(Long bargainmoney) {
		this.bargainmoney = bargainmoney;
	}

	public String getMansscomments() {
		return this.mansscomments;
	}

	public void setMansscomments(String mansscomments) {
		this.mansscomments = mansscomments;
	}

	public String getManssignature() {
		return this.manssignature;
	}

	public void setManssignature(String manssignature) {
		this.manssignature = manssignature;
	}

	public String getManscomments() {
		return this.manscomments;
	}

	public void setManscomments(String manscomments) {
		this.manscomments = manscomments;
	}

	public String getMansignature() {
		return this.mansignature;
	}

	public void setMansignature(String mansignature) {
		this.mansignature = mansignature;
	}

	public String getDepscomments() {
		return this.depscomments;
	}

	public void setDepscomments(String depscomments) {
		this.depscomments = depscomments;
	}

	public String getDepsignature() {
		return this.depsignature;
	}

	public void setDepsignature(String depsignature) {
		this.depsignature = depsignature;
	}

	public String getBudgetscomments() {
		return this.budgetscomments;
	}

	public void setBudgetscomments(String budgetscomments) {
		this.budgetscomments = budgetscomments;
	}

	public String getBudgetsignature() {
		return this.budgetsignature;
	}

	public void setBudgetsignature(String budgetsignature) {
		this.budgetsignature = budgetsignature;
	}

	public String getMscomments() {
		return this.mscomments;
	}

	public void setMscomments(String mscomments) {
		this.mscomments = mscomments;
	}

	public String getMsignature() {
		return this.msignature;
	}

	public void setMsignature(String msignature) {
		this.msignature = msignature;
	}

	public Integer getOffice() {
		return this.office;
	}

	public void setOffice(Integer office) {
		this.office = office;
	}

	public Integer getFinance() {
		return this.finance;
	}

	public void setFinance(Integer finance) {
		this.finance = finance;
	}

	public Integer getTimeint() {
		return this.timeint;
	}

	public void setTimeint(Integer timeint) {
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

	public String getDemo5() {
		return this.demo5;
	}

	public void setDemo5(String demo5) {
		this.demo5 = demo5;
	}

	public String getDemo6() {
		return this.demo6;
	}

	public void setDemo6(String demo6) {
		this.demo6 = demo6;
	}

	public String getDemo7() {
		return this.demo7;
	}

	public void setDemo7(String demo7) {
		this.demo7 = demo7;
	}

	public String getDemo8() {
		return this.demo8;
	}

	public void setDemo8(String demo8) {
		this.demo8 = demo8;
	}

	public String getUsers() {
		return this.users;
	}

	public void setUsers(String users) {
		this.users = users;
	}

}