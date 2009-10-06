package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmDescriptor entity. @author MyEclipse Persistence Tools
 */

public class JbpmDescriptor implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmDescriptor jbpmDescriptorByKeydescr;
	private JbpmWireprops jbpmWireprops;
	private JbpmDescriptor jbpmDescriptorByValuedescr;
	private JbpmDescriptor jbpmDescriptorByFactorydescr;
	private String class_;
	private Integer dbversion;
	private String name;
	private String init;
	private String text;
	private Double doubleval;
	private Long longval;
	private String classname;
	private String method;
	private Boolean boolval;
	private String factoryname;
	private Integer valuedescrIdx;
	private Integer keydescrIdx;
	private Set jbpmOperationsForDescr = new HashSet(0);
	private Set jbpmJpdlActivitiesForJavadescr = new HashSet(0);
	private Set taskdefinitionimpls = new HashSet(0);
	private Set jbpmObjectrefs = new HashSet(0);
	private Set jbpmTransitions = new HashSet(0);
	private Set jbpmJpdlActivitiesForPartsdescr = new HashSet(0);
	private Set jbpmJobs = new HashSet(0);
	private Set jbpmVariabledefs = new HashSet(0);
	private Set jbpmActivities = new HashSet(0);
	private Set jbpmArgdescriptorsForObjargDescr = new HashSet(0);
	private Set jbpmDescriptorsForFactorydescr = new HashSet(0);
	private Set jbpmDescriptorsForKeydescr = new HashSet(0);
	private Set jbpmJpdlActivitiesForExcldescr = new HashSet(0);
	private Set jbpmDescriptorsForValuedescr = new HashSet(0);
	private Set jbpmJpdlActivitiesForParamdescr = new HashSet(0);
	private Set jbpmArgdescriptorsForDescriptor = new HashSet(0);
	private Set jbpmOperationsForObjoperDescr = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmDescriptor() {
	}

	/** minimal constructor */
	public JbpmDescriptor(String class_, Integer dbversion) {
		this.class_ = class_;
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmDescriptor(JbpmDescriptor jbpmDescriptorByKeydescr,
			JbpmWireprops jbpmWireprops,
			JbpmDescriptor jbpmDescriptorByValuedescr,
			JbpmDescriptor jbpmDescriptorByFactorydescr, String class_,
			Integer dbversion, String name, String init, String text,
			Double doubleval, Long longval, String classname, String method,
			Boolean boolval, String factoryname, Integer valuedescrIdx,
			Integer keydescrIdx, Set jbpmOperationsForDescr,
			Set jbpmJpdlActivitiesForJavadescr, Set taskdefinitionimpls,
			Set jbpmObjectrefs, Set jbpmTransitions,
			Set jbpmJpdlActivitiesForPartsdescr, Set jbpmJobs,
			Set jbpmVariabledefs, Set jbpmActivities,
			Set jbpmArgdescriptorsForObjargDescr,
			Set jbpmDescriptorsForFactorydescr, Set jbpmDescriptorsForKeydescr,
			Set jbpmJpdlActivitiesForExcldescr,
			Set jbpmDescriptorsForValuedescr,
			Set jbpmJpdlActivitiesForParamdescr,
			Set jbpmArgdescriptorsForDescriptor,
			Set jbpmOperationsForObjoperDescr) {
		this.jbpmDescriptorByKeydescr = jbpmDescriptorByKeydescr;
		this.jbpmWireprops = jbpmWireprops;
		this.jbpmDescriptorByValuedescr = jbpmDescriptorByValuedescr;
		this.jbpmDescriptorByFactorydescr = jbpmDescriptorByFactorydescr;
		this.class_ = class_;
		this.dbversion = dbversion;
		this.name = name;
		this.init = init;
		this.text = text;
		this.doubleval = doubleval;
		this.longval = longval;
		this.classname = classname;
		this.method = method;
		this.boolval = boolval;
		this.factoryname = factoryname;
		this.valuedescrIdx = valuedescrIdx;
		this.keydescrIdx = keydescrIdx;
		this.jbpmOperationsForDescr = jbpmOperationsForDescr;
		this.jbpmJpdlActivitiesForJavadescr = jbpmJpdlActivitiesForJavadescr;
		this.taskdefinitionimpls = taskdefinitionimpls;
		this.jbpmObjectrefs = jbpmObjectrefs;
		this.jbpmTransitions = jbpmTransitions;
		this.jbpmJpdlActivitiesForPartsdescr = jbpmJpdlActivitiesForPartsdescr;
		this.jbpmJobs = jbpmJobs;
		this.jbpmVariabledefs = jbpmVariabledefs;
		this.jbpmActivities = jbpmActivities;
		this.jbpmArgdescriptorsForObjargDescr = jbpmArgdescriptorsForObjargDescr;
		this.jbpmDescriptorsForFactorydescr = jbpmDescriptorsForFactorydescr;
		this.jbpmDescriptorsForKeydescr = jbpmDescriptorsForKeydescr;
		this.jbpmJpdlActivitiesForExcldescr = jbpmJpdlActivitiesForExcldescr;
		this.jbpmDescriptorsForValuedescr = jbpmDescriptorsForValuedescr;
		this.jbpmJpdlActivitiesForParamdescr = jbpmJpdlActivitiesForParamdescr;
		this.jbpmArgdescriptorsForDescriptor = jbpmArgdescriptorsForDescriptor;
		this.jbpmOperationsForObjoperDescr = jbpmOperationsForObjoperDescr;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmDescriptor getJbpmDescriptorByKeydescr() {
		return this.jbpmDescriptorByKeydescr;
	}

	public void setJbpmDescriptorByKeydescr(
			JbpmDescriptor jbpmDescriptorByKeydescr) {
		this.jbpmDescriptorByKeydescr = jbpmDescriptorByKeydescr;
	}

	public JbpmWireprops getJbpmWireprops() {
		return this.jbpmWireprops;
	}

	public void setJbpmWireprops(JbpmWireprops jbpmWireprops) {
		this.jbpmWireprops = jbpmWireprops;
	}

	public JbpmDescriptor getJbpmDescriptorByValuedescr() {
		return this.jbpmDescriptorByValuedescr;
	}

	public void setJbpmDescriptorByValuedescr(
			JbpmDescriptor jbpmDescriptorByValuedescr) {
		this.jbpmDescriptorByValuedescr = jbpmDescriptorByValuedescr;
	}

	public JbpmDescriptor getJbpmDescriptorByFactorydescr() {
		return this.jbpmDescriptorByFactorydescr;
	}

	public void setJbpmDescriptorByFactorydescr(
			JbpmDescriptor jbpmDescriptorByFactorydescr) {
		this.jbpmDescriptorByFactorydescr = jbpmDescriptorByFactorydescr;
	}

	public String getClass_() {
		return this.class_;
	}

	public void setClass_(String class_) {
		this.class_ = class_;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInit() {
		return this.init;
	}

	public void setInit(String init) {
		this.init = init;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Double getDoubleval() {
		return this.doubleval;
	}

	public void setDoubleval(Double doubleval) {
		this.doubleval = doubleval;
	}

	public Long getLongval() {
		return this.longval;
	}

	public void setLongval(Long longval) {
		this.longval = longval;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public Boolean getBoolval() {
		return this.boolval;
	}

	public void setBoolval(Boolean boolval) {
		this.boolval = boolval;
	}

	public String getFactoryname() {
		return this.factoryname;
	}

	public void setFactoryname(String factoryname) {
		this.factoryname = factoryname;
	}

	public Integer getValuedescrIdx() {
		return this.valuedescrIdx;
	}

	public void setValuedescrIdx(Integer valuedescrIdx) {
		this.valuedescrIdx = valuedescrIdx;
	}

	public Integer getKeydescrIdx() {
		return this.keydescrIdx;
	}

	public void setKeydescrIdx(Integer keydescrIdx) {
		this.keydescrIdx = keydescrIdx;
	}

	public Set getJbpmOperationsForDescr() {
		return this.jbpmOperationsForDescr;
	}

	public void setJbpmOperationsForDescr(Set jbpmOperationsForDescr) {
		this.jbpmOperationsForDescr = jbpmOperationsForDescr;
	}

	public Set getJbpmJpdlActivitiesForJavadescr() {
		return this.jbpmJpdlActivitiesForJavadescr;
	}

	public void setJbpmJpdlActivitiesForJavadescr(
			Set jbpmJpdlActivitiesForJavadescr) {
		this.jbpmJpdlActivitiesForJavadescr = jbpmJpdlActivitiesForJavadescr;
	}

	public Set getTaskdefinitionimpls() {
		return this.taskdefinitionimpls;
	}

	public void setTaskdefinitionimpls(Set taskdefinitionimpls) {
		this.taskdefinitionimpls = taskdefinitionimpls;
	}

	public Set getJbpmObjectrefs() {
		return this.jbpmObjectrefs;
	}

	public void setJbpmObjectrefs(Set jbpmObjectrefs) {
		this.jbpmObjectrefs = jbpmObjectrefs;
	}

	public Set getJbpmTransitions() {
		return this.jbpmTransitions;
	}

	public void setJbpmTransitions(Set jbpmTransitions) {
		this.jbpmTransitions = jbpmTransitions;
	}

	public Set getJbpmJpdlActivitiesForPartsdescr() {
		return this.jbpmJpdlActivitiesForPartsdescr;
	}

	public void setJbpmJpdlActivitiesForPartsdescr(
			Set jbpmJpdlActivitiesForPartsdescr) {
		this.jbpmJpdlActivitiesForPartsdescr = jbpmJpdlActivitiesForPartsdescr;
	}

	public Set getJbpmJobs() {
		return this.jbpmJobs;
	}

	public void setJbpmJobs(Set jbpmJobs) {
		this.jbpmJobs = jbpmJobs;
	}

	public Set getJbpmVariabledefs() {
		return this.jbpmVariabledefs;
	}

	public void setJbpmVariabledefs(Set jbpmVariabledefs) {
		this.jbpmVariabledefs = jbpmVariabledefs;
	}

	public Set getJbpmActivities() {
		return this.jbpmActivities;
	}

	public void setJbpmActivities(Set jbpmActivities) {
		this.jbpmActivities = jbpmActivities;
	}

	public Set getJbpmArgdescriptorsForObjargDescr() {
		return this.jbpmArgdescriptorsForObjargDescr;
	}

	public void setJbpmArgdescriptorsForObjargDescr(
			Set jbpmArgdescriptorsForObjargDescr) {
		this.jbpmArgdescriptorsForObjargDescr = jbpmArgdescriptorsForObjargDescr;
	}

	public Set getJbpmDescriptorsForFactorydescr() {
		return this.jbpmDescriptorsForFactorydescr;
	}

	public void setJbpmDescriptorsForFactorydescr(
			Set jbpmDescriptorsForFactorydescr) {
		this.jbpmDescriptorsForFactorydescr = jbpmDescriptorsForFactorydescr;
	}

	public Set getJbpmDescriptorsForKeydescr() {
		return this.jbpmDescriptorsForKeydescr;
	}

	public void setJbpmDescriptorsForKeydescr(Set jbpmDescriptorsForKeydescr) {
		this.jbpmDescriptorsForKeydescr = jbpmDescriptorsForKeydescr;
	}

	public Set getJbpmJpdlActivitiesForExcldescr() {
		return this.jbpmJpdlActivitiesForExcldescr;
	}

	public void setJbpmJpdlActivitiesForExcldescr(
			Set jbpmJpdlActivitiesForExcldescr) {
		this.jbpmJpdlActivitiesForExcldescr = jbpmJpdlActivitiesForExcldescr;
	}

	public Set getJbpmDescriptorsForValuedescr() {
		return this.jbpmDescriptorsForValuedescr;
	}

	public void setJbpmDescriptorsForValuedescr(Set jbpmDescriptorsForValuedescr) {
		this.jbpmDescriptorsForValuedescr = jbpmDescriptorsForValuedescr;
	}

	public Set getJbpmJpdlActivitiesForParamdescr() {
		return this.jbpmJpdlActivitiesForParamdescr;
	}

	public void setJbpmJpdlActivitiesForParamdescr(
			Set jbpmJpdlActivitiesForParamdescr) {
		this.jbpmJpdlActivitiesForParamdescr = jbpmJpdlActivitiesForParamdescr;
	}

	public Set getJbpmArgdescriptorsForDescriptor() {
		return this.jbpmArgdescriptorsForDescriptor;
	}

	public void setJbpmArgdescriptorsForDescriptor(
			Set jbpmArgdescriptorsForDescriptor) {
		this.jbpmArgdescriptorsForDescriptor = jbpmArgdescriptorsForDescriptor;
	}

	public Set getJbpmOperationsForObjoperDescr() {
		return this.jbpmOperationsForObjoperDescr;
	}

	public void setJbpmOperationsForObjoperDescr(
			Set jbpmOperationsForObjoperDescr) {
		this.jbpmOperationsForObjoperDescr = jbpmOperationsForObjoperDescr;
	}

}