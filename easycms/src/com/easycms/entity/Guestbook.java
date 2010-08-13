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
 * Guestbook entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Guestbook implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short guestBookLang;
	@Persistent
	private String guestBookName;
	@Persistent
	private Integer guestBookImg;
	@Persistent
	private String guestBookMail;
	@Persistent
	private String guestBookTel;
	@Persistent
	private String guestBookFax;
	@Persistent
	private String guestBookCompany;
	@Persistent
	private String guestBookAddress;
	@Persistent
	private String guestBookQq;
	@Persistent
	private Byte guestBookSex;
	@Persistent
	private String guestBookTitle;
	@Persistent
	private String guestBookContent;
	@Persistent
	private Integer guestBookUser;
	@Persistent
	private String guestBookIp;
	@Persistent
	private Date guestBookTime;
	@Persistent
	private Byte guestBookShow;
	@Persistent
	private String guestBookResumes;
	@Persistent
	private String guestBookResumesName;
	@Persistent
	private Date guestBookResumesTime;

	// Constructors

	/** default constructor */
	public Guestbook() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getGuestBookLang() {
		return guestBookLang;
	}

	public void setGuestBookLang(Short guestBookLang) {
		this.guestBookLang = guestBookLang;
	}

	public String getGuestBookName() {
		return guestBookName;
	}

	public void setGuestBookName(String guestBookName) {
		this.guestBookName = guestBookName;
	}

	public Integer getGuestBookImg() {
		return guestBookImg;
	}

	public void setGuestBookImg(Integer guestBookImg) {
		this.guestBookImg = guestBookImg;
	}

	public String getGuestBookMail() {
		return guestBookMail;
	}

	public void setGuestBookMail(String guestBookMail) {
		this.guestBookMail = guestBookMail;
	}

	public String getGuestBookTel() {
		return guestBookTel;
	}

	public void setGuestBookTel(String guestBookTel) {
		this.guestBookTel = guestBookTel;
	}

	public String getGuestBookFax() {
		return guestBookFax;
	}

	public void setGuestBookFax(String guestBookFax) {
		this.guestBookFax = guestBookFax;
	}

	public String getGuestBookCompany() {
		return guestBookCompany;
	}

	public void setGuestBookCompany(String guestBookCompany) {
		this.guestBookCompany = guestBookCompany;
	}

	public String getGuestBookAddress() {
		return guestBookAddress;
	}

	public void setGuestBookAddress(String guestBookAddress) {
		this.guestBookAddress = guestBookAddress;
	}

	public String getGuestBookQq() {
		return guestBookQq;
	}

	public void setGuestBookQq(String guestBookQq) {
		this.guestBookQq = guestBookQq;
	}

	public Byte getGuestBookSex() {
		return guestBookSex;
	}

	public void setGuestBookSex(Byte guestBookSex) {
		this.guestBookSex = guestBookSex;
	}

	public String getGuestBookTitle() {
		return guestBookTitle;
	}

	public void setGuestBookTitle(String guestBookTitle) {
		this.guestBookTitle = guestBookTitle;
	}

	public String getGuestBookContent() {
		return guestBookContent;
	}

	public void setGuestBookContent(String guestBookContent) {
		this.guestBookContent = guestBookContent;
	}

	public Integer getGuestBookUser() {
		return guestBookUser;
	}

	public void setGuestBookUser(Integer guestBookUser) {
		this.guestBookUser = guestBookUser;
	}

	public String getGuestBookIp() {
		return guestBookIp;
	}

	public void setGuestBookIp(String guestBookIp) {
		this.guestBookIp = guestBookIp;
	}

	public Date getGuestBookTime() {
		return guestBookTime;
	}

	public void setGuestBookTime(Date guestBookTime) {
		this.guestBookTime = guestBookTime;
	}

	public Byte getGuestBookShow() {
		return guestBookShow;
	}

	public void setGuestBookShow(Byte guestBookShow) {
		this.guestBookShow = guestBookShow;
	}

	public String getGuestBookResumes() {
		return guestBookResumes;
	}

	public void setGuestBookResumes(String guestBookResumes) {
		this.guestBookResumes = guestBookResumes;
	}

	public String getGuestBookResumesName() {
		return guestBookResumesName;
	}

	public void setGuestBookResumesName(String guestBookResumesName) {
		this.guestBookResumesName = guestBookResumesName;
	}

	public Date getGuestBookResumesTime() {
		return guestBookResumesTime;
	}

	public void setGuestBookResumesTime(Date guestBookResumesTime) {
		this.guestBookResumesTime = guestBookResumesTime;
	}

}