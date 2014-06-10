package US.CPS.dao;

import java.util.List;

import US.CPS.entity.document.Documents;

public interface IDocumentsDAO {

	// property constants
	public static final String DOC_NAME = "docName";
	public static final String DOC_DOWNLOAD_URL = "docDownloadUrl";
	public static final String DOC_TYPE = "docType";
	public static final String DOC_STATUS = "docStatus";
	public static final String BUCKET_INDEX = "bucketIndex";

	public abstract void save(Documents transientInstance);

	public abstract void delete(Documents persistentInstance);

	public abstract Documents findById(java.lang.Long id);

	public abstract List findByExample(Documents instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByDocName(Object docName);

	public abstract List findByDocDownloadUrl(Object docDownloadUrl);

	public abstract List findByDocType(Object docType);

	public abstract List findByDocStatus(Object docStatus);

	public abstract List findByBucketIndex(Object bucketIndex);

	public abstract List findAll();

	public abstract Documents merge(Documents detachedInstance);

	public abstract void attachDirty(Documents instance);

	public abstract void attachClean(Documents instance);

}