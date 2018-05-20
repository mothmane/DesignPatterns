package ma.oth.designpatterns.behavioral.visitor.elements;

import ma.oth.designpatterns.behavioral.visitor.visitors.Visitor;

/**
 * 
 * @author othmane this is a concrete element
 *
 */
public class Book extends Product {

	private String isbn;

	
	public Book() {
		super();
	}

	public Book(int id, double price,String isbn) {
		super(id, price);
		this.isbn=isbn;
		
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitBook(this);
	}

}
