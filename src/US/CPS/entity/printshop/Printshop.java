package US.CPS.entity.printshop;

import java.util.Set;

import US.CPS.entity.district.District;

/**
 * Printshop entity. @author chwu1203
 */
public class Printshop extends AbstractPrintshop implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Printshop() {
	}

	/** minimal constructor */
	public Printshop(District district, String printshopName) {
		super(district, printshopName);
	}

	/** full constructor */
	public Printshop(District district, String printshopName, Set printtasks) {
		super(district, printshopName, printtasks);
	}

}
