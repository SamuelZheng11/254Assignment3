package managementProgram.sceneAndSceneLoaders;

import javafx.stage.Stage;
import managementProgram.controllers.ManageItemsController;

public class ManageItemsLoader extends SceneLoader {

	public ManageItemsLoader(Stage stage) {

		super(stage);

	}

	public void setController(ManageItemsController controller) {

		this.controller = controller;

	}

	protected void useController() {

		this.controller.setStage(this.stage);

	}

}
