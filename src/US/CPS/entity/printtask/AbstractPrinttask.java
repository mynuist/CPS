package US.CPS.entity.printtask;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import US.CPS.entity.printshop.Printshop;

/**
 * AbstractPrinttask entity provides the base persistence definition of the
 * Printtask entity. @author chwu1203
 */

public abstract class AbstractPrinttask implements java.io.Serializable {

	// Fields

	private Integer printTaskId;
	private Printshop printshop;
	private Integer printBooking;
	private Timestamp printRealtime;
	private String printFileName;
	private Integer printTaskStatus;
	private String printComment;
	private Integer printPageNumber;
	private Timestamp printDeadline;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractPrinttask() {
	}

	/** minimal constructor */
	public AbstractPrinttask(Printshop printshop, Integer printBooking,
			String printFileName, Integer printTaskStatus,
			Integer printPageNumber, Timestamp printDeadline) {
		this.printshop = printshop;
		this.printBooking = printBooking;
		this.printFileName = printFileName;
		this.printTaskStatus = printTaskStatus;
		this.printPageNumber = printPageNumber;
		this.printDeadline = printDeadline;
	}

	/** full constructor */
	public AbstractPrinttask(Printshop printshop, Integer printBooking,
			Timestamp printRealtime, String printFileName,
			Integer printTaskStatus, String printComment,
			Integer printPageNumber, Timestamp printDeadline, Set orderses) {
		this.printshop = printshop;
		this.printBooking = printBooking;
		this.printRealtime = printRealtime;
		this.printFileName = printFileName;
		this.printTaskStatus = printTaskStatus;
		this.printComment = printComment;
		this.printPageNumber = printPageNumber;
		this.printDeadline = printDeadline;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getPrintTaskId() {
		return this.printTaskId;
	}

	public void setPrintTaskId(Integer printTaskId) {
		this.printTaskId = printTaskId;
	}

	public Printshop getPrintshop() {
		return this.printshop;
	}

	public void setPrintshop(Printshop printshop) {
		this.printshop = printshop;
	}

	public Integer getPrintBooking() {
		return this.printBooking;
	}

	public void setPrintBooking(Integer printBooking) {
		this.printBooking = printBooking;
	}

	public Timestamp getPrintRealtime() {
		return this.printRealtime;
	}

	public void setPrintRealtime(Timestamp printRealtime) {
		this.printRealtime = printRealtime;
	}

	public String getPrintFileName() {
		return this.printFileName;
	}

	public void setPrintFileName(String printFileName) {
		this.printFileName = printFileName;
	}

	public Integer getPrintTaskStatus() {
		return this.printTaskStatus;
	}

	public void setPrintTaskStatus(Integer printTaskStatus) {
		this.printTaskStatus = printTaskStatus;
	}

	public String getPrintComment() {
		return this.printComment;
	}

	public void setPrintComment(String printComment) {
		this.printComment = printComment;
	}

	public Integer getPrintPageNumber() {
		return this.printPageNumber;
	}

	public void setPrintPageNumber(Integer printPageNumber) {
		this.printPageNumber = printPageNumber;
	}

	public Timestamp getPrintDeadline() {
		return this.printDeadline;
	}

	public void setPrintDeadline(Timestamp printDeadline) {
		this.printDeadline = printDeadline;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}