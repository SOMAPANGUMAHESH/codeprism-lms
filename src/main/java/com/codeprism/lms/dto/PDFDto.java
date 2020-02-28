/**
 * 
 */
package com.codeprism.lms.dto;

import java.sql.Date;
import com.codeprism.lms.entity.Topics;

/**
 * @author mahesh
 *
 */
public class PDFDto {
	private String pdfId;
	private Boolean secure;
	private String url;
	private Date dateCreated;
	private Date lastModified;
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

	public Topics getTopics() {
		return topics;
	}

	public void setTopics(Topics topics) {
		this.topics = topics;
	}

	public String getPdfId() {
		return pdfId;
	}

	public void setPdfId(String pdfId) {
		this.pdfId = pdfId;
	}

}
