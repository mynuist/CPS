package US.CPS.entity.orders;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.account.Account;
import US.CPS.entity.chargemoney.Chargemoney;
import US.CPS.entity.printtask.Printtask;

/**
 * AbstractOrders entity provides the base persistence definition of the Orders
 * entity. @author chwu1203
 */

public abstract class AbstractOrders implements java.io.Serializable {

	// Fields

	private Integer orderId;
	private Account account;
	private Chargemoney chargemoney;
	private Printtask printtask;
	private Timestamp orderSubTime;
	private Timestamp orderHandleTime;
	private Integer orderTask;
	private Integer orderStatus;
	private String orderDes;
	private Set bills = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOrders() {
	}

	/** minimal constructor */
	public AbstractOrders(Timestamp orderSubTime, Integer orderTask,
			Integer orderStatus) {
		this.orderSubTime = orderSubTime;
		this.orderTask = orderTask;
		this.orderStatus = orderStatus;
	}

	/** full constructor */
	public AbstractOrders(Account account, Chargemoney chargemoney,
			Printtask printtask, Timestamp orderSubTime,
			Timestamp orderHandleTime, Integer orderTask, Integer orderStatus,
			String orderDes, Set bills) {
		this.account = account;
		this.chargemoney = chargemoney;
		this.printtask = printtask;
		this.orderSubTime = orderSubTime;
		this.orderHandleTime = orderHandleTime;
		this.orderTask = orderTask;
		this.orderStatus = orderStatus;
		this.orderDes = orderDes;
		this.bills = bills;
	}

	// Property accessors

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Chargemoney getChargemoney() {
		return this.chargemoney;
	}

	public void setChargemoney(Chargemoney chargemoney) {
		this.chargemoney = chargemoney;
	}

	public Printtask getPrinttask() {
		return this.printtask;
	}

	public void setPrinttask(Printtask printtask) {
		this.printtask = printtask;
	}

	public Timestamp getOrderSubTime() {
		return this.orderSubTime;
	}

	public void setOrderSubTime(Timestamp orderSubTime) {
		this.orderSubTime = orderSubTime;
	}

	public Timestamp getOrderHandleTime() {
		return this.orderHandleTime;
	}

	public void setOrderHandleTime(Timestamp orderHandleTime) {
		this.orderHandleTime = orderHandleTime;
	}

	public Integer getOrderTask() {
		return this.orderTask;
	}

	public void setOrderTask(Integer orderTask) {
		this.orderTask = orderTask;
	}

	public Integer getOrderStatus() {
		return this.orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getOrderDes() {
		return this.orderDes;
	}

	public void setOrderDes(String orderDes) {
		this.orderDes = orderDes;
	}

	public Set getBills() {
		return this.bills;
	}

	public void setBills(Set bills) {
		this.bills = bills;
	}

}