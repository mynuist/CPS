package US.CPS.entity.dom;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.building.Building;

/**
 * AbstractDom entity provides the base persistence definition of the Dom
 * entity. @author chwu1203
 */

public abstract class AbstractDom implements java.io.Serializable {

	// Fields

	private Integer domId;
	private Building building;
	private String domNumber;
	private Set userinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDom() {
	}

	/** minimal constructor */
	public AbstractDom(Building building, String domNumber) {
		this.building = building;
		this.domNumber = domNumber;
	}

	/** full constructor */
	public AbstractDom(Building building, String domNumber, Set userinfos) {
		this.building = building;
		this.domNumber = domNumber;
		this.userinfos = userinfos;
	}

	// Property accessors

	public Integer getDomId() {
		return this.domId;
	}

	public void setDomId(Integer domId) {
		this.domId = domId;
	}

	public Building getBuilding() {
		return this.building;
	}

	public void setBuilding(Building building) {
		this.building = building;
	}

	public String getDomNumber() {
		return this.domNumber;
	}

	public void setDomNumber(String domNumber) {
		this.domNumber = domNumber;
	}

	public Set getUserinfos() {
		return this.userinfos;
	}

	public void setUserinfos(Set userinfos) {
		this.userinfos = userinfos;
	}

}