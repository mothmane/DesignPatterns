package ma.oth.designpatterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Historic {

	private List<Memento> mementos = new ArrayList<>();

	public void addMemento(Memento memento, int index) {
		mementos.add(index, memento);
	}

	public Memento getMemento(int index) {
		return mementos.get(index);

	}

}
