package US.CPS.dao;

import java.util.List;

import US.CPS.entity.account.Account;

public interface IAccountDAO {

	// property constants
	public static final String USER_NAME = "userName";
	public static final String USER_SEX = "userSex";
	public static final String USER_PHONE = "userPhone";
	public static final String USER_EMAIL = "userEmail";
	public static final String USER_OLD = "userOld";
	public static final String USER_MONEY = "userMoney";

	public abstract void save(Account transientInstance);

	public abstract void delete(Account persistentInstance);

	public abstract Account findById(java.lang.Integer id);

	public abstract List findByExample(Account instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUserName(Object userName);

	public abstract List findByUserSex(Object userSex);

	public abstract List findByUserPhone(Object userPhone);

	public abstract List findByUserEmail(Object userEmail);

	public abstract List findByUserOld(Object userOld);

	public abstract List findByUserMoney(Object userMoney);

	public abstract List findAll();

	public abstract Account merge(Account detachedInstance);

	public abstract void attachDirty(Account instance);

	public abstract void attachClean(Account instance);

}