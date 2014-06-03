package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IPaycardDAO;
import US.CPS.entity.paycard.Paycard;

/**
 * A data access object (DAO) providing persistence and search support for
 * Paycard entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.paycard.Paycard
 * @author chwu1203
 */

public class PaycardDAO extends HibernateDaoSupport implements IPaycardDAO {
	private static final Log log = LogFactory.getLog(PaycardDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#save(US.CPS.entity.paycard.Paycard)
	 */
	@Override
	public void save(Paycard transientInstance) {
		log.debug("saving Paycard instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#delete(US.CPS.entity.paycard.Paycard)
	 */
	@Override
	public void delete(Paycard persistentInstance) {
		log.debug("deleting Paycard instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findById(java.lang.Integer)
	 */
	@Override
	public Paycard findById(java.lang.Integer id) {
		log.debug("getting Paycard instance with id: " + id);
		try {
			Paycard instance = (Paycard) getHibernateTemplate().get(
					"US.CPS.entity.paycard.Paycard", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findByExample(US.CPS.entity.paycard.Paycard)
	 */
	@Override
	public List findByExample(Paycard instance) {
		log.debug("finding Paycard instance by example");
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
	 * @see US.CPS.dao.impl.IPaycardDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Paycard instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Paycard as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findByCardNum(java.lang.Object)
	 */
	@Override
	public List findByCardNum(Object cardNum) {
		return findByProperty(CARD_NUM, cardNum);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findByCardPassword(java.lang.Object)
	 */
	@Override
	public List findByCardPassword(Object cardPassword) {
		return findByProperty(CARD_PASSWORD, cardPassword);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findByCardCount(java.lang.Object)
	 */
	@Override
	public List findByCardCount(Object cardCount) {
		return findByProperty(CARD_COUNT, cardCount);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findByCardStatus(java.lang.Object)
	 */
	@Override
	public List findByCardStatus(Object cardStatus) {
		return findByProperty(CARD_STATUS, cardStatus);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Paycard instances");
		try {
			String queryString = "from Paycard";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#merge(US.CPS.entity.paycard.Paycard)
	 */
	@Override
	public Paycard merge(Paycard detachedInstance) {
		log.debug("merging Paycard instance");
		try {
			Paycard result = (Paycard) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#attachDirty(US.CPS.entity.paycard.Paycard)
	 */
	@Override
	public void attachDirty(Paycard instance) {
		log.debug("attaching dirty Paycard instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IPaycardDAO#attachClean(US.CPS.entity.paycard.Paycard)
	 */
	@Override
	public void attachClean(Paycard instance) {
		log.debug("attaching clean Paycard instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IPaycardDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IPaycardDAO) ctx.getBean("PaycardDAO");
	}
}