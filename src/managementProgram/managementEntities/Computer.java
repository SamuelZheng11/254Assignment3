package managementProgram.managementEntities;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public abstract class Computer extends Equipment {
	
	protected String systemOS;


	public String getReadableSystemOS() {
		return this.systemOS;
	}
	


	public StringProperty getSystemOS() {
		return new SimpleStringProperty(this.systemOS);
	}

}
