package ma.oth.designpatterns.behavioral.mediator.colleagues;

public interface  GitUser {
	public String getLogin();
	public void push(String message);
	public void pull();
}
