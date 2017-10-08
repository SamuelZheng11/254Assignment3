package managementProgram.controllers.leases;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import managementProgram.controllers.ManageItemsController;
import managementProgram.managementEntities.Item;
import managementProgram.managementEntities.Lease;
import managementProgram.managementEntities.ManageItemTypes;
import managementProgram.sceneAndSceneLoaders.AddItemsLoader;
import managementProgram.sceneAndSceneLoaders.SearchItemsLoader;

public class ManageLeasesController extends ManageItemsController {

	protected ObservableList<Item> leases = FXCollections.observableArrayList();

	public void setStage(Stage stage) {
		this.stage = stage;

	}

	@FXML
	public void initialize() {
		super.initialize();
	}

	@FXML
	protected void add() {

		AddLeaseController controller = new AddLeaseController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddNewLease.fxml");

	}

	@FXML
	protected void search() {

		SearchLeaseController controller = new SearchLeaseController();
		controller.setStage(this.stage);
		SearchItemsLoader loader = new SearchItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("SearchLease.fxml");

	}

	public void setupDemo() {
		Lease demo1 = new Lease("202020", "Mark", "Computer", "31 Dec 2016", "1 week", "7 Jan 2017", "30 Dec 2016", "5%", "$1000", "$1000", "details");
		Lease demo2 = new Lease("20403020", "Jack", "Computer", "1 Nov 2016", "2 week", "15 Nov 2016", "31 Oct 2016", "5%", "$1000", "$1000", "details");
		this.leases.add(demo1);
		this.leases.add(demo2);

		this.tableView.setItems(leases);

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

		AddLeaseController controller = new AddLeaseController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddNewLease.fxml");

		Lease selectedItem = (Lease) this.tableView.getSelectionModel().getSelectedItem();
		controller.setLeaseID(selectedItem.getReadableLeaseID());
		controller.setCustomerName(selectedItem.getReadableCustomerName());
		controller.setEquipment(selectedItem.getReadableEquipment());
		controller.setStartDate(selectedItem.getReadableStartDate());
		controller.setDuration(selectedItem.getReadableDuration());
		controller.setEndDate(selectedItem.getReadableEndDate());
		controller.setDateOfEntry(selectedItem.getReadableDateOfEntry());
		controller.setLeaseRate(selectedItem.getReadableLeaseRate());
		controller.setLeaseAmount(selectedItem.getReadableLeaseAmount());
		controller.setSecurityDeposit(selectedItem.getReadableSecurityDeposit());
		controller.setDetails(selectedItem.getReadableDetails());

	}

	// method for relaying to the reader what the instance of the manager is of
	@Override
	protected void setItemType() {

		this.managerType.setText("Manage " + ManageItemTypes.Leases.toString());

	}

}
