package US.CPS.entity.printshop;

import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.district.District;

/**
 * AbstractPrintshop entity provides the base persistence definition of the
 * Printshop entity. @author chwu1203
 */

public abstract class AbstractPrintshop implements java.io.Serializable {

	// Fields

	private Integer printshopId;
	private District district;
	private String printshopName;
	private Set printtasks = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPrintshop() {
	}

	/** minimal constructor */
	public AbstractPrintshop(District district, String printshopName) {
		this.district = district;
		this.printshopName = printshopName;
	}

	/** full constructor */
	public AbstractPrintshop(District district, String printshopName,
			Set printtasks) {
		this.district = district;
		this.printshopName = printshopName;
		this.printtasks = printtasks;
	}

	// Property accessors

	public Integer getPrintshopId() {
		return this.printshopId;
	}

	public void setPrintshopId(Integer printshopId) {
		this.printshopId = printshopId;
	}

	public District getDistrict() {
		return this.district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public String getPrintshopName() {
		return this.printshopName;
	}

	public void setPrintshopName(String printshopName) {
		this.printshopName = printshopName;
	}

	public Set getPrinttasks() {
		return this.printtasks;
	}

	public void setPrinttasks(Set printtasks) {
		this.printtasks = printtasks;
	}

}