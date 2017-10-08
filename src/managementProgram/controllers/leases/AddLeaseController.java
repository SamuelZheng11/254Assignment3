package managementProgram.controllers.leases;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import managementProgram.controllers.AddItemsController;
import managementProgram.sceneAndSceneLoaders.ManageItemsLoader;

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
	private TextField dateOfEntry;
	
	@FXML
	private TextField leaseRate;
	
	@FXML
	private TextField leaseAmount;
	
	@FXML
	private TextField securityDeposit;

	@FXML
	private TextArea details;

	@Override
	public void setStage(Stage stage) {

		this.stage = stage;

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
		controller.setupDemo();
	}

	public void setLeaseID(String leaseID) {
		this.leaseID.setText(leaseID);
	}

	public void setCustomerName(String customerName) {
		this.customerName.setText(customerName);
	}

	public void setEquipment(String equipment) {
		this.equipment.setText(equipment);
	}

	public void setStartDate(String startDate) {
		this.startDate.setText(startDate);
	}

	public void setDuration(String duration) {
		this.duration.setText(duration);
	}

	public void setEndDate(String endDate) {
		this.endDate.setText(endDate);
	}
	
	public void setDateOfEntry(String dateOfEntry) {
		this.dateOfEntry.setText(dateOfEntry);
	}
	
	public void setLeaseRate(String leaseRate) {
		this.leaseRate.setText(leaseRate);
	}
	
	public void setLeaseAmount(String leaseAmount) {
		this.leaseAmount.setText(leaseAmount);
	}
	
	public void setSecurityDeposit(String securityDeposit) {
		this.securityDeposit.setText(securityDeposit);
	}

	public void setDetails(String details) {
		this.details.setText(details);
	}


}
