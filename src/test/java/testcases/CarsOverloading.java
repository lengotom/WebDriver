package testcases;


//1. different number of param
//2. type of param
//3. sequence of data types of param


public class CarsOverloading {

//	public static void main (String [] args) {
//		
//	//	CarsOverloading car = new CarsOverloading();
//		System.out.println("1. different number of param");
//		CarsOverloading.increaseSeatHeight(15);
//		CarsOverloading.increaseSeatHeight(8, 4);
//		System.out.println("2. type of param");
//		CarsOverloading.increaseSeatHeight("Cause I like it");
//		System.out.println("3. sequence of data types of param");
//		CarsOverloading.increaseSeatHeight(8, "word");
//		CarsOverloading.increaseSeatHeight("word" , 8);
//	}
	
	
	
	//1. different number of param
	public static void increaseSeatHeight(int heighToIncrease) {
		System.out.println("one int: " + heighToIncrease);
	}
	
	public static void increaseSeatHeight(int heighToIncrease, int seat) {
		System.out.println("two ints: " + heighToIncrease + ", " + seat);
	}
	
	
	//2. type of param
	public static void increaseSeatHeight(String why) {
		System.out.println("String: " + why);
	}
	
	//3. sequence of data types of param
	public static void increaseSeatHeight(int seat, String why) {
		System.out.println("int, string: " + seat + ", " + why );
	}
	public static void increaseSeatHeight(String why, int seat) {
		System.out.println("string, int: " + why + ", " + seat );
	}
	
	
	
	// method to override
	public void classOverride() {
		System.out.println("Parent method");
	}
	
	
	
}
