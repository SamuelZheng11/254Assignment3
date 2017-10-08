package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Equipment extends Item {

	private final String equipmentID;

	private String equipmentType;

	private String year;

	private String weight;

	public Equipment(String equipmentID, String equipmentType, String year, String weight) {

		this.equipmentID = equipmentID;
		this.equipmentType = equipmentType;
		this.year = year;
		this.weight = weight;

	}

	public String getReadableEquipmentID() {
		return this.equipmentID;
	}

	public String getReadableEquipmentType() {
		return this.equipmentType;
	}

	public String getReadableYear() {
		return this.year;
	}

	public String getReadableWeight() {
		return this.weight;
	}
	//
	// public String getReadableDuration() {
	// return this.duration;
	// }
	//
	// public String getReadableEndDate() {
	// return this.endDate;
	// }
	//
	// public String getReadableDetails() {
	// return this.details;
	// }

	public StringProperty getID() {
		return new SimpleStringProperty(this.equipmentID);
	}

	public StringProperty getEquipmentType() {
		return new SimpleStringProperty(this.equipmentType);
	}

	public StringProperty getYear() {
		return new SimpleStringProperty(this.year);
	}

	public StringProperty getWeight() {
		return new SimpleStringProperty(this.weight);
	}

	// public StringProperty getDuration() {
	// return new SimpleStringProperty(this.duration);
	// }
	//
	// public StringProperty getEndDate() {
	// return new SimpleStringProperty(this.endDate);
	// }
	//
	// public StringProperty getDetails() {
	// return new SimpleStringProperty(this.details);
	// }
	//

}
