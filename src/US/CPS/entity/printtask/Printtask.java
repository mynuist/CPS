package US.CPS.entity.printtask;

import java.sql.Timestamp;
import java.util.Set;

import US.CPS.entity.printshop.Printshop;

/**
 * Printtask entity. @author chwu1203
 */
public class Printtask extends AbstractPrinttask implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Printtask() {
	}

	/** minimal constructor */
	public Printtask(Printshop printshop, Integer printBooking,
			String printFileName, Integer printTaskStatus,
			Integer printPageNumber, Timestamp printDeadline) {
		super(printshop, printBooking, printFileName, printTaskStatus,
				printPageNumber, printDeadline);
	}

	/** full constructor */
	public Printtask(Printshop printshop, Integer printBooking,
			Timestamp printRealtime, String printFileName,
			Integer printTaskStatus, String printComment,
			Integer printPageNumber, Timestamp printDeadline, Set orderses) {
		super(printshop, printBooking, printRealtime, printFileName,
				printTaskStatus, printComment, printPageNumber, printDeadline,
				orderses);
	}

}
