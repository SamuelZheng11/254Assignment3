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
		
	}
	
	@FXML
	private void ManageEquipment() {
		
		loader.setController(new ManageEquipmentController());
		loadScene();
		
	}
	
	@FXML
	private void ManageCustomers() {
		
		loadScene();
		
	}
	
	@FXML
	private void ManageEmployees() {
		
		loadScene();
		
	}
	
	private void loadScene(){
		loader.loadScene("ManageItems.fxml");
	}
	
	@FXML
	private void quit() {
		
		this.stage.fireEvent(new WindowEvent(this.stage, WindowEvent.WINDOW_CLOSE_REQUEST));
		
	}
	
}
