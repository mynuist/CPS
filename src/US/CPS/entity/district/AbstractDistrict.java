package US.CPS.entity.district;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.university.University;

/**
 * AbstractDistrict entity provides the base persistence definition of the
 * District entity. @author chwu1203
 */

public abstract class AbstractDistrict implements java.io.Serializable {

	// Fields

	private Integer districtId;
	private University university;
	private String districtName;
	private Set printshops = new HashSet(0);
	private Set buildings = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDistrict() {
	}

	/** minimal constructor */
	public AbstractDistrict(University university, String districtName) {
		this.university = university;
		this.districtName = districtName;
	}

	/** full constructor */
	public AbstractDistrict(University university, String districtName,
			Set printshops, Set buildings) {
		this.university = university;
		this.districtName = districtName;
		this.printshops = printshops;
		this.buildings = buildings;
	}

	// Property accessors

	public Integer getDistrictId() {
		return this.districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getDistrictName() {
		return this.districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public Set getPrintshops() {
		return this.printshops;
	}

	public void setPrintshops(Set printshops) {
		this.printshops = printshops;
	}

	public Set getBuildings() {
		return this.buildings;
	}

	public void setBuildings(Set buildings) {
		this.buildings = buildings;
	}

}