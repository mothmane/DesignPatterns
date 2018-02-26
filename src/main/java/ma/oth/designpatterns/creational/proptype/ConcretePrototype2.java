package ma.oth.designpatterns.creational.proptype;

public class ConcretePrototype2 extends Prototype {

	private int x;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
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
		ConcretePrototype2 other = (ConcretePrototype2) obj;
		if (x != other.x)
			return false;
		return true;
	}

	public ConcretePrototype2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcretePrototype2(int x) {
		super();
		this.x = x;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public ConcretePrototype2 clone() {
		return (ConcretePrototype2) super.clone();
	}

}
