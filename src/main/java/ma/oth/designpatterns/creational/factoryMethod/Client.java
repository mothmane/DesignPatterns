package ma.oth.designpatterns.creational.factoryMethod;

public class Client {

	
	public static void main(String[] args) {
		
		
		AbstractCreator ac1=new ConcreteCreator1();
		AbstractCreator ac2=new ConcreteCreator2();
	}
}
