package managementProgram.controllers.employees;

import javafx.stage.Stage;
import managementProgram.controllers.SearchItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public class SearchEmployeeController extends SearchItemsController {

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}

	@Override
	protected void returnToManager() {
		ManageEmployeeController controller = new ManageEmployeeController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

}
