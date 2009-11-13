package com.ada.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Blogtype entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "blogtype", catalog = "vigi")
public class Blogtype implements java.io.Serializable {

	// Fields

	private Integer id;
	private Blogtype blogtype;
	private String name;
	private String updatetime;
	private String message;
	private Set<Blogitem> blogitems = new HashSet<Blogitem>(0);
	private Set<Blogtype> blogtypes = new HashSet<Blogtype>(0);

	// Constructors

	/** default constructor */
	public Blogtype() {
	}

	/** full constructor */
	public Blogtype(Blogtype blogtype, String name, String updatetime,
			String message, Set<Blogitem> blogitems, Set<Blogtype> blogtypes) {
		this.blogtype = blogtype;
		this.name = name;
		this.updatetime = updatetime;
		this.message = message;
		this.blogitems = blogitems;
		this.blogtypes = blogtypes;
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
	@JoinColumn(name = "parent")
	public Blogtype getBlogtype() {
		return this.blogtype;
	}

	public void setBlogtype(Blogtype blogtype) {
		this.blogtype = blogtype;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "updatetime", length = 45)
	public String getUpdatetime() {
		return this.updatetime;
	}

	public void setUpdatetime(String updatetime) {
		this.updatetime = updatetime;
	}

	@Column(name = "message", length = 45)
	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blogtype")
	public Set<Blogitem> getBlogitems() {
		return this.blogitems;
	}

	public void setBlogitems(Set<Blogitem> blogitems) {
		this.blogitems = blogitems;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "blogtype")
	public Set<Blogtype> getBlogtypes() {
		return this.blogtypes;
	}

	public void setBlogtypes(Set<Blogtype> blogtypes) {
		this.blogtypes = blogtypes;
	}

}