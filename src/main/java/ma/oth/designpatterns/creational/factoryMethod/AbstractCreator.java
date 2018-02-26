package ma.oth.designpatterns.creational.factoryMethod;

public abstract class AbstractCreator {
	
	public void operation() {
		System.out.println("intancie Iframe");
		System.out.println("cree moi un panneau");
		System.out.println("bla bla bla");
		Product p= createProduct();
		System.out.println("met le produit dans le panneau");
		
	}
	
	public abstract Product createProduct();

}
