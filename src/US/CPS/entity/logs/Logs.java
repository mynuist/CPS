package US.CPS.entity.logs;

import java.sql.Timestamp;

import US.CPS.entity.account.Account;

/**
 * Logs entity. @author chwu1203
 */
public class Logs extends AbstractLogs implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Logs() {
	}

	/** full constructor */
	public Logs(Account account, String logDes, Timestamp logTime) {
		super(account, logDes, logTime);
	}

}
