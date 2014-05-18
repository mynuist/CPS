package US.CPS.entity.building;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.district.District;

/**
 * AbstractBuilding entity provides the base persistence definition of the
 * Building entity. @author chwu1203
 */

public abstract class AbstractBuilding implements java.io.Serializable {

	// Fields

	private Integer buildingId;
	private District district;
	private String buildingName;
	private Set doms = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractBuilding() {
	}

	/** minimal constructor */
	public AbstractBuilding(District district, String buildingName) {
		this.district = district;
		this.buildingName = buildingName;
	}

	/** full constructor */
	public AbstractBuilding(District district, String buildingName, Set doms) {
		this.district = district;
		this.buildingName = buildingName;
		this.doms = doms;
	}

	// Property accessors

	public Integer getBuildingId() {
		return this.buildingId;
	}

	public void setBuildingId(Integer buildingId) {
		this.buildingId = buildingId;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getBuildingName() {
		return this.buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public Set getDoms() {
		return this.doms;
	}

	public void setDoms(Set doms) {
		this.doms = doms;
	}

}