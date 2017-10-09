package managementProgram.controllers.equipment;

import managementProgram.managementEntities.EquipmentTypes;

public class AddLaptopController extends AddComputerController {


	@Override
	protected void setEquipmentType() {
		this.equipmentType.setText(EquipmentTypes.Laptop.toString());
		
	}
	
}
