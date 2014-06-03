package US.CPS.entity.dom;

import java.util.Set;

import US.CPS.entity.building.Building;

/**
 * Dom entity. @author chwu1203
 */
public class Dom extends AbstractDom implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Dom() {
	}

	/** minimal constructor */
	public Dom(Building building, String domNumber) {
		super(building, domNumber);
	}

	/** full constructor */
	public Dom(Building building, String domNumber, Set userinfos) {
		super(building, domNumber, userinfos);
	}

}
