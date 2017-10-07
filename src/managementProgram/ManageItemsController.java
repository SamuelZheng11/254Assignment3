package managementProgram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public abstract class ManageItemsController extends SceneController {

	@FXML
	protected Label itemType;
	
	@FXML
	protected abstract void add();
	
	@FXML
	protected abstract void update();
	
	@FXML
	protected abstract void delete();
	
	@FXML
	protected abstract void search();

	public abstract void setStage(Stage stage);
	
	@FXML
	protected final void returnToMainMenu() {
		MainMenuLoader loader = new MainMenuLoader(this.stage);
		MainMenuController controller = new MainMenuController();
		controller.setStage(this.stage);
		loader.setController(controller);
		loader.loadScene("MainMenu.fxml");
	}

}
