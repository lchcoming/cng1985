package com.gete.sun.entity;

import java.sql.Timestamp;

/**
 * Sealtable entity. @author MyEclipse Persistence Tools
 */

public class Sealtable implements java.io.Serializable {

	// Fields

	private String id;
	private String userid;
	private String departid;
	private Timestamp startime;
	private String message;
	private String usetype;
	private Timestamp outtime;
	private String usemessage;
	private String managerid;
	private String ceoid;
	private Integer counts;
	private String stateinfo;
	private String processid;
	private String tsealitle;

	// Constructors

	/** default constructor */
	public Sealtable() {
	}

	/** minimal constructor */
	public Sealtable(String tsealitle) {
		this.tsealitle = tsealitle;
	}

	/** full constructor */
	public Sealtable(String userid, String departid, Timestamp startime,
			String message, String usetype, Timestamp outtime,
			String usemessage, String managerid, String ceoid, Integer counts,
			String stateinfo, String processid, String tsealitle) {
		this.userid = userid;
		this.departid = departid;
		this.startime = startime;
		this.message = message;
		this.usetype = usetype;
		this.outtime = outtime;
		this.usemessage = usemessage;
		this.managerid = managerid;
		this.ceoid = ceoid;
		this.counts = counts;
		this.stateinfo = stateinfo;
		this.processid = processid;
		this.tsealitle = tsealitle;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserid() {
		return this.userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getDepartid() {
		return this.departid;
	}

	public void setDepartid(String departid) {
		this.departid = departid;
	}

	public Timestamp getStartime() {
		return this.startime;
	}

	public void setStartime(Timestamp startime) {
		this.startime = startime;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUsetype() {
		return this.usetype;
	}

	public void setUsetype(String usetype) {
		this.usetype = usetype;
	}

	public Timestamp getOuttime() {
		return this.outtime;
	}

	public void setOuttime(Timestamp outtime) {
		this.outtime = outtime;
	}

	public String getUsemessage() {
		return this.usemessage;
	}

	public void setUsemessage(String usemessage) {
		this.usemessage = usemessage;
	}

	public String getManagerid() {
		return this.managerid;
	}

	public void setManagerid(String managerid) {
		this.managerid = managerid;
	}

	public String getCeoid() {
		return this.ceoid;
	}

	public void setCeoid(String ceoid) {
		this.ceoid = ceoid;
	}

	public Integer getCounts() {
		return this.counts;
	}

	public void setCounts(Integer counts) {
		this.counts = counts;
	}

	public String getStateinfo() {
		return this.stateinfo;
	}

	public void setStateinfo(String stateinfo) {
		this.stateinfo = stateinfo;
	}

	public String getProcessid() {
		return this.processid;
	}

	public void setProcessid(String processid) {
		this.processid = processid;
	}

	public String getTsealitle() {
		return this.tsealitle;
	}

	public void setTsealitle(String tsealitle) {
		this.tsealitle = tsealitle;
	}

}