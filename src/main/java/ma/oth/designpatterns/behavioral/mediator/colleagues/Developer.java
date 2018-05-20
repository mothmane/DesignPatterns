package ma.oth.designpatterns.behavioral.mediator.colleagues;

import ma.oth.designpatterns.behavioral.mediator.mediators.GitMediator;

public class Developer implements GitUser {

	private GitMediator gitMediator;
	
	private String login;

	public Developer(String login,GitMediator gitMediator) {
		this.gitMediator = gitMediator;
		this.login=login;
	}

	public void push(String message) {
		gitMediator.push(message, this);

	}
	
	public void pull() {
		gitMediator.pull(this);

	}

	public String getLogin() {
		return this.login;
		
	}
	

}
