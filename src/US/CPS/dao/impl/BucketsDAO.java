package US.CPS.dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IBucketsDAO;
import US.CPS.entity.buckets.Buckets;

/**
 * A data access object (DAO) providing persistence and search support for
 * Buckets entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.buckets.Buckets
 * @author MyEclipse Persistence Tools
 */

public class BucketsDAO extends HibernateDaoSupport implements IBucketsDAO {
	private static final Log log = LogFactory.getLog(BucketsDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#save(US.CPS.entity.buckets.Buckets)
	 */
	@Override
	public void save(Buckets transientInstance) {
		log.debug("saving Buckets instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#delete(US.CPS.entity.buckets.Buckets)
	 */
	@Override
	public void delete(Buckets persistentInstance) {
		log.debug("deleting Buckets instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findById(java.lang.Integer)
	 */
	@Override
	public Buckets findById(java.lang.Integer id) {
		log.debug("getting Buckets instance with id: " + id);
		try {
			Buckets instance = (Buckets) getHibernateTemplate().get(
					"US.CPS.entity.buckets.Buckets", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findByExample(US.CPS.entity.buckets.Buckets)
	 */
	@Override
	public List findByExample(Buckets instance) {
		log.debug("finding Buckets instance by example");
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
	 * @see US.CPS.dao.impl.IBucketsDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Buckets instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Buckets as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findByBucketName(java.lang.Object)
	 */
	@Override
	public List findByBucketName(Object bucketName) {
		return findByProperty(BUCKET_NAME, bucketName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findByAccessKey(java.lang.Object)
	 */
	@Override
	public List findByAccessKey(Object accessKey) {
		return findByProperty(ACCESS_KEY, accessKey);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findBySecurityKey(java.lang.Object)
	 */
	@Override
	public List findBySecurityKey(Object securityKey) {
		return findByProperty(SECURITY_KEY, securityKey);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findByDomainUrl(java.lang.Object)
	 */
	@Override
	public List findByDomainUrl(Object domainUrl) {
		return findByProperty(DOMAIN_URL, domainUrl);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Buckets instances");
		try {
			String queryString = "from Buckets";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#merge(US.CPS.entity.buckets.Buckets)
	 */
	@Override
	public Buckets merge(Buckets detachedInstance) {
		log.debug("merging Buckets instance");
		try {
			Buckets result = (Buckets) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#attachDirty(US.CPS.entity.buckets.Buckets)
	 */
	@Override
	public void attachDirty(Buckets instance) {
		log.debug("attaching dirty Buckets instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBucketsDAO#attachClean(US.CPS.entity.buckets.Buckets)
	 */
	@Override
	public void attachClean(Buckets instance) {
		log.debug("attaching clean Buckets instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IBucketsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IBucketsDAO) ctx.getBean("BucketsDAO");
	}
}