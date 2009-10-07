package com.gete.sun.entity;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Sealtable entity. @author MyEclipse Persistence Tools
 */

public class Sealtable implements java.io.Serializable {

	// Fields

	private String id;
	private String userid;
	private String departid;
	private Date startime;
	private String message;
	private String usetype;
	private Date outtime;
	private String usemessage;
	private String managerid;
	private String ceoid;
	private Integer counts;
	private String stateinfo;
	private String processid;
	private String sealtitle;
	private String managemessage;
	private String ceomessage;
	private String number;
	private String what;

	// Constructors

	/** default constructor */
	public Sealtable() {
	}

	/** full constructor */
	public Sealtable(String userid, String departid, Date startime,
			String message, String usetype, Date outtime,
			String usemessage, String managerid, String ceoid, Integer counts,
			String stateinfo, String processid, String sealtitle,
			String managemessage, String ceomessage, String number, String what) {
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
		this.sealtitle = sealtitle;
		this.managemessage = managemessage;
		this.ceomessage = ceomessage;
		this.number = number;
		this.what = what;
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



	public Date getStartime() {
		return startime;
	}

	public void setStartime(Date startime) {
		this.startime = startime;
	}

	public Date getOuttime() {
		return outtime;
	}

	public void setOuttime(Date outtime) {
		this.outtime = outtime;
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

	public String getSealtitle() {
		return this.sealtitle;
	}

	public void setSealtitle(String sealtitle) {
		this.sealtitle = sealtitle;
	}

	public String getManagemessage() {
		return this.managemessage;
	}

	public void setManagemessage(String managemessage) {
		this.managemessage = managemessage;
	}

	public String getCeomessage() {
		return this.ceomessage;
	}

	public void setCeomessage(String ceomessage) {
		this.ceomessage = ceomessage;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getWhat() {
		return this.what;
	}

	public void setWhat(String what) {
		this.what = what;
	}

}