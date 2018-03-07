package ma.oth.designpatterns.creational.factoryMethod.example;

import javax.swing.AbstractButton;
import javax.swing.JButton;

public class JButtonPanel extends AbstractButtonPanel {

	public JButtonPanel(String[] labels) {
		this.init(labels);
	}

	@Override
	public AbstractButton createButton(String label) {

		return new JButton(label);
	}

}
