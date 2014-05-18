package US.CPS.dao;

import java.util.List;

import US.CPS.entity.school.School;

public interface ISchoolDAO {

	// property constants
	public static final String SCHOOL_NAME = "schoolName";

	public abstract void save(School transientInstance);

	public abstract void delete(School persistentInstance);

	public abstract School findById(java.lang.Integer id);

	public abstract List findByExample(School instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findBySchoolName(Object schoolName);

	public abstract List findAll();

	public abstract School merge(School detachedInstance);

	public abstract void attachDirty(School instance);

	public abstract void attachClean(School instance);

}