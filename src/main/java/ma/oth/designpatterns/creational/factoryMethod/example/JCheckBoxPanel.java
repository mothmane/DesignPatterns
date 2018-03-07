package ma.oth.designpatterns.creational.factoryMethod.example;

import javax.swing.AbstractButton;
import javax.swing.JCheckBox;

public class JCheckBoxPanel extends AbstractButtonPanel {

	public JCheckBoxPanel(String[] labels) {
		init(labels);
	}

	@Override
	public AbstractButton createButton(String label) {
		// TODO Auto-generated method stub
		return new JCheckBox(label);
	}

}
