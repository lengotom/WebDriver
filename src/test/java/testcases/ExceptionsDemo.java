package testcases;

import java.sql.SQLException;

public class ExceptionsDemo {
	
	public static void main(String [] args) {
	
		Account acc = new Account();
		try {
			System.out.println("first");
			acc.withdraw(100);
			System.out.println("second");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.out.println("Git the fuck outta here");
		} finally {
			System.out.println("always");
		}
	
	}
	

}
