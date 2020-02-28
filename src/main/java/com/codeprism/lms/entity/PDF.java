package com.codeprism.lms.entity;



import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "PDF")
public class PDF {
	@Id
	@Column(name = "pdf_id")
	private String pdfId;
	@Column(name = "secure")
	private Boolean secure;
	@Column(name = "date_created")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreated;
	@Column(name = "last_modified")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModified;
	@Column(name = "url")
	private String url;
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "content_id")
	private Topics topics;

	public Boolean getSecure() {
		return secure;
	}

	public void setSecure(Boolean secure) {
		this.secure = secure;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastModified() {
		return lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}


	public String getPdfId() {
		return pdfId;
	}
	public void setPdfId(String pdfId) {
		this.pdfId = pdfId;
	}

}
