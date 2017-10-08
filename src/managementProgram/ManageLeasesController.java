package managementProgram;

import java.util.ArrayList;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ManageLeasesController extends ManageItemsController{
	
	private List<Lease> leaseList = new ArrayList<Lease>();
	
	public void setStage(Stage stage) {
		this.stage = stage;
		setupDemo();
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
	
	private void setupDemo() {
		Lease demo1 = new Lease("202020", "Mark", "Computer", "Dec", "1 week", "Jan", "");
		Lease demo2 = new Lease("20403020", "Jack", "Computer", "Dec", "2 week", "Jan", "");
		ObservableList<Lease> leases = FXCollections.observableArrayList();
		leases.add(demo1);
		leases.add(demo2);
		
		this.tableView.setItems(leases);
		
	}
	
}
