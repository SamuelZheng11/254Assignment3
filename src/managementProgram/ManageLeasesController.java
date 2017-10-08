package managementProgram;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ManageLeasesController extends ManageItemsController{
	
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	protected void add() {
		
		AddLeaseController controller = new AddLeaseController();
		controller.setStage(this.stage);
		AddItemsLoader loader = new AddItemsLoader(this.stage);
		loader.setController(controller);
		loader.loadScene("AddNewLease.fxml");
		
	}
	
	@FXML
	protected void update() {
		
	}
	
	@FXML
	protected void delete()	{
		
	}
	
	@FXML
	protected void search()	{
		
	}
	
}
