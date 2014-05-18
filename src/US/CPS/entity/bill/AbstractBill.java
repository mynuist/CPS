package US.CPS.entity.bill;

import java.sql.Timestamp;
  
import US.CPS.entity.account.Account;
import US.CPS.entity.orders.Orders;

/**
 * AbstractBill entity provides the base persistence definition of the Bill
 * entity. @author chwu1203
 */

public abstract class AbstractBill implements java.io.Serializable {

	// Fields

	private Integer billId;
	private Account account;
	private Orders orders;
	private Float billCount;
	private Timestamp billTime;

	// Constructors

	/** default constructor */
	public AbstractBill() {
	}

	/** minimal constructor */
	public AbstractBill(Float billCount, Timestamp billTime) {
		this.billCount = billCount;
		this.billTime = billTime;
	}

	/** full constructor */
	public AbstractBill(Account account, Orders orders, Float billCount,
			Timestamp billTime) {
		this.account = account;
		this.orders = orders;
		this.billCount = billCount;
		this.billTime = billTime;
	}

	// Property accessors

	public Integer getBillId() {
		return this.billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Float getBillCount() {
		return this.billCount;
	}

	public void setBillCount(Float billCount) {
		this.billCount = billCount;
	}

	public Timestamp getBillTime() {
		return this.billTime;
	}

	public void setBillTime(Timestamp billTime) {
		this.billTime = billTime;
	}

}