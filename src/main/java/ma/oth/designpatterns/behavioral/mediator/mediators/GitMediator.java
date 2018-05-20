package ma.oth.designpatterns.behavioral.mediator.mediators;

import ma.oth.designpatterns.behavioral.mediator.colleagues.GitUser;

public interface GitMediator {

		public void push(String change,GitUser user);
		public void pull(GitUser user);
}
