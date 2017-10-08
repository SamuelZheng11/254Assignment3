package managementProgram.controllers;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import managementProgram.managementEntities.Item;
import managementProgram.managementEntities.Lease;
import managementProgram.sceneAndSceneLoaders.MainMenuLoader;

public abstract class ManageItemsController extends SceneController {

	@FXML
	protected TableView<Lease> tableView;

	@FXML
	protected Label managerType;
	
	@FXML
	protected TableColumn<Lease, String> tableColumn;

	@FXML
	public void initialize() {
		this.tableColumn.setCellValueFactory(cellData -> cellData.getValue().getLeaseID());
		this.tableColumn.setText("ID");
		setItemType();
	}

	@FXML
	protected abstract void add();

	@FXML
	protected abstract void update();

	@FXML
	protected final void delete() {

		Item selectedItem = this.tableView.getSelectionModel().getSelectedItem();

		if (!(selectedItem == null)) {
			Alert cancel = new Alert(AlertType.CONFIRMATION);
			cancel.setTitle("Delete item");
			cancel.setHeaderText("You are about to delete an item, are you sure?");
			cancel.setContentText("By pressing \"OK\" you will delete the item");

			Optional<ButtonType> result = cancel.showAndWait();
			if (result.get() == ButtonType.OK) {
				Alert unfilledFields = new Alert(AlertType.INFORMATION);
				unfilledFields.setTitle("Item Deleted");
				unfilledFields.setHeaderText("Item deleted");
				unfilledFields.setContentText("You have successfully deleted the item");
				unfilledFields.showAndWait();
			} else {
				Alert unfilledFields = new Alert(AlertType.INFORMATION);
				unfilledFields.setTitle("Delete Aborted");
				unfilledFields.setHeaderText("You have canceled the delete");
				unfilledFields.setContentText("No Items were deleted");
				unfilledFields.showAndWait();
			}
			return;
		}
		Alert unfilledFields = new Alert(AlertType.INFORMATION);
		unfilledFields.setTitle("Please select and item");
		unfilledFields.setHeaderText("You have not selected an item to delete");
		unfilledFields.setContentText("Please select before pressing the delete button");
		unfilledFields.showAndWait();

	}

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

	// protected abstract methods that children will override to make clear what
	// manager the instance is of
	protected abstract void setItemType();
	
}
