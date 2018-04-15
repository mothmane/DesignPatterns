package ma.oth.designpatterns.structural.proxy;

public class CarServiceProxy implements CarService {

	private CarService carService;

	public CarServiceProxy() {
		this.carService = new CarServiceImpl();
	}

	public void request() {
		System.out.println("proxy controll access");
		this.carService.request();
	}

}
