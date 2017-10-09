package managementProgram.controllers.equipment;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import managementProgram.managementEntities.EquipmentTypes;

public class AddPrinterController extends AddEquipmentController {

	@FXML
	private TextField ppm;
	
	@Override
	protected void setEquipmentType() {
		this.ppm.setText(EquipmentTypes.Printer.toString());
		
	}
	
	public void setPPM(String ppm) {
		this.ppm.setText(ppm);
	}

}
