package managementProgram;

import javafx.stage.Stage;

public class MainMenuLoader extends SceneLoader{

	public MainMenuLoader(Stage stage) {
		
		super(stage);
		
	}
	
	protected void useController(MainMenuController controller) {
		controller.setStage(this.stage);
	}
	
}
