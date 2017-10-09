package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Equipment extends Item {

	protected String equipmentID;

	protected String equipmentType;

	protected String year;

	protected String weight;
	

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
	
	
	protected abstract void setEquipmentType();

}
