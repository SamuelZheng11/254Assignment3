package managementProgram.controllers;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Alert.AlertType;

public abstract class AddItemsController extends SceneController {

	@FXML
	private Button confirm;

	@FXML
	private Button cancel;

	@FXML
	protected void cancel() {

		Alert cancel = new Alert(AlertType.CONFIRMATION);
		cancel.setTitle("Cancel item");
		cancel.setHeaderText("Are you sure you want to cancel the item?");
		cancel.setContentText("By pressing \"OK\" you will cancel the item");

		Optional<ButtonType> result = cancel.showAndWait();
		if (result.get() == ButtonType.OK) {
			returnToManager();
		} else {
			// left empty intentionally
		}
	}

	@FXML
	protected void comfirm() {

		Alert confrim = new Alert(AlertType.INFORMATION);
		confrim.setTitle("Item Saved");
		confrim.setHeaderText("Item saved");
		confrim.setContentText("Item with details have been saved");
		if (isValid()) {
			confrim.showAndWait();
			returnToManager();
		}else {
			Alert unfilledFields = new Alert(AlertType.INFORMATION);
			unfilledFields.setTitle("Please fill in relevent fields");
			unfilledFields.setHeaderText("One or more of the required fields is not filled in");
			unfilledFields.setContentText("please fill in all the required fields");
			unfilledFields.showAndWait();
		}
	}

	// hook method for use in the confirm and cancel buttons
	protected abstract void returnToManager();

	// hook method for checking if the nessasary fields are filled in
	protected abstract boolean isValid();

	// hook method for use for creating the item
	protected abstract void create();

}
