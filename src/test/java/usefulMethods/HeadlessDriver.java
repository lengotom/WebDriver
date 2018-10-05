package usefulMethods;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessDriver {
	WebDriver driver;
	String baseURL;
	
	@Before
	public void setUp() throws Exception {
		//add HtmlUnitDriver dependency to pom in Maven
		driver = new HtmlUnitDriver();
		
//		using particular browser
//		driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_60);
//		driver = new HtmlUnitDriver(BrowserVersion.CHROME);
//		driver = new HtmlUnitDriver(BrowserVersion.EDGE);
//		driver = new HtmlUnitDriver(BrowserVersion.INTERNET_EXPLORER);
		
		baseURL = "http://www.google.com";
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test1LetsKodeIt() throws InterruptedException {
		driver.get(baseURL);
		//do something			
	}
}