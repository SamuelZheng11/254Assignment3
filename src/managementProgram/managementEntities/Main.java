package managementProgram.managementEntities;
	
import javafx.application.Application;
import javafx.stage.Stage;
import managementProgram.controllers.MainMenuController;
import managementProgram.sceneAndSceneLoaders.MainMenuLoader;


public class Main extends Application {
	
	//displaying the main menu for the lease application
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setResizable(false);
		
		MainMenuLoader loader = new MainMenuLoader(primaryStage);
		loader.setController(new MainMenuController());
		loader.loadScene("MainMenu.fxml");
		
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
