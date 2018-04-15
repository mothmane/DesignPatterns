package ma.oth.designpatterns.structural.observer;

public class BankOperator extends Observer {

	@Override
	public void update(Compte subject) {
	
		System.out.println("BankOperator notified "+subject.toString());
		
	}

}
