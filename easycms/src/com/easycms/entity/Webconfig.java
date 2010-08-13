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
 * Webconfig entity.
 * 
 * @author MyEclipse Persistence Tools
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Webconfig implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Short webLang;
	@Persistent
	private String webTitle;
	@Persistent
	private String webLogo;
	@Persistent
	private String webDescription;
	@Persistent
	private String webkeyword;
	public Short getWebLang() {
		return webLang;
	}

	public void setWebLang(Short webLang) {
		this.webLang = webLang;
	}

	public String getWebTitle() {
		return webTitle;
	}

	public void setWebTitle(String webTitle) {
		this.webTitle = webTitle;
	}

	public String getWebLogo() {
		return webLogo;
	}

	public void setWebLogo(String webLogo) {
		this.webLogo = webLogo;
	}

	public String getWebDescription() {
		return webDescription;
	}

	public void setWebDescription(String webDescription) {
		this.webDescription = webDescription;
	}

	public String getWebkeyword() {
		return webkeyword;
	}

	public void setWebkeyword(String webkeyword) {
		this.webkeyword = webkeyword;
	}

	public String getWebCopyright() {
		return webCopyright;
	}

	public void setWebCopyright(String webCopyright) {
		this.webCopyright = webCopyright;
	}

	public String getWebEmail() {
		return webEmail;
	}

	public void setWebEmail(String webEmail) {
		this.webEmail = webEmail;
	}

	public String getWebQq() {
		return webQq;
	}

	public void setWebQq(String webQq) {
		this.webQq = webQq;
	}

	public String getWebMsn() {
		return webMsn;
	}

	public void setWebMsn(String webMsn) {
		this.webMsn = webMsn;
	}

	public String getWebTel1() {
		return webTel1;
	}

	public void setWebTel1(String webTel1) {
		this.webTel1 = webTel1;
	}

	public String getWebTel2() {
		return webTel2;
	}

	public void setWebTel2(String webTel2) {
		this.webTel2 = webTel2;
	}

	public String getWebFax() {
		return webFax;
	}

	public void setWebFax(String webFax) {
		this.webFax = webFax;
	}

	public String getWebAddress() {
		return webAddress;
	}

	public void setWebAddress(String webAddress) {
		this.webAddress = webAddress;
	}

	public String getWebIp() {
		return webIp;
	}

	public void setWebIp(String webIp) {
		this.webIp = webIp;
	}

	public Date getWebDate() {
		return webDate;
	}

	public void setWebDate(Date webDate) {
		this.webDate = webDate;
	}

	public String getWebAdminName() {
		return webAdminName;
	}

	public void setWebAdminName(String webAdminName) {
		this.webAdminName = webAdminName;
	}

	@Persistent
	private String webCopyright;
	@Persistent
	private String webEmail;
	@Persistent
	private String webQq;
	@Persistent
	private String webMsn;
	@Persistent
	private String webTel1;
	@Persistent
	private String webTel2;
	@Persistent
	private String webFax;
	@Persistent
	private String webAddress;
	@Persistent
	private String webIp;
	@Persistent
	private Date webDate;
	@Persistent
	private String webAdminName;

	// Constructors

	/** default constructor */
	public Webconfig() {
	}


}