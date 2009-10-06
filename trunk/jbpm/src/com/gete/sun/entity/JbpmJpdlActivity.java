package com.gete.sun.entity;

/**
 * JbpmJpdlActivity entity. @author MyEclipse Persistence Tools
 */

public class JbpmJpdlActivity implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmOperation jbpmOperation;
	private JbpmDescriptor jbpmDescriptorByPartsdescr;
	private JbpmDescriptor jbpmDescriptorByJavadescr;
	private JbpmDescriptor jbpmDescriptorByParamdescr;
	private JbpmDescriptor jbpmDescriptorByExcldescr;
	private String class_;
	private String text;
	private String text2;
	private Boolean endpi;
	private Boolean isuniq;
	private String text3;

	// Constructors

	/** default constructor */
	public JbpmJpdlActivity() {
	}

	/** minimal constructor */
	public JbpmJpdlActivity(String class_) {
		this.class_ = class_;
	}

	/** full constructor */
	public JbpmJpdlActivity(JbpmOperation jbpmOperation,
			JbpmDescriptor jbpmDescriptorByPartsdescr,
			JbpmDescriptor jbpmDescriptorByJavadescr,
			JbpmDescriptor jbpmDescriptorByParamdescr,
			JbpmDescriptor jbpmDescriptorByExcldescr, String class_,
			String text, String text2, Boolean endpi, Boolean isuniq,
			String text3) {
		this.jbpmOperation = jbpmOperation;
		this.jbpmDescriptorByPartsdescr = jbpmDescriptorByPartsdescr;
		this.jbpmDescriptorByJavadescr = jbpmDescriptorByJavadescr;
		this.jbpmDescriptorByParamdescr = jbpmDescriptorByParamdescr;
		this.jbpmDescriptorByExcldescr = jbpmDescriptorByExcldescr;
		this.class_ = class_;
		this.text = text;
		this.text2 = text2;
		this.endpi = endpi;
		this.isuniq = isuniq;
		this.text3 = text3;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmOperation getJbpmOperation() {
		return this.jbpmOperation;
	}

	public void setJbpmOperation(JbpmOperation jbpmOperation) {
		this.jbpmOperation = jbpmOperation;
	}

	public JbpmDescriptor getJbpmDescriptorByPartsdescr() {
		return this.jbpmDescriptorByPartsdescr;
	}

	public void setJbpmDescriptorByPartsdescr(
			JbpmDescriptor jbpmDescriptorByPartsdescr) {
		this.jbpmDescriptorByPartsdescr = jbpmDescriptorByPartsdescr;
	}

	public JbpmDescriptor getJbpmDescriptorByJavadescr() {
		return this.jbpmDescriptorByJavadescr;
	}

	public void setJbpmDescriptorByJavadescr(
			JbpmDescriptor jbpmDescriptorByJavadescr) {
		this.jbpmDescriptorByJavadescr = jbpmDescriptorByJavadescr;
	}

	public JbpmDescriptor getJbpmDescriptorByParamdescr() {
		return this.jbpmDescriptorByParamdescr;
	}

	public void setJbpmDescriptorByParamdescr(
			JbpmDescriptor jbpmDescriptorByParamdescr) {
		this.jbpmDescriptorByParamdescr = jbpmDescriptorByParamdescr;
	}

	public JbpmDescriptor getJbpmDescriptorByExcldescr() {
		return this.jbpmDescriptorByExcldescr;
	}

	public void setJbpmDescriptorByExcldescr(
			JbpmDescriptor jbpmDescriptorByExcldescr) {
		this.jbpmDescriptorByExcldescr = jbpmDescriptorByExcldescr;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText2() {
		return this.text2;
	}

	public void setText2(String text2) {
		this.text2 = text2;
	}

	public Boolean getEndpi() {
		return this.endpi;
	}

	public void setEndpi(Boolean endpi) {
		this.endpi = endpi;
	}

	public Boolean getIsuniq() {
		return this.isuniq;
	}

	public void setIsuniq(Boolean isuniq) {
		this.isuniq = isuniq;
	}

	public String getText3() {
		return this.text3;
	}

	public void setText3(String text3) {
		this.text3 = text3;
	}

}