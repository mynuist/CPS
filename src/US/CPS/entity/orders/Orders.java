package US.CPS.entity.orders;

import java.sql.Timestamp;
import java.util.Set;

import US.CPS.entity.account.Account;
import US.CPS.entity.chargemoney.Chargemoney;
import US.CPS.entity.printtask.Printtask;

/**
 * Orders entity. @author chwu1203
 */
public class Orders extends AbstractOrders implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** minimal constructor */
	public Orders(Timestamp orderSubTime, Integer orderTask, Integer orderStatus) {
		super(orderSubTime, orderTask, orderStatus);
	}

	/** full constructor */
	public Orders(Account account, Chargemoney chargemoney,
			Printtask printtask, Timestamp orderSubTime,
			Timestamp orderHandleTime, Integer orderTask, Integer orderStatus,
			String orderDes, Set bills) {
		super(account, chargemoney, printtask, orderSubTime, orderHandleTime,
				orderTask, orderStatus, orderDes, bills);
	}

}
