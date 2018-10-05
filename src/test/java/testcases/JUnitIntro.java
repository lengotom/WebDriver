package testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitIntro {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Before class execution");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("After class execution");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before test execution");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After test execution");
	}

	@Test
	public void test() {
		System.out.println("Test1");
		fail("Not yet implemented");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
		fail("Not yet implemented");
	}

}
