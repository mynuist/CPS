package US.CPS.entity.userinfo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.dom.Dom;
import US.CPS.entity.major.Major;

/**
 * AbstractUserinfo entity provides the base persistence definition of the
 * Userinfo entity. @author chwu1203
 */

public abstract class AbstractUserinfo implements java.io.Serializable {

	// Fields

	private Integer userinfoId;
	private Dom dom;
	private Major major;
	private String userinfoSign;
	private Timestamp userinfoRegisterTime;
	private Timestamp userinfoLastLoginTime;
	private String userinfoLastLoginIp;
	private Integer userinfoStatus;
	private Set accounts = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUserinfo() {
	}

	/** minimal constructor */
	public AbstractUserinfo(Dom dom, Major major,
			Timestamp userinfoRegisterTime, Timestamp userinfoLastLoginTime,
			String userinfoLastLoginIp, Integer userinfoStatus) {
		this.dom = dom;
		this.major = major;
		this.userinfoRegisterTime = userinfoRegisterTime;
		this.userinfoLastLoginTime = userinfoLastLoginTime;
		this.userinfoLastLoginIp = userinfoLastLoginIp;
		this.userinfoStatus = userinfoStatus;
	}

	/** full constructor */
	public AbstractUserinfo(Dom dom, Major major, String userinfoSign,
			Timestamp userinfoRegisterTime, Timestamp userinfoLastLoginTime,
			String userinfoLastLoginIp, Integer userinfoStatus, Set accounts) {
		this.dom = dom;
		this.major = major;
		this.userinfoSign = userinfoSign;
		this.userinfoRegisterTime = userinfoRegisterTime;
		this.userinfoLastLoginTime = userinfoLastLoginTime;
		this.userinfoLastLoginIp = userinfoLastLoginIp;
		this.userinfoStatus = userinfoStatus;
		this.accounts = accounts;
	}

	// Property accessors

	public Integer getUserinfoId() {
		return this.userinfoId;
	}

	public void setUserinfoId(Integer userinfoId) {
		this.userinfoId = userinfoId;
	}

	public Dom getDom() {
		return this.dom;
	}

	public void setDom(Dom dom) {
		this.dom = dom;
	}

	public Major getMajor() {
		return this.major;
	}

	public void setMajor(Major major) {
		this.major = major;
	}

	public String getUserinfoSign() {
		return this.userinfoSign;
	}

	public void setUserinfoSign(String userinfoSign) {
		this.userinfoSign = userinfoSign;
	}

	public Timestamp getUserinfoRegisterTime() {
		return this.userinfoRegisterTime;
	}

	public void setUserinfoRegisterTime(Timestamp userinfoRegisterTime) {
		this.userinfoRegisterTime = userinfoRegisterTime;
	}

	public Timestamp getUserinfoLastLoginTime() {
		return this.userinfoLastLoginTime;
	}

	public void setUserinfoLastLoginTime(Timestamp userinfoLastLoginTime) {
		this.userinfoLastLoginTime = userinfoLastLoginTime;
	}

	public String getUserinfoLastLoginIp() {
		return this.userinfoLastLoginIp;
	}

	public void setUserinfoLastLoginIp(String userinfoLastLoginIp) {
		this.userinfoLastLoginIp = userinfoLastLoginIp;
	}

	public Integer getUserinfoStatus() {
		return this.userinfoStatus;
	}

	public void setUserinfoStatus(Integer userinfoStatus) {
		this.userinfoStatus = userinfoStatus;
	}

	public Set getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Set accounts) {
		this.accounts = accounts;
	}

}