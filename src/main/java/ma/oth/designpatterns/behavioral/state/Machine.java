package ma.oth.designpatterns.behavioral.state;

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
			System.out.println("PLus de cafe renez autre chose");

			break;
		case NOCHANGE:
			System.out.println("Attention pa de monnaie");
			break;
		default:
			break;
		}
	}

}
