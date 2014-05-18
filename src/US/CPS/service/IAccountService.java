package US.CPS.service;

import org.springframework.transaction.annotation.Transactional;

import US.CPS.entity.account.Account;
import US.CPS.entity.userinfo.Userinfo;

public interface IAccountService {

	@Transactional
	public abstract boolean registerAccount(Account account, Userinfo userinfo);

}