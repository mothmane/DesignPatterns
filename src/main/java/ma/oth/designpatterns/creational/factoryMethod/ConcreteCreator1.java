package ma.oth.designpatterns.creational.factoryMethod;

public class ConcreteCreator1 extends AbstractCreator {

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return new Product1();
	}

}
