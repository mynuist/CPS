package US.CPS.dao;

import java.util.List;

import US.CPS.entity.chargemoney.Chargemoney;

public interface IChargemoneyDAO {

	// property constants
	public static final String CHARGEMONEY_COUNT = "chargemoneyCount";

	public abstract void save(Chargemoney transientInstance);

	public abstract void delete(Chargemoney persistentInstance);

	public abstract Chargemoney findById(java.lang.Integer id);

	public abstract List findByExample(Chargemoney instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByChargemoneyCount(Object chargemoneyCount);

	public abstract List findAll();

	public abstract Chargemoney merge(Chargemoney detachedInstance);

	public abstract void attachDirty(Chargemoney instance);

	public abstract void attachClean(Chargemoney instance);

}