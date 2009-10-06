package com.gete.sun.entity;

/**
 * Mailboxdetail entity. @author MyEclipse Persistence Tools
 */

public class Mailboxdetail implements java.io.Serializable {

	// Fields

	private String id;
	private String mainid;
	private String sendid;
	private String receiverid;
	private String isread;
	private String position;
	private String demo1;
	private String demo2;

	// Constructors

	/** default constructor */
	public Mailboxdetail() {
	}

	/** full constructor */
	public Mailboxdetail(String mainid, String sendid, String receiverid,
			String isread, String position, String demo1, String demo2) {
		this.mainid = mainid;
		this.sendid = sendid;
		this.receiverid = receiverid;
		this.isread = isread;
		this.position = position;
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

	public String getMainid() {
		return this.mainid;
	}

	public void setMainid(String mainid) {
		this.mainid = mainid;
	}

	public String getSendid() {
		return this.sendid;
	}

	public void setSendid(String sendid) {
		this.sendid = sendid;
	}

	public String getReceiverid() {
		return this.receiverid;
	}

	public void setReceiverid(String receiverid) {
		this.receiverid = receiverid;
	}

	public String getIsread() {
		return this.isread;
	}

	public void setIsread(String isread) {
		this.isread = isread;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
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