package managementProgram.controllers.equipment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import managementProgram.controllers.ManageItemsController;
import managementProgram.managementEntities.Desktop;
import managementProgram.managementEntities.Item;
import managementProgram.managementEntities.Laptop;
import managementProgram.managementEntities.ManageItemTypes;
import managementProgram.managementEntities.Printer;
import managementProgram.sceneAndSceneLoaders.AddEquipmentTypeLoader;
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

		Stage equipmentSelection = new Stage();

		equipmentSelection.initModality(Modality.WINDOW_MODAL);

		AddEquipmentTypeController controller = new AddEquipmentTypeController();
		controller.setParentController(this);
		controller.setStage(equipmentSelection);
		AddEquipmentTypeLoader loader = new AddEquipmentTypeLoader(equipmentSelection);
		loader.setController(controller);
		loader.loadScene("AddEquipmentType.fxml");

		equipmentSelection.initOwner(this.stage.getScene().getWindow());
		equipmentSelection.show();

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
		} else if (this.tableView.getSelectionModel().getSelectedItem() instanceof Desktop) {
			
			AddDesktopController controller = new AddDesktopController();
			controller.setStage(this.stage);
			AddItemsLoader loader = new AddItemsLoader(this.stage);
			loader.setController(controller);
			loader.loadScene("AddComputer.fxml");

			Desktop selectedItem = (Desktop) this.tableView.getSelectionModel().getSelectedItem();
			controller.setEquipmentID(selectedItem.getReadableEquipmentID());
			controller.setEquipmentType(selectedItem.getReadableEquipmentType());
			controller.setYear(selectedItem.getReadableYear());
			controller.setWeight(selectedItem.getReadableWeight());
			controller.setSystemOS(selectedItem.getReadableSystemOS());
			
		} else if (this.tableView.getSelectionModel().getSelectedItem() instanceof Laptop) {
			
			AddLaptopController controller = new AddLaptopController();
			controller.setStage(this.stage);
			AddItemsLoader loader = new AddItemsLoader(this.stage);
			loader.setController(controller);
			loader.loadScene("AddComputer.fxml");

			Laptop selectedItem = (Laptop) this.tableView.getSelectionModel().getSelectedItem();
			controller.setEquipmentID(selectedItem.getReadableEquipmentID());
			controller.setEquipmentType(selectedItem.getReadableEquipmentType());
			controller.setYear(selectedItem.getReadableYear());
			controller.setWeight(selectedItem.getReadableWeight());
			controller.setSystemOS(selectedItem.getReadableSystemOS());
			
		} else if (this.tableView.getSelectionModel().getSelectedItem() instanceof Printer) {
			
			AddPrinterController controller = new AddPrinterController();
			controller.setStage(this.stage);
			AddItemsLoader loader = new AddItemsLoader(this.stage);
			loader.setController(controller);
			loader.loadScene("AddPrinter.fxml");

			Printer selectedItem = (Printer) this.tableView.getSelectionModel().getSelectedItem();
			controller.setEquipmentID(selectedItem.getReadableEquipmentID());
			controller.setEquipmentType(selectedItem.getReadableEquipmentType());
			controller.setYear(selectedItem.getReadableYear());
			controller.setWeight(selectedItem.getReadableWeight());
			controller.setPPM(selectedItem.getReadablePPM());
		}

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

		Laptop demo1 = new Laptop("238749238", "2007", "5kg", "Linux");
		Desktop demo2 = new Desktop("9874923", "2008", "8kg", "Windows");
		Printer demo3 = new Printer("320874023", "1990", "50kg", "20");
		this.customers.add(demo1);
		this.customers.add(demo2);
		this.customers.add(demo3);

		this.tableView.setItems(customers);

	}

	// method for relaying to the reader what the instance of the manager is of
	@Override
	protected void setItemType() {

		this.managerType.setText("Manage " + ManageItemTypes.Equipment.toString());

	}

	protected void addPrinter() {

		AddPrinterController controller = new AddPrinterController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddPrinter.fxml");

	}

	protected void addDesktop() {

		AddDesktopController controller = new AddDesktopController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddComputer.fxml");

	}

	protected void addLaptop() {

		AddLaptopController controller = new AddLaptopController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddComputer.fxml");

	}

}
