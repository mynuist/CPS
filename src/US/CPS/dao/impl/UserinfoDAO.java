package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IUserinfoDAO;
import US.CPS.entity.userinfo.Userinfo;

/**
 * A data access object (DAO) providing persistence and search support for
 * Userinfo entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.userinfo.Userinfo
 * @author chwu1203
 */

public class UserinfoDAO extends HibernateDaoSupport implements IUserinfoDAO {
	private static final Log log = LogFactory.getLog(UserinfoDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#save(US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	public void save(Userinfo transientInstance) {
		log.debug("saving Userinfo instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#delete(US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	public void delete(Userinfo persistentInstance) {
		log.debug("deleting Userinfo instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#findById(java.lang.Integer)
	 */
	@Override
	public Userinfo findById(java.lang.Integer id) {
		log.debug("getting Userinfo instance with id: " + id);
		try {
			Userinfo instance = (Userinfo) getHibernateTemplate().get(
					"US.CPS.entity.userinfo.Userinfo", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#findByExample(US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	public List findByExample(Userinfo instance) {
		log.debug("finding Userinfo instance by example");
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
	 * @see US.CPS.dao.impl.IUserinfoDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Userinfo instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Userinfo as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#findByUserinfoSign(java.lang.Object)
	 */
	@Override
	public List findByUserinfoSign(Object userinfoSign) {
		return findByProperty(USERINFO_SIGN, userinfoSign);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#findByUserinfoLastLoginIp(java.lang.Object)
	 */
	@Override
	public List findByUserinfoLastLoginIp(Object userinfoLastLoginIp) {
		return findByProperty(USERINFO_LAST_LOGIN_IP, userinfoLastLoginIp);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#findByUserinfoStatus(java.lang.Object)
	 */
	@Override
	public List findByUserinfoStatus(Object userinfoStatus) {
		return findByProperty(USERINFO_STATUS, userinfoStatus);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Userinfo instances");
		try {
			String queryString = "from Userinfo";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#merge(US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	public Userinfo merge(Userinfo detachedInstance) {
		log.debug("merging Userinfo instance");
		try {
			Userinfo result = (Userinfo) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#attachDirty(US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	public void attachDirty(Userinfo instance) {
		log.debug("attaching dirty Userinfo instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IUserinfoDAO#attachClean(US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	public void attachClean(Userinfo instance) {
		log.debug("attaching clean Userinfo instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IUserinfoDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IUserinfoDAO) ctx.getBean("UserinfoDAO");
	}
}