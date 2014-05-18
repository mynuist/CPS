package US.CPS.entity.chargemoney;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.paycard.Paycard;

/**
 * AbstractChargemoney entity provides the base persistence definition of the
 * Chargemoney entity. @author chwu1203
 */

public abstract class AbstractChargemoney implements java.io.Serializable {

	// Fields

	private Integer chargemoneyId;
	private Paycard paycard;
	private Float chargemoneyCount;
	private Timestamp chargemoneyDatetime;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractChargemoney() {
	}

	/** minimal constructor */
	public AbstractChargemoney(Float chargemoneyCount,
			Timestamp chargemoneyDatetime) {
		this.chargemoneyCount = chargemoneyCount;
		this.chargemoneyDatetime = chargemoneyDatetime;
	}

	/** full constructor */
	public AbstractChargemoney(Paycard paycard, Float chargemoneyCount,
			Timestamp chargemoneyDatetime, Set orderses) {
		this.paycard = paycard;
		this.chargemoneyCount = chargemoneyCount;
		this.chargemoneyDatetime = chargemoneyDatetime;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getChargemoneyId() {
		return this.chargemoneyId;
	}

	public void setChargemoneyId(Integer chargemoneyId) {
		this.chargemoneyId = chargemoneyId;
	}

	public Paycard getPaycard() {
		return this.paycard;
	}

	public void setPaycard(Paycard paycard) {
		this.paycard = paycard;
	}

	public Float getChargemoneyCount() {
		return this.chargemoneyCount;
	}

	public void setChargemoneyCount(Float chargemoneyCount) {
		this.chargemoneyCount = chargemoneyCount;
	}

	public Timestamp getChargemoneyDatetime() {
		return this.chargemoneyDatetime;
	}

	public void setChargemoneyDatetime(Timestamp chargemoneyDatetime) {
		this.chargemoneyDatetime = chargemoneyDatetime;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}