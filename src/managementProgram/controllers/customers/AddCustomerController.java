package managementProgram.controllers.customers;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import managementProgram.controllers.AddItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

public class AddCustomerController extends AddItemsController {

	
	@FXML
	private TextField customerID;

	@FXML
	private TextField customerName;

	@FXML
	private TextField contactNumber;

	@FXML
	private TextField email;

	@FXML
	private TextField address;

	@FXML
	private TextField companyOrOrganization;

	@FXML
	private TextField creditCard;

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

	}
	
	public boolean isValid() {
		if((this.customerID == null) || (this.customerName == null) || (this.contactNumber == null) || (this.email == null ) ||(this.address == null ) || (this.companyOrOrganization == null)) {
			return false;
		}
		return true;
	}
	
	public void create() {
		//in future this would be implemented and based to the manager
	}
	
	protected void returnToManager() {
		ManageCustomerController controller = new ManageCustomerController();
		controller.setStage(this.stage);
		ManageItemsLoader loader = new ManageItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("ManageItems.fxml");
		controller.setupDemo();
	}

	public void setCustomerID(String customerID) {
		this.customerID.setText(customerID);
	}

	public void setCustomerName(String customerName) {
		this.customerName.setText(customerName);
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

	public void setCompanyOrOrganization(String companyOrOrganization) {
		this.companyOrOrganization.setText(companyOrOrganization);
	}

	public void setCreditCard(String creditCard) {
		this.creditCard.setText(creditCard);
	}


}
