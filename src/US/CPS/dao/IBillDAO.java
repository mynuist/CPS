package US.CPS.dao;

import java.util.List;

import US.CPS.entity.bill.Bill;

public interface IBillDAO {

	// property constants
	public static final String BILL_COUNT = "billCount";

	public abstract void save(Bill transientInstance);

	public abstract void delete(Bill persistentInstance);

	public abstract Bill findById(java.lang.Integer id);

	public abstract List findByExample(Bill instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByBillCount(Object billCount);

	public abstract List findAll();

	public abstract Bill merge(Bill detachedInstance);

	public abstract void attachDirty(Bill instance);

	public abstract void attachClean(Bill instance);

}