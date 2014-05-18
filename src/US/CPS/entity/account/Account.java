package US.CPS.entity.account;

import java.util.Set;

import US.CPS.entity.userinfo.Userinfo;

/**
 * Account entity. @author chwu1203
 */
public class Account extends AbstractAccount implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Account() {
	}

	/** minimal constructor */
	public Account(String userName, Boolean userSex, Long userPhone,
			String userEmail, Integer userOld, Float userMoney) {
		super(userName, userSex, userPhone, userEmail, userOld, userMoney);
	}

	/** full constructor */
	public Account(Userinfo userinfo, String userName, Boolean userSex,
			Long userPhone, String userEmail, Integer userOld, Float userMoney,
			Set orderses, Set bills, Set logses) {
		super(userinfo, userName, userSex, userPhone, userEmail, userOld,
				userMoney, orderses, bills, logses);
	}

}
