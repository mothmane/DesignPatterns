package ma.oth.designpatterns.behavioral.command;

public class DescendreCommand implements Command {

	private Ascensseur asc;

	public DescendreCommand(Ascensseur asc) {
		this.asc = asc;
	}

	@Override
	public void executeAction() {

		this.asc.descendre();
	}

}
