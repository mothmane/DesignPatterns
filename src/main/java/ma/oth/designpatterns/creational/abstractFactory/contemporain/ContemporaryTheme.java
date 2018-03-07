package ma.oth.designpatterns.creational.abstractFactory.contemporain;

import ma.oth.designpatterns.creational.abstractFactory.AbstractTheme;
import ma.oth.designpatterns.creational.abstractFactory.Chair;
import ma.oth.designpatterns.creational.abstractFactory.Sofa;
import ma.oth.designpatterns.creational.abstractFactory.Table;

public class ContemporaryTheme implements AbstractTheme {

	public Table createTable() {

		return new BlueTable();
	}

	public Sofa createSofa() {
		
		return new MagneticSofa();
	}

	public Chair createChair() {
		
		return new YellowChair();
	}

}
