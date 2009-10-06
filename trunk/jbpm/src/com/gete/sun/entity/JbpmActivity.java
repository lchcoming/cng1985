package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmActivity entity. @author MyEclipse Persistence Tools
 */

public class JbpmActivity implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmTransition jbpmTransition;
	private JbpmDescriptor jbpmDescriptor;
	private JbpmProcess jbpmProcessByProcess;
	private JbpmProcess jbpmProcessByActsprocess;
	private JbpmWireprops jbpmWireprops;
	private JbpmActivity jbpmActivity;
	private Integer dbversion;
	private String name;
	private String descr;
	private Boolean hasVarDef;
	private Boolean hasTimerDef;
	private Boolean localScope;
	private Boolean execAsync;
	private Boolean signalAsync;
	private Boolean prevNeeded;
	private String behavClass;
	private Long behavId;
	private Integer actsprocessIdx;
	private Integer parentIdx;
	private Set jbpmTransitionsForDest = new HashSet(0);
	private Set jbpmTransitionsForSource = new HashSet(0);
	private Set jbpmProcesses = new HashSet(0);
	private Set jbpmVariabledefs = new HashSet(0);
	private Set jbpmActivities = new HashSet(0);
	private Set jbpmTimerdefs = new HashSet(0);
	private Set jbpmHistActinsts = new HashSet(0);
	private Set jbpmExecutionsForAct = new HashSet(0);
	private Set jbpmExecutionsForTransorig = new HashSet(0);
	private Set jbpmTransitionsForDestination = new HashSet(0);
	private Set jbpmEvents = new HashSet(0);
	private Set jbpmJobs = new HashSet(0);
	private Set jbpmExcepthndlrs = new HashSet(0);
	private Set jbpmTransitionsForSrc = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmActivity() {
	}

	/** minimal constructor */
	public JbpmActivity(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmActivity(JbpmTransition jbpmTransition,
			JbpmDescriptor jbpmDescriptor, JbpmProcess jbpmProcessByProcess,
			JbpmProcess jbpmProcessByActsprocess, JbpmWireprops jbpmWireprops,
			JbpmActivity jbpmActivity, Integer dbversion, String name,
			String descr, Boolean hasVarDef, Boolean hasTimerDef,
			Boolean localScope, Boolean execAsync, Boolean signalAsync,
			Boolean prevNeeded, String behavClass, Long behavId,
			Integer actsprocessIdx, Integer parentIdx,
			Set jbpmTransitionsForDest, Set jbpmTransitionsForSource,
			Set jbpmProcesses, Set jbpmVariabledefs, Set jbpmActivities,
			Set jbpmTimerdefs, Set jbpmHistActinsts, Set jbpmExecutionsForAct,
			Set jbpmExecutionsForTransorig, Set jbpmTransitionsForDestination,
			Set jbpmEvents, Set jbpmJobs, Set jbpmExcepthndlrs,
			Set jbpmTransitionsForSrc) {
		this.jbpmTransition = jbpmTransition;
		this.jbpmDescriptor = jbpmDescriptor;
		this.jbpmProcessByProcess = jbpmProcessByProcess;
		this.jbpmProcessByActsprocess = jbpmProcessByActsprocess;
		this.jbpmWireprops = jbpmWireprops;
		this.jbpmActivity = jbpmActivity;
		this.dbversion = dbversion;
		this.name = name;
		this.descr = descr;
		this.hasVarDef = hasVarDef;
		this.hasTimerDef = hasTimerDef;
		this.localScope = localScope;
		this.execAsync = execAsync;
		this.signalAsync = signalAsync;
		this.prevNeeded = prevNeeded;
		this.behavClass = behavClass;
		this.behavId = behavId;
		this.actsprocessIdx = actsprocessIdx;
		this.parentIdx = parentIdx;
		this.jbpmTransitionsForDest = jbpmTransitionsForDest;
		this.jbpmTransitionsForSource = jbpmTransitionsForSource;
		this.jbpmProcesses = jbpmProcesses;
		this.jbpmVariabledefs = jbpmVariabledefs;
		this.jbpmActivities = jbpmActivities;
		this.jbpmTimerdefs = jbpmTimerdefs;
		this.jbpmHistActinsts = jbpmHistActinsts;
		this.jbpmExecutionsForAct = jbpmExecutionsForAct;
		this.jbpmExecutionsForTransorig = jbpmExecutionsForTransorig;
		this.jbpmTransitionsForDestination = jbpmTransitionsForDestination;
		this.jbpmEvents = jbpmEvents;
		this.jbpmJobs = jbpmJobs;
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
		this.jbpmTransitionsForSrc = jbpmTransitionsForSrc;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmTransition getJbpmTransition() {
		return this.jbpmTransition;
	}

	public void setJbpmTransition(JbpmTransition jbpmTransition) {
		this.jbpmTransition = jbpmTransition;
	}

	public JbpmDescriptor getJbpmDescriptor() {
		return this.jbpmDescriptor;
	}

	public void setJbpmDescriptor(JbpmDescriptor jbpmDescriptor) {
		this.jbpmDescriptor = jbpmDescriptor;
	}

	public JbpmProcess getJbpmProcessByProcess() {
		return this.jbpmProcessByProcess;
	}

	public void setJbpmProcessByProcess(JbpmProcess jbpmProcessByProcess) {
		this.jbpmProcessByProcess = jbpmProcessByProcess;
	}

	public JbpmProcess getJbpmProcessByActsprocess() {
		return this.jbpmProcessByActsprocess;
	}

	public void setJbpmProcessByActsprocess(JbpmProcess jbpmProcessByActsprocess) {
		this.jbpmProcessByActsprocess = jbpmProcessByActsprocess;
	}

	public JbpmWireprops getJbpmWireprops() {
		return this.jbpmWireprops;
	}

	public void setJbpmWireprops(JbpmWireprops jbpmWireprops) {
		this.jbpmWireprops = jbpmWireprops;
	}

	public JbpmActivity getJbpmActivity() {
		return this.jbpmActivity;
	}

	public void setJbpmActivity(JbpmActivity jbpmActivity) {
		this.jbpmActivity = jbpmActivity;
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

	public Boolean getLocalScope() {
		return this.localScope;
	}

	public void setLocalScope(Boolean localScope) {
		this.localScope = localScope;
	}

	public Boolean getExecAsync() {
		return this.execAsync;
	}

	public void setExecAsync(Boolean execAsync) {
		this.execAsync = execAsync;
	}

	public Boolean getSignalAsync() {
		return this.signalAsync;
	}

	public void setSignalAsync(Boolean signalAsync) {
		this.signalAsync = signalAsync;
	}

	public Boolean getPrevNeeded() {
		return this.prevNeeded;
	}

	public void setPrevNeeded(Boolean prevNeeded) {
		this.prevNeeded = prevNeeded;
	}

	public String getBehavClass() {
		return this.behavClass;
	}

	public void setBehavClass(String behavClass) {
		this.behavClass = behavClass;
	}

	public Long getBehavId() {
		return this.behavId;
	}

	public void setBehavId(Long behavId) {
		this.behavId = behavId;
	}

	public Integer getActsprocessIdx() {
		return this.actsprocessIdx;
	}

	public void setActsprocessIdx(Integer actsprocessIdx) {
		this.actsprocessIdx = actsprocessIdx;
	}

	public Integer getParentIdx() {
		return this.parentIdx;
	}

	public void setParentIdx(Integer parentIdx) {
		this.parentIdx = parentIdx;
	}

	public Set getJbpmTransitionsForDest() {
		return this.jbpmTransitionsForDest;
	}

	public void setJbpmTransitionsForDest(Set jbpmTransitionsForDest) {
		this.jbpmTransitionsForDest = jbpmTransitionsForDest;
	}

	public Set getJbpmTransitionsForSource() {
		return this.jbpmTransitionsForSource;
	}

	public void setJbpmTransitionsForSource(Set jbpmTransitionsForSource) {
		this.jbpmTransitionsForSource = jbpmTransitionsForSource;
	}

	public Set getJbpmProcesses() {
		return this.jbpmProcesses;
	}

	public void setJbpmProcesses(Set jbpmProcesses) {
		this.jbpmProcesses = jbpmProcesses;
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

	public Set getJbpmTimerdefs() {
		return this.jbpmTimerdefs;
	}

	public void setJbpmTimerdefs(Set jbpmTimerdefs) {
		this.jbpmTimerdefs = jbpmTimerdefs;
	}

	public Set getJbpmHistActinsts() {
		return this.jbpmHistActinsts;
	}

	public void setJbpmHistActinsts(Set jbpmHistActinsts) {
		this.jbpmHistActinsts = jbpmHistActinsts;
	}

	public Set getJbpmExecutionsForAct() {
		return this.jbpmExecutionsForAct;
	}

	public void setJbpmExecutionsForAct(Set jbpmExecutionsForAct) {
		this.jbpmExecutionsForAct = jbpmExecutionsForAct;
	}

	public Set getJbpmExecutionsForTransorig() {
		return this.jbpmExecutionsForTransorig;
	}

	public void setJbpmExecutionsForTransorig(Set jbpmExecutionsForTransorig) {
		this.jbpmExecutionsForTransorig = jbpmExecutionsForTransorig;
	}

	public Set getJbpmTransitionsForDestination() {
		return this.jbpmTransitionsForDestination;
	}

	public void setJbpmTransitionsForDestination(
			Set jbpmTransitionsForDestination) {
		this.jbpmTransitionsForDestination = jbpmTransitionsForDestination;
	}

	public Set getJbpmEvents() {
		return this.jbpmEvents;
	}

	public void setJbpmEvents(Set jbpmEvents) {
		this.jbpmEvents = jbpmEvents;
	}

	public Set getJbpmJobs() {
		return this.jbpmJobs;
	}

	public void setJbpmJobs(Set jbpmJobs) {
		this.jbpmJobs = jbpmJobs;
	}

	public Set getJbpmExcepthndlrs() {
		return this.jbpmExcepthndlrs;
	}

	public void setJbpmExcepthndlrs(Set jbpmExcepthndlrs) {
		this.jbpmExcepthndlrs = jbpmExcepthndlrs;
	}

	public Set getJbpmTransitionsForSrc() {
		return this.jbpmTransitionsForSrc;
	}

	public void setJbpmTransitionsForSrc(Set jbpmTransitionsForSrc) {
		this.jbpmTransitionsForSrc = jbpmTransitionsForSrc;
	}

}