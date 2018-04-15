package ma.oth.designpatterns.structural.proxy;

public class Client {

	public void exp01() {
		CarService cs= new CarServiceProxy();
		cs.request();
	}
	public Client() {
		exp01();
	}
	
	public static void main(String[] args) {
		new Client();
	}
}
