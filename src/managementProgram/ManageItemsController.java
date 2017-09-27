package managementProgram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ManageItemsController extends SceneController {

	private Stage stage;
	@FXML
	private Label name;
	
	public void setStage(Stage stage) {
		this.stage = stage;
		this.name.setText("Manage Leases");
	}
	
//	@FXML
//	public abstract void add();
//	
//	@FXML
//	public abstract void update();
//	
//	@FXML
//	public abstract void delete();
//	
//	@FXML
//	public abstract void search();
	
	@FXML
	public void returnToMainMenu() {
		MainMenuLoader loader = new MainMenuLoader(this.stage);
		loader.loadScene("MainMenu.fxml");
	}
	
}
