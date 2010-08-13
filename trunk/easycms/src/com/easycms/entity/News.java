package com.easycms.entity;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * News entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")

public class News implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short newsLang;
	@Persistent
	private String newsRela;
	@Persistent
	private String newsTitle;
	@Persistent
	private String newsTitleColor;
	@Persistent
	private Byte newsExternal;
	@Persistent
	private String newsContent;
	@Persistent
	private String newsPhoto;
	@Persistent
	private String newsSource;
	@Persistent
	private Byte newsRecommended;
	@Persistent
	private String newsPublished;
	@Persistent
	private String newsKeyWord;
	@Persistent
	private Byte newsAudit;
	@Persistent
	private Integer newsClick;
	@Persistent
	private Integer newsSort;
	@Persistent
	private Date newsTime;

	// Constructors

	/** default constructor */
	public News() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getNewsLang() {
		return newsLang;
	}

	public void setNewsLang(Short newsLang) {
		this.newsLang = newsLang;
	}

	public String getNewsRela() {
		return newsRela;
	}

	public void setNewsRela(String newsRela) {
		this.newsRela = newsRela;
	}

	public String getNewsTitle() {
		return newsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		this.newsTitle = newsTitle;
	}

	public String getNewsTitleColor() {
		return newsTitleColor;
	}

	public void setNewsTitleColor(String newsTitleColor) {
		this.newsTitleColor = newsTitleColor;
	}

	public Byte getNewsExternal() {
		return newsExternal;
	}

	public void setNewsExternal(Byte newsExternal) {
		this.newsExternal = newsExternal;
	}

	public String getNewsContent() {
		return newsContent;
	}

	public void setNewsContent(String newsContent) {
		this.newsContent = newsContent;
	}

	public String getNewsPhoto() {
		return newsPhoto;
	}

	public void setNewsPhoto(String newsPhoto) {
		this.newsPhoto = newsPhoto;
	}

	public String getNewsSource() {
		return newsSource;
	}

	public void setNewsSource(String newsSource) {
		this.newsSource = newsSource;
	}

	public Byte getNewsRecommended() {
		return newsRecommended;
	}

	public void setNewsRecommended(Byte newsRecommended) {
		this.newsRecommended = newsRecommended;
	}

	public String getNewsPublished() {
		return newsPublished;
	}

	public void setNewsPublished(String newsPublished) {
		this.newsPublished = newsPublished;
	}

	public String getNewsKeyWord() {
		return newsKeyWord;
	}

	public void setNewsKeyWord(String newsKeyWord) {
		this.newsKeyWord = newsKeyWord;
	}

	public Byte getNewsAudit() {
		return newsAudit;
	}

	public void setNewsAudit(Byte newsAudit) {
		this.newsAudit = newsAudit;
	}

	public Integer getNewsClick() {
		return newsClick;
	}

	public void setNewsClick(Integer newsClick) {
		this.newsClick = newsClick;
	}

	public Integer getNewsSort() {
		return newsSort;
	}

	public void setNewsSort(Integer newsSort) {
		this.newsSort = newsSort;
	}

	public Date getNewsTime() {
		return newsTime;
	}

	public void setNewsTime(Date newsTime) {
		this.newsTime = newsTime;
	}

	

}