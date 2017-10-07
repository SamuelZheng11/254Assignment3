package managementProgram;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneLoader {

	protected Stage stage;
	protected SceneController controller;
	
	public SceneLoader(Stage stage) {
		this.stage = stage;
	}
	
	public final void loadScene(String fileName) {
		
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(this.getClass().getResource(fileName));
		loader.setController(controller);
		
		Parent layout = null;
		
		try {
			
			layout = loader.load();
			
			useController();
			
		}catch(IOException ioe){
			
			ioe.printStackTrace();
			
			System.exit(1);
		}
		
		Scene scene = new Scene(layout);
		this.stage.setScene(scene);
		
	}
	
	// Optional hook method
	protected void useController() {}
	
}
