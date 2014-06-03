package US.CPS.entity.paycard;

import java.sql.Timestamp;
import java.util.Set;

/**
 * Paycard entity. @author chwu1203
 */
public class Paycard extends AbstractPaycard implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Paycard() {
	}

	/** minimal constructor */
	public Paycard(String cardNum, Integer cardPassword, Integer cardCount,
			Integer cardStatus, Timestamp cardTime) {
		super(cardNum, cardPassword, cardCount, cardStatus, cardTime);
	}

	/** full constructor */
	public Paycard(String cardNum, Integer cardPassword, Integer cardCount,
			Integer cardStatus, Timestamp cardTime, Set chargemoneies) {
		super(cardNum, cardPassword, cardCount, cardStatus, cardTime,
				chargemoneies);
	}

}
