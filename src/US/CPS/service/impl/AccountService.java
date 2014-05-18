package US.CPS.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import US.CPS.dao.IAccountDAO;
import US.CPS.entity.account.Account;
import US.CPS.entity.userinfo.Userinfo;
import US.CPS.service.IAccountService;

public class AccountService implements IAccountService {

	@Autowired
	private IAccountDAO accountDAO;
	
	/* (non-Javadoc)
	 * @see US.CPS.service.impl.IAccountService#registerAccount(US.CPS.entity.account.Account, US.CPS.entity.userinfo.Userinfo)
	 */
	@Override
	@Transactional
	public boolean registerAccount(Account account, Userinfo userinfo) {
		accountDAO.save(account);
		//userinfo.save();
		return true;
	}
}
