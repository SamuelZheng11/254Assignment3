package managementProgram.controllers.equipment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import managementProgram.controllers.ManageItemsController;
import managementProgram.managementEntities.Customer;
import managementProgram.managementEntities.Equipment;
import managementProgram.managementEntities.Item;
import managementProgram.managementEntities.ManageItemTypes;
import managementProgram.sceneAndSceneLoaders.AddItemsLoader;
import managementProgram.sceneAndSceneLoaders.SearchItemsLoader;

public class ManageEquipmentController extends ManageItemsController {

	protected ObservableList<Item> customers = FXCollections.observableArrayList();

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}

	@FXML
	public void initialize() {
		super.initialize();
	}

	@Override
	protected void add() {

		AddEquipmentController controller = new AddEquipmentController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddCustomer.fxml");

	}

	@Override
	protected void update() {

		if (this.tableView.getSelectionModel().getSelectedItem() == null) {
			Alert unfilledFields = new Alert(AlertType.INFORMATION);
			unfilledFields.setTitle("Please select and item");
			unfilledFields.setHeaderText("You have not selected an item to update");
			unfilledFields.setContentText("Please select before pressing the update button");
			unfilledFields.showAndWait();
			return;
		}

		AddEquipmentController controller = new AddEquipmentController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddCustomer.fxml");

		Equipment selectedItem = (Equipment) this.tableView.getSelectionModel().getSelectedItem();
		controller.setEquipmentID(selectedItem.getReadableEquipmentID());
		controller.setEquipmentType(selectedItem.getReadableEquipmentType());
		controller.setYear(selectedItem.getReadableYear());
		controller.setWeight(selectedItem.getReadableWeight());

	}

	@Override
	protected void search() {
		SearchEquipmentController controller = new SearchEquipmentController();
		controller.setStage(this.stage);
		SearchItemsLoader loader = new SearchItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("SearchEquipment.fxml");

	}

	public void setupDemo() {
		
//		Customer demo1 = new Customer("435345", "Mark", "1231231", "mark@google.com", "65 street", "Google", "23423");
//		Customer demo2 = new Customer("43534", "Jack", "342342", "jack@facebook.com", "66 street", "Facebook", "364");
//		this.customers.add(demo1);
//		this.customers.add(demo2);
//
//		this.tableView.setItems(customers);

	}

	// method for relaying to the reader what the instance of the manager is of
	@Override
	protected void setItemType() {

		this.managerType.setText("Manage " + ManageItemTypes.Equipment.toString());

	}

}
