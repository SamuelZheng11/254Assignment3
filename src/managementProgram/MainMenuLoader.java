package managementProgram;

import javafx.stage.Stage;

public class MainMenuLoader extends SceneLoader {

	

	public MainMenuLoader(Stage stage) {

		super(stage);

	}

	public void setController(MainMenuController controller) {

		this.controller = controller;

	}

	protected void useController() {

		this.controller.setStage(this.stage);
		
	}

}