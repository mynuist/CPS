package US.CPS.entity.logs;

import java.sql.Timestamp;

import US.CPS.entity.account.Account;

/**
 * AbstractLogs entity provides the base persistence definition of the Logs
 * entity. @author chwu1203
 */

public abstract class AbstractLogs implements java.io.Serializable {

	// Fields

	private Integer logId;
	private Account account;
	private String logDes;
	private Timestamp logTime;

	// Constructors

	/** default constructor */
	public AbstractLogs() {
	}

	/** full constructor */
	public AbstractLogs(Account account, String logDes, Timestamp logTime) {
		this.account = account;
		this.logDes = logDes;
		this.logTime = logTime;
	}

	// Property accessors

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public Account getAccount() {
		return this.account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getLogDes() {
		return this.logDes;
	}

	public void setLogDes(String logDes) {
		this.logDes = logDes;
	}

	public Timestamp getLogTime() {
		return this.logTime;
	}

	public void setLogTime(Timestamp logTime) {
		this.logTime = logTime;
	}

}