package US.CPS.entity.school;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.university.University;

/**
 * AbstractSchool entity provides the base persistence definition of the School
 * entity. @author chwu1203
 */

public abstract class AbstractSchool implements java.io.Serializable {

	// Fields

	private Integer schoolId;
	private University university;
	private String schoolName;
	private Set majors = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractSchool() {
	}

	/** minimal constructor */
	public AbstractSchool(University university, String schoolName) {
		this.university = university;
		this.schoolName = schoolName;
	}

	/** full constructor */
	public AbstractSchool(University university, String schoolName, Set majors) {
		this.university = university;
		this.schoolName = schoolName;
		this.majors = majors;
	}

	// Property accessors

	public Integer getSchoolId() {
		return this.schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
	}

	public University getUniversity() {
		return this.university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	public String getSchoolName() {
		return this.schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public Set getMajors() {
		return this.majors;
	}

	public void setMajors(Set majors) {
		this.majors = majors;
	}

}