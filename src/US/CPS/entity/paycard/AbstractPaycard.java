package US.CPS.entity.paycard;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * AbstractPaycard entity provides the base persistence definition of the
 * Paycard entity. @author chwu1203
 */

public abstract class AbstractPaycard implements java.io.Serializable {

	// Fields

	private Integer cardId;
	private String cardNum;
	private Integer cardPassword;
	private Integer cardCount;
	private Integer cardStatus;
	private Timestamp cardTime;
	private Set chargemoneies = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPaycard() {
	}

	/** minimal constructor */
	public AbstractPaycard(String cardNum, Integer cardPassword,
			Integer cardCount, Integer cardStatus, Timestamp cardTime) {
		this.cardNum = cardNum;
		this.cardPassword = cardPassword;
		this.cardCount = cardCount;
		this.cardStatus = cardStatus;
		this.cardTime = cardTime;
	}

	/** full constructor */
	public AbstractPaycard(String cardNum, Integer cardPassword,
			Integer cardCount, Integer cardStatus, Timestamp cardTime,
			Set chargemoneies) {
		this.cardNum = cardNum;
		this.cardPassword = cardPassword;
		this.cardCount = cardCount;
		this.cardStatus = cardStatus;
		this.cardTime = cardTime;
		this.chargemoneies = chargemoneies;
	}

	// Property accessors

	public Integer getCardId() {
		return this.cardId;
	}

	public void setCardId(Integer cardId) {
		this.cardId = cardId;
	}

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public Integer getCardPassword() {
		return this.cardPassword;
	}

	public void setCardPassword(Integer cardPassword) {
		this.cardPassword = cardPassword;
	}

	public Integer getCardCount() {
		return this.cardCount;
	}

	public void setCardCount(Integer cardCount) {
		this.cardCount = cardCount;
	}

	public Integer getCardStatus() {
		return this.cardStatus;
	}

	public void setCardStatus(Integer cardStatus) {
		this.cardStatus = cardStatus;
	}

	public Timestamp getCardTime() {
		return this.cardTime;
	}

	public void setCardTime(Timestamp cardTime) {
		this.cardTime = cardTime;
	}

	public Set getChargemoneies() {
		return this.chargemoneies;
	}

	public void setChargemoneies(Set chargemoneies) {
		this.chargemoneies = chargemoneies;
	}

}