package US.CPS.dao;

import java.util.List;

import US.CPS.entity.userinfo.Userinfo;

public interface IUserinfoDAO {

	// property constants
	public static final String USERINFO_SIGN = "userinfoSign";
	public static final String USERINFO_LAST_LOGIN_IP = "userinfoLastLoginIp";
	public static final String USERINFO_STATUS = "userinfoStatus";

	public abstract void save(Userinfo transientInstance);

	public abstract void delete(Userinfo persistentInstance);

	public abstract Userinfo findById(java.lang.Integer id);

	public abstract List findByExample(Userinfo instance);

	public abstract List findByProperty(String propertyName, Object value);

	public abstract List findByUserinfoSign(Object userinfoSign);

	public abstract List findByUserinfoLastLoginIp(Object userinfoLastLoginIp);

	public abstract List findByUserinfoStatus(Object userinfoStatus);

	public abstract List findAll();

	public abstract Userinfo merge(Userinfo detachedInstance);

	public abstract void attachDirty(Userinfo instance);

	public abstract void attachClean(Userinfo instance);

}