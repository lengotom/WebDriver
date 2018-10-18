package usefulMethods;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementExistsCheckDemo {
	WebDriver driver;
	String baseURL;
	GenericMethods gm;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
//		driver = new HtmlUnitDriver();
		driver = new FirefoxDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		gm = new GenericMethods(driver);
		
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		
	//	driver.quit();
	}


	@Test
	public void test() {
		driver.get(baseURL);
		gm.clickWhenReady(By.id("opentab"), 3);
		gm.elementExists("Id", "opentab");
		gm.elementExists("Id", "openasdfadatab");
		

	}
}