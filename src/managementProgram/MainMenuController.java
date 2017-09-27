package managementProgram;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class MainMenuController extends SceneController{

	private Stage stage;
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	@FXML
	private void ManageLease() {
		
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.loadScene("ManageItems.fxml");
		
	}
	
	@FXML
	private void ManageEquipment() {
		
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.loadScene("ManageItems.fxml");
		
	}
	
	@FXML
	private void ManageCustomers() {
		
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.loadScene("ManageItems.fxml");
		
	}
	
	@FXML
	private void ManageEmployees() {
		
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.loadScene("ManageItems.fxml");
		
	}
	
	@FXML
	private void quit() {
		
		this.stage.fireEvent(new WindowEvent(this.stage, WindowEvent.WINDOW_CLOSE_REQUEST));
		
	}
	
}
