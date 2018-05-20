package ma.oth.designpatterns.behavioral.memento;

public class Action {

	private Historic historic;

	private String name;

	private double value;
	private double cours;

	public Action(Historic historic,String name, double value, double cours) {
		super();
		this.historic=historic;
		this.name = name;
		this.value = value;
		this.cours = cours;
	}

	public void createMemento() {
		historic.addMemento(new Memento(this.value, this.cours), 0);
	}

	public void setMemento(Memento memento) {

		this.value = memento.getValue();
		this.cours = memento.getCours();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public double getCours() {
		return cours;
	}

	public void setCours(double cours) {
		this.cours = cours;
	}

	@Override
	public String toString() {
		return "Action [historic=" + historic + ", name=" + name + ", value=" + value + ", cours=" + cours + "]";
	}
	

}
