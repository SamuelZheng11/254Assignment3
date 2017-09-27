package managementProgram;

import javafx.stage.Stage;

public class ManageItemsLoader extends SceneLoader {
	
	public ManageItemsLoader(Stage stage) {
		
		super(stage);
		
	}
	
	protected void useController( SceneController controller) {
		if( controller instanceof ManageItemsController) {
			controller = (ManageItemsController) controller;
			((ManageItemsController) controller).setStage(this.stage);
		}else {
			System.out.println("failed");
		}

	}
	
}
