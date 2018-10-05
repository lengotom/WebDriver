/*********************************************************************************************************************************************
 * useless bullshit for finding elements, makes finding more error prone, doesn't speed up things
 ********************************************************************************************************************************************/



package usefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericMethodsTest {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}


	@Test
	public void test(){
		GenericMethods m = new GenericMethods(driver);
		driver.get(baseURL);
		m.getElement("carselect", "id");
		System.out.println(driver.findElement(By.id("carselect")));
		m.getElement("bla", "ide");
		

	}
}