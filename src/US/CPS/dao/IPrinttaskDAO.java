package US.CPS.dao;

import java.util.List;

import US.CPS.entity.printtask.Printtask;

public interface IPrinttaskDAO {

	// property constants
	public static final String PRINT_BOOKING = "printBooking";
	public static final String PRINT_FILE_NAME = "printFileName";
	public static final String PRINT_TASK_STATUS = "printTaskStatus";
	public static final String PRINT_COMMENT = "printComment";
	public static final String PRINT_PAGE_NUMBER = "printPageNumber";

	public abstract void save(Printtask transientInstance);

	public abstract void delete(Printtask persistentInstance);

	public abstract Printtask findById(java.lang.Integer id);

	public abstract List findByExample(Printtask instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByPrintBooking(Object printBooking);

	public abstract List findByPrintFileName(Object printFileName);

	public abstract List findByPrintTaskStatus(Object printTaskStatus);

	public abstract List findByPrintComment(Object printComment);

	public abstract List findByPrintPageNumber(Object printPageNumber);

	public abstract List findAll();

	public abstract Printtask merge(Printtask detachedInstance);

	public abstract void attachDirty(Printtask instance);

	public abstract void attachClean(Printtask instance);

}