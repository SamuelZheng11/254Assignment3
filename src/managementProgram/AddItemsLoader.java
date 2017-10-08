package managementProgram;

import javafx.stage.Stage;

public class AddItemsLoader extends SceneLoader {

	public AddItemsLoader(Stage stage) {

		super(stage);

	}

	public void setController(AddItemsController controller) {

		this.controller = controller;

	}

	protected void useController() {

		this.controller.setStage(this.stage);
		
	}
	
}
