package testcases;

public class InterfaceDemo implements CarsInterface, BMWCarsInterface {

	public void engineStart(String engineType, boolean isKeyLess) {
		System.out.println("engine start method - engineType: " + engineType + ", keyless: " + isKeyLess);
	}

	public void headsUpNavigation() {
		System.out.println("Heads up navigation");
		
	}
}
