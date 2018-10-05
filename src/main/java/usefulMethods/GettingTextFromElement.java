package usefulMethods;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GettingTextFromElement {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


	@Test
	public void test1LetsKodeIt() throws InterruptedException {
		driver.get(baseURL);
		WebElement button = driver.findElement(By.id("opentab"));
		String elementText = button.getText();
		System.out.println("Element text is: \"" + elementText + "\"");
	}
	
	
	

}
