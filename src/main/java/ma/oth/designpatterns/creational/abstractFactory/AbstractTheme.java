package ma.oth.designpatterns.creational.abstractFactory;

public interface AbstractTheme {

	public Table createTable();

	public Sofa createSofa();

	public Chair createChair();

}
