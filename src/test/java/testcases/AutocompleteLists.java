package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AutocompleteLists {
	WebDriver driver;
	String baseURL;
	Logger logger;
	
	@Before
	public void setUp() {
	    logger = Logger.getLogger("");
	    logger.setLevel(Level.OFF);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
//		driver = new HtmlUnitDriver();
		driver = new FirefoxDriver();
		baseURL = "https://www.southwest.com/";
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		
		String searchingText = "New York/Newark, NJ - EWR";
		String partialText = "New York";
		
		driver.findElement(By.id("air-city-departure")).sendKeys(partialText);
		
		WebElement el = driver.findElement(By.xpath("//div[@class=\"js-overlay-container overlay--container \"]"));
		List<WebElement> list = el.findElements(By.tagName("li"));
		System.out.println("Size of the list: " + list.size());
		for (WebElement elem: list) {
			System.out.println(elem.getText());
		}
		for (WebElement elem: list) {
			if (elem.getText().equals(searchingText)) {
				elem.click();
				break;
			}
		}

		

	}
}