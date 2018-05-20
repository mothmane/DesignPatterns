package ma.oth.designpatterns.behavioral.visitor.visitors;

import ma.oth.designpatterns.behavioral.visitor.elements.Book;
import ma.oth.designpatterns.behavioral.visitor.elements.DVD;
import ma.oth.designpatterns.behavioral.visitor.elements.Shirt;

public interface Visitor {

	public String visitBook(Book book);

	public String visitShirt(Shirt shirt);

	public String visitDVD(DVD dvd);

}
