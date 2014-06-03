package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.ISchoolDAO;
import US.CPS.entity.school.School;

/**
 * A data access object (DAO) providing persistence and search support for
 * School entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.school.School
 * @author chwu1203
 */

public class SchoolDAO extends HibernateDaoSupport implements ISchoolDAO {
	private static final Log log = LogFactory.getLog(SchoolDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#save(US.CPS.entity.school.School)
	 */
	@Override
	public void save(School transientInstance) {
		log.debug("saving School instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#delete(US.CPS.entity.school.School)
	 */
	@Override
	public void delete(School persistentInstance) {
		log.debug("deleting School instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#findById(java.lang.Integer)
	 */
	@Override
	public School findById(java.lang.Integer id) {
		log.debug("getting School instance with id: " + id);
		try {
			School instance = (School) getHibernateTemplate().get(
					"US.CPS.entity.school.School", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#findByExample(US.CPS.entity.school.School)
	 */
	@Override
	public List findByExample(School instance) {
		log.debug("finding School instance by example");
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
	 * @see US.CPS.dao.impl.ISchoolDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding School instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from School as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#findBySchoolName(java.lang.Object)
	 */
	@Override
	public List findBySchoolName(Object schoolName) {
		return findByProperty(SCHOOL_NAME, schoolName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all School instances");
		try {
			String queryString = "from School";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#merge(US.CPS.entity.school.School)
	 */
	@Override
	public School merge(School detachedInstance) {
		log.debug("merging School instance");
		try {
			School result = (School) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#attachDirty(US.CPS.entity.school.School)
	 */
	@Override
	public void attachDirty(School instance) {
		log.debug("attaching dirty School instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ISchoolDAO#attachClean(US.CPS.entity.school.School)
	 */
	@Override
	public void attachClean(School instance) {
		log.debug("attaching clean School instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ISchoolDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ISchoolDAO) ctx.getBean("SchoolDAO");
	}
}