package US.CPS.dao;

import java.util.List;

import US.CPS.entity.district.District;

public interface IDistrictDAO {

	// property constants
	public static final String DISTRICT_NAME = "districtName";

	public abstract void save(District transientInstance);

	public abstract void delete(District persistentInstance);

	public abstract District findById(java.lang.Integer id);

	public abstract List findByExample(District instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByDistrictName(Object districtName);

	public abstract List findAll();

	public abstract District merge(District detachedInstance);

	public abstract void attachDirty(District instance);

	public abstract void attachClean(District instance);

}