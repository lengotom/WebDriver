package testcases;



import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class jUnitElementState {
	WebDriver driver;
	String baseURL;
		

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TOMLEN\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		baseURL = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	
	@Test
	public void test() {
		driver.get(baseURL);
		System.out.println(driver.findElement(By.id("lst-ib")).isEnabled());
		driver.findElement(By.id("lst-ib")).sendKeys("bullshit");
		
	}
	
	@After
	public void tearDown() throws Exception {
		Thread.sleep(1000);
		driver.quit();
	}

}
