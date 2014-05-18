package US.CPS.dao.impl;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import US.CPS.dao.IBuildingDAO;
import US.CPS.entity.building.Building;

/**
 * A data access object (DAO) providing persistence and search support for
 * Building entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see US.CPS.entity.building.Building
 * @author chwu1203
 */

public class BuildingDAO extends HibernateDaoSupport implements IBuildingDAO {
	private static final Log log = LogFactory.getLog(BuildingDAO.class);
	protected void initDao() {
		// do nothing
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#save(US.CPS.entity.building.Building)
	 */
	@Override
	public void save(Building transientInstance) {
		log.debug("saving Building instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#delete(US.CPS.entity.building.Building)
	 */
	@Override
	public void delete(Building persistentInstance) {
		log.debug("deleting Building instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#findById(java.lang.Integer)
	 */
	@Override
	public Building findById(java.lang.Integer id) {
		log.debug("getting Building instance with id: " + id);
		try {
			Building instance = (Building) getHibernateTemplate().get(
					"US.CPS.entity.building.Building", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#findByExample(US.CPS.entity.building.Building)
	 */
	@Override
	public List findByExample(Building instance) {
		log.debug("finding Building instance by example");
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
	 * @see US.CPS.dao.impl.IBuildingDAO#findByProperty(java.lang.String, java.lang.Object)
	 */
	@Override
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Building instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Building as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#findByBuildingName(java.lang.Object)
	 */
	@Override
	public List findByBuildingName(Object buildingName) {
		return findByProperty(BUILDING_NAME, buildingName);
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#findAll()
	 */
	@Override
	public List findAll() {
		log.debug("finding all Building instances");
		try {
			String queryString = "from Building";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#merge(US.CPS.entity.building.Building)
	 */
	@Override
	public Building merge(Building detachedInstance) {
		log.debug("merging Building instance");
		try {
			Building result = (Building) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#attachDirty(US.CPS.entity.building.Building)
	 */
	@Override
	public void attachDirty(Building instance) {
		log.debug("attaching dirty Building instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	/* (non-Javadoc)
	 * @see US.CPS.dao.impl.IBuildingDAO#attachClean(US.CPS.entity.building.Building)
	 */
	@Override
	public void attachClean(Building instance) {
		log.debug("attaching clean Building instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static IBuildingDAO getFromApplicationContext(ApplicationContext ctx) {
		return (IBuildingDAO) ctx.getBean("BuildingDAO");
	}
}