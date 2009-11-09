package com.ada.model;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.Text;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class ForumRMessage {
	@PrimaryKey
	@Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
	private Long key;
	@Persistent
	private long messageid;
    @Persistent
    private Text content;
	@Persistent
    private long score=0;
	@Persistent
    private long upscore=0;
	@Persistent
    private long downscore=0;
	@Persistent
    private Date pubtime=new Date();
	public Text getContent() {
		return content;
	}
	public long getDownscore() {
		return downscore;
	}
	public Long getKey() {
		return key;
	}

	public Date getPubtime() {
		return pubtime;
	}
	public long getScore() {
		return score;
	}
	public long getUpscore() {
		return upscore;
	}
	public void setContent(Text content) {
		this.content = content;
	}
	public void setDownscore(long downscore) {
		this.downscore = downscore;
	}
	public void setKey(Long key) {
		this.key = key;
	}
    public long getMessageid() {
		return messageid;
	}
	public void setMessageid(long messageid) {
		this.messageid = messageid;
	}
	public void setPubtime(Date pubtime) {
		this.pubtime = pubtime;
	}
    public void setScore(long score) {
		this.score = score;
	}
    public void setUpscore(long upscore) {
		this.upscore = upscore;
	}
}
