package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IUniversityDAO;
import US.CPS.entity.university.University;

/**
 * A data access object (DAO) providing persistence and search support for
 * University entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.university.University
 * @author chwu1203
 */

public class UniversityDAO extends HibernateDaoSupport implements IUniversityDAO {
	private static final Log log = LogFactory.getLog(UniversityDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#save(US.CPS.entity.university.University)
	 */
	@Override
	public void save(University transientInstance) {
		log.debug("saving University instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#delete(US.CPS.entity.university.University)
	 */
	@Override
	public void delete(University persistentInstance) {
		log.debug("deleting University instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#findById(java.lang.Integer)
	 */
	@Override
	public University findById(java.lang.Integer id) {
		log.debug("getting University instance with id: " + id);
		try {
			University instance = (University) getHibernateTemplate().get(
					"US.CPS.entity.university.University", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#findByExample(US.CPS.entity.university.University)
	 */
	@Override
	public List findByExample(University instance) {
		log.debug("finding University instance by example");
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
	 * @see US.CPS.dao.impl.IUniversityDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding University instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from University as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#findByUniversityName(java.lang.Object)
	 */
	@Override
	public List findByUniversityName(Object universityName) {
		return findByProperty(UNIVERSITY_NAME, universityName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all University instances");
		try {
			String queryString = "from University";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#merge(US.CPS.entity.university.University)
	 */
	@Override
	public University merge(University detachedInstance) {
		log.debug("merging University instance");
		try {
			University result = (University) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#attachDirty(US.CPS.entity.university.University)
	 */
	@Override
	public void attachDirty(University instance) {
		log.debug("attaching dirty University instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUniversityDAO#attachClean(US.CPS.entity.university.University)
	 */
	@Override
	public void attachClean(University instance) {
		log.debug("attaching clean University instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IUniversityDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IUniversityDAO) ctx.getBean("UniversityDAO");
	}
}