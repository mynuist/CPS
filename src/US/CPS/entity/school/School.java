package US.CPS.entity.school;

import java.util.Set;

import US.CPS.entity.university.University;

/**
 * School entity. @author chwu1203
 */
public class School extends AbstractSchool implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public School() {
	}

	/** minimal constructor */
	public School(University university, String schoolName) {
		super(university, schoolName);
	}

	/** full constructor */
	public School(University university, String schoolName, Set majors) {
		super(university, schoolName, majors);
	}

}
