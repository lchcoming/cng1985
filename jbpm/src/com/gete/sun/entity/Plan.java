package com.gete.sun.entity;

import java.math.BigDecimal;

/**
 * Plan entity. @author MyEclipse Persistence Tools
 */

public class Plan implements java.io.Serializable {

	// Fields

	private String id;
	private User user;
	private String type;
	private String object;
	private String lw1result;
	private String lw1lasttime;
	private String lw1monite;
	private String lw1solution;
	private String lw2resutl;
	private String lw2lasttime;
	private String lw2monite;
	private String lw2solution;
	private String lw3result;
	private String lw3lasttime;
	private String lw3monite;
	private String lw3solution;
	private String lw4result;
	private String lw4lasttime;
	private String lw4monite;
	private String lw4solution;
	private String lw5result;
	private String lw5lasttime;
	private String lw5monite;
	private String lw5solution;
	private String tw1result;
	private String tw1lasttime;
	private String tw1monite;
	private String tw2resutl;
	private String tw2lasttime;
	private String tw2monite;
	private String tw3result;
	private String tw3lasttime;
	private String tw3monite;
	private String tw4result;
	private String tw4lasttime;
	private String tw4monite;
	private String tw5result;
	private String tw5lasttime;
	private String tw5monite;
	private String monite1result;
	private String monite1lasttime;
	private String monite1monite;
	private String monite2result;
	private String monite2lasttime;
	private String monite2monite;
	private String monite3result;
	private String monite3lasttime;
	private String monite3monite;
	private String worktogethredetail;
	private String mark;
	private String timestr2;
	private BigDecimal timeint4;
	private String demo5;
	private String demo7;
	private String isgood;
	private String demo8;
	private String demo9;

	// Constructors

	/** default constructor */
	public Plan() {
	}

