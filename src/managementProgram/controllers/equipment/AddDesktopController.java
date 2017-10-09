package managementProgram.controllers.equipment;

import managementProgram.managementEntities.EquipmentTypes;

public class AddDesktopController extends AddComputerController{
	
	@Override
	protected void setEquipmentType() {
		this.equipmentType.setText(EquipmentTypes.Desktop.toString());
		
	}
	

}
