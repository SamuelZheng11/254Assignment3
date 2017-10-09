package managementProgram.controllers.equipment;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import managementProgram.controllers.SceneController;

public class AddEquipmentTypeController extends SceneController{

	private ManageEquipmentController manageEquipmentController;
	
	@Override
	public void setStage(Stage stage) {
		
		this.stage = stage;
		
	}
	
	public void setParentController(ManageEquipmentController manageEquipmentController) {

		this.manageEquipmentController = manageEquipmentController;
		
	}

	@FXML
	protected void addPrinter() {
		this.manageEquipmentController.addPrinter();
		closeStage();
	}
	
	@FXML
	protected void addDesktop() {
		this.manageEquipmentController.addDesktop();
		closeStage();
	}
	
	@FXML
	protected void addLaptop() {
		this.manageEquipmentController.addLaptop();
		closeStage();
	}
	
	private void closeStage() {
		stage.close();
	}
	
}
