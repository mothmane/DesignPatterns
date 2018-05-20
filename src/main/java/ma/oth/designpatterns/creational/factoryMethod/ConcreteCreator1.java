package ma.oth.designpatterns.creational.factoryMethod;

public class ConcreteCreator1 extends AbstractCreator {

	@Override
	public Product createProduct() {
		
		return new Product1();
	}

}