	/** full constructor */
	public Plan(User user, String type, String object, String lw1result,
			String lw1lasttime, String lw1monite, String lw1solution,
			String lw2resutl, String lw2lasttime, String lw2monite,
			String lw2solution, String lw3result, String lw3lasttime,
			String lw3monite, String lw3solution, String lw4result,
			String lw4lasttime, String lw4monite, String lw4solution,
			String lw5result, String lw5lasttime, String lw5monite,
			String lw5solution, String tw1result, String tw1lasttime,
			String tw1monite, String tw2resutl, String tw2lasttime,
			String tw2monite, String tw3result, String tw3lasttime,
			String tw3monite, String tw4result, String tw4lasttime,
			String tw4monite, String tw5result, String tw5lasttime,
			String tw5monite, String monite1result, String monite1lasttime,
			String monite1monite, String monite2result, String monite2lasttime,
			String monite2monite, String monite3result, String monite3lasttime,
			String monite3monite, String worktogethredetail, String mark,
			String timestr2, BigDecimal timeint4, String demo5, String demo7,
			String isgood, String demo8, String demo9) {
		this.user = user;
		this.type = type;
		this.object = object;
		this.lw1result = lw1result;
		this.lw1lasttime = lw1lasttime;
		this.lw1monite = lw1monite;
		this.lw1solution = lw1solution;
		this.lw2resutl = lw2resutl;
		this.lw2lasttime = lw2lasttime;
		this.lw2monite = lw2monite;
		this.lw2solution = lw2solution;
		this.lw3result = lw3result;
		this.lw3lasttime = lw3lasttime;
		this.lw3monite = lw3monite;
		this.lw3solution = lw3solution;
		this.lw4result = lw4result;
		this.lw4lasttime = lw4lasttime;
		this.lw4monite = lw4monite;
		this.lw4solution = lw4solution;
		this.lw5result = lw5result;
		this.lw5lasttime = lw5lasttime;
		this.lw5monite = lw5monite;
		this.lw5solution = lw5solution;
		this.tw1result = tw1result;
		this.tw1lasttime = tw1lasttime;
		this.tw1monite = tw1monite;
		this.tw2resutl = tw2resutl;
		this.tw2lasttime = tw2lasttime;
		this.tw2monite = tw2monite;
		this.tw3result = tw3result;
		this.tw3lasttime = tw3lasttime;
		this.tw3monite = tw3monite;
		this.tw4result = tw4result;
		this.tw4lasttime = tw4lasttime;
		this.tw4monite = tw4monite;
		this.tw5result = tw5result;
		this.tw5lasttime = tw5lasttime;
		this.tw5monite = tw5monite;
		this.monite1result = monite1result;
		this.monite1lasttime = monite1lasttime;
		this.monite1monite = monite1monite;
		this.monite2result = monite2result;
		this.monite2lasttime = monite2lasttime;
		this.monite2monite = monite2monite;
		this.monite3result = monite3result;
		this.monite3lasttime = monite3lasttime;
		this.monite3monite = monite3monite;
		this.worktogethredetail = worktogethredetail;
		this.mark = mark;
		this.timestr2 = timestr2;
		this.timeint4 = timeint4;
		this.demo5 = demo5;
		this.demo7 = demo7;
		this.isgood = isgood;
		this.demo8 = demo8;
		this.demo9 = demo9;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getObject() {
		return this.object;
	}

	public void setObject(String object) {
		this.object = object;
	}

	public String getLw1result() {
		return this.lw1result;
	}

	public void setLw1result(String lw1result) {
		this.lw1result = lw1result;
	}

	public String getLw1lasttime() {
		return this.lw1lasttime;
	}

	public void setLw1lasttime(String lw1lasttime) {
		this.lw1lasttime = lw1lasttime;
	}

	public String getLw1monite() {
		return this.lw1monite;
	}

	public void setLw1monite(String lw1monite) {
		this.lw1monite = lw1monite;
	}

	public String getLw1solution() {
		return this.lw1solution;
	}

	public void setLw1solution(String lw1solution) {
		this.lw1solution = lw1solution;
	}

	public String getLw2resutl() {
		return this.lw2resutl;
	}

	public void setLw2resutl(String lw2resutl) {
		this.lw2resutl = lw2resutl;
	}

	public String getLw2lasttime() {
		return this.lw2lasttime;
	}

	public void setLw2lasttime(String lw2lasttime) {
		this.lw2lasttime = lw2lasttime;
	}

	public String getLw2monite() {
		return this.lw2monite;
	}

	public void setLw2monite(String lw2monite) {
		this.lw2monite = lw2monite;
	}

	public String getLw2solution() {
		return this.lw2solution;
	}

	public void setLw2solution(String lw2solution) {
		this.lw2solution = lw2solution;
	}

	public String getLw3result() {
		return this.lw3result;
	}

	public void setLw3result(String lw3result) {
		this.lw3result = lw3result;
	}

	public String getLw3lasttime() {
		return this.lw3lasttime;
	}

	public void setLw3lasttime(String lw3lasttime) {
		this.lw3lasttime = lw3lasttime;
	}

	public String getLw3monite() {
		return this.lw3monite;
	}

	public void setLw3monite(String lw3monite) {
		this.lw3monite = lw3monite;
	}

	public String getLw3solution() {
		return this.lw3solution;
	}

	public void setLw3solution(String lw3solution) {
		this.lw3solution = lw3solution;
	}

	public String getLw4result() {
		return this.lw4result;
	}

	public void setLw4result(String lw4result) {
		this.lw4result = lw4result;
	}

	public String getLw4lasttime() {
		return this.lw4lasttime;
	}

	public void setLw4lasttime(String lw4lasttime) {
		this.lw4lasttime = lw4lasttime;
	}

	public String getLw4monite() {
		return this.lw4monite;
	}

	public void setLw4monite(String lw4monite) {
		this.lw4monite = lw4monite;
	}

	public String getLw4solution() {
		return this.lw4solution;
	}

	public void setLw4solution(String lw4solution) {
		this.lw4solution = lw4solution;
	}

	public String getLw5result() {
		return this.lw5result;
	}

	public void setLw5result(String lw5result) {
		this.lw5result = lw5result;
	}

	public String getLw5lasttime() {
		return this.lw5lasttime;
	}

	public void setLw5lasttime(String lw5lasttime) {
		this.lw5lasttime = lw5lasttime;
	}

	public String getLw5monite() {
		return this.lw5monite;
	}

	public void setLw5monite(String lw5monite) {
		this.lw5monite = lw5monite;
	}

	public String getLw5solution() {
		return this.lw5solution;
	}

	public void setLw5solution(String lw5solution) {
		this.lw5solution = lw5solution;
	}

	public String getTw1result() {
		return this.tw1result;
	}

	public void setTw1result(String tw1result) {
		this.tw1result = tw1result;
	}

	public String getTw1lasttime() {
		return this.tw1lasttime;
	}

	public void setTw1lasttime(String tw1lasttime) {
		this.tw1lasttime = tw1lasttime;
	}

	public String getTw1monite() {
		return this.tw1monite;
	}

	public void setTw1monite(String tw1monite) {
		this.tw1monite = tw1monite;
	}

	public String getTw2resutl() {
		return this.tw2resutl;
	}

	public void setTw2resutl(String tw2resutl) {
		this.tw2resutl = tw2resutl;
	}

	public String getTw2lasttime() {
		return this.tw2lasttime;
	}

	public void setTw2lasttime(String tw2lasttime) {
		this.tw2lasttime = tw2lasttime;
	}

	public String getTw2monite() {
		return this.tw2monite;
	}

	public void setTw2monite(String tw2monite) {
		this.tw2monite = tw2monite;
	}

	public String getTw3result() {
		return this.tw3result;
	}

	public void setTw3result(String tw3result) {
		this.tw3result = tw3result;
	}

	public String getTw3lasttime() {
		return this.tw3lasttime;
	}

	public void setTw3lasttime(String tw3lasttime) {
		this.tw3lasttime = tw3lasttime;
	}

	public String getTw3monite() {
		return this.tw3monite;
	}

	public void setTw3monite(String tw3monite) {
		this.tw3monite = tw3monite;
	}

	public String getTw4result() {
		return this.tw4result;
	}

	public void setTw4result(String tw4result) {
		this.tw4result = tw4result;
	}

	public String getTw4lasttime() {
		return this.tw4lasttime;
	}

	public void setTw4lasttime(String tw4lasttime) {
		this.tw4lasttime = tw4lasttime;
	}

	public String getTw4monite() {
		return this.tw4monite;
	}

	public void setTw4monite(String tw4monite) {
		this.tw4monite = tw4monite;
	}

	public String getTw5result() {
		return this.tw5result;
	}

	public void setTw5result(String tw5result) {
		this.tw5result = tw5result;
	}

	public String getTw5lasttime() {
		return this.tw5lasttime;
	}

	public void setTw5lasttime(String tw5lasttime) {
		this.tw5lasttime = tw5lasttime;
	}

	public String getTw5monite() {
		return this.tw5monite;
	}

	public void setTw5monite(String tw5monite) {
		this.tw5monite = tw5monite;
	}

	public String getMonite1result() {
		return this.monite1result;
	}

	public void setMonite1result(String monite1result) {
		this.monite1result = monite1result;
	}

	public String getMonite1lasttime() {
		return this.monite1lasttime;
	}

	public void setMonite1lasttime(String monite1lasttime) {
		this.monite1lasttime = monite1lasttime;
	}

	public String getMonite1monite() {
		return this.monite1monite;
	}

	public void setMonite1monite(String monite1monite) {
		this.monite1monite = monite1monite;
	}

	public String getMonite2result() {
		return this.monite2result;
	}

	public void setMonite2result(String monite2result) {
		this.monite2result = monite2result;
	}

	public String getMonite2lasttime() {
		return this.monite2lasttime;
	}

	public void setMonite2lasttime(String monite2lasttime) {
		this.monite2lasttime = monite2lasttime;
	}

	public String getMonite2monite() {
		return this.monite2monite;
	}

	public void setMonite2monite(String monite2monite) {
		this.monite2monite = monite2monite;
	}

	public String getMonite3result() {
		return this.monite3result;
	}

	public void setMonite3result(String monite3result) {
		this.monite3result = monite3result;
	}

	public String getMonite3lasttime() {
		return this.monite3lasttime;
	}

	public void setMonite3lasttime(String monite3lasttime) {
		this.monite3lasttime = monite3lasttime;
	}

	public String getMonite3monite() {
		return this.monite3monite;
	}

	public void setMonite3monite(String monite3monite) {
		this.monite3monite = monite3monite;
	}

	public String getWorktogethredetail() {
		return this.worktogethredetail;
	}

	public void setWorktogethredetail(String worktogethredetail) {
		this.worktogethredetail = worktogethredetail;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getTimestr2() {
		return this.timestr2;
	}

	public void setTimestr2(String timestr2) {
		this.timestr2 = timestr2;
	}

	public BigDecimal getTimeint4() {
		return this.timeint4;
	}

	public void setTimeint4(BigDecimal timeint4) {
		this.timeint4 = timeint4;
	}

	public String getDemo5() {
		return this.demo5;
	}

	public void setDemo5(String demo5) {
		this.demo5 = demo5;
	}

	public String getDemo7() {
		return this.demo7;
	}

	public void setDemo7(String demo7) {
		this.demo7 = demo7;
	}

	public String getIsgood() {
		return this.isgood;
	}

	public void setIsgood(String isgood) {
		this.isgood = isgood;
	}

	public String getDemo8() {
		return this.demo8;
	}

	public void setDemo8(String demo8) {
		this.demo8 = demo8;
	}

	public String getDemo9() {
		return this.demo9;
	}

	public void setDemo9(String demo9) {
		this.demo9 = demo9;
	}

}