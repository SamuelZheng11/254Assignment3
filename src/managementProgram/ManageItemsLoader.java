package managementProgram;

import javafx.stage.Stage;

public class ManageItemsLoader extends SceneLoader {

	private ManageItemsController controller;

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
