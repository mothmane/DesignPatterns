package ma.oth.designpatterns.creational.prototype;

/**
 * 
 * @author othmane
 *
 */
public class Client {

	public void exp01() {

		ConcretePrototype1 cp1 = new ConcretePrototype1("Adil");
		ConcretePrototype1 cp2 = cp1.clone();

		System.out.println("cp1==cp2 : " + (cp1 == cp2));
		System.out.println("cp1.equals(cp2) : " + cp1.equals(cp2));

	}

	public Client() {
		exp01();
	}

	public static void main(String[] args) {
		new Client();
	}
}
