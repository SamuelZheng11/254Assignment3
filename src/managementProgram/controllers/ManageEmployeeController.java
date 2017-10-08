package managementProgram.controllers;

import javafx.fxml.FXML;
import javafx.stage.Stage;
import managementProgram.managementEntities.ManageItemTypes;

public class ManageEmployeeController extends ManageItemsController {

	@FXML
	public void initialize() {
		super.initialize();
	}
	
	@Override
	protected void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void search() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStage(Stage stage) {
		
		this.stage = stage;
		
	}
	
	// method for relaying to the reader what the instance of the manager is of
	@Override
	protected void setItemType() {
		
		this.managerType.setText("Manage " + ManageItemTypes.Employees.toString());

	}

}
