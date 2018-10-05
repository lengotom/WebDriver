package usefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollingWebsite {
	WebDriver driver;
	JavascriptExecutor js;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		baseURL = "https://learn.letskodeit.com/p/practice";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}


	@Test
	public void test1LetsKodeIt() throws InterruptedException {
		driver.get(baseURL);
		//scrolling down by 600 pixels
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		
		//scrolling up by 200 pixels
		js.executeScript("window.scrollBy(0,-200)");
		Thread.sleep(1000);
	}
	
	
	

}

