package com.codeprism.lms.dto;

import java.util.Date;
import java.util.Set;

import com.codeprism.lms.entity.Course;
import com.codeprism.lms.entity.Topics;

public class ChapterDto {
	private String chapterId;
	private Set<Topics> topics;
	private Date dateModified;
	private Date lastModified;
	private  Course course;
	public String getChapterId() {
		return chapterId;
	}

	public void setChapterId(String chapterId) {
		this.chapterId = chapterId;
	}

	public Set<Topics> getTopics() {
		return topics;
	}

	public void setTopics(Set<Topics> topics) {
		this.topics = topics;
	}

	public Date getDateModified() {
		return dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
}