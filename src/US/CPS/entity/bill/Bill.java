package US.CPS.entity.bill;

import java.sql.Timestamp;

import US.CPS.entity.account.Account;
import US.CPS.entity.orders.Orders;

/**
 * Bill entity. @author chwu1203
 */
public class Bill extends AbstractBill implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Bill() {
	}

	/** minimal constructor */
	public Bill(Float billCount, Timestamp billTime) {
		super(billCount, billTime);
	}

	/** full constructor */
	public Bill(Account account, Orders orders, Float billCount,
			Timestamp billTime) {
		super(account, orders, billCount, billTime);
	}

}
