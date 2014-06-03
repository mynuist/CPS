package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IDomDAO;
import US.CPS.entity.dom.Dom;

/**
 * A data access object (DAO) providing persistence and search support for Dom
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see US.CPS.entity.dom.Dom
 * @author chwu1203
 */

public class DomDAO extends HibernateDaoSupport implements IDomDAO {
	private static final Log log = LogFactory.getLog(DomDAO.class);
	// property constants
	public static final String DOM_NUMBER = "domNumber";

	protected void initDao() {
		// do nothing
	}

	public void save(Dom transientInstance) {
		log.debug("saving Dom instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Dom persistentInstance) {
		log.debug("deleting Dom instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Dom findById(java.lang.Integer id) {
		log.debug("getting Dom instance with id: " + id);
		try {
			Dom instance = (Dom) getHibernateTemplate().get(
					"US.CPS.entity.dom.Dom", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Dom instance) {
		log.debug("finding Dom instance by example");
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

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Dom instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Dom as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDomNumber(Object domNumber) {
		return findByProperty(DOM_NUMBER, domNumber);
	}

	public List findAll() {
		log.debug("finding all Dom instances");
		try {
			String queryString = "from Dom";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Dom merge(Dom detachedInstance) {
		log.debug("merging Dom instance");
		try {
			Dom result = (Dom) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Dom instance) {
		log.debug("attaching dirty Dom instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Dom instance) {
		log.debug("attaching clean Dom instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IDomDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IDomDAO) ctx.getBean("DomDAO");
	}
}