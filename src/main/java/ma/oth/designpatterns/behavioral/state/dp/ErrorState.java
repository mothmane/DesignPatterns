package ma.oth.designpatterns.behavioral.state.dp;

public class ErrorState implements State {

	public void showMessage() {
		System.out.println("Cette machine est hors serive");
		
	}

}
