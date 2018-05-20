package ma.oth.designpatterns.behavioral.visitor.elements;

import ma.oth.designpatterns.behavioral.visitor.visitors.Visitor;
/**
 * 
 * @author othmane Element corresponding example class
 *
 */
public abstract class Product {

	private int id;
	private double price;

	public Product() {

	}

	public Product(int id, double price) {
		super();
		this.id = id;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract String accept(Visitor visitor);

}
