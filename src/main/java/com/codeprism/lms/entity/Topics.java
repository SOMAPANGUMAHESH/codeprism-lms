package com.codeprism.lms.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Topics")
public class Topics {

	@Id
	@Column(name="topic_id")
	@NotNull
	@NotEmpty
	private String topicId;
	@Column(name="content_id",unique = true)
	@NotNull
	private String contentId;
	@Column(name="content_type")
	private String contentType;
	@Transient
	private String chapterId;
	@ManyToOne
	@JoinColumn(name="chapter_id")
	private Chapter chapter;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_created")
	private Date dateCreated;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_modefied")
	private Date lastModefied;
	@Column(name="allow_discussions")
	private boolean allowDiscussion;
	@OneToMany(mappedBy = "topics")
	private Set<PDF> pdf =new HashSet<PDF>();
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getContentId() {
		return contentId;
	}
	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getLastModefied() {
		return lastModefied;
	}
	public void setLastModefied(Date lastModefied) {
		this.lastModefied = lastModefied;
	}
	@Override
	public String toString() {
		return "Topics [topicId=" + topicId + ", contentId=" + contentId + ", contentType=" + contentType
				+ ", dateCreated=" + dateCreated + ", lastModefied=" + lastModefied + "]";
	}
	
}
