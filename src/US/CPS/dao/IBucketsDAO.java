package US.CPS.dao;

import java.util.List;

import US.CPS.entity.buckets.Buckets;

public interface IBucketsDAO {

	// property constants
	public static final String BUCKET_NAME = "bucketName";
	public static final String ACCESS_KEY = "accessKey";
	public static final String SECURITY_KEY = "securityKey";
	public static final String DOMAIN_URL = "domainUrl";

	public abstract void save(Buckets transientInstance);

	public abstract void delete(Buckets persistentInstance);

	public abstract Buckets findById(java.lang.Integer id);

	public abstract List findByExample(Buckets instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBucketName(Object bucketName);

	public abstract List findByAccessKey(Object accessKey);

	public abstract List findBySecurityKey(Object securityKey);

	public abstract List findByDomainUrl(Object domainUrl);

	public abstract List findAll();

	public abstract Buckets merge(Buckets detachedInstance);

	public abstract void attachDirty(Buckets instance);

	public abstract void attachClean(Buckets instance);

}