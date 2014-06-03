package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IPrinttaskDAO;
import US.CPS.entity.printtask.Printtask;

/**
 * A data access object (DAO) providing persistence and search support for
 * Printtask entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.printtask.Printtask
 * @author chwu1203
 */

public class PrinttaskDAO extends HibernateDaoSupport implements IPrinttaskDAO {
	private static final Log log = LogFactory.getLog(PrinttaskDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#save(US.CPS.entity.printtask.Printtask)
	 */
	@Override
	public void save(Printtask transientInstance) {
		log.debug("saving Printtask instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#delete(US.CPS.entity.printtask.Printtask)
	 */
	@Override
	public void delete(Printtask persistentInstance) {
		log.debug("deleting Printtask instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findById(java.lang.Integer)
	 */
	@Override
	public Printtask findById(java.lang.Integer id) {
		log.debug("getting Printtask instance with id: " + id);
		try {
			Printtask instance = (Printtask) getHibernateTemplate().get(
					"US.CPS.entity.printtask.Printtask", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByExample(US.CPS.entity.printtask.Printtask)
	 */
	@Override
	public List findByExample(Printtask instance) {
		log.debug("finding Printtask instance by example");
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
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Printtask instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Printtask as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByPrintBooking(java.lang.Object)
	 */
	@Override
	public List findByPrintBooking(Object printBooking) {
		return findByProperty(PRINT_BOOKING, printBooking);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByPrintFileName(java.lang.Object)
	 */
	@Override
	public List findByPrintFileName(Object printFileName) {
		return findByProperty(PRINT_FILE_NAME, printFileName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByPrintTaskStatus(java.lang.Object)
	 */
	@Override
	public List findByPrintTaskStatus(Object printTaskStatus) {
		return findByProperty(PRINT_TASK_STATUS, printTaskStatus);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByPrintComment(java.lang.Object)
	 */
	@Override
	public List findByPrintComment(Object printComment) {
		return findByProperty(PRINT_COMMENT, printComment);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findByPrintPageNumber(java.lang.Object)
	 */
	@Override
	public List findByPrintPageNumber(Object printPageNumber) {
		return findByProperty(PRINT_PAGE_NUMBER, printPageNumber);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Printtask instances");
		try {
			String queryString = "from Printtask";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#merge(US.CPS.entity.printtask.Printtask)
	 */
	@Override
	public Printtask merge(Printtask detachedInstance) {
		log.debug("merging Printtask instance");
		try {
			Printtask result = (Printtask) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#attachDirty(US.CPS.entity.printtask.Printtask)
	 */
	@Override
	public void attachDirty(Printtask instance) {
		log.debug("attaching dirty Printtask instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPrinttaskDAO#attachClean(US.CPS.entity.printtask.Printtask)
	 */
	@Override
	public void attachClean(Printtask instance) {
		log.debug("attaching clean Printtask instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IPrinttaskDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IPrinttaskDAO) ctx.getBean("PrinttaskDAO");
	}
}