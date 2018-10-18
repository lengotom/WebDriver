package usefulMethods;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;



public class ElementExistsCheckDemo {
	WebDriver driver;
	String baseURL;
	GenericMethods gm;
	Logger logger;
	
	@Before
	public void setUp() {
	    logger = Logger.getLogger("");
	    logger.setLevel(Level.OFF);
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new HtmlUnitDriver();
//		driver = new FirefoxDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		gm = new GenericMethods(driver);
		
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		
	//	driver.quit();
	}


	@Test
	public void test() {
		driver.get(baseURL);
		gm.elementExists("Id", "opentab");
		gm.elementExists("Id", "openasdfadatab");
		List<WebElement> list = gm.getElementList("name", "cars");
		for (WebElement el: list) {
			System.out.println(el);
		}
		driver.findElement(By.linkText("Login")).click();
		gm.clickWhenReady(By.xpath("//input[@name='commit']"), 3);
		

	}
}