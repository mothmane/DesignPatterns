package ma.oth.designpatterns.creational.builder;

public interface Builder {
	
	
	
	public Builder createProduct();
	public Builder buildPart1();
	public Builder buildPart2();
	public Builder buildPart3();

	public Product getResult();
}
