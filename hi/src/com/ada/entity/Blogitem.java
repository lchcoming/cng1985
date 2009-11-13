package com.ada.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Blogitem entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "blogitem", catalog = "vigi")
public class Blogitem implements java.io.Serializable {

	// Fields

	private Integer id;
	private Blogtype blogtype;
	private String title;
	private String body;
	private Timestamp putime;
	private Integer visit;

	// Constructors

	/** default constructor */
	public Blogitem() {
	}

	/** full constructor */
	public Blogitem(Blogtype blogtype, String title, String body,
			Timestamp putime, Integer visit) {
		this.blogtype = blogtype;
		this.title = title;
		this.body = body;
		this.putime = putime;
		this.visit = visit;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "blogtype")
	public Blogtype getBlogtype() {
		return this.blogtype;
	}

	public void setBlogtype(Blogtype blogtype) {
		this.blogtype = blogtype;
	}

	@Column(name = "title", length = 45)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "body", length = 2000)
	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Column(name = "putime", length = 0)
	public Timestamp getPutime() {
		return this.putime;
	}

	public void setPutime(Timestamp putime) {
		this.putime = putime;
	}

	@Column(name = "visit")
	public Integer getVisit() {
		return this.visit;
	}

	public void setVisit(Integer visit) {
		this.visit = visit;
	}

}