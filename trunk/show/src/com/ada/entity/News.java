package com.ada.entity;

import java.sql.Timestamp;

/**
 * News entity. @author MyEclipse Persistence Tools
 */

public class News implements java.io.Serializable {

	// Fields

	private String newsId;
	private String newsType;
	private String classId;
	private String className;
	private String areaId;
	private String custId;
	private String userId;
	private String title;
	private String shorttitle;
	private String color;
	private String content;
	private String attachmentTag;
	private Integer removeTag;
	private String newsClass;
	private String publishUserId;
	private Timestamp publishDate;
	private String checkUser;
	private Timestamp checkTime;
	private String remark;
	private Timestamp stateCodeDate;
	private Integer commend;
	private Integer bestNew;
	private Integer infoState;
	private String keywords;
	private Timestamp updateTime;
	private String viewPerm;
	private String author;
	private String editor;
	private Integer cancomments;
	private Integer clicks;
	private Integer listTop;
	private String publishUserName;
	private String attachId;

	// Constructors

	/** default constructor */
	public News() {
	}

	/** minimal constructor */
	public News(String newsId, String classId, String className, String custId,
			String userId, String title, String publishUserId,
			Timestamp publishDate) {
		this.newsId = newsId;
		this.classId = classId;
		this.className = className;
		this.custId = custId;
		this.userId = userId;
		this.title = title;
		this.publishUserId = publishUserId;
		this.publishDate = publishDate;
	}

	/** full constructor */
	public News(String newsId, String newsType, String classId,
			String className, String areaId, String custId, String userId,
			String title, String shorttitle, String color, String content,
			String attachmentTag, Integer removeTag, String newsClass,
			String publishUserId, Timestamp publishDate, String checkUser,
			Timestamp checkTime, String remark, Timestamp stateCodeDate,
			Integer commend, Integer bestNew, Integer infoState,
			String keywords, Timestamp updateTime, String viewPerm,
			String author, String editor, Integer cancomments, Integer clicks,
			Integer listTop, String publishUserName, String attachId) {
		this.newsId = newsId;
		this.newsType = newsType;
		this.classId = classId;
		this.className = className;
		this.areaId = areaId;
		this.custId = custId;
		this.userId = userId;
		this.title = title;
		this.shorttitle = shorttitle;
		this.color = color;
		this.content = content;
		this.attachmentTag = attachmentTag;
		this.removeTag = removeTag;
		this.newsClass = newsClass;
		this.publishUserId = publishUserId;
		this.publishDate = publishDate;
		this.checkUser = checkUser;
		this.checkTime = checkTime;
		this.remark = remark;
		this.stateCodeDate = stateCodeDate;
		this.commend = commend;
		this.bestNew = bestNew;
		this.infoState = infoState;
		this.keywords = keywords;
		this.updateTime = updateTime;
		this.viewPerm = viewPerm;
		this.author = author;
		this.editor = editor;
		this.cancomments = cancomments;
		this.clicks = clicks;
		this.listTop = listTop;
		this.publishUserName = publishUserName;
		this.attachId = attachId;
	}

	// Property accessors

	public String getNewsId() {
		return this.newsId;
	}

	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}

	public String getNewsType() {
		return this.newsType;
	}

	public void setNewsType(String newsType) {
		this.newsType = newsType;
	}

	public String getClassId() {
		return this.classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return this.className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public String getCustId() {
		return this.custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getShorttitle() {
		return this.shorttitle;
	}

	public void setShorttitle(String shorttitle) {
		this.shorttitle = shorttitle;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAttachmentTag() {
		return this.attachmentTag;
	}

	public void setAttachmentTag(String attachmentTag) {
		this.attachmentTag = attachmentTag;
	}

	public Integer getRemoveTag() {
		return this.removeTag;
	}

	public void setRemoveTag(Integer removeTag) {
		this.removeTag = removeTag;
	}

	public String getNewsClass() {
		return this.newsClass;
	}

	public void setNewsClass(String newsClass) {
		this.newsClass = newsClass;
	}

	public String getPublishUserId() {
		return this.publishUserId;
	}

	public void setPublishUserId(String publishUserId) {
		this.publishUserId = publishUserId;
	}

	public Timestamp getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Timestamp publishDate) {
		this.publishDate = publishDate;
	}

	public String getCheckUser() {
		return this.checkUser;
	}

	public void setCheckUser(String checkUser) {
		this.checkUser = checkUser;
	}

	public Timestamp getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Timestamp getStateCodeDate() {
		return this.stateCodeDate;
	}

	public void setStateCodeDate(Timestamp stateCodeDate) {
		this.stateCodeDate = stateCodeDate;
	}

	public Integer getCommend() {
		return this.commend;
	}

	public void setCommend(Integer commend) {
		this.commend = commend;
	}

	public Integer getBestNew() {
		return this.bestNew;
	}

	public void setBestNew(Integer bestNew) {
		this.bestNew = bestNew;
	}

	public Integer getInfoState() {
		return this.infoState;
	}

	public void setInfoState(Integer infoState) {
		this.infoState = infoState;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public Timestamp getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Timestamp updateTime) {
		this.updateTime = updateTime;
	}

	public String getViewPerm() {
		return this.viewPerm;
	}

	public void setViewPerm(String viewPerm) {
		this.viewPerm = viewPerm;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getEditor() {
		return this.editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public Integer getCancomments() {
		return this.cancomments;
	}

	public void setCancomments(Integer cancomments) {
		this.cancomments = cancomments;
	}

	public Integer getClicks() {
		return this.clicks;
	}

	public void setClicks(Integer clicks) {
		this.clicks = clicks;
	}

	public Integer getListTop() {
		return this.listTop;
	}

	public void setListTop(Integer listTop) {
		this.listTop = listTop;
	}

	public String getPublishUserName() {
		return this.publishUserName;
	}

	public void setPublishUserName(String publishUserName) {
		this.publishUserName = publishUserName;
	}

	public String getAttachId() {
		return this.attachId;
	}

	public void setAttachId(String attachId) {
		this.attachId = attachId;
	}

}