package ma.oth.designpatterns.creational.builder;

public class ConcreteBuilder1 implements Builder {

	protected Product product;

	public Builder createProduct() {
		product = new Product();
		return this;
	}

	public Builder buildPart1() {
		// traite traitement traitement product

		return this;
	}

	public Builder buildPart2() {
		// traite traitement traitement

		return this;
	}

	public Builder buildPart3() {
		// traite traitement traitement

		return this;
	}

	public Product getResult() {
		// TODO Auto-generated method stub
		return product;
	}

}
