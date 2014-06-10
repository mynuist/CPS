package US.CPS.entity.buckets;

/**
 * AbstractBuckets entity provides the base persistence definition of the
 * Buckets entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractBuckets implements
		java.io.Serializable {

	// Fields

	private Integer bucketId;
	private String bucketName;
	private String accessKey;
	private String securityKey;
	private String domainUrl;

	// Constructors

	/** default constructor */
	public AbstractBuckets() {
	}

	/** full constructor */
	public AbstractBuckets(String bucketName, String accessKey,
			String securityKey, String domainUrl) {
		this.bucketName = bucketName;
		this.accessKey = accessKey;
		this.securityKey = securityKey;
		this.domainUrl = domainUrl;
	}

	// Property accessors

	public Integer getBucketId() {
		return this.bucketId;
	}

	public void setBucketId(Integer bucketId) {
		this.bucketId = bucketId;
	}

	public String getBucketName() {
		return this.bucketName;
	}

	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	public String getAccessKey() {
		return this.accessKey;
	}

	public void setAccessKey(String accessKey) {
		this.accessKey = accessKey;
	}

	public String getSecurityKey() {
		return this.securityKey;
	}

	public void setSecurityKey(String securityKey) {
		this.securityKey = securityKey;
	}

	public String getDomainUrl() {
		return this.domainUrl;
	}

	public void setDomainUrl(String domainUrl) {
		this.domainUrl = domainUrl;
	}

}