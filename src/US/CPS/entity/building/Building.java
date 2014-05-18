package US.CPS.entity.building;

import java.util.Set;

import US.CPS.entity.district.District;

/**
 * Building entity. @author chwu1203
 */
public class Building extends AbstractBuilding implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Building() {
	}

	/** minimal constructor */
	public Building(District district, String buildingName) {
		super(district, buildingName);
	}

	/** full constructor */
	public Building(District district, String buildingName, Set doms) {
		super(district, buildingName, doms);
	}

}
