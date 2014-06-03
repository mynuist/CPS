package US.CPS.dao.impl;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IOrdersDAO;
import US.CPS.entity.orders.Orders;

/**
 * A data access object (DAO) providing persistence and search support for
 * Orders entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.orders.Orders
 * @author chwu1203
 */

public class OrdersDAO extends HibernateDaoSupport implements IOrdersDAO {
	private static final Log log = LogFactory.getLog(OrdersDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#save(US.CPS.entity.orders.Orders)
	 */
	@Override
	public void save(Orders transientInstance) {
		log.debug("saving Orders instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#delete(US.CPS.entity.orders.Orders)
	 */
	@Override
	public void delete(Orders persistentInstance) {
		log.debug("deleting Orders instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#findById(java.lang.Integer)
	 */
	@Override
	public Orders findById(java.lang.Integer id) {
		log.debug("getting Orders instance with id: " + id);
		try {
			Orders instance = (Orders) getHibernateTemplate().get(
					"US.CPS.entity.orders.Orders", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#findByExample(US.CPS.entity.orders.Orders)
	 */
	@Override
	public List findByExample(Orders instance) {
		log.debug("finding Orders instance by example");
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
	 * @see US.CPS.dao.impl.IOrdersDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Orders instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Orders as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#findByOrderTask(java.lang.Object)
	 */
	@Override
	public List findByOrderTask(Object orderTask) {
		return findByProperty(ORDER_TASK, orderTask);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#findByOrderStatus(java.lang.Object)
	 */
	@Override
	public List findByOrderStatus(Object orderStatus) {
		return findByProperty(ORDER_STATUS, orderStatus);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#findByOrderDes(java.lang.Object)
	 */
	@Override
	public List findByOrderDes(Object orderDes) {
		return findByProperty(ORDER_DES, orderDes);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Orders instances");
		try {
			String queryString = "from Orders";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#merge(US.CPS.entity.orders.Orders)
	 */
	@Override
	public Orders merge(Orders detachedInstance) {
		log.debug("merging Orders instance");
		try {
			Orders result = (Orders) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#attachDirty(US.CPS.entity.orders.Orders)
	 */
	@Override
	public void attachDirty(Orders instance) {
		log.debug("attaching dirty Orders instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IOrdersDAO#attachClean(US.CPS.entity.orders.Orders)
	 */
	@Override
	public void attachClean(Orders instance) {
		log.debug("attaching clean Orders instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IOrdersDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IOrdersDAO) ctx.getBean("OrdersDAO");
	}
}