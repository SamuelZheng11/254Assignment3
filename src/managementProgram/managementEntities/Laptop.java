package managementProgram.managementEntities;

public class Laptop extends Computer {

	
	public Laptop(String equipmentID, String year, String weight, String systemOS) {

		this.equipmentID = equipmentID;
		this.year = year;
		this.weight = weight;
		this.systemOS = systemOS;
		setEquipmentType();

	}

	@Override
	protected void setEquipmentType() {
		this.equipmentType = EquipmentTypes.Laptop.toString();
		
	}
}
