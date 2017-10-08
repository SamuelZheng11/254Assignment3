package managementProgram.controllers.equipment;

import javafx.stage.Stage;
import managementProgram.controllers.SearchItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public class SearchEquipmentController extends SearchItemsController {

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}

	@Override
	protected void returnToManager() {
		ManageEquipmentController controller = new ManageEquipmentController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

}
