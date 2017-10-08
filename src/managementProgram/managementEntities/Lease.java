package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Lease extends Item {

	private final String leaseID;

	private String customerName;

	private String equipment;

	private final String startDate;

	private String duration;

	private String endDate;

	private String dateOfEntry;

	private String leaseRate;

	private String leaseAmount;

	private String securityDeposit;

	private String details;

	public Lease(String leaseID, String customerName, String equipment, String startDate, String duration,
			String endDate, String dateOfEntry, String leaseRate, String leaseAmount, String securityDeposit,
			String details) {

		this.leaseID = leaseID;
		this.customerName = customerName;
		this.equipment = equipment;
		this.startDate = startDate;
		this.duration = duration;
		this.endDate = endDate;
		this.dateOfEntry = dateOfEntry;
		this.leaseRate = leaseRate;
		this.leaseAmount = leaseAmount;
		this.securityDeposit = securityDeposit;
		this.details = details;

	}

	public String getReadableLeaseID() {
		return this.leaseID;
	}

	public String getReadableCustomerName() {
		return this.customerName;
	}

	public String getReadableEquipment() {
		return this.equipment;
	}

	public String getReadableStartDate() {
		return this.startDate;
	}

	public String getReadableDuration() {
		return this.duration;
	}

	public String getReadableEndDate() {
		return this.endDate;
	}

	public String getReadableDateOfEntry() {
		return this.dateOfEntry;
	}

	public String getReadableLeaseRate() {
		return this.leaseRate;
	}

	public String getReadableLeaseAmount() {
		return this.leaseAmount;
	}

	public String getReadableSecurityDeposit() {
		return this.securityDeposit;
	}

	public String getReadableDetails() {
		return this.details;
	}

	public StringProperty getID() {
		return new SimpleStringProperty(this.leaseID);
	}

	public StringProperty getCustomerName() {
		return new SimpleStringProperty(this.customerName);
	}

	public StringProperty getEquipment() {
		return new SimpleStringProperty(this.equipment);
	}

	public StringProperty getStartDate() {
		return new SimpleStringProperty(this.startDate);
	}

	public StringProperty getDuration() {
		return new SimpleStringProperty(this.duration);
	}

	public StringProperty getEndDate() {
		return new SimpleStringProperty(this.endDate);
	}

	public StringProperty getDateOfEntry() {
		return new SimpleStringProperty(this.dateOfEntry);
	}

	public StringProperty getLeaseRate() {
		return new SimpleStringProperty(this.leaseRate);
	}

	public StringProperty getLeaseAmount() {
		return new SimpleStringProperty(this.leaseAmount);
	}

	public StringProperty getSecurityDeposit() {
		return new SimpleStringProperty(this.securityDeposit);
	}

	public StringProperty getDetails() {
		return new SimpleStringProperty(this.details);
	}

}
