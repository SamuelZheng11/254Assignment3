package managementProgram.sceneAndSceneLoaders;

import javafx.stage.Stage;
import managementProgram.controllers.equipment.AddEquipmentTypeController;

public class AddEquipmentTypeLoader extends SceneLoader {

	public AddEquipmentTypeLoader(Stage stage) {

		super(stage);

	}

	public void setController(AddEquipmentTypeController controller) {

		this.controller = controller;

	}

	protected void useController() {

		this.controller.setStage(this.stage);
		
	}
	
	
}
