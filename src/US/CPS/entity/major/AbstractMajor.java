package US.CPS.entity.major;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.school.School;

/**
 * AbstractMajor entity provides the base persistence definition of the Major
 * entity. @author chwu1203
 */

public abstract class AbstractMajor implements java.io.Serializable {

	// Fields

	private Integer majorId;
	private School school;
	private String majorName;
	private Set userinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractMajor() {
	}

	/** minimal constructor */
	public AbstractMajor(School school, String majorName) {
		this.school = school;
		this.majorName = majorName;
	}

	/** full constructor */
	public AbstractMajor(School school, String majorName, Set userinfos) {
		this.school = school;
		this.majorName = majorName;
		this.userinfos = userinfos;
	}

	// Property accessors

	public Integer getMajorId() {
		return this.majorId;
	}

	public void setMajorId(Integer majorId) {
		this.majorId = majorId;
	}

	public School getSchool() {
		return this.school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getMajorName() {
		return this.majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

}