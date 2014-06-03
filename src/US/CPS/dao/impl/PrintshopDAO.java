package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IPrintshopDAO;
import US.CPS.entity.printshop.Printshop;

/**
 * A data access object (DAO) providing persistence and search support for
 * Printshop entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.printshop.Printshop
 * @author chwu1203
 */

public class PrintshopDAO extends HibernateDaoSupport implements IPrintshopDAO {
	private static final Log log = LogFactory.getLog(PrintshopDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#save(US.CPS.entity.printshop.Printshop)
	 */
	@Override
	public void save(Printshop transientInstance) {
		log.debug("saving Printshop instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#delete(US.CPS.entity.printshop.Printshop)
	 */
	@Override
	public void delete(Printshop persistentInstance) {
		log.debug("deleting Printshop instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#findById(java.lang.Integer)
	 */
	@Override
	public Printshop findById(java.lang.Integer id) {
		log.debug("getting Printshop instance with id: " + id);
		try {
			Printshop instance = (Printshop) getHibernateTemplate().get(
					"US.CPS.entity.printshop.Printshop", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#findByExample(US.CPS.entity.printshop.Printshop)
	 */
	@Override
	public List findByExample(Printshop instance) {
		log.debug("finding Printshop instance by example");
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
	 * @see US.CPS.dao.impl.IPrintshopDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Printshop instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Printshop as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#findByPrintshopName(java.lang.Object)
	 */
	@Override
	public List findByPrintshopName(Object printshopName) {
		return findByProperty(PRINTSHOP_NAME, printshopName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Printshop instances");
		try {
			String queryString = "from Printshop";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#merge(US.CPS.entity.printshop.Printshop)
	 */
	@Override
	public Printshop merge(Printshop detachedInstance) {
		log.debug("merging Printshop instance");
		try {
			Printshop result = (Printshop) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#attachDirty(US.CPS.entity.printshop.Printshop)
	 */
	@Override
	public void attachDirty(Printshop instance) {
		log.debug("attaching dirty Printshop instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrintshopDAO#attachClean(US.CPS.entity.printshop.Printshop)
	 */
	@Override
	public void attachClean(Printshop instance) {
		log.debug("attaching clean Printshop instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IPrintshopDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IPrintshopDAO) ctx.getBean("PrintshopDAO");
	}
}