package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee extends Item {
	
	private final String employeeID;

	private String customerName;
	
	private String equipment;
	
	private final String startDate;
	
	private String duration;
	
	private String endDate;
	
	private String details;
	
	public Employee(String leaseID, String customerName, String equipment, String startDate, String duration, String endDate, String details) {
		
		this.employeeID = leaseID;
		this.customerName = customerName;
		this.equipment = equipment;
		this.startDate = startDate;
		this.duration = duration;
		this.endDate = endDate;
		this.details = details;
		
	}
	
	public String getReadableEmployeeID() {
		return this.employeeID;
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

	public String getReadableDetails() {
		return this.details;
	}
	
	
	
	
	
	public StringProperty getID() {
		return new SimpleStringProperty(this.employeeID);
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

	public StringProperty getDetails() {
		return new SimpleStringProperty(this.details);
	}
	

}
