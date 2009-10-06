package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Filetype entity. @author MyEclipse Persistence Tools
 */

public class Filetype implements java.io.Serializable {

	// Fields

	private String id;
	private Filetype filetype;
	private String typename;
	private String typecontent;
	private String demo1;
	private String demo2;
	private Set filetypes = new HashSet(0);
	private Set filedetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Filetype() {
	}

	/** full constructor */
	public Filetype(Filetype filetype, String typename, String typecontent,
			String demo1, String demo2, Set filetypes, Set filedetails) {
		this.filetype = filetype;
		this.typename = typename;
		this.typecontent = typecontent;
		this.demo1 = demo1;
		this.demo2 = demo2;
		this.filetypes = filetypes;
		this.filedetails = filedetails;
	}

	// Property accessors

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Filetype getFiletype() {
		return this.filetype;
	}

	public void setFiletype(Filetype filetype) {
		this.filetype = filetype;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public String getTypecontent() {
		return this.typecontent;
	}

	public void setTypecontent(String typecontent) {
		this.typecontent = typecontent;
	}

	public String getDemo1() {
		return this.demo1;
	}

	public void setDemo1(String demo1) {
		this.demo1 = demo1;
	}

	public String getDemo2() {
		return this.demo2;
	}

	public void setDemo2(String demo2) {
		this.demo2 = demo2;
	}

	public Set getFiletypes() {
		return this.filetypes;
	}

	public void setFiletypes(Set filetypes) {
		this.filetypes = filetypes;
	}

	public Set getFiledetails() {
		return this.filedetails;
	}

	public void setFiledetails(Set filedetails) {
		this.filedetails = filedetails;
	}

}