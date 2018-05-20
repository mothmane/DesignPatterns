package ma.oth.designpatterns.behavioral.visitor.visitors;

import ma.oth.designpatterns.behavioral.visitor.elements.Book;
import ma.oth.designpatterns.behavioral.visitor.elements.DVD;
import ma.oth.designpatterns.behavioral.visitor.elements.Shirt;

public class BlackFridayVisitor implements Visitor {

	public String visitBook(Book book) {
		return book.getPrice() * 0.3 + "";
	}

	public String visitShirt(Shirt shirt) {
		return shirt.getPrice() * 0.4 + "";
	}

	public String visitDVD(DVD dvd) {
		return dvd.getPrice() * 0.35 + "";
	}

}
