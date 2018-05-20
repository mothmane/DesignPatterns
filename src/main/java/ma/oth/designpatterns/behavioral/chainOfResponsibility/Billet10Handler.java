package ma.oth.designpatterns.behavioral.chainOfResponsibility;

public class Billet10Handler extends Handler {

	@Override
	public void handle(Context ctx) {

		int billetCount = (int) (ctx.getAmmount() / 10);

		int rest = ctx.getAmmount() % 10;
		System.out.println("Nombre de billet de 10 : " + billetCount);

	}

}
