package managementProgram;

import javafx.stage.Stage;

public class MainMenuLoader extends SceneLoader {

	public MainMenuLoader(Stage stage) {
		
		super(stage);
		
	}
	
	protected void useController(SceneController controller) {
		if(controller instanceof MainMenuController) {
		((MainMenuController) controller).setStage(this.stage);
		}

	}
	
}