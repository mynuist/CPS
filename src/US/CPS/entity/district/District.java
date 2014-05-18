package US.CPS.entity.district;

import java.util.Set;

import US.CPS.entity.university.University;

/**
 * District entity. @author chwu1203
 */
public class District extends AbstractDistrict implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public District() {
	}

	/** minimal constructor */
	public District(University university, String districtName) {
		super(university, districtName);
	}

	/** full constructor */
	public District(University university, String districtName, Set printshops,
			Set buildings) {
		super(university, districtName, printshops, buildings);
	}

}
