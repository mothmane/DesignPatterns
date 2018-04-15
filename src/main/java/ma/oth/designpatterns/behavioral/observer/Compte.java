package ma.oth.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Compte {
	
	private List<Observer> observers;
	
	public Compte() {
		observers= new ArrayList<>();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void detach(Observer observer) {
		observers.remove(observer);
	}

	public void notifiy() {
		observers.forEach(observer -> observer.update(this));
	}
	
	
	
	
	

}
