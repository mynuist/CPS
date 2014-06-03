package US.CPS.entity.chargemoney;

import java.sql.Timestamp;
import java.util.Set;

import US.CPS.entity.paycard.Paycard;

/**
 * Chargemoney entity. @author chwu1203
 */
public class Chargemoney extends AbstractChargemoney implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Chargemoney() {
	}

	/** minimal constructor */
	public Chargemoney(Float chargemoneyCount, Timestamp chargemoneyDatetime) {
		super(chargemoneyCount, chargemoneyDatetime);
	}

	/** full constructor */
	public Chargemoney(Paycard paycard, Float chargemoneyCount,
			Timestamp chargemoneyDatetime, Set orderses) {
		super(paycard, chargemoneyCount, chargemoneyDatetime, orderses);
	}

}
