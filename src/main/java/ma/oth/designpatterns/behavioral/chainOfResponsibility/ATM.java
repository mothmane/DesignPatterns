package ma.oth.designpatterns.behavioral.chainOfResponsibility;

public class ATM {
	
	public ATM() {
		
		Handler h50= new Billet50Handler();
		Handler h20= new Billet20Handler();
		Handler h10= new Billet10Handler();
		
		h20.setSuccessor(h50);
		h20.setSuccessor(h10);
		h10.setSuccessor(h50);
		
		
		Context context= new Context(0,230);
		
		h50.handle(context);
		
		
	}
	
	public static void main(String[] args) {
		new ATM();
	}

}
