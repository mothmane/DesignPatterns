package ma.oth.designpatterns.behavioral.visitor;

import ma.oth.designpatterns.behavioral.visitor.elements.Book;
import ma.oth.designpatterns.behavioral.visitor.elements.DVD;
import ma.oth.designpatterns.behavioral.visitor.elements.Shirt;
import ma.oth.designpatterns.behavioral.visitor.visitors.BlackFridayVisitor;
import ma.oth.designpatterns.behavioral.visitor.visitors.Visitor;
import ma.oth.designpatterns.behavioral.visitor.visitors.XMLVisitor;

public class Client {
	public Client() {
		exp01();
	}

	private void exp01() {
		
		/* elements */
		Book book = new Book(01, 35.7, "isbn0998098767868760");
		Shirt shirt = new Shirt(02, 14.00, "Adidas");
		DVD dvd = new DVD(03, 10, "Black Pnnther");

		/* visitors new services */
		Visitor xmlVisitor = new XMLVisitor();
		Visitor bfVisitor = new BlackFridayVisitor();

		/* execution of xml services */
		System.out.println("Getting elements in xml format => ");
		System.out.println();
		System.out.println(book.accept(xmlVisitor));
		System.out.println(shirt.accept(xmlVisitor));
		System.out.println(dvd.accept(xmlVisitor));
		
		/* execution of black friday services */	
		System.out.println();
		System.out.println("Getting the Black Friday prices => ");
		System.out.println();
		System.out.println(book.accept(bfVisitor));
		System.out.println(shirt.accept(bfVisitor));
		System.out.println(dvd.accept(bfVisitor));

	}

	public static void main(String[] args) {
		new Client();
	}

}
