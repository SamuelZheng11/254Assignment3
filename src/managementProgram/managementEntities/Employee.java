package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Employee extends Item {
	
	private final String staffID;

	private String staffName;
	
	private String address;
	
	private final String email;
	
	private String contactNumber;
	
	private String irdNumber;
	
	public Employee(String staffID, String staffName, String address, String email, String contactNumber, String irdNumber) {
		
		this.staffID = staffID;
		this.staffName = staffName;
		this.address = address;
		this.email = email;
		this.contactNumber = contactNumber;
		this.irdNumber = irdNumber;
		
	}
	
	public String getReadableStaffID() {
		return this.staffID;
	}
	
	public String getReadableStaffName() {
		return this.staffName;
	}

	public String getReadableAddress() {
		return this.address;
	}

	public String getReadableEmail() {
		return this.email;
	}
	
	public String getReadableContactNumber() {
		return this.contactNumber;
	}

	public String getReadableIRDNumber() {
		return this.irdNumber;
	}
	
	
	
	
	
	public StringProperty getID() {
		return new SimpleStringProperty(this.staffID);
	}

	public StringProperty getStaffName() {
		return new SimpleStringProperty(this.staffName);
	}

	public StringProperty getAddress() {
		return new SimpleStringProperty(this.address);
	}

	public StringProperty getEmail() {
		return new SimpleStringProperty(this.email);
	}

	public StringProperty getContactNumber() {
		return new SimpleStringProperty(this.contactNumber);
	}

	public StringProperty getIRDNumber() {
		return new SimpleStringProperty(this.irdNumber);
	}
	

}
