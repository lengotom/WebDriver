package usefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ElementExistsCheckDemo {
	WebDriver driver;
	String baseURL;
	ElementExistsCheck exists;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new HtmlUnitDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		
		exists = new ElementExistsCheck(driver);
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}


	@Test
	public void test() {
		driver.get(baseURL);
		System.out.println(exists.checkElementExists("opentab"));
		System.out.println(exists.checkElementExists("opntab"));
		System.out.println(exists.checkElementExists("cen-right-align"));
		System.out.println(exists.checkElementExists("a"));
	}
}