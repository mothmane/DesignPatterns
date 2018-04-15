package ma.oth.designpatterns.behavioral.observer;

public class Client extends Observer {

	@Override
	public void update(Compte subject) {
		System.out.println("Client notified " + subject.toString());

	}

}
