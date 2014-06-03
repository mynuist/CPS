package US.CPS.dao;

import java.util.List;

import US.CPS.entity.building.Building;

public interface IBuildingDAO {

	// property constants
	public static final String BUILDING_NAME = "buildingName";

	public abstract void save(Building transientInstance);

	public abstract void delete(Building persistentInstance);

	public abstract Building findById(java.lang.Integer id);

	public abstract List findByExample(Building instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBuildingName(Object buildingName);

	public abstract List findAll();

	public abstract Building merge(Building detachedInstance);

	public abstract void attachDirty(Building instance);

	public abstract void attachClean(Building instance);

}