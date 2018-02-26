package ma.oth.designpatterns.creational.singleton;

public class Client {
	
	public void exp01(){
		Singleton s1= Singleton.getInstance();
		Singleton s2= Singleton.getInstance();
		
		System.out.print("test singeleton  s1==s2 :");
		System.out.println((s1==s2));
		
	}
	
	public Client() {
		exp01();
	}
	
	public static void main(String[] args) {
		
		new Client();
		
		
	}

}
