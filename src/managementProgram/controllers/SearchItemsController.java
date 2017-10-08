package managementProgram.controllers;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;

public abstract class SearchItemsController extends SceneController {

	@FXML
	private Button cancel;

	@FXML
	protected void cancel() {

		Alert cancel = new Alert(AlertType.CONFIRMATION);
		cancel.setTitle("Cancel item");
		cancel.setHeaderText("Are you sure you want to cancel the search?");
		cancel.setContentText("By pressing \"OK\" you will cancel the search");

		Optional<ButtonType> result = cancel.showAndWait();
		if (result.get() == ButtonType.OK) {
			returnToManager();
		} else {
			// left empty intentionally
		}
	}
	
	// hook method for use in the confirm and cancel buttons
	protected abstract void returnToManager();
	
}
