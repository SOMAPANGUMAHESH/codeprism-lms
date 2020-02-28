/**
 * 
 */
package com.codeprism.lms.entity;

import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author mahesh
 *
 */
@Entity
@Table(name = "chapter")
public class Chapter {

	@Id
	@Column(name = "chapter_id")
	private String chapterId;
	@Transient
	private String courseId;
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "course_id")
	private Course course;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_modified")
	private Date dateModified;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified")
	private Date lastModified;
	@OneToMany(mappedBy = "chapter",cascade = CascadeType.ALL,fetch =FetchType.EAGER)
	private Set<Topics> topics=new LinkedHashSet<Topics>();
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
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
	public String getChapterId() {return chapterId; }
	public void setChapterId(String chapterId) { this.chapterId = chapterId; }
	public Set<Topics> getTopics() {return topics; }
}
