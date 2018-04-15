package ma.oth.designpatterns.behavioral.observer;

public class CompteCourant  extends Compte{
	
	private double credit=100;
	
	public void withdraw(double montant) {
		this.credit=this.credit-montant;
		System.out.println("withdraw");
		this.notifiy();
		
	}

	@Override
	public String toString() {
		return "CompteCourant [credit=" + credit + "]";
	}
	
	
	

}
