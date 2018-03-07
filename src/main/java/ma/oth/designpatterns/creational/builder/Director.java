package ma.oth.designpatterns.creational.builder;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void build() {

		Product product = this.builder.createProduct().buildPart1().buildPart2().getResult();

	}

}
