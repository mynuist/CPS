package US.CPS.entity.major;

import java.util.Set;

import US.CPS.entity.school.School;

/**
 * Major entity. @author chwu1203
 */
public class Major extends AbstractMajor implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Major() {
	}

	/** minimal constructor */
	public Major(School school, String majorName) {
		super(school, majorName);
	}

	/** full constructor */
	public Major(School school, String majorName, Set userinfos) {
		super(school, majorName, userinfos);
	}

}
