package ma.oth.designpatterns.creational.proptype;

public class ConcretePrototype1  extends Prototype{
	
	private String name;
	

	public ConcretePrototype1() {
		super();
		for (int i = 0; i < 100; i++) {
			System.out.println("traitement "+i);
		}
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
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
