package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IDistrictDAO;
import US.CPS.entity.district.District;

/**
 * A data access object (DAO) providing persistence and search support for
 * District entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.district.District
 * @author chwu1203
 */

public class DistrictDAO extends HibernateDaoSupport implements IDistrictDAO {
	private static final Log log = LogFactory.getLog(DistrictDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#save(US.CPS.entity.district.District)
	 */
	@Override
	public void save(District transientInstance) {
		log.debug("saving District instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#delete(US.CPS.entity.district.District)
	 */
	@Override
	public void delete(District persistentInstance) {
		log.debug("deleting District instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#findById(java.lang.Integer)
	 */
	@Override
	public District findById(java.lang.Integer id) {
		log.debug("getting District instance with id: " + id);
		try {
			District instance = (District) getHibernateTemplate().get(
					"US.CPS.entity.district.District", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#findByExample(US.CPS.entity.district.District)
	 */
	@Override
	public List findByExample(District instance) {
		log.debug("finding District instance by example");
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
	 * @see US.CPS.dao.impl.IDistrictDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding District instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from District as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#findByDistrictName(java.lang.Object)
	 */
	@Override
	public List findByDistrictName(Object districtName) {
		return findByProperty(DISTRICT_NAME, districtName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all District instances");
		try {
			String queryString = "from District";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#merge(US.CPS.entity.district.District)
	 */
	@Override
	public District merge(District detachedInstance) {
		log.debug("merging District instance");
		try {
			District result = (District) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#attachDirty(US.CPS.entity.district.District)
	 */
	@Override
	public void attachDirty(District instance) {
		log.debug("attaching dirty District instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IDistrictDAO#attachClean(US.CPS.entity.district.District)
	 */
	@Override
	public void attachClean(District instance) {
		log.debug("attaching clean District instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IDistrictDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IDistrictDAO) ctx.getBean("DistrictDAO");
	}
}