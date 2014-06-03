package US.CPS.entity.userinfo;

import java.sql.Timestamp;
import java.util.Set;

import US.CPS.entity.dom.Dom;
import US.CPS.entity.major.Major;

/**
 * Userinfo entity. @author chwu1203
 */
public class Userinfo extends AbstractUserinfo implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Userinfo() {
	}

	/** minimal constructor */
	public Userinfo(Dom dom, Major major, Timestamp userinfoRegisterTime,
			Timestamp userinfoLastLoginTime, String userinfoLastLoginIp,
			Integer userinfoStatus) {
		super(dom, major, userinfoRegisterTime, userinfoLastLoginTime,
				userinfoLastLoginIp, userinfoStatus);
	}

	/** full constructor */
	public Userinfo(Dom dom, Major major, String userinfoSign,
			Timestamp userinfoRegisterTime, Timestamp userinfoLastLoginTime,
			String userinfoLastLoginIp, Integer userinfoStatus, Set accounts) {
		super(dom, major, userinfoSign, userinfoRegisterTime,
				userinfoLastLoginTime, userinfoLastLoginIp, userinfoStatus,
				accounts);
	}

}
