package ma.oth.designpatterns.behavioral.state;

/*
 * This class shows how behavior is associated with state  
 * 
 */
public class Machine {

	private State state;

	public void showMessage() {
		switch (state) {
		case ONSERVICE:
			System.out.println("utiliser le distributeur");
			break;
		case ERROR:
			System.out.println("Cette machine est hors serive");
			break;
		case NOCOFFE:
			System.out.println("PLus de cafe Prenez autre chose");

			break;
		case NOCHANGE:
			System.out.println("Attention pas de monnaie");
			break;
		default:
			break;
		}
	}

}
