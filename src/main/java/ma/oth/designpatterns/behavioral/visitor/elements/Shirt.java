package ma.oth.designpatterns.behavioral.visitor.elements;

import ma.oth.designpatterns.behavioral.visitor.visitors.Visitor;

public class Shirt extends Product {
	private String brand;

	public Shirt() {
		super();
	}

	public Shirt(int id, double price,String brand) {
		super(id, price);
		this.brand=brand;
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitShirt(this);
	}

}
