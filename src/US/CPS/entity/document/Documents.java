package US.CPS.entity.document;

import java.sql.Timestamp;

/**
 * Documents entity. @author MyEclipse Persistence Tools
 */
public class Documents extends AbstractDocuments implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Documents() {
	}

	/** minimal constructor */
	public Documents(Timestamp docUploadTime, Timestamp docLastDownTime,
			Integer bucketIndex) {
		super(docUploadTime, docLastDownTime, bucketIndex);
	}

	/** full constructor */
	public Documents(String docName, String docDownloadUrl, String docType,
			Short docStatus, Timestamp docUploadTime,
			Timestamp docLastDownTime, Integer bucketIndex) {
		super(docName, docDownloadUrl, docType, docStatus, docUploadTime,
				docLastDownTime, bucketIndex);
	}

}
