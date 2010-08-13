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
 * Article entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Article implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short articleLang;
	@Persistent
	private String articleRela;
	@Persistent
	private String articleTitle;
	@Persistent
	private String articleImg;
	@Persistent
	private String articleKeyWord;
	@Persistent
	private String articleContent;
	@Persistent
	private String articleSource;
	@Persistent
	private String articlePublished;
	@Persistent
	private Byte articleAudit;
	@Persistent
	private Byte articleRecommended;
	@Persistent
	private Integer articleClick;
	@Persistent
	private Integer articleSort;
	@Persistent
	private Date articleTime;

	// Constructors

	/** default constructor */
	public Article() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getArticleLang() {
		return articleLang;
	}

	public void setArticleLang(Short articleLang) {
		this.articleLang = articleLang;
	}

	public String getArticleRela() {
		return articleRela;
	}

	public void setArticleRela(String articleRela) {
		this.articleRela = articleRela;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleImg() {
		return articleImg;
	}

	public void setArticleImg(String articleImg) {
		this.articleImg = articleImg;
	}

	public String getArticleKeyWord() {
		return articleKeyWord;
	}

	public void setArticleKeyWord(String articleKeyWord) {
		this.articleKeyWord = articleKeyWord;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getArticleSource() {
		return articleSource;
	}

	public void setArticleSource(String articleSource) {
		this.articleSource = articleSource;
	}

	public String getArticlePublished() {
		return articlePublished;
	}

	public void setArticlePublished(String articlePublished) {
		this.articlePublished = articlePublished;
	}

	public Byte getArticleAudit() {
		return articleAudit;
	}

	public void setArticleAudit(Byte articleAudit) {
		this.articleAudit = articleAudit;
	}

	public Byte getArticleRecommended() {
		return articleRecommended;
	}

	public void setArticleRecommended(Byte articleRecommended) {
		this.articleRecommended = articleRecommended;
	}

	public Integer getArticleClick() {
		return articleClick;
	}

	public void setArticleClick(Integer articleClick) {
		this.articleClick = articleClick;
	}

	public Integer getArticleSort() {
		return articleSort;
	}

	public void setArticleSort(Integer articleSort) {
		this.articleSort = articleSort;
	}

	public Date getArticleTime() {
		return articleTime;
	}

	public void setArticleTime(Date articleTime) {
		this.articleTime = articleTime;
	}



}