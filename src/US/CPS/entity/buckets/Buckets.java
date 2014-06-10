package US.CPS.entity.buckets;

/**
 * Buckets entity. @author MyEclipse Persistence Tools
 */
public class Buckets extends AbstractBuckets implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Buckets() {
	}

	/** full constructor */
	public Buckets(String bucketName, String accessKey, String securityKey,
			String domainUrl) {
		super(bucketName, accessKey, securityKey, domainUrl);
	}

}
