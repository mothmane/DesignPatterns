package ma.oth.designpatterns.behavioral.command;

public class Client {

	public Client() {
		exp01();
	}

	private void exp01() {
		Bouton monterButton = new Bouton();
		Bouton descendreButton = new Bouton();

		Ascensseur asc = new Ascensseur();

		monterButton.setCommand(new MonterCommand(asc));
		descendreButton.setCommand(new DescendreCommand(asc));
		
		monterButton.onClick();

	}

	public static void main(String[] args) {
		new Client();
	}

}
