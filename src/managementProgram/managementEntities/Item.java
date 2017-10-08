package managementProgram.managementEntities;

import javafx.beans.property.StringProperty;

public abstract class Item {

	// all items must have a method for getting the ID String property for display
	// on the screen
	public abstract StringProperty getID();

}
