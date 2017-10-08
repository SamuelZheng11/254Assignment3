package managementProgram.controllers;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import managementProgram.controllers.customers.ManageCustomerController;
import managementProgram.controllers.employees.ManageEmployeeController;
import managementProgram.controllers.leases.ManageLeasesController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

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
		
		ManageEquipmentController controller = new ManageEquipmentController();
		controller.setStage(this.stage);
		loader.setController(controller);
		loadScene();
		
	}
	
	@FXML
	private void ManageCustomers() {
		
		ManageCustomerController controller = new ManageCustomerController();
		controller.setStage(this.stage);
		loader.setController(controller);
		loadScene();
		controller.setupDemo();
		
	}
	
	@FXML
	private void ManageEmployees() {

		ManageEmployeeController controller = new ManageEmployeeController();
		controller.setStage(this.stage);
		loader.setController(controller);
		loadScene();
		controller.setupDemo();
		
	}
	
	private void loadScene(){
		loader.loadScene("ManageItems.fxml");
	}
	
	@FXML
	private void quit() {
		
		this.stage.fireEvent(new WindowEvent(this.stage, WindowEvent.WINDOW_CLOSE_REQUEST));
		
	}
	
}
