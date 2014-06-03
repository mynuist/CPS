package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IAccountDAO;
import US.CPS.entity.account.Account;

/**
 * A data access object (DAO) providing persistence and search support for
 * Account entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.account.Account
 * @author chwu1203
 */

public class AccountDAO extends HibernateDaoSupport implements IAccountDAO {
	private static final Log log = LogFactory.getLog(AccountDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#save(US.CPS.entity.account.Account)
	 */
	@Override
	public void save(Account transientInstance) {
		log.debug("saving Account instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#delete(US.CPS.entity.account.Account)
	 */
	@Override
	public void delete(Account persistentInstance) {
		log.debug("deleting Account instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findById(java.lang.Integer)
	 */
	@Override
	public Account findById(java.lang.Integer id) {
		log.debug("getting Account instance with id: " + id);
		try {
			Account instance = (Account) getHibernateTemplate().get(
					"US.CPS.entity.Account", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByExample(US.CPS.entity.account.Account)
	 */
	@Override
	public List findByExample(Account instance) {
		log.debug("finding Account instance by example");
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
	 * @see US.CPS.dao.impl.IAccountDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Account instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Account as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByUserName(java.lang.Object)
	 */
	@Override
	public List findByUserName(Object userName) {
		return findByProperty(USER_NAME, userName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByUserSex(java.lang.Object)
	 */
	@Override
	public List findByUserSex(Object userSex) {
		return findByProperty(USER_SEX, userSex);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByUserPhone(java.lang.Object)
	 */
	@Override
	public List findByUserPhone(Object userPhone) {
		return findByProperty(USER_PHONE, userPhone);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByUserEmail(java.lang.Object)
	 */
	@Override
	public List findByUserEmail(Object userEmail) {
		return findByProperty(USER_EMAIL, userEmail);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByUserOld(java.lang.Object)
	 */
	@Override
	public List findByUserOld(Object userOld) {
		return findByProperty(USER_OLD, userOld);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findByUserMoney(java.lang.Object)
	 */
	@Override
	public List findByUserMoney(Object userMoney) {
		return findByProperty(USER_MONEY, userMoney);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Account instances");
		try {
			String queryString = "from Account";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#merge(US.CPS.entity.account.Account)
	 */
	@Override
	public Account merge(Account detachedInstance) {
		log.debug("merging Account instance");
		try {
			Account result = (Account) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#attachDirty(US.CPS.entity.account.Account)
	 */
	@Override
	public void attachDirty(Account instance) {
		log.debug("attaching dirty Account instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IAccountDAO#attachClean(US.CPS.entity.account.Account)
	 */
	@Override
	public void attachClean(Account instance) {
		log.debug("attaching clean Account instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IAccountDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IAccountDAO) ctx.getBean("AccountDAO");
	}
}