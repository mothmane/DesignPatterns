package ma.oth.designpatterns.behavioral.command;

public class MonterCommand implements Command {

	private Ascensseur asc;

	public MonterCommand(Ascensseur asc) {
		this.asc = asc;
	}

	@Override
	public void executeAction() {

		this.asc.monter();
	}

}
