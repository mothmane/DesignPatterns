package ma.oth.designpatterns.creational.prototype;

/**
 * 
 * @author othmane
 *
 */
public class ConcretePrototype1  extends Prototype{
	
	private String name;
	

	public ConcretePrototype1() {
		super();
	}

	public ConcretePrototype1(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "ConcretePrototype1 [name=" + name + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConcretePrototype1 other = (ConcretePrototype1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	public ConcretePrototype1 clone() {		
		return (ConcretePrototype1)super.clone();
	}

}
