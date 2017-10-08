package managementProgram;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddLeaseController extends AddItemsController {

	@FXML
	private TextField leaseID;

	@FXML
	private TextField customerName;

	@FXML
	private TextField equipment;

	@FXML
	private TextField startDate;

	@FXML
	private TextField duration;

	@FXML
	private TextField endDate;

	@FXML
	private TextArea details;

	@Override
	protected void setStage(Stage stage) {

		this.stage = stage;

		// Initially making the confirm button disabled
		//confirm.setDisable(true);

	}
	
	public boolean isValid() {
		if((this.leaseID == null) || (this.customerName == null) || (this.equipment == null) || (this.startDate == null ) ||(this.duration == null ) || (this.endDate == null)) {
			return false;
		}
		return true;
	}
	
	public void create() {
		//in future this would be implemented and based to the manager
	}
	
	protected void returnToManager() {
		ManageLeasesController controller = new ManageLeasesController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
	}

}