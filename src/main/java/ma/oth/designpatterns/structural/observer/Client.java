package ma.oth.designpatterns.structural.observer;

public class Client extends Observer {

	@Override
	public void update(Compte subject) {
		System.out.println("Client notified " + subject.toString());

	}

}
