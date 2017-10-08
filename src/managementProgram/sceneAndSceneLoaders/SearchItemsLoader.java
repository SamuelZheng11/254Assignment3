package managementProgram.sceneAndSceneLoaders;

import javafx.stage.Stage;
import managementProgram.controllers.SearchItemsController;

public class SearchItemsLoader extends SceneLoader{
	
	public SearchItemsLoader(Stage stage) {

		super(stage);

	}

	public void setController(SearchItemsController controller) {

		this.controller = controller;

	}

	protected void useController() {

		this.controller.setStage(this.stage);
		
	}
}
