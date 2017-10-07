package managementProgram;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public abstract class ManageItemsController extends SceneController {

	@FXML
	protected Label name = new Label();
	
	protected void setManageType(ManageItemTypes manageItemType) {
		this.name.setText("Manage " + manageItemType.toString());
	}
	
	@FXML
	protected abstract void add();
	
	@FXML
	protected abstract void update();
	
	@FXML
	protected abstract void delete();
	
	@FXML
	protected abstract void search();

	public abstract void setStage(Stage stage);

}
