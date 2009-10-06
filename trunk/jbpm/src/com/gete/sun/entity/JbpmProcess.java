package com.gete.sun.entity;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * JbpmProcess entity. @author MyEclipse Persistence Tools
 */

public class JbpmProcess implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmActivity jbpmActivity;
	private JbpmWireprops jbpmWireprops;
	private Integer dbversion;
	private String name;
	private String descr;
	private Boolean hasVarDef;
	private Boolean hasTimerDef;
	private String key;
	private String id;
	private String package_;
	private Integer version;
	private Timestamp deployed;
	private Set jbpmEventsForProcess = new HashSet(0);
	private Set jbpmEventsForProcessdef = new HashSet(0);
	private Set jbpmTimerdefs = new HashSet(0);
	private Set jbpmLobs = new HashSet(0);
	private Set jbpmExcepthndlrs = new HashSet(0);
	private Set jbpmActivitiesForActsprocess = new HashSet(0);
	private Set jbpmHistProcinsts = new HashSet(0);
	private Set jbpmActivitiesForProcess = new HashSet(0);
	private Set jbpmVariabledefs = new HashSet(0);
	private Set jbpmTransitions = new HashSet(0);
	private Set jbpmJpdlProcdefs = new HashSet(0);
	private Set jbpmExecutions = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmProcess() {
	}

	/** minimal constructor */
	public JbpmProcess(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmProcess(JbpmActivity jbpmActivity, JbpmWireprops jbpmWireprops,
			Integer dbversion, String name, String descr, Boolean hasVarDef,
			Boolean hasTimerDef, String key, String id, String package_,
			Integer version, Timestamp deployed, Set jbpmEventsForProcess,
			Set jbpmEventsForProcessdef, Set jbpmTimerdefs, Set jbpmLobs,
			Set jbpmExcepthndlrs, Set jbpmActivitiesForActsprocess,
			Set jbpmHistProcinsts, Set jbpmActivitiesForProcess,
			Set jbpmVariabledefs, Set jbpmTransitions, Set jbpmJpdlProcdefs,
			Set jbpmExecutions) {
		this.jbpmActivity = jbpmActivity;
		this.jbpmWireprops = jbpmWireprops;
		this.dbversion = dbversion;
		this.name = name;
		this.descr = descr;
		this.hasVarDef = hasVarDef;
		this.hasTimerDef = hasTimerDef;
		this.key = key;
		this.id = id;
		this.package_ = package_;
		this.version = version;
		this.deployed = deployed;
		this.jbpmEventsForProcess = jbpmEventsForProcess;
		this.jbpmEventsForProcessdef = jbpmEventsForProcessdef;
		this.jbpmTimerdefs = jbpmTimerdefs;
		this.jbpmLobs = jbpmLobs;
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
		this.jbpmActivitiesForActsprocess = jbpmActivitiesForActsprocess;
		this.jbpmHistProcinsts = jbpmHistProcinsts;
		this.jbpmActivitiesForProcess = jbpmActivitiesForProcess;
		this.jbpmVariabledefs = jbpmVariabledefs;
		this.jbpmTransitions = jbpmTransitions;
		this.jbpmJpdlProcdefs = jbpmJpdlProcdefs;
		this.jbpmExecutions = jbpmExecutions;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmActivity getJbpmActivity() {
		return this.jbpmActivity;
	}

	public void setJbpmActivity(JbpmActivity jbpmActivity) {
		this.jbpmActivity = jbpmActivity;
	}

	public JbpmWireprops getJbpmWireprops() {
		return this.jbpmWireprops;
	}

	public void setJbpmWireprops(JbpmWireprops jbpmWireprops) {
		this.jbpmWireprops = jbpmWireprops;
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

	public String getDescr() {
		return this.descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Boolean getHasVarDef() {
		return this.hasVarDef;
	}

	public void setHasVarDef(Boolean hasVarDef) {
		this.hasVarDef = hasVarDef;
	}

	public Boolean getHasTimerDef() {
		return this.hasTimerDef;
	}

	public void setHasTimerDef(Boolean hasTimerDef) {
		this.hasTimerDef = hasTimerDef;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPackage_() {
		return this.package_;
	}

	public void setPackage_(String package_) {
		this.package_ = package_;
	}

	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Timestamp getDeployed() {
		return this.deployed;
	}

	public void setDeployed(Timestamp deployed) {
		this.deployed = deployed;
	}

	public Set getJbpmEventsForProcess() {
		return this.jbpmEventsForProcess;
	}

	public void setJbpmEventsForProcess(Set jbpmEventsForProcess) {
		this.jbpmEventsForProcess = jbpmEventsForProcess;
	}

	public Set getJbpmEventsForProcessdef() {
		return this.jbpmEventsForProcessdef;
	}

	public void setJbpmEventsForProcessdef(Set jbpmEventsForProcessdef) {
		this.jbpmEventsForProcessdef = jbpmEventsForProcessdef;
	}

	public Set getJbpmTimerdefs() {
		return this.jbpmTimerdefs;
	}

	public void setJbpmTimerdefs(Set jbpmTimerdefs) {
		this.jbpmTimerdefs = jbpmTimerdefs;
	}

	public Set getJbpmLobs() {
		return this.jbpmLobs;
	}

	public void setJbpmLobs(Set jbpmLobs) {
		this.jbpmLobs = jbpmLobs;
	}

	public Set getJbpmExcepthndlrs() {
		return this.jbpmExcepthndlrs;
	}

	public void setJbpmExcepthndlrs(Set jbpmExcepthndlrs) {
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
	}

	public Set getJbpmActivitiesForActsprocess() {
		return this.jbpmActivitiesForActsprocess;
	}

	public void setJbpmActivitiesForActsprocess(Set jbpmActivitiesForActsprocess) {
		this.jbpmActivitiesForActsprocess = jbpmActivitiesForActsprocess;
	}

	public Set getJbpmHistProcinsts() {
		return this.jbpmHistProcinsts;
	}

	public void setJbpmHistProcinsts(Set jbpmHistProcinsts) {
		this.jbpmHistProcinsts = jbpmHistProcinsts;
	}

	public Set getJbpmActivitiesForProcess() {
		return this.jbpmActivitiesForProcess;
	}

	public void setJbpmActivitiesForProcess(Set jbpmActivitiesForProcess) {
		this.jbpmActivitiesForProcess = jbpmActivitiesForProcess;
	}

	public Set getJbpmVariabledefs() {
		return this.jbpmVariabledefs;
	}

	public void setJbpmVariabledefs(Set jbpmVariabledefs) {
		this.jbpmVariabledefs = jbpmVariabledefs;
	}

	public Set getJbpmTransitions() {
		return this.jbpmTransitions;
	}

	public void setJbpmTransitions(Set jbpmTransitions) {
		this.jbpmTransitions = jbpmTransitions;
	}

	public Set getJbpmJpdlProcdefs() {
		return this.jbpmJpdlProcdefs;
	}

	public void setJbpmJpdlProcdefs(Set jbpmJpdlProcdefs) {
		this.jbpmJpdlProcdefs = jbpmJpdlProcdefs;
	}

	public Set getJbpmExecutions() {
		return this.jbpmExecutions;
	}

	public void setJbpmExecutions(Set jbpmExecutions) {
		this.jbpmExecutions = jbpmExecutions;
	}

}