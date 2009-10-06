package com.gete.sun.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * JbpmExecution entity. @author MyEclipse Persistence Tools
 */

public class JbpmExecution implements java.io.Serializable {

	// Fields

	private Long dbid;
	private JbpmProcess jbpmProcess;
	private JbpmExecution jbpmExecutionBySuperexec;
	private JbpmExecution jbpmExecutionByParent;
	private JbpmExecution jbpmExecutionByInstance;
	private JbpmActivity jbpmActivityByAct;
	private JbpmActivity jbpmActivityByTransorig;
	private JbpmTransition jbpmTransition;
	private Integer dbversion;
	private Boolean hasvars;
	private Boolean hastimers;
	private String name;
	private String key;
	private String id;
	private String state;
	private Integer priority;
	private Long hisactinst;
	private Integer parentIdx;
	private Set jbpmVariablesForProcinst = new HashSet(0);
	private Set jbpmJpdlExecutions = new HashSet(0);
	private Set jbpmExecutionsForParent = new HashSet(0);
	private Set jbpmVariablesForExecution = new HashSet(0);
	private Set jbpmExecutionsForSuperexec = new HashSet(0);
	private Set jbpmJobsForExecution = new HashSet(0);
	private Set jbpmExecutionsForInstance = new HashSet(0);
	private Set jbpmJobsForProcessinstance = new HashSet(0);

	// Constructors

	/** default constructor */
	public JbpmExecution() {
	}

	/** minimal constructor */
	public JbpmExecution(Integer dbversion) {
		this.dbversion = dbversion;
	}

	/** full constructor */
	public JbpmExecution(JbpmProcess jbpmProcess,
			JbpmExecution jbpmExecutionBySuperexec,
			JbpmExecution jbpmExecutionByParent,
			JbpmExecution jbpmExecutionByInstance,
			JbpmActivity jbpmActivityByAct,
			JbpmActivity jbpmActivityByTransorig,
			JbpmTransition jbpmTransition, Integer dbversion, Boolean hasvars,
			Boolean hastimers, String name, String key, String id,
			String state, Integer priority, Long hisactinst, Integer parentIdx,
			Set jbpmVariablesForProcinst, Set jbpmJpdlExecutions,
			Set jbpmExecutionsForParent, Set jbpmVariablesForExecution,
			Set jbpmExecutionsForSuperexec, Set jbpmJobsForExecution,
			Set jbpmExecutionsForInstance, Set jbpmJobsForProcessinstance) {
		this.jbpmProcess = jbpmProcess;
		this.jbpmExecutionBySuperexec = jbpmExecutionBySuperexec;
		this.jbpmExecutionByParent = jbpmExecutionByParent;
		this.jbpmExecutionByInstance = jbpmExecutionByInstance;
		this.jbpmActivityByAct = jbpmActivityByAct;
		this.jbpmActivityByTransorig = jbpmActivityByTransorig;
		this.jbpmTransition = jbpmTransition;
		this.dbversion = dbversion;
		this.hasvars = hasvars;
		this.hastimers = hastimers;
		this.name = name;
		this.key = key;
		this.id = id;
		this.state = state;
		this.priority = priority;
		this.hisactinst = hisactinst;
		this.parentIdx = parentIdx;
		this.jbpmVariablesForProcinst = jbpmVariablesForProcinst;
		this.jbpmJpdlExecutions = jbpmJpdlExecutions;
		this.jbpmExecutionsForParent = jbpmExecutionsForParent;
		this.jbpmVariablesForExecution = jbpmVariablesForExecution;
		this.jbpmExecutionsForSuperexec = jbpmExecutionsForSuperexec;
		this.jbpmJobsForExecution = jbpmJobsForExecution;
		this.jbpmExecutionsForInstance = jbpmExecutionsForInstance;
		this.jbpmJobsForProcessinstance = jbpmJobsForProcessinstance;
	}

	// Property accessors

	public Long getDbid() {
		return this.dbid;
	}

	public void setDbid(Long dbid) {
		this.dbid = dbid;
	}

	public JbpmProcess getJbpmProcess() {
		return this.jbpmProcess;
	}

	public void setJbpmProcess(JbpmProcess jbpmProcess) {
		this.jbpmProcess = jbpmProcess;
	}

	public JbpmExecution getJbpmExecutionBySuperexec() {
		return this.jbpmExecutionBySuperexec;
	}

	public void setJbpmExecutionBySuperexec(
			JbpmExecution jbpmExecutionBySuperexec) {
		this.jbpmExecutionBySuperexec = jbpmExecutionBySuperexec;
	}

