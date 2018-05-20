package ma.oth.designpatterns.creational.abstractFactory;
/**
 * 
 * @author othmane
 *
 */
public interface AbstractTheme {

	public Table createTable();

	public Sofa createSofa();

	public Chair createChair();

}
