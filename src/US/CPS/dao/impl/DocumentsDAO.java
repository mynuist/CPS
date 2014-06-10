package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IDocumentsDAO;
import US.CPS.entity.document.Documents;

/**
 * A data access object (DAO) providing persistence and search support for
 * Documents entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.document.Documents
 * @author MyEclipse Persistence Tools
 */

public class DocumentsDAO extends HibernateDaoSupport implements IDocumentsDAO {
	private static final Log log = LogFactory.getLog(DocumentsDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#save(US.CPS.entity.document.Documents)
	 */
	@Override
	public void save(Documents transientInstance) {
		log.debug("saving Documents instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#delete(US.CPS.entity.document.Documents)
	 */
	@Override
	public void delete(Documents persistentInstance) {
		log.debug("deleting Documents instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findById(java.lang.Long)
	 */
	@Override
	public Documents findById(java.lang.Long id) {
		log.debug("getting Documents instance with id: " + id);
		try {
			Documents instance = (Documents) getHibernateTemplate().get(
					"US.CPS.entity.document.Documents", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByExample(US.CPS.entity.document.Documents)
	 */
	@Override
	public List findByExample(Documents instance) {
		log.debug("finding Documents instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Documents instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Documents as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByDocName(java.lang.Object)
	 */
	@Override
	public List findByDocName(Object docName) {
		return findByProperty(DOC_NAME, docName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByDocDownloadUrl(java.lang.Object)
	 */
	@Override
	public List findByDocDownloadUrl(Object docDownloadUrl) {
		return findByProperty(DOC_DOWNLOAD_URL, docDownloadUrl);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByDocType(java.lang.Object)
	 */
	@Override
	public List findByDocType(Object docType) {
		return findByProperty(DOC_TYPE, docType);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByDocStatus(java.lang.Object)
	 */
	@Override
	public List findByDocStatus(Object docStatus) {
		return findByProperty(DOC_STATUS, docStatus);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findByBucketIndex(java.lang.Object)
	 */
	@Override
	public List findByBucketIndex(Object bucketIndex) {
		return findByProperty(BUCKET_INDEX, bucketIndex);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Documents instances");
		try {
			String queryString = "from Documents";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#merge(US.CPS.entity.document.Documents)
	 */
	@Override
	public Documents merge(Documents detachedInstance) {
		log.debug("merging Documents instance");
		try {
			Documents result = (Documents) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#attachDirty(US.CPS.entity.document.Documents)
	 */
	@Override
	public void attachDirty(Documents instance) {
		log.debug("attaching dirty Documents instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDocumentsDAO#attachClean(US.CPS.entity.document.Documents)
	 */
	@Override
	public void attachClean(Documents instance) {
		log.debug("attaching clean Documents instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IDocumentsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IDocumentsDAO) ctx.getBean("DocumentsDAO");
	}
}