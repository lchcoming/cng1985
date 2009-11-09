package com.ada.model;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Forum {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private String describe;
	@Persistent
	private Date pubtime;
	@Persistent
	private String title;
	@Persistent
	private String forumtype;
	public Forum(){
		describe="";
		pubtime=new Date();
		forumtype="";
		title="";
	}
	public String getDescribe() {
		return describe;
	}
	public String getForumtype() {
		return forumtype;
	}
	public Long getId() {
		return id;
	}
	public Date getPubtime() {
		return pubtime;
	}
	public String getTitle() {
		return title;
	}
	public void setDescribe(String describe) {
		this.describe = describe;
	}
	public void setForumtype(String forumtype) {
		this.forumtype = forumtype;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPubtime(Date pubtime) {
		this.pubtime = pubtime;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
