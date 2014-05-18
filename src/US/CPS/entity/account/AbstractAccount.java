package US.CPS.entity.account;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.userinfo.Userinfo;

/**
 * AbstractAccount entity provides the base persistence definition of the
 * Account entity. @author chwu1203
 */

public abstract class AbstractAccount implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Userinfo userinfo;
	private String userName;
	private Boolean userSex;
	private Long userPhone;
	private String userEmail;
	private Integer userOld;
	private Float userMoney;
	private Set orderses = new HashSet(0);
	private Set bills = new HashSet(0);
	private Set logses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractAccount() {
	}

	/** minimal constructor */
	public AbstractAccount(String userName, Boolean userSex, Long userPhone,
			String userEmail, Integer userOld, Float userMoney) {
		this.userName = userName;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userOld = userOld;
		this.userMoney = userMoney;
	}

	/** full constructor */
	public AbstractAccount(Userinfo userinfo, String userName, Boolean userSex,
			Long userPhone, String userEmail, Integer userOld, Float userMoney,
			Set orderses, Set bills, Set logses) {
		this.userinfo = userinfo;
		this.userName = userName;
		this.userSex = userSex;
		this.userPhone = userPhone;
		this.userEmail = userEmail;
		this.userOld = userOld;
		this.userMoney = userMoney;
		this.orderses = orderses;
		this.bills = bills;
		this.logses = logses;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Userinfo getUserinfo() {
		return this.userinfo;
	}

	public void setUserinfo(Userinfo userinfo) {
		this.userinfo = userinfo;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Boolean getUserSex() {
		return this.userSex;
	}

	public void setUserSex(Boolean userSex) {
		this.userSex = userSex;
	}

	public Long getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(Long userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserEmail() {
		return this.userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserOld() {
		return this.userOld;
	}

	public void setUserOld(Integer userOld) {
		this.userOld = userOld;
	}

	public Float getUserMoney() {
		return this.userMoney;
	}

	public void setUserMoney(Float userMoney) {
		this.userMoney = userMoney;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getBills() {
		return this.bills;
	}

	public void setBills(Set bills) {
		this.bills = bills;
	}

	public Set getLogses() {
		return this.logses;
	}

	public void setLogses(Set logses) {
		this.logses = logses;
	}

}