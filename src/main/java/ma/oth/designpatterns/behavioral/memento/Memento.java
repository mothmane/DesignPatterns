package ma.oth.designpatterns.behavioral.memento;

public class Memento {
	
	private double value;
	private double cours;
	
	
	public Memento(double value, double cours) {
		super();
		this.value = value;
		this.cours = cours;
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
	
	

}
