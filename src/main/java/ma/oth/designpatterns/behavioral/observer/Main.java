package ma.oth.designpatterns.behavioral.observer;

public class Main {
	
	
	
	public Main() {
		exp01();
	}
	
	public void exp01() {
		
		CompteCourant cc= new CompteCourant();
		Observer o1= new Client();
		Observer o2= new BankOperator();
		cc.attach(o1);
		cc.attach(o2);
		cc.withdraw(20);
		
	}
	
	public static void main(String[] args) {
		 new Main();
	}

}
