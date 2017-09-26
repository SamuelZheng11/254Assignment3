package application;
	
import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class Main extends Application {
	
	//displaying the main menu for the lease application
	@Override
	public void start(Stage primaryStage) {
		
		primaryStage.setResizable(false);
		
		MainMenuLoader loader = new MainMenuLoader();
		loader.loadScene(MainMenu.fxml);
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
