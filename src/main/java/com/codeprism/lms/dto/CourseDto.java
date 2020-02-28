package com.codeprism.lms.dto;

import com.codeprism.lms.entity.Chapter;
import com.codeprism.lms.entity.Topics;

import java.util.Date;
import java.util.Set;

public class CourseDto {

	private String courseId;
	private String title;
	private String author;
	private Chapter chapter;
	private Date dateCreated;
	private Date dataModified;
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDataModified() {
		return dataModified;
	}
	public void setDataModified(Date dataModified) {
		this.dataModified = dataModified;
	}
	@Override
	public String toString() {
		return "CourseDto [courseId=" + courseId + ", title=" + title + ", author=" + author + ", dateCreated="
				+ dateCreated + ", dataModified=" + dataModified + "]";
	}
	
}
