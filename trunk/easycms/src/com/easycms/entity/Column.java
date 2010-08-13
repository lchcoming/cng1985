package com.easycms.entity;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Column entity.
 * 
 * @author MyEclipse Persistence Tools
 */

@PersistenceCapable(identityType = IdentityType.APPLICATION, cacheable = "true")
public class Column implements java.io.Serializable {

	// Fields
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Integer id;
	@Persistent
	private Short columnType;
	@Persistent
	private Short columnLang;
	@Persistent
	private String columnRela;
	@Persistent
	private String columnName;
	@Persistent
	private Integer columnLevel;
	@Persistent
	private String columnTemPage;
	@Persistent
	private String columnTemDetail;
	@Persistent
	private Short columnSort;
	@Persistent
	private Date columnTime;

	// Constructors

	/** default constructor */
	public Column() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Short getColumnType() {
		return columnType;
	}

	public void setColumnType(Short columnType) {
		this.columnType = columnType;
	}

	public Short getColumnLang() {
		return columnLang;
	}

	public void setColumnLang(Short columnLang) {
		this.columnLang = columnLang;
	}

	public String getColumnRela() {
		return columnRela;
	}

	public void setColumnRela(String columnRela) {
		this.columnRela = columnRela;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Integer getColumnLevel() {
		return columnLevel;
	}

	public void setColumnLevel(Integer columnLevel) {
		this.columnLevel = columnLevel;
	}

	public String getColumnTemPage() {
		return columnTemPage;
	}

	public void setColumnTemPage(String columnTemPage) {
		this.columnTemPage = columnTemPage;
	}

	public String getColumnTemDetail() {
		return columnTemDetail;
	}

	public void setColumnTemDetail(String columnTemDetail) {
		this.columnTemDetail = columnTemDetail;
	}

	public Short getColumnSort() {
		return columnSort;
	}

	public void setColumnSort(Short columnSort) {
		this.columnSort = columnSort;
	}

	public Date getColumnTime() {
		return columnTime;
	}

	public void setColumnTime(Date columnTime) {
		this.columnTime = columnTime;
	}

	
}