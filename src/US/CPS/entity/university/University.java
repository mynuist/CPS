package US.CPS.entity.university;

import java.util.Set;

/**
 * University entity. @author chwu1203
 */
public class University extends AbstractUniversity implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public University() {
	}

	/** minimal constructor */
	public University(String universityName) {
		super(universityName);
	}

	/** full constructor */
	public University(String universityName, Set districts, Set schools) {
		super(universityName, districts, schools);
	}

}
