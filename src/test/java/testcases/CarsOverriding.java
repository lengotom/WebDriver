package testcases;

public class CarsOverriding extends CarsOverloading {
 
	@Override
	public void classOverride() {
		super.classOverride();
		System.out.println("Child method");
	}
	
	public static void main (String [] args) {
		
		CarsOverloading car1 = new CarsOverloading();
		CarsOverloading car2 = new CarsOverriding();
		
		car1.classOverride();
		System.out.println("------------------------------------");
		car2.classOverride();
	}
}
