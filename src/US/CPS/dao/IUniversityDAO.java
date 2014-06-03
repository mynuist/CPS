package US.CPS.dao;

import java.util.List;

import US.CPS.entity.university.University;

public interface IUniversityDAO {

	// property constants
	public static final String UNIVERSITY_NAME = "universityName";

	public abstract void save(University transientInstance);

	public abstract void delete(University persistentInstance);

	public abstract University findById(java.lang.Integer id);

	public abstract List findByExample(University instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUniversityName(Object universityName);

	public abstract List findAll();

	public abstract University merge(University detachedInstance);

	public abstract void attachDirty(University instance);

	public abstract void attachClean(University instance);

}