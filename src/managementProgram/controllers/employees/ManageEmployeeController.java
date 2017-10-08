package managementProgram.controllers.employees;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import managementProgram.controllers.ManageItemsController;
import managementProgram.managementEntities.Employee;
import managementProgram.managementEntities.Item;
import managementProgram.managementEntities.ManageItemTypes;
import managementProgram.sceneAndSceneLoaders.AddItemsLoader;
import managementProgram.sceneAndSceneLoaders.SearchItemsLoader;

public class ManageEmployeeController extends ManageItemsController {

	protected ObservableList<Item> Employees = FXCollections.observableArrayList();

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

		AddEmployeeController controller = new AddEmployeeController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddEmployee.fxml");

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

		AddEmployeeController controller = new AddEmployeeController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddEmployee.fxml");

		Employee selectedItem = (Employee) this.tableView.getSelectionModel().getSelectedItem();
		controller.setStaffID(selectedItem.getReadableStaffID());
		controller.setStaffName(selectedItem.getReadableStaffName());
		controller.setContactNumber(selectedItem.getReadableContactNumber());
		controller.setEmail(selectedItem.getReadableEmail());
		controller.setAddress(selectedItem.getReadableAddress());
		controller.setIRDNumber(selectedItem.getReadableIRDNumber());

	}

	@Override
	protected void search() {

		SearchEmployeeController controller = new SearchEmployeeController();
		controller.setStage(this.stage);
		SearchItemsLoader loader = new SearchItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("SearchEmployee.fxml");

	}

	public void setupDemo() {
		Employee demo1 = new Employee("8534", "Jenny", "54 street", "mark@google.com", "4535234", "23894723");
		Employee demo2 = new Employee("0485739", "Zain", "51 street", "jack@facebook.com", "24324234", "2394823");
		this.Employees.add(demo1);
		this.Employees.add(demo2);

		this.tableView.setItems(Employees);

	}

	// method for relaying to the reader what the instance of the manager is of
	@Override
	protected void setItemType() {

		this.managerType.setText("Manage " + ManageItemTypes.Employees.toString());

	}

}
