package com.ada.model;

import java.util.Date;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;
import com.google.appengine.api.datastore.Text;

@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class RMessage {
	@PrimaryKey
    @Persistent(valueStrategy = IdGeneratorStrategy.IDENTITY)
    private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public RMessage(long articleid, Text content, long score, long upscore,
			long downscore, Date pubtime) {
		super();
		this.articleid = articleid;
		this.content = content;
		this.score = score;
		this.upscore = upscore;
		this.downscore = downscore;
		this.pubtime = pubtime;
	}
	public long getArticleid() {
		return articleid;
	}
	public void setArticleid(long articleid) {
		this.articleid = articleid;
	}
	public Text getContent() {
		return content;
	}
	public void setContent(Text content) {
		this.content = content;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public long getUpscore() {
		return upscore;
	}
	public void setUpscore(long upscore) {
		this.upscore = upscore;
	}
	public long getDownscore() {
		return downscore;
	}
	public void setDownscore(long downscore) {
		this.downscore = downscore;
	}
	public Date getPubtime() {
		return pubtime;
	}
	public void setPubtime(Date pubtime) {
		this.pubtime = pubtime;
	}
	@Persistent
    private long articleid;
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
}
