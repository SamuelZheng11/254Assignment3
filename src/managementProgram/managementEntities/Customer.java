package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Customer extends Item {
	
	private final String CustomerID;

	private String customerName;
	
	private String contactNumber;
	
	private String email;
	
	private String address;
	
	private String companyOrOrganization;
	
	private String creditCard;
	
	public Customer(String CustomerID, String customerName, String contactNumber, String email, String address, String companyOrOrganization, String creditCard) {
		
		this.CustomerID = CustomerID;
		this.customerName = customerName;
		this.contactNumber = contactNumber;
		this.email = email;
		this.address = address;
		this.companyOrOrganization = companyOrOrganization;
		this.creditCard = creditCard;
		
	}
	
	public String getReadableCustomerID() {
		return this.CustomerID;
	}
	
	public String getReadableCustomerName() {
		return this.customerName;
	}

	public String getReadableContactNumber() {
		return this.contactNumber;
	}

	public String getReadableEmail() {
		return this.email;
	}
	
	public String getReadableAddress() {
		return this.address;
	}

	public String getReadableCompanyOrOrganization() {
		return this.companyOrOrganization;
	}

	public String getReadableCreditCard() {
		return this.creditCard;
	}
	
	
	
	
	
	public StringProperty getID() {
		return new SimpleStringProperty(this.CustomerID);
	}

	public StringProperty getCustomerName() {
		return new SimpleStringProperty(this.customerName);
	}

	public StringProperty getContactNumber() {
		return new SimpleStringProperty(this.contactNumber);
	}

	public StringProperty getEmail() {
		return new SimpleStringProperty(this.email);
	}

	public StringProperty getAddress() {
		return new SimpleStringProperty(this.address);
	}

	public StringProperty getCompanyOrOrganization() {
		return new SimpleStringProperty(this.companyOrOrganization);
	}

	public StringProperty getCreditCard() {
		return new SimpleStringProperty(this.creditCard);
	}
	

}
