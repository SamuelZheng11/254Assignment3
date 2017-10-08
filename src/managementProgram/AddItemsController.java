package managementProgram;

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
		
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Cancel item");
		alert.setHeaderText("Are you sure you want to cancel the item?");
		alert.setContentText("By pressing \"OK\" you will cancel the item");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
			returnToManager();
		} else {
			//left empty intentionally
		}
	}
	
	@FXML
	protected void comfirm() {
		
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Item Created");
		alert.setHeaderText("Item Created");
		alert.setContentText("Item with details have been made");

		alert.showAndWait();
		returnToManager();
	}
	
	//hook method for use in the confirm and cancel buttons
	protected abstract void returnToManager();
	
}
