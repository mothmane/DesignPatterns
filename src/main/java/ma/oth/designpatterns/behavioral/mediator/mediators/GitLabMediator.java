package ma.oth.designpatterns.behavioral.mediator.mediators;

import java.util.ArrayList;
import java.util.List;

import ma.oth.designpatterns.behavioral.mediator.colleagues.GitUser;

public class GitLabMediator implements GitMediator {
	
	private List<GitUser> users= new ArrayList<GitUser>();

	private StringBuilder repo = new StringBuilder();
	
	private List<GitUser> userCommit= new ArrayList<GitUser>();
	
	public void push(String change, GitUser user) {
		repo.append(change);
		userCommit.add(user);
	}

	public void pull(GitUser user) {
		//users.forEach(action);
		System.out.println("A pull is Requested by "+user.getLogin());
		System.out.println(repo);
		System.out.println(userCommit);
	}
	
	public void addUser(GitUser user) {
		this.users.add(user);
	}

}
