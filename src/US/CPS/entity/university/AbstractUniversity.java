package US.CPS.entity.university;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractUniversity entity provides the base persistence definition of the
 * University entity. @author chwu1203
 */

public abstract class AbstractUniversity implements java.io.Serializable {

	// Fields

	private Integer universityId;
	private String universityName;
	private Set districts = new HashSet(0);
	private Set schools = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractUniversity() {
	}

	/** minimal constructor */
	public AbstractUniversity(String universityName) {
		this.universityName = universityName;
	}

	/** full constructor */
	public AbstractUniversity(String universityName, Set districts, Set schools) {
		this.universityName = universityName;
		this.districts = districts;
		this.schools = schools;
	}

	// Property accessors

	public Integer getUniversityId() {
		return this.universityId;
	}

	public void setUniversityId(Integer universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return this.universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public Set getDistricts() {
		return this.districts;
	}

	public void setDistricts(Set districts) {
		this.districts = districts;
	}

	public Set getSchools() {
		return this.schools;
	}

	public void setSchools(Set schools) {
		this.schools = schools;
	}

}