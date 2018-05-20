package ma.oth.designpatterns.behavioral.visitor.visitors;

import ma.oth.designpatterns.behavioral.visitor.elements.Book;
import ma.oth.designpatterns.behavioral.visitor.elements.DVD;
import ma.oth.designpatterns.behavioral.visitor.elements.Shirt;

public class XMLVisitor implements Visitor {

	public String visitBook(Book book) {

		return "<book>" + book.getIsbn() + "</book>";
	}

	public String visitShirt(Shirt shirt) {

		return "<shirt>" + shirt.getBrand() + "</shirt>";
	}

	public String visitDVD(DVD dvd) {

		return "<dvd>" + dvd.getTitle() + "</dvd>";
	}

}
