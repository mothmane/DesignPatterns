package ma.oth.designpatterns.creational.factoryMethod.example;

import javax.swing.AbstractButton;
import javax.swing.JPanel;

public abstract class AbstractButtonPanel extends JPanel {

	
	
	public void init(String[] labels) {
		for (int i = 0; i < labels.length; i++) {
			AbstractButton ab = this.createButton(labels[i]);
			this.add(ab);
		}
	}
	
	

	abstract public AbstractButton createButton(String label);

}
