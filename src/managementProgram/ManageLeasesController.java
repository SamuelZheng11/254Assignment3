package managementProgram;

import javafx.fxml.FXML;
import javafx.stage.Stage;

public class ManageLeasesController extends ManageItemsController{
	
	public void setStage(Stage stage) {
		this.stage = stage;
		super.setManageType(ManageItemTypes.Leases);
	}
	
	protected void add() {
		Stage addWindow = new Stage();
		SceneLoader loader = new SceneLoader(addWindow);
		loader.loadScene("AddNewLease.fxml");
		addWindow.show();
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
