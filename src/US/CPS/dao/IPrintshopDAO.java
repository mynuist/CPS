package US.CPS.dao;

import java.util.List;

import US.CPS.entity.printshop.Printshop;

public interface IPrintshopDAO {

	// property constants
	public static final String PRINTSHOP_NAME = "printshopName";

	public abstract void save(Printshop transientInstance);

	public abstract void delete(Printshop persistentInstance);

	public abstract Printshop findById(java.lang.Integer id);

	public abstract List findByExample(Printshop instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByPrintshopName(Object printshopName);

	public abstract List findAll();

	public abstract Printshop merge(Printshop detachedInstance);

	public abstract void attachDirty(Printshop instance);

	public abstract void attachClean(Printshop instance);

}