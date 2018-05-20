package ma.oth.designpatterns.behavioral.mediator;

import ma.oth.designpatterns.behavioral.mediator.colleagues.Developer;
import ma.oth.designpatterns.behavioral.mediator.colleagues.GitUser;
import ma.oth.designpatterns.behavioral.mediator.mediators.GitLabMediator;
import ma.oth.designpatterns.behavioral.mediator.mediators.GitMediator;

public class Client {
	public Client() {
		exp01();
	}

	private void exp01() {
		GitMediator gitMediator = new GitLabMediator();

		GitUser jamel = new Developer("Jamel", gitMediator);
		GitUser hafid = new Developer("Hafid", gitMediator);
		GitUser khaled = new Developer("Khaled", gitMediator);

		jamel.push("ligne1");
		hafid.push("ligne2");
		khaled.pull();
		khaled.push("ligne3");

	}

	public static void main(String[] args) {
		new Client();
	}

}
