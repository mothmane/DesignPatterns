package ma.oth.designpatterns.behavioral.chainOfResponsibility;

public class Billet20Handler extends Handler  {

	@Override
	public void handle(Context ctx) {
		
		int billetCount=  (int) (ctx.getAmmount()/20);
		
		int rest = ctx.getAmmount()%20;
		
		System.out.println("Nombre de billet de 20 : "+ billetCount);
		if(rest!=0) {
			ctx.setAmmount(rest);
			this.getSuccessor().handle(ctx);
		}
		
		
	}

}
