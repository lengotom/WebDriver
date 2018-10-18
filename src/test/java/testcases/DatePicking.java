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

import usefulMethods.GenericMethods;

public class DatePicking {
	WebDriver driver;
	String baseURL;
	GenericMethods gm;
	Logger logger;
	
	@Before
	public void setUp() {
	    logger = Logger.getLogger("");
	    logger.setLevel(Level.OFF);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
//		driver = new HtmlUnitDriver();
		driver = new FirefoxDriver();
		baseURL = "https://www.expedia.com/";
		gm = new GenericMethods(driver);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() throws InterruptedException {
//		Thread.sleep(3000);
		driver.quit();
	}


	@Test
	public void test() throws InterruptedException {
		driver.get(baseURL);
		String day = "27";
		boolean dayFound = false;
		
		driver.findElement(By.id("package-departing-hp-package")).sendKeys("11/20/2018");
		driver.findElement(By.id("package-returning-hp-package")).sendKeys("12/06/2018");
		
		Thread.sleep(1000);
		
		gm.clickWhenReady(By.id("package-departing-hp-package"), 0);
		gm.clickWhenReady(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button[@data-day='29']"), 2);
		gm.clickWhenReady(By.id("package-returning-hp-package"), 0);
		gm.clickWhenReady(By.xpath("//div[@class='datepicker-cal-month'][position()=2]//button[@data-day='11']"), 2);
		
		driver.findElement(By.id("package-departing-hp-package")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='datepicker-cal-month'][position()=1]//button"));
		for (WebElement el: list) {
			if (el.isEnabled()) {
				if (el.getAttribute("data-day").equals(day)) {
					System.out.println("----" + day + "----");
					dayFound = true;
				}
				else System.out.println(el.getAttribute("data-day"));
			}
		}
		if (dayFound) System.out.println("Possible to choose day: " + day);
		else System.out.println("Not possible to choose day: " + day);
		
		
		


		

	}
}