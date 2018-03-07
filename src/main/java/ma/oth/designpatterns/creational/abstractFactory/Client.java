package ma.oth.designpatterns.creational.abstractFactory;

import ma.oth.designpatterns.creational.abstractFactory.contemporain.BlueTable;
import ma.oth.designpatterns.creational.abstractFactory.contemporain.ContemporaryTheme;
import ma.oth.designpatterns.creational.abstractFactory.contemporain.MagneticSofa;
import ma.oth.designpatterns.creational.abstractFactory.contemporain.YellowChair;

public class Client {

	public Client() {
		exp01();
	}

	public void exp01() {
		new BlueTable();
		new MagneticSofa();
		new YellowChair();
	}

	public void exp02() {
		AbstractTheme theme = new ContemporaryTheme();
		// Abstract theme = new StarWarsTheme();
	}

	public static void main(String[] args) {
		new Client();
	}

}
