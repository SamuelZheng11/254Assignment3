package managementProgram.controllers.equipment;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import managementProgram.controllers.AddItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public abstract class AddEquipmentController extends AddItemsController {

	@FXML
	protected TextField equipmentID;

	@FXML
	protected TextField equipmentType;

	@FXML
	protected TextField year;

	@FXML
	protected TextField weight;

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}
	
	@FXML
	public void initialize() {
		setEquipmentType();
	}


	public boolean isValid() {
		if ((this.equipmentID == null) || (this.year == null)
				|| (this.weight == null)) {
			return false;
		}
		return true;
	}

	public void create() {
		// in future this would be implemented and based to the manager
	}

	protected void returnToManager() {
		ManageEquipmentController controller = new ManageEquipmentController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

	public void setEquipmentID(String equipmentID) {
		this.equipmentID.setText(equipmentID);
	}

	public void setEquipmentType(String equipmentType) {
		this.equipmentType.setText(equipmentType);
	}

	public void setYear(String year) {
		this.year.setText(year);
	}

	public void setWeight(String weight) {
		this.weight.setText(weight);
	}
	
	protected abstract void setEquipmentType();

}
