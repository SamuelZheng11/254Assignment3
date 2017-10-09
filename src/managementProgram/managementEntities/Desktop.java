package managementProgram.managementEntities;

public class Desktop extends Computer {

	
	public Desktop(String equipmentID, String year, String weight, String systemOS) {

		this.equipmentID = equipmentID;
		this.year = year;
		this.weight = weight;
		this.systemOS = systemOS;
		setEquipmentType();

	}

	@Override
	protected void setEquipmentType() {
		this.equipmentType = EquipmentTypes.Desktop.toString();
		
	}
}
