package managementProgram;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainMenuController extends SceneController{

	private Stage stage;
	private ManageItemsLoader loader;
	
	public void setStage(Stage stage) {
		this.stage = stage;
		this.loader = new ManageItemsLoader(this.stage);
	}
	
	@FXML
	private void ManageLease() {

		ManageLeasesController controller = new ManageLeasesController();
		controller.setStage(this.stage);
		loader.setController(controller);
		loadScene();
		controller.setupDemo();
	}
	
	@FXML
	private void ManageEquipment() {
		
		
	}
	
	@FXML
	private void ManageCustomers() {
		
		
	}
	
	@FXML
	private void ManageEmployees() {

		
	}
	
	private void loadScene(){
		loader.loadScene("ManageItems.fxml");
	}
	
	@FXML
	private void quit() {
		
		this.stage.fireEvent(new WindowEvent(this.stage, WindowEvent.WINDOW_CLOSE_REQUEST));
		
	}
	
}
