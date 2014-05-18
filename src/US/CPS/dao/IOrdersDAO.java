package US.CPS.dao;

import java.util.List;

import US.CPS.entity.orders.Orders;

public interface IOrdersDAO {

	// property constants
	public static final String ORDER_TASK = "orderTask";
	public static final String ORDER_STATUS = "orderStatus";
	public static final String ORDER_DES = "orderDes";

	public abstract void save(Orders transientInstance);

	public abstract void delete(Orders persistentInstance);

	public abstract Orders findById(java.lang.Integer id);

	public abstract List findByExample(Orders instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByOrderTask(Object orderTask);

	public abstract List findByOrderStatus(Object orderStatus);

	public abstract List findByOrderDes(Object orderDes);

	public abstract List findAll();

	public abstract Orders merge(Orders detachedInstance);

	public abstract void attachDirty(Orders instance);

	public abstract void attachClean(Orders instance);

}