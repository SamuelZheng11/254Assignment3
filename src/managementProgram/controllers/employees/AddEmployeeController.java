package managementProgram.controllers.employees;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import managementProgram.controllers.AddItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public class AddEmployeeController extends AddItemsController {

	
	@FXML
	private TextField staffID;

	@FXML
	private TextField staffName;

	@FXML
	private TextField address;

	@FXML
	private TextField email;

	@FXML
	private TextField contactNumber;

	@FXML
	private TextField irdNumber;

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}
	
	public boolean isValid() {
		if((this.staffID == null) || (this.staffName == null) || (this.email == null ) ||(this.address == null ) || (this.contactNumber == null) || (this.irdNumber == null)) {
			return false;
		}
		return true;
	}
	
	public void create() {
		//in future this would be implemented and based to the manager
	}
	
	protected void returnToManager() {
		ManageEmployeeController controller = new ManageEmployeeController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

	public void setStaffID(String staffID) {
		this.staffID.setText(staffID);
	}

	public void setStaffName(String staffName) {
		this.staffName.setText(staffName);
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber.setText(contactNumber);
	}

	public void setEmail(String email) {
		this.email.setText(email);
	}

	public void setAddress(String address) {
		this.address.setText(address);
	}

	public void setIRDNumber(String irdNumber) {
		this.irdNumber.setText(irdNumber);
	}


}
