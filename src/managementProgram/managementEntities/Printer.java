package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Printer extends Equipment {
	
	protected String ppm;

	
	public Printer(String equipmentID, String year, String weight, String ppm) {

		this.equipmentID = equipmentID;
		this.year = year;
		this.weight = weight;
		this.ppm = ppm;
		setEquipmentType();

	}

	public String getReadablePPM() {
		return this.ppm;
	}
	


	public StringProperty getSystemPPM() {
		return new SimpleStringProperty(this.ppm);
	}



	@Override
	protected void setEquipmentType() {
		this.equipmentType = EquipmentTypes.Printer.toString();
		
	}

}
