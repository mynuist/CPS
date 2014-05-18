package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IBillDAO;
import US.CPS.entity.bill.Bill;

/**
 * A data access object (DAO) providing persistence and search support for Bill
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see US.CPS.entity.bill.Bill
 * @author chwu1203
 */

public class BillDAO extends HibernateDaoSupport implements IBillDAO {
	private static final Log log = LogFactory.getLog(BillDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#save(US.CPS.entity.bill.Bill)
	 */
	@Override
	public void save(Bill transientInstance) {
		log.debug("saving Bill instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#delete(US.CPS.entity.bill.Bill)
	 */
	@Override
	public void delete(Bill persistentInstance) {
		log.debug("deleting Bill instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#findById(java.lang.Integer)
	 */
	@Override
	public Bill findById(java.lang.Integer id) {
		log.debug("getting Bill instance with id: " + id);
		try {
			Bill instance = (Bill) getHibernateTemplate().get(
					"US.CPS.entity.bill.Bill", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#findByExample(US.CPS.entity.bill.Bill)
	 */
	@Override
	public List findByExample(Bill instance) {
		log.debug("finding Bill instance by example");
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
	 * @see US.CPS.dao.impl.IBillDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Bill instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Bill as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#findByBillCount(java.lang.Object)
	 */
	@Override
	public List findByBillCount(Object billCount) {
		return findByProperty(BILL_COUNT, billCount);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Bill instances");
		try {
			String queryString = "from Bill";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#merge(US.CPS.entity.bill.Bill)
	 */
	@Override
	public Bill merge(Bill detachedInstance) {
		log.debug("merging Bill instance");
		try {
			Bill result = (Bill) getHibernateTemplate().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#attachDirty(US.CPS.entity.bill.Bill)
	 */
	@Override
	public void attachDirty(Bill instance) {
		log.debug("attaching dirty Bill instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBillDAO#attachClean(US.CPS.entity.bill.Bill)
	 */
	@Override
	public void attachClean(Bill instance) {
		log.debug("attaching clean Bill instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IBillDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IBillDAO) ctx.getBean("BillDAO");
	}
}