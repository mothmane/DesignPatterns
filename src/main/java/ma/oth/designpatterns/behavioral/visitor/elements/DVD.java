package ma.oth.designpatterns.behavioral.visitor.elements;

import ma.oth.designpatterns.behavioral.visitor.visitors.Visitor;

public class DVD extends Product {

	private String title;

	public DVD() {
		super();
	}

	public DVD(int id, double price, String title) {
		super(id, price);
		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitDVD(this);
	}

}
