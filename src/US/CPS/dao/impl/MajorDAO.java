package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IMajorDAO;
import US.CPS.entity.major.Major;

/**
 * A data access object (DAO) providing persistence and search support for Major
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see US.CPS.entity.major.Major
 * @author chwu1203
 */

public class MajorDAO extends HibernateDaoSupport implements IMajorDAO {
	private static final Log log = LogFactory.getLog(MajorDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#save(US.CPS.entity.major.Major)
	 */
	@Override
	public void save(Major transientInstance) {
		log.debug("saving Major instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#delete(US.CPS.entity.major.Major)
	 */
	@Override
	public void delete(Major persistentInstance) {
		log.debug("deleting Major instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#findById(java.lang.Integer)
	 */
	@Override
	public Major findById(java.lang.Integer id) {
		log.debug("getting Major instance with id: " + id);
		try {
			Major instance = (Major) getHibernateTemplate().get(
					"US.CPS.entity.major.Major", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#findByExample(US.CPS.entity.major.Major)
	 */
	@Override
	public List findByExample(Major instance) {
		log.debug("finding Major instance by example");
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
	 * @see US.CPS.dao.impl.IMajorDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Major instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Major as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#findByMajorName(java.lang.Object)
	 */
	@Override
	public List findByMajorName(Object majorName) {
		return findByProperty(MAJOR_NAME, majorName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Major instances");
		try {
			String queryString = "from Major";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#merge(US.CPS.entity.major.Major)
	 */
	@Override
	public Major merge(Major detachedInstance) {
		log.debug("merging Major instance");
		try {
			Major result = (Major) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#attachDirty(US.CPS.entity.major.Major)
	 */
	@Override
	public void attachDirty(Major instance) {
		log.debug("attaching dirty Major instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IMajorDAO#attachClean(US.CPS.entity.major.Major)
	 */
	@Override
	public void attachClean(Major instance) {
		log.debug("attaching clean Major instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IMajorDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IMajorDAO) ctx.getBean("MajorDAO");
	}
}