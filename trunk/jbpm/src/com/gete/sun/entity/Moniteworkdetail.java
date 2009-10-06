package com.gete.sun.entity;

/**
 * Moniteworkdetail entity. @author MyEclipse Persistence Tools
 */

public class Moniteworkdetail implements java.io.Serializable {

	// Fields

	private String id;
	private Moniteworkmain moniteworkmain;
	private User user;
	private String projectname;
	private String content;
	private String request;
	private String finishtime;
	private String page;
	private Integer no;
	private String finishflag;
	private String mark;
	private String demo3;
	private String demo4;

	// Constructors

	/** default constructor */
	public Moniteworkdetail() {
	}

	/** full constructor */
	public Moniteworkdetail(Moniteworkmain moniteworkmain, User user,
			String projectname, String content, String request,
			String finishtime, String page, Integer no, String finishflag,
			String mark, String demo3, String demo4) {
		this.moniteworkmain = moniteworkmain;
		this.user = user;
		this.projectname = projectname;
		this.content = content;
		this.request = request;
		this.finishtime = finishtime;
		this.page = page;
		this.no = no;
		this.finishflag = finishflag;
		this.mark = mark;
		this.demo3 = demo3;
		this.demo4 = demo4;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Moniteworkmain getMoniteworkmain() {
		return this.moniteworkmain;
	}

	public void setMoniteworkmain(Moniteworkmain moniteworkmain) {
		this.moniteworkmain = moniteworkmain;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getProjectname() {
		return this.projectname;
	}

	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
	}

	public String getFinishtime() {
		return this.finishtime;
	}

	public void setFinishtime(String finishtime) {
		this.finishtime = finishtime;
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

	public String getFinishflag() {
		return this.finishflag;
	}

	public void setFinishflag(String finishflag) {
		this.finishflag = finishflag;
	}

	public String getMark() {
		return this.mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
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

}