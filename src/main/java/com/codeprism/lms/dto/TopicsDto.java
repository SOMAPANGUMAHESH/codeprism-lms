package com.codeprism.lms.dto;

import java.util.Date;


public class TopicsDto {

	private String topicId;
	private String contentId;
	private String contentType;
	private boolean allowDiscussion;
	private Date dateCreated;
	private Date lastModefied;

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
	public boolean isAllowDiscussion() {
		return allowDiscussion;
	}
	public void setAllowDiscussion(boolean allowDiscussion) {
		this.allowDiscussion = allowDiscussion;
	}
	@Override
	public String toString() {
		return "TopicsDto [topicId=" + topicId + ", contentId=" + contentId + ", contentType=" + contentType
				+ ", dateCreated=" + dateCreated + ", lastModefied=" + lastModefied + ", allowDiscussion="
				+ allowDiscussion + "]";
	}
	
}
