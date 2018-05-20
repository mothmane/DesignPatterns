package ma.oth.designpatterns.behavioral.command;

public class Bouton {

	private Command command;
	
	public Bouton() {
		
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void onClick() {
		command.executeAction();
	}
	
	
}
