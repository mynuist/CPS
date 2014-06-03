package US.CPS.dao;

import java.util.List;

import US.CPS.entity.major.Major;

public interface IMajorDAO {

	// property constants
	public static final String MAJOR_NAME = "majorName";

	public abstract void save(Major transientInstance);

	public abstract void delete(Major persistentInstance);

	public abstract Major findById(java.lang.Integer id);

	public abstract List findByExample(Major instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByMajorName(Object majorName);

	public abstract List findAll();

	public abstract Major merge(Major detachedInstance);

	public abstract void attachDirty(Major instance);

	public abstract void attachClean(Major instance);

}