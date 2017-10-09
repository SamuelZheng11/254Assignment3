package managementProgram.controllers.equipment;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public abstract class AddComputerController extends AddEquipmentController {

	@FXML
	private TextField systemOS;

	public void setSystemOS(String systemOS) {
		this.systemOS.setText(systemOS);
	}
}
