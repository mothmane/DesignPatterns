package ma.oth.designpatterns.behavioral.chainOfResponsibility;

public class Billet50Handler extends Handler  {

	@Override
	public void handle(Context ctx) {
		
		int billetCount=  (int) (ctx.getAmmount()/50);
		
		int rest = ctx.getAmmount()%50;
		System.out.println("Nombre de billet de 50 : " + billetCount);
		
		if(rest!=0) {
			ctx.setAmmount(rest);
			this.getSuccessor().handle(ctx);
		}
		
		
	}

}
