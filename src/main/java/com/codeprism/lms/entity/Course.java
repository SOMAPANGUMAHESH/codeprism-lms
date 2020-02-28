/**
 * 
 */
package com.codeprism.lms.entity;

import java.util.*;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
	@Id
	@Column(name = "course_id")
	private String courseId;
	@Column(name = "title")
	private String title;
	@Column(name = "author")
	private String author;
	@Column(name = "date_created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified")
	private Date lastModified;
	@OneToMany(mappedBy = "course",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<Chapter> chapters=new ArrayList<>();
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
		return lastModified;
	}

	public void setDataModified(Date dataModified) {
		this.lastModified = dataModified;
	}

	public List<Chapter> getChpter() {
		return chapters;
	}

	public void setChpter(List<Chapter> chpter) {
		this.chapters = chpter;
	}
}
