package managementProgram.controllers;

import javafx.stage.Stage;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public class SearchLeaseController extends SearchItemsController {

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}
	
	@Override
	protected void returnToManager() {
		ManageLeasesController controller = new ManageLeasesController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

}
