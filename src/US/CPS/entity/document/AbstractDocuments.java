package US.CPS.entity.document;

import java.sql.Timestamp;

/**
 * AbstractDocuments entity provides the base persistence definition of the
 * Documents entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDocuments implements
		java.io.Serializable {

	// Fields

	private Long documentId;
	private String docName;
	private String docDownloadUrl;
	private String docType;
	private Short docStatus;
	private Timestamp docUploadTime;
	private Timestamp docLastDownTime;
	private Integer bucketIndex;

	// Constructors

	/** default constructor */
	public AbstractDocuments() {
	}

	/** minimal constructor */
	public AbstractDocuments(Timestamp docUploadTime,
			Timestamp docLastDownTime, Integer bucketIndex) {
		this.docUploadTime = docUploadTime;
		this.docLastDownTime = docLastDownTime;
		this.bucketIndex = bucketIndex;
	}

	/** full constructor */
	public AbstractDocuments(String docName, String docDownloadUrl,
			String docType, Short docStatus, Timestamp docUploadTime,
			Timestamp docLastDownTime, Integer bucketIndex) {
		this.docName = docName;
		this.docDownloadUrl = docDownloadUrl;
		this.docType = docType;
		this.docStatus = docStatus;
		this.docUploadTime = docUploadTime;
		this.docLastDownTime = docLastDownTime;
		this.bucketIndex = bucketIndex;
	}

	// Property accessors

	public Long getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(Long documentId) {
		this.documentId = documentId;
	}

	public String getDocName() {
		return this.docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	public String getDocDownloadUrl() {
		return this.docDownloadUrl;
	}

	public void setDocDownloadUrl(String docDownloadUrl) {
		this.docDownloadUrl = docDownloadUrl;
	}

	public String getDocType() {
		return this.docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public Short getDocStatus() {
		return this.docStatus;
	}

	public void setDocStatus(Short docStatus) {
		this.docStatus = docStatus;
	}

	public Timestamp getDocUploadTime() {
		return this.docUploadTime;
	}

	public void setDocUploadTime(Timestamp docUploadTime) {
		this.docUploadTime = docUploadTime;
	}

	public Timestamp getDocLastDownTime() {
		return this.docLastDownTime;
	}

	public void setDocLastDownTime(Timestamp docLastDownTime) {
		this.docLastDownTime = docLastDownTime;
	}

	public Integer getBucketIndex() {
		return this.bucketIndex;
	}

	public void setBucketIndex(Integer bucketIndex) {
		this.bucketIndex = bucketIndex;
	}

}