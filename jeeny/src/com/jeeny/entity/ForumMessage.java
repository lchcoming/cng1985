package com.jeeny.entity;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Text;

@PersistenceCapable(identityType=IdentityType.APPLICATION)
public class ForumMessage {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long id;
	@Persistent
	private Date putime;
	@Persistent
	private String title;
	@Persistent
	private Text content;
	@Persistent 
	private String pubuser;
	@Persistent
	private int visit;
	@Persistent
	private int score;
	@Persistent
	private int uptimes;
	@Persistent
	private int downtime;
	@Persistent
	private Long forumid;
	public Text getContent() {
		return content;
	}
	public int getDowntime() {
		return downtime;
	}
	public Long getForumid() {
		return forumid;
	}
	public Long getId() {
		return id;
	}
	public String getPubuser() {
		return pubuser;
	}
	public Date getPutime() {
		return putime;
	}

	public int getScore() {
		return score;
	}
	public String getTitle() {
		return title;
	}
	public int getUptimes() {
		return uptimes;
	}
	public int getVisit() {
		return visit;
	}
	public void setContent(Text content) {
		this.content = content;
	}
	public void setDowntime(int downtime) {
		this.downtime = downtime;
	}
	public void setForumid(Long forumid) {
		this.forumid = forumid;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPubuser(String pubuser) {
		this.pubuser = pubuser;
	}
	public void setPutime(Date putime) {
		this.putime = putime;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setUptimes(int uptimes) {
		this.uptimes = uptimes;
	}
	public void setVisit(int visit) {
		this.visit = visit;
	}
}
