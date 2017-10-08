package managementProgram.controllers;

import javafx.stage.Stage;

public abstract class SceneController {

	protected Stage stage;


	// //methods that call the hooks so that all
	// @FXML
	// protected final void add() {
	//
	// }
	//
	// @FXML
	// protected final void update() {
	//
	// }
	//
	// @FXML
	// protected final void delete() {
	//
	// }
	//
	// @FXML
	// protected final void search() {
	//
	// }
	//
	// // methods that subclasses of this abstract class must have so that this
	// class
	// // can call them as a hook method
	// protected abstract void addHook();
	//
	// protected abstract void updateHook();
	//
	// protected abstract void deleteHook();
	//
	// protected abstract void searchHook();

	public abstract void setStage(Stage stage);
}
