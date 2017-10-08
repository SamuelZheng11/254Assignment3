package managementProgram.controllers.customers;

import javafx.stage.Stage;
import managementProgram.controllers.SearchItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public class SearchCustomerController extends SearchItemsController {

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}

	@Override
	protected void returnToManager() {
		ManageCustomerController controller = new ManageCustomerController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

}
