package com.gete.sun.entity;

/**
 * Moneyplandetail entity. @author MyEclipse Persistence Tools
 */

public class Moneyplandetail implements java.io.Serializable {

	// Fields

	private String id;
	private Moneyplan moneyplan;
	private String page;
	private Integer no;
	private String moneyuse;
	private Double money;
	private String payway;
	private String weekpaystatu;
	private String mark;
	private String demo1;
	private String demo2;

	// Constructors

	/** default constructor */
	public Moneyplandetail() {
	}

	/** full constructor */
	public Moneyplandetail(Moneyplan moneyplan, String page, Integer no,
			String moneyuse, Double money, String payway, String weekpaystatu,
			String mark, String demo1, String demo2) {
		this.moneyplan = moneyplan;
		this.page = page;
		this.no = no;
		this.moneyuse = moneyuse;
		this.money = money;
		this.payway = payway;
		this.weekpaystatu = weekpaystatu;
		this.mark = mark;
		this.demo1 = demo1;
		this.demo2 = demo2;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Moneyplan getMoneyplan() {
		return this.moneyplan;
	}

	public void setMoneyplan(Moneyplan moneyplan) {
		this.moneyplan = moneyplan;
	}

	public String getPage() {
		return this.page;
	}

	public void setPage(String page) {
		this.page = page;
	}

	public Integer getNo() {
		return this.no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getMoneyuse() {
		return this.moneyuse;
	}

	public void setMoneyuse(String moneyuse) {
		this.moneyuse = moneyuse;
	}

	public Double getMoney() {
		return this.money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getPayway() {
		return this.payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public String getWeekpaystatu() {
		return this.weekpaystatu;
	}

	public void setWeekpaystatu(String weekpaystatu) {
		this.weekpaystatu = weekpaystatu;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
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

}