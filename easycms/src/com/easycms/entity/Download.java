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
 * Download entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Download implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short downloadLang;
	@Persistent
	private String downloadRela;
	@Persistent
	private Byte downloadType;
	@Persistent
	private String downloadTitle;
	@Persistent
	private String downloadUrl;
	@Persistent
	private Integer downloadViews;
	@Persistent
	private Date downloadAddDate;

	// Constructors

	/** default constructor */
	public Download() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getDownloadLang() {
		return downloadLang;
	}

	public void setDownloadLang(Short downloadLang) {
		this.downloadLang = downloadLang;
	}

	public String getDownloadRela() {
		return downloadRela;
	}

	public void setDownloadRela(String downloadRela) {
		this.downloadRela = downloadRela;
	}

	public Byte getDownloadType() {
		return downloadType;
	}

	public void setDownloadType(Byte downloadType) {
		this.downloadType = downloadType;
	}

	public String getDownloadTitle() {
		return downloadTitle;
	}

	public void setDownloadTitle(String downloadTitle) {
		this.downloadTitle = downloadTitle;
	}

	public String getDownloadUrl() {
		return downloadUrl;
	}

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}

	public Integer getDownloadViews() {
		return downloadViews;
	}

	public void setDownloadViews(Integer downloadViews) {
		this.downloadViews = downloadViews;
	}

	public Date getDownloadAddDate() {
		return downloadAddDate;
	}

	public void setDownloadAddDate(Date downloadAddDate) {
		this.downloadAddDate = downloadAddDate;
	}



}