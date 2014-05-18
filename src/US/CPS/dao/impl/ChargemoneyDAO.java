package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IChargemoneyDAO;
import US.CPS.entity.chargemoney.Chargemoney;

/**
 * A data access object (DAO) providing persistence and search support for
 * Chargemoney entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see US.CPS.entity.chargemoney.Chargemoney
 * @author chwu1203
 */

public class ChargemoneyDAO extends HibernateDaoSupport implements IChargemoneyDAO {
	private static final Log log = LogFactory.getLog(ChargemoneyDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#save(US.CPS.entity.chargemoney.Chargemoney)
	 */
	@Override
	public void save(Chargemoney transientInstance) {
		log.debug("saving Chargemoney instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#delete(US.CPS.entity.chargemoney.Chargemoney)
	 */
	@Override
	public void delete(Chargemoney persistentInstance) {
		log.debug("deleting Chargemoney instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#findById(java.lang.Integer)
	 */
	@Override
	public Chargemoney findById(java.lang.Integer id) {
		log.debug("getting Chargemoney instance with id: " + id);
		try {
			Chargemoney instance = (Chargemoney) getHibernateTemplate().get(
					"US.CPS.entity.chargemoney.Chargemoney", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#findByExample(US.CPS.entity.chargemoney.Chargemoney)
	 */
	@Override
	public List findByExample(Chargemoney instance) {
		log.debug("finding Chargemoney instance by example");
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
	 * @see US.CPS.dao.impl.IChargemoneyDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Chargemoney instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Chargemoney as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#findByChargemoneyCount(java.lang.Object)
	 */
	@Override
	public List findByChargemoneyCount(Object chargemoneyCount) {
		return findByProperty(CHARGEMONEY_COUNT, chargemoneyCount);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Chargemoney instances");
		try {
			String queryString = "from Chargemoney";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#merge(US.CPS.entity.chargemoney.Chargemoney)
	 */
	@Override
	public Chargemoney merge(Chargemoney detachedInstance) {
		log.debug("merging Chargemoney instance");
		try {
			Chargemoney result = (Chargemoney) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#attachDirty(US.CPS.entity.chargemoney.Chargemoney)
	 */
	@Override
	public void attachDirty(Chargemoney instance) {
		log.debug("attaching dirty Chargemoney instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IChargemoneyDAO#attachClean(US.CPS.entity.chargemoney.Chargemoney)
	 */
	@Override
	public void attachClean(Chargemoney instance) {
		log.debug("attaching clean Chargemoney instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IChargemoneyDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (IChargemoneyDAO) ctx.getBean("ChargemoneyDAO");
	}
}