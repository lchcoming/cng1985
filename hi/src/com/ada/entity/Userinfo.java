package com.ada.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Userinfo entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "userinfo", catalog = "vigi")
public class Userinfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private String username;
	private String userpassword;
	private String realname;

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** full constructor */
	public Userinfo(String username, String userpassword, String realname) {
		this.username = username;
		this.userpassword = userpassword;
		this.realname = realname;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "userpassword", length = 45)
	public String getUserpassword() {
		return this.userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	@Column(name = "realname", length = 45)
	public String getRealname() {
		return this.realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

}