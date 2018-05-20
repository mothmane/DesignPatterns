package ma.oth.designpatterns.behavioral.memento;

public class Client {
	public Client() {
		exp01();
	}

	private void exp01() {
		Historic historic = new Historic();
		Action action = new Action(historic, "NASDAQ", 60.13, 59);

		action.setValue(60.16);
		action.createMemento();

		action.setValue(60.13);
		action.createMemento();

		action.setValue(60.14);
		action.createMemento();

		action.setValue(60.18);
		action.createMemento();

		action.setValue(60);
		action.createMemento();

		System.out.println(action);

		action.setMemento(historic.getMemento(0));
		System.out.println(action);

		action.setMemento(historic.getMemento(1));
		System.out.println(action);

		action.setMemento(historic.getMemento(2));
		System.out.println(action);

	}

	public static void main(String[] args) {
		new Client();
	}

}
