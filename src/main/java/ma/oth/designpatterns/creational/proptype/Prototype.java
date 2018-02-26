package ma.oth.designpatterns.creational.proptype;

public class Prototype implements Cloneable{

	public Prototype clone() {
		Prototype clone=null;
		
		try {
			clone=(Prototype)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
}