	public JbpmExecution getJbpmExecutionByParent() {
		return this.jbpmExecutionByParent;
	}

	public void setJbpmExecutionByParent(JbpmExecution jbpmExecutionByParent) {
		this.jbpmExecutionByParent = jbpmExecutionByParent;
	}

	public JbpmExecution getJbpmExecutionByInstance() {
		return this.jbpmExecutionByInstance;
	}

	public void setJbpmExecutionByInstance(JbpmExecution jbpmExecutionByInstance) {
		this.jbpmExecutionByInstance = jbpmExecutionByInstance;
	}

	public JbpmActivity getJbpmActivityByAct() {
		return this.jbpmActivityByAct;
	}

	public void setJbpmActivityByAct(JbpmActivity jbpmActivityByAct) {
		this.jbpmActivityByAct = jbpmActivityByAct;
	}

	public JbpmActivity getJbpmActivityByTransorig() {
		return this.jbpmActivityByTransorig;
	}

	public void setJbpmActivityByTransorig(JbpmActivity jbpmActivityByTransorig) {
		this.jbpmActivityByTransorig = jbpmActivityByTransorig;
	}

	public JbpmTransition getJbpmTransition() {
		return this.jbpmTransition;
	}

	public void setJbpmTransition(JbpmTransition jbpmTransition) {
		this.jbpmTransition = jbpmTransition;
	}

	public Integer getDbversion() {
		return this.dbversion;
	}

	public void setDbversion(Integer dbversion) {
		this.dbversion = dbversion;
	}

	public Boolean getHasvars() {
		return this.hasvars;
	}

	public void setHasvars(Boolean hasvars) {
		this.hasvars = hasvars;
	}

	public Boolean getHastimers() {
		return this.hastimers;
	}

	public void setHastimers(Boolean hastimers) {
		this.hastimers = hastimers;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Long getHisactinst() {
		return this.hisactinst;
	}

	public void setHisactinst(Long hisactinst) {
		this.hisactinst = hisactinst;
	}

	public Integer getParentIdx() {
		return this.parentIdx;
	}

	public void setParentIdx(Integer parentIdx) {
		this.parentIdx = parentIdx;
	}

	public Set getJbpmVariablesForProcinst() {
		return this.jbpmVariablesForProcinst;
	}

	public void setJbpmVariablesForProcinst(Set jbpmVariablesForProcinst) {
		this.jbpmVariablesForProcinst = jbpmVariablesForProcinst;
	}

	public Set getJbpmJpdlExecutions() {
		return this.jbpmJpdlExecutions;
	}

	public void setJbpmJpdlExecutions(Set jbpmJpdlExecutions) {
		this.jbpmJpdlExecutions = jbpmJpdlExecutions;
	}

	public Set getJbpmExecutionsForParent() {
		return this.jbpmExecutionsForParent;
	}

	public void setJbpmExecutionsForParent(Set jbpmExecutionsForParent) {
		this.jbpmExecutionsForParent = jbpmExecutionsForParent;
	}

	public Set getJbpmVariablesForExecution() {
		return this.jbpmVariablesForExecution;
	}

	public void setJbpmVariablesForExecution(Set jbpmVariablesForExecution) {
		this.jbpmVariablesForExecution = jbpmVariablesForExecution;
	}

	public Set getJbpmExecutionsForSuperexec() {
		return this.jbpmExecutionsForSuperexec;
	}

	public void setJbpmExecutionsForSuperexec(Set jbpmExecutionsForSuperexec) {
		this.jbpmExecutionsForSuperexec = jbpmExecutionsForSuperexec;
	}

	public Set getJbpmJobsForExecution() {
		return this.jbpmJobsForExecution;
	}

	public void setJbpmJobsForExecution(Set jbpmJobsForExecution) {
		this.jbpmJobsForExecution = jbpmJobsForExecution;
	}

	public Set getJbpmExecutionsForInstance() {
		return this.jbpmExecutionsForInstance;
	}

	public void setJbpmExecutionsForInstance(Set jbpmExecutionsForInstance) {
		this.jbpmExecutionsForInstance = jbpmExecutionsForInstance;
	}

	public Set getJbpmJobsForProcessinstance() {
		return this.jbpmJobsForProcessinstance;
	}

	public void setJbpmJobsForProcessinstance(Set jbpmJobsForProcessinstance) {
		this.jbpmJobsForProcessinstance = jbpmJobsForProcessinstance;
	}

}