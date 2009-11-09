package com.ada.news.model;

import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class News {
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	@PrimaryKey
	private Long id;
	@Persistent
	private String title;
	@Persistent
	private long visit;
	@Persistent
	private Date putime;
	@Persistent(mappedBy="news")
	private List<Discuss> dilist; 
	@Persistent
	private NewDetails details;
	public NewDetails getDetails() {
		return details;
	}
	public Long getId() {
		return id;
	}
	public Date getPutime() {
		return putime;
	}
	public String getTitle() {
		return title;
	}
	public long getVisit() {
		return visit;
	}
	public void setDetails(NewDetails details) {
		this.details = details;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setPutime(Date putime) {
		this.putime = putime;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setVisit(long visit) {
		this.visit = visit;
	}
	public void setDilist(List<Discuss> dilist) {
		this.dilist = dilist;
	}
	public List<Discuss> getDilist() {
		return dilist;
	}
}
