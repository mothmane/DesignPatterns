package ma.oth.designpatterns.creational.factoryMethod;

public class ConcreteCreator2 extends AbstractCreator {

	@Override
	public Product createProduct() {
		
		return new Product2();
	}

}
