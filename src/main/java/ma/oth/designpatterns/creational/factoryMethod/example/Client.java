package ma.oth.designpatterns.creational.factoryMethod.example;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Client extends JFrame {

	public Client() {
		exp01();
	}

	public void exp01() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

		//panel.add(new JButtonPanel(new String[] { "label 01", "lable 02", "label 03" }));
		panel.add(new JCheckBoxPanel(new String[] { "label 01", "lable 02", "label 03" }));
		this.setContentPane(panel);
		this.prepare();
	}

	private void prepare() {
		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Client();
	}
}
