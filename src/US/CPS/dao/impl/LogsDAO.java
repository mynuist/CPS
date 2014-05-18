package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.ILogsDAO;
import US.CPS.entity.logs.Logs;

/**
 * A data access object (DAO) providing persistence and search support for Logs
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see US.CPS.entity.logs.Logs
 * @author chwu1203
 */

public class LogsDAO extends HibernateDaoSupport implements ILogsDAO {
	private static final Log log = LogFactory.getLog(LogsDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#save(US.CPS.entity.logs.Logs)
	 */
	@Override
	public void save(Logs transientInstance) {
		log.debug("saving Logs instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#delete(US.CPS.entity.logs.Logs)
	 */
	@Override
	public void delete(Logs persistentInstance) {
		log.debug("deleting Logs instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#findById(java.lang.Integer)
	 */
	@Override
	public Logs findById(java.lang.Integer id) {
		log.debug("getting Logs instance with id: " + id);
		try {
			Logs instance = (Logs) getHibernateTemplate().get(
					"US.CPS.entity.logs.Logs", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#findByExample(US.CPS.entity.logs.Logs)
	 */
	@Override
	public List findByExample(Logs instance) {
		log.debug("finding Logs instance by example");
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
	 * @see US.CPS.dao.impl.ILogsDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Logs instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Logs as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#findByLogDes(java.lang.Object)
	 */
	@Override
	public List findByLogDes(Object logDes) {
		return findByProperty(LOG_DES, logDes);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Logs instances");
		try {
			String queryString = "from Logs";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#merge(US.CPS.entity.logs.Logs)
	 */
	@Override
	public Logs merge(Logs detachedInstance) {
		log.debug("merging Logs instance");
		try {
			Logs result = (Logs) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#attachDirty(US.CPS.entity.logs.Logs)
	 */
	@Override
	public void attachDirty(Logs instance) {
		log.debug("attaching dirty Logs instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.ILogsDAO#attachClean(US.CPS.entity.logs.Logs)
	 */
	@Override
	public void attachClean(Logs instance) {
		log.debug("attaching clean Logs instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ILogsDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ILogsDAO) ctx.getBean("LogsDAO");
	}
}