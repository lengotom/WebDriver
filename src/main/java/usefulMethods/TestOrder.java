package usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)			//sort by method name
//@FixMethodOrder(MethodSorters.JVM)					//sort by order returned by JVM
//@FixMethodOrder(MethodSorters.DEFAULT)				//default JUnit sort order     
public class TestOrder {
	
	@Before
	public void setUp() {}
	
	@After
	public void tearDown() {}
	
	

	@Test
	public void test6(){	
		System.out.println("Execute test 6");
	}
	
	@Test
	public void test3() {
		System.out.println("Execute test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Execute test 4");
	}
	
	@Test
	public void test5() {
		System.out.println("Execute test 5");
	}
	
	@Test
	public void test1() {
		System.out.println("Execute test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("Execute test 2");
	}
	

}
