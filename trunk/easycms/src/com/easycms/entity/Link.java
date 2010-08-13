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
 * Link entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Link implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short lnikLang;
	@Persistent
	private Short linkType;
	@Persistent
	private String linkWebName;
	@Persistent
	private String linkWebUrl;
	@Persistent
	private String linkWebIntro;
	@Persistent
	private String linkLogoUrl;
	@Persistent
	private String linkWebAdmin;
	@Persistent
	private String linkEmail;
	@Persistent
	private Integer linkSort;
	@Persistent
	private Byte linkIsAudit;
	@Persistent
	private Date linkTime;

	// Constructors

	/** default constructor */
	public Link() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getLnikLang() {
		return lnikLang;
	}

	public void setLnikLang(Short lnikLang) {
		this.lnikLang = lnikLang;
	}

	public Short getLinkType() {
		return linkType;
	}

	public void setLinkType(Short linkType) {
		this.linkType = linkType;
	}

	public String getLinkWebName() {
		return linkWebName;
	}

	public void setLinkWebName(String linkWebName) {
		this.linkWebName = linkWebName;
	}

	public String getLinkWebUrl() {
		return linkWebUrl;
	}

	public void setLinkWebUrl(String linkWebUrl) {
		this.linkWebUrl = linkWebUrl;
	}

	public String getLinkWebIntro() {
		return linkWebIntro;
	}

	public void setLinkWebIntro(String linkWebIntro) {
		this.linkWebIntro = linkWebIntro;
	}

	public String getLinkLogoUrl() {
		return linkLogoUrl;
	}

	public void setLinkLogoUrl(String linkLogoUrl) {
		this.linkLogoUrl = linkLogoUrl;
	}

	public String getLinkWebAdmin() {
		return linkWebAdmin;
	}

	public void setLinkWebAdmin(String linkWebAdmin) {
		this.linkWebAdmin = linkWebAdmin;
	}

	public String getLinkEmail() {
		return linkEmail;
	}

	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}

	public Integer getLinkSort() {
		return linkSort;
	}

	public void setLinkSort(Integer linkSort) {
		this.linkSort = linkSort;
	}

	public Byte getLinkIsAudit() {
		return linkIsAudit;
	}

	public void setLinkIsAudit(Byte linkIsAudit) {
		this.linkIsAudit = linkIsAudit;
	}

	public Date getLinkTime() {
		return linkTime;
	}

	public void setLinkTime(Date linkTime) {
		this.linkTime = linkTime;
	}

	

}