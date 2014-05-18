package US.CPS.dao;

import java.util.List;

import US.CPS.entity.logs.Logs;

public interface ILogsDAO {

	// property constants
	public static final String LOG_DES = "logDes";

	public abstract void save(Logs transientInstance);

	public abstract void delete(Logs persistentInstance);

	public abstract Logs findById(java.lang.Integer id);

	public abstract List findByExample(Logs instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByLogDes(Object logDes);

	public abstract List findAll();

	public abstract Logs merge(Logs detachedInstance);

	public abstract void attachDirty(Logs instance);

	public abstract void attachClean(Logs instance);

}